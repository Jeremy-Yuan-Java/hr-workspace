package com.hrbc.business.mapper;

import com.hrbc.business.domain.OpLog;
import com.hrbc.business.domain.OpLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpLogMapper {
    long countByExample(OpLogExample example);

    int deleteByExample(OpLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpLog record);

    int insertSelective(OpLog record);

    List<OpLog> selectByExample(OpLogExample example);

    OpLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OpLog record, @Param("example") OpLogExample example);

    int updateByExample(@Param("record") OpLog record, @Param("example") OpLogExample example);

    int updateByPrimaryKeySelective(OpLog record);

    int updateByPrimaryKey(OpLog record);

    int batchInsert(@Param("recordList") List<OpLog> recordList);
}