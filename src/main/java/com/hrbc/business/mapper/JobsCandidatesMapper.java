package com.hrbc.business.mapper;

import com.hrbc.business.domain.JobsCandidates;
import com.hrbc.business.domain.JobsCandidatesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobsCandidatesMapper {
    long countByExample(JobsCandidatesExample example);

    int deleteByExample(JobsCandidatesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobsCandidates record);

    int insertSelective(JobsCandidates record);

    List<JobsCandidates> selectByExampleWithBLOBs(JobsCandidatesExample example);

    List<JobsCandidates> selectByExample(JobsCandidatesExample example);

    JobsCandidates selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobsCandidates record, @Param("example") JobsCandidatesExample example);

    int updateByExampleWithBLOBs(@Param("record") JobsCandidates record, @Param("example") JobsCandidatesExample example);

    int updateByExample(@Param("record") JobsCandidates record, @Param("example") JobsCandidatesExample example);

    int updateByPrimaryKeySelective(JobsCandidates record);

    int updateByPrimaryKeyWithBLOBs(JobsCandidates record);

    int updateByPrimaryKey(JobsCandidates record);

    int batchInsert(@Param("recordList") List<JobsCandidates> recordList);
}