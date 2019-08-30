package com.hrbc.business.mapper;

import com.hrbc.business.domain.CandidatesResumeEducationinfo;
import com.hrbc.business.domain.CandidatesResumeEducationinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CandidatesResumeEducationinfoMapper {
    long countByExample(CandidatesResumeEducationinfoExample example);

    int deleteByExample(CandidatesResumeEducationinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CandidatesResumeEducationinfo record);

    int insertSelective(CandidatesResumeEducationinfo record);

    List<CandidatesResumeEducationinfo> selectByExample(CandidatesResumeEducationinfoExample example);

    CandidatesResumeEducationinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CandidatesResumeEducationinfo record, @Param("example") CandidatesResumeEducationinfoExample example);

    int updateByExample(@Param("record") CandidatesResumeEducationinfo record, @Param("example") CandidatesResumeEducationinfoExample example);

    int updateByPrimaryKeySelective(CandidatesResumeEducationinfo record);

    int updateByPrimaryKey(CandidatesResumeEducationinfo record);

    int batchInsert(@Param("recordList") List<CandidatesResumeEducationinfo> recordList);
}