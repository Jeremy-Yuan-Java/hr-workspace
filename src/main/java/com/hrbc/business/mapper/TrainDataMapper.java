package com.hrbc.business.mapper;

import com.hrbc.business.domain.TrainData;
import com.hrbc.business.domain.TrainDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainDataMapper {
    long countByExample(TrainDataExample example);

    int deleteByExample(TrainDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TrainData record);

    int insertSelective(TrainData record);

    List<TrainData> selectByExample(TrainDataExample example);

    TrainData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TrainData record, @Param("example") TrainDataExample example);

    int updateByExample(@Param("record") TrainData record, @Param("example") TrainDataExample example);

    int updateByPrimaryKeySelective(TrainData record);

    int updateByPrimaryKey(TrainData record);

    int batchInsert(@Param("recordList") List<TrainData> recordList);
}