package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.domain.SysUser;
import com.hrbc.business.domain.SysUserExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.mapper.SysUserMapper;
import com.hrbc.business.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper mapper;

    @Override
    public SysUser get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(SysUser entity) {

        if (entity != null && !StringUtils.isEmpty(entity.getId())) {
            return mapper.updateByPrimaryKeySelective(entity);
        } else {
            return mapper.insertSelective(entity);

        }
    }

    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {

        int count = 0;
        List<SysUser> list = null;
        int page = 1;
        int size = 10;
        if (params != null) {
            if (params.getPage() >= 0) {
                page = params.getPage();
            }
            if (params.getSize() >= 0) {
                size = params.getSize();
            }
            SysUser dto = null;
            SysUserExample example = new SysUserExample();
            if (!StringUtils.isEmpty(params.getOrderby())) {
                example.setOrderByClause(params.getOrderby());
            }
            if (params.getQuery() != null) {
                dto = JSONObject.toJavaObject(params.getQuery(), SysUser.class);
                example.createCriteria();

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
    public int remove(SysUser dto) {

        return mapper.deleteByPrimaryKey(dto.getId());
    }

    @Override
    public int changeState(SysUser dto) {

        return mapper.updateByPrimaryKeySelective(dto);
    }

    @Override
    public List<SysUser> query(SysUserExample example) {
        return mapper.selectByExample(example);
    }
}
