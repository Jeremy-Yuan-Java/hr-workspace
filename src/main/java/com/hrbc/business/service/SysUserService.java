package com.hrbc.business.service;

import com.hrbc.business.domain.SysUser;
import com.hrbc.business.domain.SysUserExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;

import java.util.List;

public interface SysUserService {
    public SysUser get(Integer id);

    public int save(SysUser entity);
    public int verify(SysUser entity);

    public PageResultDTO loadPage(PageQueryParamDTO params);

    public int remove(SysUser dto);

    public int changeState(SysUser dto);
    public int changePWD(SysUser dto);

    public List<SysUser> query(SysUserExample example);

    }
