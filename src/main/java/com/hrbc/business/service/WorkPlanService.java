package com.hrbc.business.service;

import com.hrbc.business.domain.WorkPlan;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;

public interface WorkPlanService {

    public WorkPlan get(Integer id);

    public int save(WorkPlan entity);

    public PageResultDTO loadPage(PageQueryParamDTO params);

    public int remove(WorkPlan dto);

}
