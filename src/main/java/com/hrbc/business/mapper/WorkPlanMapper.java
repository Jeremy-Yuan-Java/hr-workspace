package com.hrbc.business.mapper;

import com.hrbc.business.domain.WorkPlan;
import com.hrbc.business.domain.WorkPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkPlanMapper {
    long countByExample(WorkPlanExample example);

    int deleteByExample(WorkPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkPlan record);

    int insertSelective(WorkPlan record);

    List<WorkPlan> selectByExample(WorkPlanExample example);

    WorkPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkPlan record, @Param("example") WorkPlanExample example);

    int updateByExample(@Param("record") WorkPlan record, @Param("example") WorkPlanExample example);

    int updateByPrimaryKeySelective(WorkPlan record);

    int updateByPrimaryKey(WorkPlan record);

    int batchInsert(@Param("recordList") List<WorkPlan> recordList);
}