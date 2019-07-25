package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.common.JwtToken;
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
import org.springframework.util.StringUtils;

import java.util.List;

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
    public int save(JobsCandidates entity) {

        if (entity != null && !StringUtils.isEmpty(entity.getId())) {
            return mapper.updateByPrimaryKeySelective(entity);
        } else {
            return mapper.insertSelective(entity);

        }
    }

    @Override
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
            entity.setOpusername(username);
            entity.setOpuser(username);
            entity.setState(JobFlowE.匹配职位.code);
            int r = mapper.insertSelective(entity);
            if (r > 0) {
                JobsCandidatesState state = new JobsCandidatesState();

                state.setText1(entity.getRemark());
                state.setJcid(entity.getId());
                state.setOpusername(username);
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
                dto = JSONObject.toJavaObject(params.getQuery(), JobsCandidates.class);
                example.createCriteria();
                if (dto.getDelflag() == null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(DelFlagE.NO.code);
                }
                if (dto.getDelflag() != null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(dto.getDelflag());

                }
            }
            count = mapper.countByExample(example);

            if (count > 0) {
                example.setOffset((page - 1) * size);
                example.setLimit(size);
                list = mapper.selectByExample(example);
            }
        }

        // 返回分页数据
        return new PageResultDTO(count, list);
    }

    @Override
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
}
