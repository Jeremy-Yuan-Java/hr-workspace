package com.hrbc.business.controller;

import com.hrbc.business.domain.PerformanceDetail;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PerformanceDto;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.PerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: hr-workspace
 * @description: 绩效控制器
 * @author: 波波烤鸭
 * @create: 2019-09-26 22:59
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/performance", produces = {"application/json;charset=UTF-8"})
public class PerformanceController {

    @Autowired
    private PerformanceService performanceService;

    @RequestMapping("loadPage")
    public PerformanceDto query(@RequestBody PageQueryParamDTO params){
        return performanceService.query(params);
    }

    @RequestMapping("loadRowPage")
    public PerformanceDto loadRowPage(@RequestBody PageQueryParamDTO params){
        return performanceService.queryRowDetail(params);
    }

    @RequestMapping("loadRowPageDetail")
    public ResponseDTO loadRowPageDetail(@RequestBody PerformanceDetail detail){
        List<PerformanceDetail> details = performanceService.queryDetail(detail);
        if (detail != null){
            return new ResponseDTO(true,"查询成功",details);
        }
        return new ResponseDTO(false,"无数据",null);
    }

    @RequestMapping("loadMonthlyPage")
    public PerformanceDto loadMonthlyPerformance(@RequestBody PageQueryParamDTO params){
        return performanceService.queryMonthlyPerformance(params);
    }




}
