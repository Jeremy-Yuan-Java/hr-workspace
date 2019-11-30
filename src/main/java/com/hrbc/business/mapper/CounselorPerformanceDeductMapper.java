package com.hrbc.business.mapper;

import com.hrbc.business.domain.CounselorPerformanceDeduct;
import com.hrbc.business.domain.CounselorPerformanceDeductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CounselorPerformanceDeductMapper {
    long countByExample(CounselorPerformanceDeductExample example);

    int deleteByExample(CounselorPerformanceDeductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CounselorPerformanceDeduct record);

    int insertSelective(CounselorPerformanceDeduct record);

    List<CounselorPerformanceDeduct> selectByExample(CounselorPerformanceDeductExample example);

    CounselorPerformanceDeduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CounselorPerformanceDeduct record, @Param("example") CounselorPerformanceDeductExample example);

    int updateByExample(@Param("record") CounselorPerformanceDeduct record, @Param("example") CounselorPerformanceDeductExample example);

    int updateByPrimaryKeySelective(CounselorPerformanceDeduct record);

    int updateByPrimaryKey(CounselorPerformanceDeduct record);

    int batchInsert(@Param("recordList") List<CounselorPerformanceDeduct> recordList);
}