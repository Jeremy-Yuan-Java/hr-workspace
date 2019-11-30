package com.hrbc.business.controller;

import com.hrbc.business.domain.CounselorPerformanceDeduct;
import com.hrbc.business.domain.JobsCandidatesAccount;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.CounselorPerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: hr-workspace
 * @description: 绩效和提成
 * @author: 波波烤鸭
 * @create: 2019-11-16 20:20
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/performanceDeduct", produces = {"application/json;charset=UTF-8"})
public class PerformanceDeductController {

    @Autowired
    private CounselorPerformanceService service;

    @PostMapping("loadPage")
    public PageResultDTO loadPage(@RequestBody PageQueryParamDTO params) {
        // 返回分页数据
        PageResultDTO dto = service.loadPage(params);
        return dto;
    }

    @PostMapping("save")
    public ResponseDTO save(@RequestBody CounselorPerformanceDeduct entity) {
        int res = service.save(entity);
        if (res < 0) {
            return new ResponseDTO(false, "操作失败", null);
        }
        return new ResponseDTO(true, "操作成功", entity.getId());
    }
}
