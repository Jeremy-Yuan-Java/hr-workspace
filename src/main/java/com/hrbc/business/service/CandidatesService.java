package com.hrbc.business.service;

import com.hrbc.business.domain.Candidates;
import com.hrbc.business.domain.CandidatesExample;
import com.hrbc.business.domain.CandidatesWithBLOBs;
import com.hrbc.business.domain.common.CandidatesDto;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;

import java.util.List;

public interface CandidatesService {

    public CandidatesDto getWithBLOBs(Integer id);

    public Candidates get(Integer id);

    public int save(CandidatesDto entity, Integer flag);

    public PageResultDTO loadPage(PageQueryParamDTO params);

    public int remove(CandidatesWithBLOBs dto);

    public int changeState(CandidatesWithBLOBs dto);

    public List<Candidates> query(CandidatesExample example);

    }
