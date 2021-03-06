package com.hrbc.business.mapper;

import com.hrbc.business.domain.DepositRecevied;
import com.hrbc.business.domain.Performance;
import com.hrbc.business.domain.PerformanceDetail;
import com.hrbc.business.domain.WorkPlan;
import com.hrbc.business.domain.common.PerformanceDto;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 绩效对应的映射 接口文件
 */
public interface PerformanceMapper {



    List<Performance> queryDay(Performance performance);

    List<Performance> queryMonth(Performance performance);

    List<Performance> queryYear(Performance performance);

    List<Performance> queryRowYear(@Param("opdate") String opdate, @Param("opuser") String opuser,@Param("createtimeststr") String createtimeststr,@Param("createtimeedstr")String createtimeedstr);

    List<Performance> queryRowMonth(@Param("opdate") String opdate,@Param("opuser") String opuser,@Param("createtimeststr") String createtimeststr,@Param("createtimeedstr")String createtimeedstr);

    List<Performance> queryRowDay(@Param("opdate") String opdate,@Param("opuser") String opuser,@Param("createtimeststr") String createtimeststr,@Param("createtimeedstr") String createtimeedstr);

    List<PerformanceDetail> queryDetail(PerformanceDetail detail);

    List<Performance> queryMonthlyPerformance(@Param("opdate") String opdate,@Param("opusername") String opuser,@Param("currentuser") String currentuser);

    List<DepositRecevied> queryDepositRecevied(DepositRecevied depositRecevied);

    Integer countDepositRecevied(DepositRecevied depositRecevied);

    Integer querySignCount(WorkPlan plan);

    String queryOfferComplete(WorkPlan plan);

    String queryPerformance(WorkPlan plan);
}
