package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.common.JwtToken;
import com.hrbc.business.domain.*;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.mapper.*;
import com.hrbc.business.service.JobsCandidatesAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: hr-workspace
 * @description: 财务管理-到账管理
 * @author: 波波烤鸭
 * @create: 2019-11-07 11:11
 */
@Service
public class JobsCandidatesAccountServiceImpl implements JobsCandidatesAccountService {

    @Autowired
    private JobsCandidatesAccountMapper accountMapper;

    @Autowired
    private JobsCandidatesStateMapper stateMapper;

    @Autowired
    private JobsCandidatesMapper jobsCandidatesMapper;

    @Autowired
    private SysUserServiceImpl userService;

    @Autowired
    private CounselorPerformanceDeductMapper cpdMapper;

    @Autowired
    private CustomersMapper customersMapper;

    @Autowired
    private CustomersJobsMapper customersJobsMapper;

    @Autowired
    private CandidatesMapper candidatesMapper;

    @Override
    public JobsCandidatesAccount get(Integer id) {
        return accountMapper.selectByPrimaryKey(id);
    }

    @Transactional
    @Override
    public int save(JobsCandidatesAccount entity) {
        int count = 0;
        if (entity != null && !StringUtils.isEmpty(entity.getId())) {
            entity.setUpdateuser(JwtToken.getUser());
            count = accountMapper.updateByPrimaryKeySelective(entity);
            // 删除对应的绩效
            CounselorPerformanceDeductExample example = new CounselorPerformanceDeductExample();
            example.createCriteria().andJcidEqualTo(entity.getId());
            System.out.println("----> " + entity.getId());
            cpdMapper.deleteByExample(example);
        } else {
            entity.setIsdelete(DelFlagE.NO.code);
            entity.setCreateuser(JwtToken.getUser());
            // 根据客户编号 获取客户姓名
            CustomersExample customersExample = new CustomersExample();
            customersExample.createCriteria().andCnoEqualTo(entity.getCno());
            List<Customers> cs = customersMapper.selectByExample(customersExample);
            if(cs!=null && cs.size() == 1){
                entity.setCname(cs.get(0).getCname());
            }
            // 根据职位id 获取职位名称
            CustomersJobs customersJobs = customersJobsMapper.selectByPrimaryKey(Integer.parseInt(entity.getJobno()));
            entity.setJobdesc(customersJobs.getJobdesc());
            // 根据候选人编号获取  名称
            Candidates candidates = candidatesMapper.selectByPrimaryKey(entity.getCandidatesid());
            if(candidates != null){
                entity.setCandidatesname(candidates.getUsername());
            }
            // 获取职位编号
            JobsCandidatesExample jobsCandidatesExample = new JobsCandidatesExample();
            jobsCandidatesExample.createCriteria()
                    .andCandidateidEqualTo(entity.getCandidatesid())
                    .andJobidEqualTo(Integer.parseInt(entity.getJobno()));
            List<JobsCandidates> jcs =jobsCandidatesMapper.selectByExample(jobsCandidatesExample);
            if(jcs != null && jcs.size() == 1){
                entity.setJobsCandidatesId(jcs.get(0).getId());
                entity.setJobcandidateid(jcs.get(0).getId());
            }

            count = accountMapper.insertSelective(entity);
        }
        if(count <= 0){
            return count;
        }
        // 插入各个顾问对应的绩效，根据 jobCandidatesId 获取各个顾问对应的提成比例
        JobsCandidatesStateExample example = new JobsCandidatesStateExample();
        example.createCriteria()
                .andJcidEqualTo(entity.getJobsCandidatesId())
                .andFlowstateEqualTo(5)
        ;
        List<JobsCandidatesState> list = stateMapper.selectByExample(example);
        if(list != null && list.size() == 1){
            JobsCandidatesState state = list.get(0);
            // 获取提成比例数据 Vivian.meng:25000000;Thomas.han:25000000
            String performanace = state.getText4();
            List<CounselorPerformanceDeduct> cpds = new ArrayList<>();
            double total = 0;
            if (!StringUtils.isEmpty(performanace)) {
                String[] pfs =performanace.split(";");
                for(String pf : pfs){
                    String[] p = pf.split(":");
                    if(p != null && p.length == 2){
                        String username = p[0];
                        String money = p[1].trim();
                        CounselorPerformanceDeduct cdp = new CounselorPerformanceDeduct();
                        cdp.setJcid(entity.getId());
                        cdp.setJobsCandidatesId(entity.getJobsCandidatesId());
                        cdp.setUsername(username);
                        // 根据账号获取 职员名称
                        SysUserExample userExample = new SysUserExample();
                        userExample.createCriteria().andUsernameEqualTo(username);
                        List<SysUser> users = userService.query(userExample);
                        if(users != null && users.size() == 1){
                            cdp.setCnname(users.get(0).getCnname());
                        }

                        cdp.setCno(entity.getCno());
                        cdp.setCname(entity.getCname());
                        cdp.setJobno(entity.getJobno());
                        cdp.setJobdesc(entity.getJobdesc());
                        cdp.setCandidatesid(entity.getCandidatesid());
                        cdp.setCandidatesname(entity.getCandidatesname());
                        cdp.setAccounttime(entity.getAccountDate());
                        cdp.setAccountmoney(entity.getAccountMoney()*10000);

                        try{
                            cdp.setDeductmoney(Double.parseDouble(money));
                            total += Double.parseDouble(money);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        cpds.add(cdp);

                    }
                }

                for(CounselorPerformanceDeduct cpd:cpds){
                    double ratio = cpd.getDeductmoney()/total;
                    // 员工应该发放的提成的金额
                    cpd.setGrantmoney(ratio*cpd.getAccountmoney()*0.15);
                    // 实到业绩
                    cpd.setPracticeperformance(ratio*cpd.getAccountmoney());
                    // 员工的提成的比例
                    cpd.setDeductratio(ratio);
                    // 提成的状态为未发放 初始状态
                    cpd.setDeducttype("未发放");
                    cpd.setCreatetime(new Date());
                    cpd.setCreateuser(JwtToken.getUser());
                }
                // 批量插入数据
                cpdMapper.batchInsert(cpds);
            }
        }
        return count;
    }

    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {
        long count = 0;
        List<JobsCandidatesAccount> list = null;
        int page = 1;
        int size = 10;
        if (params != null) {
            if (params.getPage() >= 0) {
                page = params.getPage();
            }
            if (params.getSize() >= 0) {
                size = params.getSize();
            }
            JobsCandidatesAccount dto = null;
            JobsCandidatesAccountExample example = new JobsCandidatesAccountExample();
            if (!StringUtils.isEmpty(params.getOrderby())) {
                example.setOrderByClause(params.getOrderby());
            }
            if (params.getQuery() != null) {
                Date createtimest = params.getQuery().getDate("createtimest");
                Date createtimeed = params.getQuery().getDate("createtimeed");
                dto = JSONObject.toJavaObject(params.getQuery(), JobsCandidatesAccount.class);
                example.createCriteria();
                 example.getOredCriteria().get(0).andIsdeleteEqualTo(DelFlagE.NO.code);

                if (createtimest != null) {
                    //example.getOredCriteria().get(0).andCreatetimeGreaterThanOrEqualTo(createtimest);
                    example.getOredCriteria().get(0).andAccountDateGreaterThanOrEqualTo(createtimest);
                }
                if (createtimeed != null) {
                    example.getOredCriteria().get(0).andAccountDateLessThanOrEqualTo(createtimeed);
                }
                if(!StringUtils.isEmpty(dto.getCno())){
                    example.getOredCriteria().get(0).andCnoEqualTo(dto.getCno());
                }
                if(!StringUtils.isEmpty(dto.getJobno())){
                    example.getOredCriteria().get(0).andJobnoEqualTo(dto.getJobno());
                }
                if(dto.getCandidatesid() != null && dto.getCandidatesid() > 0){
                    example.getOredCriteria().get(0).andCandidatesidEqualTo(dto.getCandidatesid());
                }
            }
            count = accountMapper.countByExample(example);

            if (count > 0) {
                example.setOffset((page - 1) * size);
                example.setLimit(size);
                list = accountMapper.selectByExample(example);
            }
        }

        // 返回分页数据
        return new PageResultDTO(count, list);
    }

    @Transactional
    @Override
    public int remove(JobsCandidatesAccount dto) {
        // 更新状态
        dto.setIsdelete(DelFlagE.YES.code);
        // 删除对应的绩效
        CounselorPerformanceDeductExample example = new CounselorPerformanceDeductExample();
        example.createCriteria().andJcidEqualTo(dto.getId());
        System.out.println("----> " + dto.getId());
        cpdMapper.deleteByExample(example);
        return accountMapper.updateByPrimaryKeySelective(dto);
    }
}
