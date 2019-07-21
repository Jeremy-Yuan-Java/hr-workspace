package com.hrbc.business.mapper;

import com.hrbc.business.domain.CustomersJobsTeam;
import com.hrbc.business.domain.CustomersJobsTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomersJobsTeamMapper {
    long countByExample(CustomersJobsTeamExample example);

    int deleteByExample(CustomersJobsTeamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomersJobsTeam record);

    int insertSelective(CustomersJobsTeam record);

    List<CustomersJobsTeam> selectByExample(CustomersJobsTeamExample example);

    CustomersJobsTeam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomersJobsTeam record, @Param("example") CustomersJobsTeamExample example);

    int updateByExample(@Param("record") CustomersJobsTeam record, @Param("example") CustomersJobsTeamExample example);

    int updateByPrimaryKeySelective(CustomersJobsTeam record);

    int updateByPrimaryKey(CustomersJobsTeam record);

    int batchInsert(@Param("recordList") List<CustomersJobsTeam> recordList);
}