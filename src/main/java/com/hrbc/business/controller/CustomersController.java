package com.hrbc.business.controller;

import com.hrbc.business.domain.Customers;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "api/customers", produces = {"application/json;charset=UTF-8"})
public class CustomersController {

    @Autowired
    private CustomersService service;

    @GetMapping("get/{id}")
    public Customers get(@PathVariable Integer id) {
        return service.get(id);
    }

    @PostMapping("save")
    public ResponseDTO save(@RequestBody Customers entity) {
        int res = service.save(entity);
        if (res == -2) {
            return new ResponseDTO(false, "客户名称已经存在", null);
        }
        return new ResponseDTO(true, "操作成功", entity.getId());
    }

    @PostMapping("changeopsuser")
    public ResponseDTO changeopsuser(@RequestBody Customers entity) {
        service.changeOpsUser(entity);
        return new ResponseDTO(true, "操作成功", entity.getId());
    }


    @PostMapping("communicate")
    public ResponseDTO communicate(@RequestBody Customers entity) {
        service.saveCommunicate(entity);
        return new ResponseDTO(true, "操作成功", entity.getId());
    }


    @PostMapping("loadPage")
    public PageResultDTO loadPage(@RequestBody PageQueryParamDTO params) {
        // 返回分页数据
        PageResultDTO dto = service.loadPage(params);
        return dto;
    }

    @GetMapping("remove/{id}")
    public ResponseDTO remove(@PathVariable Integer id) {
        if (id != null) {
            Customers dto = new Customers();
            dto.setId(id);
            service.remove(dto);
        }
        return new ResponseDTO(true, "操作成功", id);
    }

    @GetMapping("state/{id}/{state}")
    public ResponseDTO changeState(@PathVariable Integer id, @PathVariable Integer state) {
        if (state != null) {
            Customers dto = new Customers();
            dto.setId(id);
            dto.setState(state);
            service.changeState(dto);
        }
        return new ResponseDTO(true, "操作成功", id);
    }

}
