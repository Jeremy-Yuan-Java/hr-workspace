package com.hrbc.business.service.impl;

import com.hrbc.business.common.JwtToken;
import com.hrbc.business.domain.Performance;
import com.hrbc.business.domain.PerformanceDetail;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PerformanceDto;
import com.hrbc.business.mapper.PerformanceMapper;
import com.hrbc.business.service.PerformanceService;
import com.hrbc.business.util.QuickTimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @program: hr-workspace
 * @description: 绩效业务实现类
 * @author: 波波烤鸭
 * @create: 2019-09-26 22:46
 */
@Service
public class PerformanceServiceImpl  implements PerformanceService {

    @Autowired
    private PerformanceMapper performanceMapper;

    @Override
    public PerformanceDto query(PageQueryParamDTO params) {
        PerformanceDto dto = null;
        Performance performance = new Performance();
        String activeName = null;
        if(params != null && params.getQuery() != null){
            // 查询数据的时间范围
            Date createtimest = params.getQuery().getDate("createtimest");
            Date createtimeed = params.getQuery().getDate("createtimeed");

            if (createtimest != null){
                String startDate = QuickTimeUtil.dateParseString(createtimest,"yyyy-MM-dd");
                createtimest = QuickTimeUtil.stringParseDate(startDate,"yyyy-MM-dd");
                performance.setCreatetimeststr(startDate);
            }

            if(createtimeed != null){
                Calendar c = Calendar.getInstance();
                c.setTime(createtimeed);
                c.add(Calendar.DAY_OF_MONTH,1);


                String endDate = QuickTimeUtil.dateParseString(c.getTime(),"yyyy-MM-dd");
                createtimeed = QuickTimeUtil.stringParseDate(endDate,"yyyy-MM-dd");
                performance.setCreatetimeedstr(endDate);
            }


            // 具体的查询条件
            String customername = params.getQuery().getString("customername");
            String jobname = params.getQuery().getString("jobname");
            String opusername = params.getQuery().getString("qopusername");
            activeName = params.getQuery().getString("activeName");

            String ismy = params.getQuery().getString("ismy");
            if(!StringUtils.isEmpty(ismy) && "yes".equals(ismy)){
                performance.setCurrentuser(JwtToken.getUser());
            }

            // 分组条件
            String group1 = params.getQuery().getString("group1");
            String group2 = params.getQuery().getString("group2");



            performance.setCreatetimest(createtimest);
            performance.setCreatetimeed(createtimeed);
            if(!StringUtils.isEmpty(customername)){
                performance.setQcustomername("%" + customername + "%");
            }
            if(!StringUtils.isEmpty(jobname)){
                performance.setQjobname("%" + jobname + "%");
            }
            if (!StringUtils.isEmpty(opusername)){
                performance.setQopusername("%" + opusername + "%");
            }
            performance.setGroup1(group1);
            performance.setGroup2(group2);
        }

        // 查询出月度的信息
        List<Performance> days = null;
        List<Performance> months = null;
        List<Performance> years = null;
        if(activeName !=null){
            if("first".equals(activeName)){
                days = performanceMapper.queryDay(performance);
            }

            if("second".equals(activeName)){
                months = performanceMapper.queryMonth(performance);
            }

            if("third".equals(activeName)){
                years = performanceMapper.queryYear(performance);
            }
        }

        dto = new PerformanceDto();
        dto.setDays(days);
        dto.setMonths(months);
        dto.setYears(years);

        return dto;
    }

    /**
     * 根据 用户编号和时间查询出具体的信息
     * @param params
     * @return
     */
    @Override
    public PerformanceDto queryRowDetail(PageQueryParamDTO params) {
        PerformanceDto dto = new PerformanceDto();
        if(params != null && params.getQuery() != null){
            String opdate = params.getQuery().getString("opdate");
            String opuser = params.getQuery().getString("opuser");

            // 查询数据的时间范围
            Date createtimest = params.getQuery().getDate("createtimest");
            Date createtimeed = params.getQuery().getDate("createtimeed");
            String createtimeststr = null;
            String createtimeedstr = null;
            if (createtimest != null){
                createtimeststr = QuickTimeUtil.dateParseString(createtimest,"yyyy-MM-dd");
                //createtimest = QuickTimeUtil.stringParseDate(startDate,"yyyy-MM-dd");

            }

            if(createtimeed != null){
                Calendar c = Calendar.getInstance();
                c.setTime(createtimeed);
                c.add(Calendar.DAY_OF_MONTH,1);


                createtimeedstr = QuickTimeUtil.dateParseString(c.getTime(),"yyyy-MM-dd");
                //createtimeed = QuickTimeUtil.stringParseDate(endDate,"yyyy-MM-dd");

            }

            System.out.println("------>"+createtimest);
            System.out.println(createtimeed);

            List<Performance> list = null;
            // 判断是查询  年 月  日 的数据
            if (opdate.contains("-")){
                // 判断是 月 日   2019-09-09
                if(opdate.indexOf("-") == opdate.lastIndexOf("-")){
                    // 月份
                    list = performanceMapper.queryRowMonth(opdate,opuser,createtimeststr,createtimeedstr);
                }else{
                    // 天
                    list = performanceMapper.queryRowDay(opdate,opuser,createtimeststr,createtimeedstr);
                }
            }else{
                // 查询年份的数据
                list = performanceMapper.queryRowYear(opdate,opuser,createtimeststr,createtimeedstr);
            }

            for (Performance p:list) {
                p.setHasChildren(false);
            }
            dto.setRowsdata(list);
        }
        return dto;
    }

    @Override
    public List<PerformanceDetail> queryDetail(PerformanceDetail detail) {
        if(detail != null){
            if (detail.getCreatetimest() != null){
                String createtimeststr = QuickTimeUtil.dateParseString(detail.getCreatetimest(),"yyyy-MM-dd");
                //createtimest = QuickTimeUtil.stringParseDate(startDate,"yyyy-MM-dd");
                detail.setCreatetimeststr(createtimeststr);
            }

            if(detail.getCreatetimeed() != null){
                Calendar c = Calendar.getInstance();
                c.setTime(detail.getCreatetimeed());
                c.add(Calendar.DAY_OF_MONTH,1);


                String createtimeedstr = QuickTimeUtil.dateParseString(c.getTime(),"yyyy-MM-dd");
                //createtimeed = QuickTimeUtil.stringParseDate(endDate,"yyyy-MM-dd");
                detail.setCreatetimeedstr(createtimeedstr);

            }
            return performanceMapper.queryDetail(detail);
        }
        return null;
    }

    /**
     * 查询月度绩效分
     * @param params
     * @return
     */
    @Override
    public PerformanceDto queryMonthlyPerformance(PageQueryParamDTO params) {

        PerformanceDto dto = new PerformanceDto();
        String qmonth = null;
        String opusername = null;
        String currentuser = null;
        if(params != null && params.getQuery() != null){
            Date qmonthDate = params.getQuery().getDate("qmonth");
            if (qmonthDate != null) {
               qmonth = QuickTimeUtil.dateParseString(qmonthDate,"yyyy-MM");
            }
            opusername = params.getQuery().getString("qopusername");
            if(!StringUtils.isEmpty(opusername)){
                opusername = "%" +opusername +"%";
            }
            String ismy = params.getQuery().getString("ismy");
            if(!StringUtils.isEmpty(ismy) && "yes".equals(ismy)){
                currentuser = JwtToken.getUser();
            }
        }
        List<Performance> list = performanceMapper.queryMonthlyPerformance(qmonth,opusername,currentuser);
        dto.setMonthly(list);
        return dto;
    }
}
