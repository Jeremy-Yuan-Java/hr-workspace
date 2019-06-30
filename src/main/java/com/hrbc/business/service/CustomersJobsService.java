package com.hrbc.business.service;

import com.hrbc.business.domain.CustomersJobs;
import com.hrbc.business.domain.CustomersJobsExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;

import java.util.List;

public interface CustomersJobsService {
    public CustomersJobs get(Integer id);

    public int save(CustomersJobs entity);

    public PageResultDTO loadPage(PageQueryParamDTO params);

    public int remove(CustomersJobs dto);

    public int changeState(CustomersJobs dto);

    public List<CustomersJobs> query(CustomersJobsExample example);

    }
