package com.hrbc.business.service;

import com.hrbc.business.domain.Candidatetags;
import com.hrbc.business.domain.CandidatetagsExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;

import java.util.List;

public interface CandidatetagsService {
    public Candidatetags get(String id);

    public int save(Candidatetags entity);

    public PageResultDTO loadPage(PageQueryParamDTO params);

    public int remove(Candidatetags dto);

    public int changeState(Candidatetags dto);

    public List<Candidatetags> query(CandidatetagsExample example);

    }
