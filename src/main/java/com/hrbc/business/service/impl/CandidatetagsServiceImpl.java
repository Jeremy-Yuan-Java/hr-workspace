package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.domain.Candidatetags;
import com.hrbc.business.domain.CandidatetagsExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.mapper.CandidatetagsMapper;
import com.hrbc.business.service.CandidatetagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

@Service
public class CandidatetagsServiceImpl implements CandidatetagsService {
    @Autowired
    private CandidatetagsMapper mapper;

    @Override
    public Candidatetags get(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(Candidatetags entity) {

        if (entity != null && !StringUtils.isEmpty(entity.getTag())) {
            return mapper.updateByPrimaryKeySelective(entity);
        } else {
            return mapper.insertSelective(entity);

        }
    }

    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {

        long count = 0;
        List<Candidatetags> list = null;
        int page = 1;
        int size = 10;
        if (params != null) {
            if (params.getPage() >= 0) {
                page = params.getPage();
            }
            if (params.getSize() >= 0) {
                size = params.getSize();
            }
            Candidatetags dto = null;
            CandidatetagsExample example = new CandidatetagsExample();
            if (!StringUtils.isEmpty(params.getOrderby())) {
                example.setOrderByClause(params.getOrderby());
            }
            if (params.getQuery() != null) {
                Date createtimest = params.getQuery().getDate("createtimest");
                Date createtimeed = params.getQuery().getDate("createtimeed");
                dto = JSONObject.toJavaObject(params.getQuery(), Candidatetags.class);
                example.createCriteria();
                if (dto.getDelflag() == null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(DelFlagE.NO.code);
                }
                if (dto.getDelflag() != null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(dto.getDelflag());

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
            }
        }

        // 返回分页数据
        return new PageResultDTO(count, list);
    }

    @Override
    public int remove(Candidatetags dto) {

        Candidatetags delDto = new Candidatetags();
        delDto.setTag(dto.getTag());
        delDto.setDelflag(DelFlagE.YES.code);

        return mapper.updateByPrimaryKeySelective(delDto);
    }

    @Override
    public int changeState(Candidatetags dto) {

        return mapper.updateByPrimaryKeySelective(dto);
    }

    @Override
    public List<Candidatetags> query(CandidatetagsExample example) {
        return mapper.selectByExample(example);
    }
}
