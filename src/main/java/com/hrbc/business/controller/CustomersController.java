package com.hrbc.business.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.common.JwtToken;
import com.hrbc.business.domain.Customers;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.CustomersService;
import com.hrbc.business.util.Patten;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.util.Date;

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
        service.save(entity);
        return new ResponseDTO(true, "success", entity.getId());
    }

    @PostMapping("changeopsuser")
    public ResponseDTO changeopsuser(@RequestBody Customers entity) {
        service.changeOpsUser(entity);
        return new ResponseDTO(true, "success", entity.getId());
    }


    @PostMapping("communicate")
    public ResponseDTO communicate(@RequestBody Customers entity) {
        service.saveCommunicate(entity);
        return new ResponseDTO(true, "success", entity.getId());
    }



    @PostMapping("loadPage")
    public PageResultDTO loadPage(@RequestBody PageQueryParamDTO params) {

        // 返回分页数据
        return service.loadPage(params);
    }

    @GetMapping("remove/{id}")
    public ResponseDTO remove(@PathVariable Integer id) {
        if (id != null) {
			Customers dto = new Customers();
            dto.setId(id);
            service.remove(dto);
        }
        return new ResponseDTO(true, "success", id);
    }

    @GetMapping("state/{id}/{state}")
    public ResponseDTO changeState(@PathVariable Integer id, @PathVariable Integer state) {
        if (state != null) {
			Customers dto = new Customers();
            dto.setId(id);
            dto.setState(state);
            service.changeState(dto);
        }
        return new ResponseDTO(true, "success", id);
    }

}
