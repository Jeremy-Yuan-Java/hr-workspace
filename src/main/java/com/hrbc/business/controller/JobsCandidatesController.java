package com.hrbc.business.controller;

import com.hrbc.business.domain.JobsCandidates;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.JobsCandidatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "api/jobsCandidates", produces = {"application/json;charset=UTF-8"})
public class JobsCandidatesController {

    @Autowired
    private JobsCandidatesService service;

    @GetMapping("get/{id}")
    public JobsCandidates get(@PathVariable Integer id) {
        return service.get(id);
    }

    @PostMapping("save")
    public ResponseDTO save(@RequestBody JobsCandidates entity) {
        service.save(entity);
        return new ResponseDTO(true, "success", entity.getId());
    }

    @PostMapping("add")
    public ResponseDTO add(@RequestBody JobsCandidates entity) {
        if (entity.getCandidateid() == null || entity.getJobid() == null) {
            return new ResponseDTO(false, "参数错误", null);

        }
        int res = service.add(entity);
        if (res == -1) {
            return new ResponseDTO(false, "信息错误,无法加入", null);

        } else if (res == -2) {
            return new ResponseDTO(false, "已加入该职位", null);

        }
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
            JobsCandidates dto = new JobsCandidates();
            dto.setId(id);
            service.remove(dto);
        }
        return new ResponseDTO(true, "success", id);
    }

    @GetMapping("state/{id}/{state}")
    public ResponseDTO changeState(@PathVariable Integer id, @PathVariable Integer state) {
        if (state != null) {
            JobsCandidates dto = new JobsCandidates();
            dto.setId(id);
            dto.setState(state);
            service.changeState(dto);
        }
        return new ResponseDTO(true, "success", id);
    }

}
