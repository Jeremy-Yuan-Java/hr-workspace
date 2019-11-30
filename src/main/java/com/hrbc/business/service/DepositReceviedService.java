package com.hrbc.business.service;

import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;

public interface DepositReceviedService {

    public PageResultDTO loadPage(PageQueryParamDTO params);
}
