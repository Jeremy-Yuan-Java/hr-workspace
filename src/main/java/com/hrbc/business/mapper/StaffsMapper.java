package com.hrbc.business.mapper;

import com.hrbc.business.domain.Staffs;
import com.hrbc.business.domain.StaffsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StaffsMapper {
    int countByExample(StaffsExample example);

    int deleteByExample(StaffsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Staffs record);

    int insertSelective(Staffs record);

    List<Staffs> selectByExample(StaffsExample example);

    Staffs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Staffs record, @Param("example") StaffsExample example);

    int updateByExample(@Param("record") Staffs record, @Param("example") StaffsExample example);

    int updateByPrimaryKeySelective(Staffs record);

    int updateByPrimaryKey(Staffs record);
}