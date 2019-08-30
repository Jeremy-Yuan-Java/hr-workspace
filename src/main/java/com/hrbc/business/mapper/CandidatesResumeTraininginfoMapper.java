package com.hrbc.business.mapper;

import com.hrbc.business.domain.CandidatesResumeTraininginfo;
import com.hrbc.business.domain.CandidatesResumeTraininginfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CandidatesResumeTraininginfoMapper {
    long countByExample(CandidatesResumeTraininginfoExample example);

    int deleteByExample(CandidatesResumeTraininginfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CandidatesResumeTraininginfo record);

    int insertSelective(CandidatesResumeTraininginfo record);

    List<CandidatesResumeTraininginfo> selectByExampleWithBLOBs(CandidatesResumeTraininginfoExample example);

    List<CandidatesResumeTraininginfo> selectByExample(CandidatesResumeTraininginfoExample example);

    CandidatesResumeTraininginfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CandidatesResumeTraininginfo record, @Param("example") CandidatesResumeTraininginfoExample example);

    int updateByExampleWithBLOBs(@Param("record") CandidatesResumeTraininginfo record, @Param("example") CandidatesResumeTraininginfoExample example);

    int updateByExample(@Param("record") CandidatesResumeTraininginfo record, @Param("example") CandidatesResumeTraininginfoExample example);

    int updateByPrimaryKeySelective(CandidatesResumeTraininginfo record);

    int updateByPrimaryKeyWithBLOBs(CandidatesResumeTraininginfo record);

    int updateByPrimaryKey(CandidatesResumeTraininginfo record);

    int batchInsert(@Param("recordList") List<CandidatesResumeTraininginfo> recordList);
}