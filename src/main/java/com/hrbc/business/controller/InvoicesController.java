package com.hrbc.business.controller;

import com.hrbc.business.domain.Customers;
import com.hrbc.business.domain.Invoices;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.InvoicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: hr-workspace
 * @description: 发票管理
 * @author: 波波烤鸭
 * @create: 2019-11-22 10:11
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/invoices", produces = {"application/json;charset=UTF-8"})
public class InvoicesController {

    @Autowired
    private InvoicesService service;

    @GetMapping("get/{id}")
    public Invoices get(@PathVariable Integer id) {
        return service.get(id);
    }

    @PostMapping("save")
    public ResponseDTO save(@RequestBody Invoices entity) {
        int res = service.save(entity);
        if (res < 0) {
            return new ResponseDTO(false, "操作失败", null);
        }
        return new ResponseDTO(true, "操作成功", entity.getId());
    }
    @PostMapping("loadPage")
    public PageResultDTO loadPage(@RequestBody PageQueryParamDTO params) {
        // 返回分页数据
        return service.loadPage(params);
    }

    @GetMapping("remove/{id}")
    public ResponseDTO remove(@PathVariable Integer id) {
        if (id != null) {
            Invoices dto = new Invoices();
            dto.setId(id);
            service.remove(dto);
        }
        return new ResponseDTO(true, "操作成功", id);
    }

}
