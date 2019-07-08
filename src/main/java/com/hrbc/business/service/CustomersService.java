package com.hrbc.business.service;

import com.hrbc.business.domain.Customers;
import com.hrbc.business.domain.CustomersExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;

import java.util.List;

public interface CustomersService {
    public Customers get(Integer id);

    public int save(Customers entity);

    public int changeOpsUser(Customers entity);


    public Customers saveCommunicate(Customers entity);

    public PageResultDTO loadPage(PageQueryParamDTO params);

    public int remove(Customers dto);

    public int changeState(Customers dto);

    public List<Customers> query(CustomersExample example);

    }
