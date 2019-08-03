package com.hrbc.business.service;

import com.hrbc.business.domain.Majors;
import com.hrbc.business.domain.MajorsExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;

import java.util.List;

public interface MajorsService {
    public Majors get(Integer id);

    public int save(Majors entity);

    public PageResultDTO loadPage(PageQueryParamDTO params);

    public int remove(Majors dto);

    public int changeState(Majors dto);

    public List<Majors> query(MajorsExample example);

    public void generateJSON();

}
