package com.hrbc.business.mapper;

import com.hrbc.business.domain.CandidatesResumeProjectinfo;
import com.hrbc.business.domain.CandidatesResumeProjectinfoExample;
import com.hrbc.business.domain.CandidatesResumeProjectinfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CandidatesResumeProjectinfoMapper {
    long countByExample(CandidatesResumeProjectinfoExample example);

    int deleteByExample(CandidatesResumeProjectinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CandidatesResumeProjectinfoWithBLOBs record);

    int insertSelective(CandidatesResumeProjectinfoWithBLOBs record);

    List<CandidatesResumeProjectinfoWithBLOBs> selectByExampleWithBLOBs(CandidatesResumeProjectinfoExample example);

    List<CandidatesResumeProjectinfo> selectByExample(CandidatesResumeProjectinfoExample example);

    CandidatesResumeProjectinfoWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CandidatesResumeProjectinfoWithBLOBs record, @Param("example") CandidatesResumeProjectinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") CandidatesResumeProjectinfoWithBLOBs record, @Param("example") CandidatesResumeProjectinfoExample example);

    int updateByExample(@Param("record") CandidatesResumeProjectinfo record, @Param("example") CandidatesResumeProjectinfoExample example);

    int updateByPrimaryKeySelective(CandidatesResumeProjectinfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CandidatesResumeProjectinfoWithBLOBs record);

    int updateByPrimaryKey(CandidatesResumeProjectinfo record);

    int batchInsert(@Param("recordList") List<CandidatesResumeProjectinfoWithBLOBs> recordList);
}