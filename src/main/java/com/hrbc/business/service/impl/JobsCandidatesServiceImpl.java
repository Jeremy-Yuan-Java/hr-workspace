package com.hrbc.business.service.impl;
import com.hrbc.business.domain.enums.DelFlagE;
import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.mapper.JobsCandidatesMapper;
import com.hrbc.business.domain.JobsCandidates;
import com.hrbc.business.domain.JobsCandidatesExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.service.JobsCandidatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class JobsCandidatesServiceImpl implements JobsCandidatesService {
    @Autowired
    private JobsCandidatesMapper mapper;

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
                if(dto.getDelflag()!=null){
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
