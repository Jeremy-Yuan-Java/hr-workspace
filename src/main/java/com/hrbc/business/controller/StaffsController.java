package com.hrbc.business.controller;

import com.hrbc.business.domain.Staffs;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.StaffsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "api/staffs", produces = {"application/json;charset=UTF-8"})
public class StaffsController {

    @Autowired
    private StaffsService service;

    @GetMapping("get/{id}")
    public Staffs get(@PathVariable Integer id) {
        return service.get(id);
    }

    @PostMapping("save")
    public ResponseDTO save(@RequestBody Staffs entity) {
        service.save(entity);
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
			Staffs dto = new Staffs();
            dto.setId(id);
            service.remove(dto);
        }
        return new ResponseDTO(true, "success", id);
    }

    @GetMapping("state/{id}/{state}")
    public ResponseDTO changeState(@PathVariable Integer id, @PathVariable Integer state) {
        if (state != null) {
			Staffs dto = new Staffs();
            dto.setId(id);
            dto.setState(state);
            service.changeState(dto);
        }
        return new ResponseDTO(true, "success", id);
    }

}