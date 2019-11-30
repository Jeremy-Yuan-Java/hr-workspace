package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.common.JwtToken;
import com.hrbc.business.domain.WorkPlan;
import com.hrbc.business.domain.WorkPlanExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.common.WorkPlanDto;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.mapper.PerformanceMapper;
import com.hrbc.business.mapper.WorkPlanMapper;
import com.hrbc.business.service.WorkPlanService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: hr-workspace
 * @description: 工作计划的业务实现
 * @author: 波波烤鸭
 * @create: 2019-11-29 11:43
 */
@Service
public class WorkPlanServiceImpl implements WorkPlanService {

    @Autowired
    private WorkPlanMapper mapper;

    @Autowired
    private PerformanceMapper performanceMapper;

    @Override
    public WorkPlan get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Transactional
    @Override
    public int save(WorkPlan entity) {
        if(entity!= null && entity.getId()!=null){
            entity.setUpdatetime(new Date());
            return mapper.updateByPrimaryKeySelective(entity);
        }else{
            // 同一个用户 年份 月份 不能有重复的数据
            WorkPlanExample example = new WorkPlanExample();
            example.createCriteria().andUsernameEqualTo(JwtToken.getUser())
                    .andYearsEqualTo(entity.getYears())
                    .andMonthsEqualTo(entity.getMonths())
                    .andIsdeleteEqualTo(DelFlagE.NO.code);
            List<WorkPlan> workPlans = mapper.selectByExample(example);
            if(workPlans != null && workPlans.size() > 0){
                // 表示存在相同的数据
                return -2;
            }

            entity.setUsername(JwtToken.getUser());
            entity.setCnname(JwtToken.getUserName(JwtToken.getUser()));
            entity.setCreatetime(new Date());
            return mapper.insertSelective(entity);
        }
    }

    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {
        long count = 0;
        List<WorkPlanDto> listDto = new ArrayList<>();
        int page = 1;
        int size = 10;
        if (params != null) {
            if (params.getPage() >= 0) {
                page = params.getPage();
            }
            if (params.getSize() >= 0) {
                size = params.getSize();
            }
            WorkPlan dto = null;


            String ismy = params.getQuery().getString("ismy");

            WorkPlanExample example = new WorkPlanExample();
            example.createCriteria();

            example.getOredCriteria().get(0).andIsdeleteEqualTo(DelFlagE.NO.code);
            if (!StringUtils.isEmpty(params.getOrderby())) {
                example.setOrderByClause(params.getOrderby());
            }

            if(ismy != null && "yes".equals(ismy)){
                String username = JwtToken.getUser();
                example.getOredCriteria().get(0).andUsernameEqualTo(username);
            }

            if (params.getQuery() != null) {
                dto = JSONObject.toJavaObject(params.getQuery(), WorkPlan.class);
                /*if(!StringUtils.isEmpty(dto.getOpuser())){
                    example.getOredCriteria().get(0).andOpuserEqualTo(dto.getOpuser());
                }*/

               if(!StringUtils.isEmpty(dto.getUsername())){
                   example.getOredCriteria().get(0).andUsernameEqualTo(dto.getUsername());
               }

               if(!StringUtils.isEmpty(dto.getYears())){
                   example.getOredCriteria().get(0).andYearsEqualTo(dto.getYears());
               }

               if(!StringUtils.isEmpty(dto.getMonths())){
                   example.getOredCriteria().get(0).andMonthsEqualTo(dto.getMonths());
               }


            }

            count = mapper.countByExample(example);
            List<WorkPlan> list = new ArrayList<>();
            if (count > 0) {
                example.setOffset((page - 1) * size);
                example.setLimit(size);
                list = mapper.selectByExample(example);
                // 统计出没记录的相关完成情况
                if (list != null && list.size() > 0){
                    list.forEach(workPlan -> {
                        // 查询 员工+年份 + 月份 的 offer金额
                        String offerMsg = performanceMapper.queryOfferComplete(workPlan);
                        Double offerTotal = 0d;
                        if(offerMsg !=null){
                            String[] oms = offerMsg.split(";");
                            if(oms !=null){
                                for(String om:oms){
                                    offerTotal += Double.parseDouble(om.split(":")[1].trim());
                                }
                            }
                        }
                        // 查询 员工+年份 + 月份 的绩效金额
                        String performance = performanceMapper.queryPerformance(workPlan);
                        Double performanceMoney = 0d;
                        if(performance != null){
                            String[] ps = performance.split(";");
                            if(ps != null){
                                for(String p:ps){
                                    String username = p.split(":")[0].trim();
                                    String money = p.split(":")[1].trim();
                                    if(username.equals(workPlan.getUsername())){
                                        performanceMoney += Double.parseDouble(money);
                                    }
                                }
                            }
                        }
                        // 查询 员工+年份 + 月份 的签约数量
                        Integer signCount = performanceMapper.querySignCount(workPlan);
                        WorkPlanDto wpd = new WorkPlanDto();
                        BeanUtils.copyProperties(workPlan,wpd);

                        wpd.setOfferComplete(offerTotal + "/" + workPlan.getOffers());
                        wpd.setPerformanceComplete(performanceMoney + "/" + workPlan.getPerformances());
                        wpd.setSignComplete(signCount + "/" + workPlan.getSigns());
                        listDto.add(wpd);
                    });
                }
            }
        }

        // 返回分页数据
        return new PageResultDTO(count, listDto);
    }

    @Override
    public int remove(WorkPlan dto) {
        WorkPlan plan = new WorkPlan();
        plan.setId(dto.getId());
        plan.setIsdelete(DelFlagE.YES.code);
        return mapper.updateByPrimaryKeySelective(plan);
    }
}
