package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.common.Constants;
import com.hrbc.business.common.JwtToken;
import com.hrbc.business.domain.Staffs;
import com.hrbc.business.domain.StaffsExample;
import com.hrbc.business.domain.SysUser;
import com.hrbc.business.domain.SysUserExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.domain.enums.StateE;
import com.hrbc.business.mapper.StaffsMapper;
import com.hrbc.business.mapper.SysUserMapper;
import com.hrbc.business.service.SysUserService;
import com.hrbc.business.util.MD5Encode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper mapper;
    @Autowired
    private StaffsMapper staffsMapper;

    @Override
    public int verify(SysUser entity) {
        SysUserExample example = new SysUserExample();
        example.createCriteria().andUsernameEqualTo(entity.getUsername())
                .andStateEqualTo(StateE.VALID.code).andPwdEqualTo(MD5Encode.md5(entity.getPwd(), entity.getUsername()));
        List<SysUser> sysUsers = mapper.selectByExample(example);
        if (CollectionUtils.isEmpty(sysUsers)) {
            return 0;
        } else {

            entity.setCnname(sysUsers.get(0).getCnname());
            entity.setId(sysUsers.get(0).getId());

            try {
                StaffsExample example1 = new StaffsExample();
                example1.createCriteria().andUsernameEqualTo(entity.getUsername());
                List<Staffs> list = staffsMapper.selectByExample(example1);
                if (!CollectionUtils.isEmpty(list)) {
                    JwtToken.CURRENTSTAFFMAP.put(entity.getUsername(), list.get(0));
                    entity.setCnname(list.get(0).getStaffname());
                    entity.setStaffid(list.get(0).getId());

                }
            } catch (Exception e) {
                e.printStackTrace();
            }


            return 1;
        }
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
        String username = JwtToken.getUser();
        SysUserExample example = new SysUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<SysUser> list = mapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(list)) {
            dto.setPwd(MD5Encode.md5(dto.getPwd(), username));
            dto.setId(list.get(0).getId());
            return mapper.updateByPrimaryKeySelective(dto);
        }
        return 0;

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
                    example.getOredCriteria().get(0).andUsernameLike("%" + dto.getUsername() + "%");

                }
                if (!StringUtils.isEmpty(dto.getCnname())) {
                    example.getOredCriteria().get(0).andCnnameLike("%" + dto.getCnname() + "%");

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


    @Override
    public int resetPwd(SysUser dto) {
        SysUserExample example = new SysUserExample();
        example.createCriteria().andUsernameEqualTo(dto.getUsername());
        List<SysUser> list = mapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(list)) {
            dto.setPwd(MD5Encode.md5(Constants.DEFAULT_PWD, dto.getUsername()));
            dto.setId(list.get(0).getId());
            return mapper.updateByPrimaryKeySelective(dto);
        }
        return 0;

    }

}
