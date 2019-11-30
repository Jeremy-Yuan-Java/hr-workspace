package com.hrbc.business.service;

import com.hrbc.business.domain.JobsCandidatesAccount;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;

public interface JobsCandidatesAccountService {

    public JobsCandidatesAccount get(Integer id);

    public int save(JobsCandidatesAccount entity);

    public PageResultDTO loadPage(PageQueryParamDTO params);

    public int remove(JobsCandidatesAccount dto);
}
