package com.hrbc.business.mapper;

import com.hrbc.business.domain.JobsCandidatesState;
import com.hrbc.business.domain.JobsCandidatesStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobsCandidatesStateMapper {
    long countByExample(JobsCandidatesStateExample example);

    int deleteByExample(JobsCandidatesStateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobsCandidatesState record);

    int insertSelective(JobsCandidatesState record);

    List<JobsCandidatesState> selectByExampleWithBLOBs(JobsCandidatesStateExample example);

    List<JobsCandidatesState> selectByExample(JobsCandidatesStateExample example);

    JobsCandidatesState selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobsCandidatesState record, @Param("example") JobsCandidatesStateExample example);

    int updateByExampleWithBLOBs(@Param("record") JobsCandidatesState record, @Param("example") JobsCandidatesStateExample example);

    int updateByExample(@Param("record") JobsCandidatesState record, @Param("example") JobsCandidatesStateExample example);

    int updateByPrimaryKeySelective(JobsCandidatesState record);

    int updateByPrimaryKeyWithBLOBs(JobsCandidatesState record);

    int updateByPrimaryKey(JobsCandidatesState record);

    int batchInsert(@Param("recordList") List<JobsCandidatesState> recordList);
}