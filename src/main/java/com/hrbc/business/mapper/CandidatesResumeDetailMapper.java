package com.hrbc.business.mapper;

import com.hrbc.business.domain.CandidatesResumeDetail;
import com.hrbc.business.domain.CandidatesResumeDetailExample;
import com.hrbc.business.domain.CandidatesResumeDetailWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CandidatesResumeDetailMapper {
    long countByExample(CandidatesResumeDetailExample example);

    int deleteByExample(CandidatesResumeDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CandidatesResumeDetailWithBLOBs record);

    int insertSelective(CandidatesResumeDetailWithBLOBs record);

    List<CandidatesResumeDetailWithBLOBs> selectByExampleWithBLOBs(CandidatesResumeDetailExample example);

    List<CandidatesResumeDetail> selectByExample(CandidatesResumeDetailExample example);

    CandidatesResumeDetailWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CandidatesResumeDetailWithBLOBs record, @Param("example") CandidatesResumeDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") CandidatesResumeDetailWithBLOBs record, @Param("example") CandidatesResumeDetailExample example);

    int updateByExample(@Param("record") CandidatesResumeDetail record, @Param("example") CandidatesResumeDetailExample example);

    int updateByPrimaryKeySelective(CandidatesResumeDetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CandidatesResumeDetailWithBLOBs record);

    int updateByPrimaryKey(CandidatesResumeDetail record);

    int batchInsert(@Param("recordList") List<CandidatesResumeDetailWithBLOBs> recordList);
}