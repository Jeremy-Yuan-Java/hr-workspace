package com.hrbc.business.service;

import com.hrbc.business.domain.JobsCandidates;
import com.hrbc.business.domain.JobsCandidatesExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;

import java.util.List;

public interface JobsCandidatesService {
    public JobsCandidates get(Integer id);

    public int save(JobsCandidates entity);
    public int add(JobsCandidates entity);

    public PageResultDTO loadPage(PageQueryParamDTO params);

    public int remove(JobsCandidates dto);

    public int changeState(JobsCandidates dto);

    public List<JobsCandidates> query(JobsCandidatesExample example);

    }
