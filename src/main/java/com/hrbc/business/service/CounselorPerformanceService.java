package com.hrbc.business.service;

import com.hrbc.business.domain.CounselorPerformanceDeduct;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;

public interface CounselorPerformanceService {

    public CounselorPerformanceDeduct get(Integer id);

    public int save(CounselorPerformanceDeduct entity);

    public PageResultDTO loadPage(PageQueryParamDTO params);

    public int remove(CounselorPerformanceDeduct dto);
}
