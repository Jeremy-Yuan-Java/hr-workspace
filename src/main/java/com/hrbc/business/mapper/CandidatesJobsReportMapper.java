package com.hrbc.business.mapper;

import com.hrbc.business.domain.CandidatesJobsReport;
import com.hrbc.business.domain.CandidatesJobsReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CandidatesJobsReportMapper {
    long countByExample(CandidatesJobsReportExample example);

    int deleteByExample(CandidatesJobsReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CandidatesJobsReport record);

    int insertSelective(CandidatesJobsReport record);

    List<CandidatesJobsReport> selectByExample(CandidatesJobsReportExample example);

    CandidatesJobsReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CandidatesJobsReport record, @Param("example") CandidatesJobsReportExample example);

    int updateByExample(@Param("record") CandidatesJobsReport record, @Param("example") CandidatesJobsReportExample example);

    int updateByPrimaryKeySelective(CandidatesJobsReport record);

    int updateByPrimaryKey(CandidatesJobsReport record);

    int batchInsert(@Param("recordList") List<CandidatesJobsReport> recordList);
}