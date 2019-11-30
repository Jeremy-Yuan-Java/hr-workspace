package com.hrbc.business.controller;

import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.service.DepositReceviedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: hr-workspace
 * @description: 预收
 * @author: 波波烤鸭
 * @create: 2019-11-19 18:19
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/deposit", produces = {"application/json;charset=UTF-8"})
public class DepositReceviedController {

    @Autowired
    private DepositReceviedService service;

    @PostMapping("loadPage")
    public PageResultDTO loadPage(@RequestBody PageQueryParamDTO params) {
        // 返回分页数据
        PageResultDTO dto = service.loadPage(params);
        return dto;
    }
}
