package com.hrbc.business.mapper;

import com.hrbc.business.domain.CandidatesResume;
import com.hrbc.business.domain.CandidatesResumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CandidatesResumeMapper {
    long countByExample(CandidatesResumeExample example);

    int deleteByExample(CandidatesResumeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CandidatesResume record);

    int insertSelective(CandidatesResume record);

    List<CandidatesResume> selectByExampleWithBLOBs(CandidatesResumeExample example);

    List<CandidatesResume> selectByExample(CandidatesResumeExample example);

    CandidatesResume selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CandidatesResume record, @Param("example") CandidatesResumeExample example);

    int updateByExampleWithBLOBs(@Param("record") CandidatesResume record, @Param("example") CandidatesResumeExample example);

    int updateByExample(@Param("record") CandidatesResume record, @Param("example") CandidatesResumeExample example);

    int updateByPrimaryKeySelective(CandidatesResume record);

    int updateByPrimaryKeyWithBLOBs(CandidatesResume record);

    int updateByPrimaryKey(CandidatesResume record);

    int batchInsert(@Param("recordList") List<CandidatesResume> recordList);
}