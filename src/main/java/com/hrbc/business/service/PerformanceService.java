package com.hrbc.business.service;

import com.hrbc.business.domain.Performance;
import com.hrbc.business.domain.PerformanceDetail;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PerformanceDto;

import java.util.List;


public interface PerformanceService {

    PerformanceDto query(PageQueryParamDTO params);

    PerformanceDto queryRowDetail(PageQueryParamDTO params);

    List<PerformanceDetail> queryDetail(PerformanceDetail detail);

    PerformanceDto queryMonthlyPerformance(PageQueryParamDTO params);
}
