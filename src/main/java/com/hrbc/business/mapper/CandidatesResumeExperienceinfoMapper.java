package com.hrbc.business.mapper;

import com.hrbc.business.domain.CandidatesResumeExperienceinfo;
import com.hrbc.business.domain.CandidatesResumeExperienceinfoExample;
import com.hrbc.business.domain.CandidatesResumeExperienceinfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CandidatesResumeExperienceinfoMapper {
    long countByExample(CandidatesResumeExperienceinfoExample example);

    int deleteByExample(CandidatesResumeExperienceinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CandidatesResumeExperienceinfoWithBLOBs record);

    int insertSelective(CandidatesResumeExperienceinfoWithBLOBs record);

    List<CandidatesResumeExperienceinfoWithBLOBs> selectByExampleWithBLOBs(CandidatesResumeExperienceinfoExample example);

    List<CandidatesResumeExperienceinfo> selectByExample(CandidatesResumeExperienceinfoExample example);

    CandidatesResumeExperienceinfoWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CandidatesResumeExperienceinfoWithBLOBs record, @Param("example") CandidatesResumeExperienceinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") CandidatesResumeExperienceinfoWithBLOBs record, @Param("example") CandidatesResumeExperienceinfoExample example);

    int updateByExample(@Param("record") CandidatesResumeExperienceinfo record, @Param("example") CandidatesResumeExperienceinfoExample example);

    int updateByPrimaryKeySelective(CandidatesResumeExperienceinfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CandidatesResumeExperienceinfoWithBLOBs record);

    int updateByPrimaryKey(CandidatesResumeExperienceinfo record);

    int batchInsert(@Param("recordList") List<CandidatesResumeExperienceinfoWithBLOBs> recordList);
}