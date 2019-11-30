package com.hrbc.business.mapper;

import com.hrbc.business.domain.JobsCandidatesAccount;
import com.hrbc.business.domain.JobsCandidatesAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobsCandidatesAccountMapper {
    long countByExample(JobsCandidatesAccountExample example);

    int deleteByExample(JobsCandidatesAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobsCandidatesAccount record);

    int insertSelective(JobsCandidatesAccount record);

    List<JobsCandidatesAccount> selectByExample(JobsCandidatesAccountExample example);

    JobsCandidatesAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobsCandidatesAccount record, @Param("example") JobsCandidatesAccountExample example);

    int updateByExample(@Param("record") JobsCandidatesAccount record, @Param("example") JobsCandidatesAccountExample example);

    int updateByPrimaryKeySelective(JobsCandidatesAccount record);

    int updateByPrimaryKey(JobsCandidatesAccount record);

    int batchInsert(@Param("recordList") List<JobsCandidatesAccount> recordList);
}