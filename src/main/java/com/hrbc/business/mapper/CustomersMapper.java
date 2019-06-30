package com.hrbc.business.mapper;

import com.hrbc.business.domain.Customers;
import com.hrbc.business.domain.CustomersExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CustomersMapper {
    int countByExample(CustomersExample example);

    int deleteByExample(CustomersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Customers record);

    int insertSelective(Customers record);

    List<Customers> selectByExampleWithBLOBs(CustomersExample example);

    List<Customers> selectByExample(CustomersExample example);

    Customers selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Customers record, @Param("example") CustomersExample example);

    int updateByExampleWithBLOBs(@Param("record") Customers record, @Param("example") CustomersExample example);

    int updateByExample(@Param("record") Customers record, @Param("example") CustomersExample example);

    int updateByPrimaryKeySelective(Customers record);

    int updateByPrimaryKeyWithBLOBs(Customers record);

    int updateByPrimaryKey(Customers record);
}