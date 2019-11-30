package com.hrbc.business.controller;

import com.hrbc.business.domain.JobsCandidatesAccount;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.JobsCandidatesAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: hr-workspace
 * @description: 财务管理-到账管理 控制器
 * @author: 波波烤鸭
 * @create: 2019-11-07 11:27
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/account", produces = {"application/json;charset=UTF-8"})
public class JobsCandidatesAccountController {

    @Autowired
    private JobsCandidatesAccountService service;

    @GetMapping("get/{id}")
    public JobsCandidatesAccount get(@PathVariable Integer id) {
        return service.get(id);
    }

    @PostMapping("save")
    public ResponseDTO save(@RequestBody JobsCandidatesAccount entity) {
        int res = service.save(entity);
        if (res < 0) {
            return new ResponseDTO(false, "操作失败", null);
        }
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
            JobsCandidatesAccount dto = new JobsCandidatesAccount();
            dto.setId(id);
            service.remove(dto);
        }
        return new ResponseDTO(true, "操作成功", id);
    }

}
