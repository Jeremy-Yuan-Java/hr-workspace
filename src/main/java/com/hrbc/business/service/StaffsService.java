package com.hrbc.business.service;

import com.hrbc.business.domain.Staffs;
import com.hrbc.business.domain.StaffsExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;

import java.util.List;

public interface StaffsService {
    public Staffs get(Integer id);

    public int save(Staffs entity);

    public PageResultDTO loadPage(PageQueryParamDTO params);

    public int remove(Staffs dto);

    public int changeState(Staffs dto);

    public List<Staffs> query(StaffsExample example);

    }
