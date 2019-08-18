package com.hrbc.business.controller;

import com.hrbc.business.domain.CustomersJobs;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.CustomersJobsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "api/customersJobs", produces = {"application/json;charset=UTF-8"})
public class CustomersJobsController {
    private static final Logger logger = LoggerFactory.getLogger(CustomersJobsController.class);

    @Autowired
    private CustomersJobsService service;

    @GetMapping("get/{id}")
    public CustomersJobs get(@PathVariable Integer id) {
        return service.get(id);
    }

    @PostMapping("save")
    public ResponseDTO save(@RequestBody CustomersJobs entity) {
        try {
            service.save(entity);
        } catch (Exception e) {
            logger.error("",e);
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
			CustomersJobs dto = new CustomersJobs();
            dto.setId(id);
            service.remove(dto);
        }
        return new ResponseDTO(true, "操作成功", id);
    }

    @GetMapping("state/{id}/{state}")
    public ResponseDTO changeState(@PathVariable Integer id, @PathVariable Integer state) {
        if (state != null) {
			CustomersJobs dto = new CustomersJobs();
            dto.setId(id);
            dto.setState(state);
            service.changeState(dto);
        }
        return new ResponseDTO(true, "操作成功", id);
    }

}
