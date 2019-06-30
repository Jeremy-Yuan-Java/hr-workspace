package com.hrbc.business.mapper;

import com.hrbc.business.domain.CustomersJobs;
import com.hrbc.business.domain.CustomersJobsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CustomersJobsMapper {
    int countByExample(CustomersJobsExample example);

    int deleteByExample(CustomersJobsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomersJobs record);

    int insertSelective(CustomersJobs record);

    List<CustomersJobs> selectByExample(CustomersJobsExample example);

    CustomersJobs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomersJobs record, @Param("example") CustomersJobsExample example);

    int updateByExample(@Param("record") CustomersJobs record, @Param("example") CustomersJobsExample example);

    int updateByPrimaryKeySelective(CustomersJobs record);

    int updateByPrimaryKey(CustomersJobs record);
}