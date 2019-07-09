package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.domain.SysUser;
import com.hrbc.business.domain.SysUserExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.domain.enums.StateE;
import com.hrbc.business.mapper.SysUserMapper;
import com.hrbc.business.service.SysUserService;
import com.hrbc.business.util.MD5Encode;
import org.apache.commons.codec.digest.Md5Crypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper mapper;


    @Override
    public int verify(SysUser entity) {
        SysUserExample example = new SysUserExample();
        example.createCriteria().andUsernameEqualTo(entity.getUsername()).andStateEqualTo(StateE.VALID.code);

        return 1;
    }

    @Override
    public SysUser get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(SysUser entity) {

        if (entity != null && !StringUtils.isEmpty(entity.getId())) {
            entity.setPwd(null);
            return mapper.updateByPrimaryKeySelective(entity);
        } else {
            entity.setPwd(MD5Encode.md5(entity.getPwd(), entity.getUsername()));
            return mapper.insertSelective(entity);

        }
    }

    @Override
    public int changePWD(SysUser dto) {
        dto.setPwd(Md5Crypt.md5Crypt(dto.getPwd().getBytes(), dto.getUsername()));
        return mapper.updateByPrimaryKeySelective(dto);

    }

    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {

        long count = 0;
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
                if (dto.getDelflag() == null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(DelFlagE.NO.code);
                }
                if (dto.getDelflag() != null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(dto.getDelflag());

                }
                if (dto.getState() != null) {
                    example.getOredCriteria().get(0).andStateEqualTo(dto.getState());

                }
                if (!StringUtils.isEmpty(dto.getUsername())) {
                    example.getOredCriteria().get(0).andUsernameLike("%"+dto.getUsername()+"%");

                }
                if (!StringUtils.isEmpty(dto.getCnname())) {
                    example.getOredCriteria().get(0).andCnnameLike("%"+dto.getCnname()+"%");

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
    public int remove(SysUser dto) {

        SysUser delDto = new SysUser();
        delDto.setId(dto.getId());
        delDto.setDelflag(DelFlagE.YES.code);

        return mapper.updateByPrimaryKeySelective(delDto);
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
