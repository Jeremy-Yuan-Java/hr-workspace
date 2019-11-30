package com.hrbc.business.service;

import com.hrbc.business.domain.Invoices;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;

public interface InvoicesService {
    public Invoices get(Integer id);

    public int save(Invoices entity);

    public PageResultDTO loadPage(PageQueryParamDTO params);

    public int remove(Invoices dto);
}
