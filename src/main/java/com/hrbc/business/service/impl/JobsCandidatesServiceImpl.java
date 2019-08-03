package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.hrbc.business.common.JwtToken;
import com.hrbc.business.conf.aop.ProcessLog;
import com.hrbc.business.domain.*;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.domain.enums.JobFlowE;
import com.hrbc.business.mapper.CandidatesMapper;
import com.hrbc.business.mapper.CustomersJobsMapper;
import com.hrbc.business.mapper.JobsCandidatesMapper;
import com.hrbc.business.mapper.JobsCandidatesStateMapper;
import com.hrbc.business.service.JobsCandidatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JobsCandidatesServiceImpl implements JobsCandidatesService {
    @Autowired
    private JobsCandidatesMapper mapper;
    @Autowired
    private CandidatesMapper candidatesMapper;
    @Autowired
    private CustomersJobsMapper jobsMapper;
    @Autowired
    private JobsCandidatesStateMapper stateMapper;

    @Override
    public JobsCandidates get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    @ProcessLog(businessName = "职位候选人管理",methodName = "save")
    public int save(JobsCandidates entity) {

        if (entity != null && !StringUtils.isEmpty(entity.getId())) {
            return mapper.updateByPrimaryKeySelective(entity);
        } else {
            return mapper.insertSelective(entity);

        }
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    @ProcessLog(businessName = "职位候选人管理",methodName = "add")
    public int add(JobsCandidates entity) {
        String username = JwtToken.getUser();
        CustomersJobs jobs = jobsMapper.selectByPrimaryKey(entity.getJobid());
        Candidates candidates = candidatesMapper.selectByPrimaryKey(entity.getCandidateid());
        if (jobs == null || candidates == null) {
            return -1;
        }
        JobsCandidatesExample example = new JobsCandidatesExample();
        example.createCriteria().andCandidateidEqualTo(entity.getCandidateid()).andJobidEqualTo(entity.getJobid());
        if (mapper.countByExample(example) > 0) {
            return -2;
        } else {
            entity.setCandidatename(candidates.getUsername());
            entity.setJobtitle(candidates.getJobtitle());
            entity.setLastcompany(candidates.getWork1());
            entity.setPhoneno(candidates.getPhoneno());
            entity.setUpdateuser(username);
            entity.setCreateuser(username);
            entity.setOpusername(JwtToken.getUserName(username));
            entity.setOpuser(username);
            entity.setState(JobFlowE.匹配职位.code);
            int r = mapper.insertSelective(entity);
            if (r > 0) {
                JobsCandidatesState state = new JobsCandidatesState();

                state.setText1(entity.getRemark());
                state.setJcid(entity.getId());
                state.setOpusername(JwtToken.getUserName(username));
                entity.setOpuser(username);
                state.setFlowstate(JobFlowE.匹配职位.code);
                state.setFlowstatedesc(JobFlowE.匹配职位.toString());
                stateMapper.insertSelective(state);
            }
            return r;


        }

    }

    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {

        long count = 0;
        List<JobsCandidates> list = null;
        int page = 1;
        int size = 10;
        if (params != null) {
            if (params.getPage() >= 0) {
                page = params.getPage();
            }
            if (params.getSize() >= 0) {
                size = params.getSize();
            }
            JobsCandidates dto = null;
            JobsCandidatesExample example = new JobsCandidatesExample();
            if (!StringUtils.isEmpty(params.getOrderby())) {
                example.setOrderByClause(params.getOrderby());
            }
            if (params.getQuery() != null) {
                Date createtimest = params.getQuery().getDate("createtimest");
                Date createtimeed = params.getQuery().getDate("createtimeed");
                dto = JSONObject.toJavaObject(params.getQuery(), JobsCandidates.class);
                example.createCriteria();
                if (dto.getDelflag() == null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(DelFlagE.NO.code);
                }
                if (dto.getDelflag() != null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(dto.getDelflag());
                }
                if (dto.getJobid() != null) {
                    example.getOredCriteria().get(0).andJobidEqualTo(dto.getJobid());
                }

                if (dto.getState() != null) {
                    example.getOredCriteria().get(0).andStateEqualTo(dto.getState());
                }
                if (createtimest != null) {
                    example.getOredCriteria().get(0).andCreatetimeGreaterThanOrEqualTo(createtimest);
                }
                if (createtimeed != null) {
                    example.getOredCriteria().get(0).andCreatetimeLessThanOrEqualTo(createtimeed);
                }
            }
            count = mapper.countByExample(example);

            if (count > 0) {
                example.setOffset((page - 1) * size);
                example.setLimit(size);
                list = mapper.selectByExample(example);

                JobsCandidatesStateExample stateExample = new JobsCandidatesStateExample();
                List<Integer> jcids = list.stream().map(n -> n.getId()).collect(Collectors.toList());
                stateExample.createCriteria().andJcidIn(jcids);
                List<JobsCandidatesState> listJc = stateMapper.selectByExample(stateExample);
                Map<Integer, List<JobsCandidatesState>> jcmap = Optional.of(listJc).orElse(Lists.newArrayList()).stream().collect(Collectors.groupingBy(JobsCandidatesState::getJcid));
                list.forEach(n -> n.setJcList(jcmap.get(n.getId())));


            }
        }

        // 返回分页数据
        return new PageResultDTO(count, list);
    }

    @Override
    @ProcessLog(businessName = "职位候选人管理",methodName = "remove")

    public int remove(JobsCandidates dto) {

        JobsCandidates delDto = new JobsCandidates();
        delDto.setId(dto.getId());
        delDto.setDelflag(DelFlagE.YES.code);

        return mapper.updateByPrimaryKeySelective(delDto);
    }

    @Override
    public int changeState(JobsCandidates dto) {

        return mapper.updateByPrimaryKeySelective(dto);
    }

    @Override
    public List<JobsCandidates> query(JobsCandidatesExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    @ProcessLog(businessName = "职位候选人管理",methodName = "changeFlowState")
    public int changeFlowState(JobsCandidatesState state) {
        JobsCandidatesStateExample example = new JobsCandidatesStateExample();
        example.createCriteria().andJcidEqualTo(state.getJcid()).andFlowstateEqualTo(state.getFlowstate());
        if (stateMapper.countByExample(example) > 0) {
            return -1;
        }
        String username = JwtToken.getUser();
        String name = JwtToken.getUserName(JwtToken.getUser());

        state.setOpuser(username);
        state.setOpusername(name);
        int i = stateMapper.insertSelective(state);
        if (i > 0) {
            JobsCandidates jobsCandidates = new JobsCandidates();
            jobsCandidates.setId(state.getJcid());
            jobsCandidates.setState(state.getFlowstate());
            mapper.updateByPrimaryKeySelective(jobsCandidates);
        }
        return i;
    }
}
