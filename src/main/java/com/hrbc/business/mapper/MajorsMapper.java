package com.hrbc.business.mapper;

import com.hrbc.business.domain.Majors;
import com.hrbc.business.domain.MajorsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MajorsMapper {
    int countByExample(MajorsExample example);

    int deleteByExample(MajorsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Majors record);

    int insertSelective(Majors record);

    List<Majors> selectByExample(MajorsExample example);

    Majors selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Majors record, @Param("example") MajorsExample example);

    int updateByExample(@Param("record") Majors record, @Param("example") MajorsExample example);

    int updateByPrimaryKeySelective(Majors record);

    int updateByPrimaryKey(Majors record);
}