package com.hrbc.business.mapper;

import com.hrbc.business.domain.Candidates;
import com.hrbc.business.domain.CandidatesExample;
import com.hrbc.business.domain.CandidatesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CandidatesMapper {
    long countByExample(CandidatesExample example);

    int deleteByExample(CandidatesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CandidatesWithBLOBs record);

    int insertSelective(CandidatesWithBLOBs record);

    List<CandidatesWithBLOBs> selectByExampleWithBLOBs(CandidatesExample example);

    List<Candidates> selectByExample(CandidatesExample example);

    CandidatesWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CandidatesWithBLOBs record, @Param("example") CandidatesExample example);

    int updateByExampleWithBLOBs(@Param("record") CandidatesWithBLOBs record, @Param("example") CandidatesExample example);

    int updateByExample(@Param("record") Candidates record, @Param("example") CandidatesExample example);

    int updateByPrimaryKeySelective(CandidatesWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CandidatesWithBLOBs record);

    int updateByPrimaryKey(Candidates record);

    int batchInsert(@Param("recordList") List<CandidatesWithBLOBs> recordList);
}