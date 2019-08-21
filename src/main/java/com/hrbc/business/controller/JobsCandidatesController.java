package com.hrbc.business.controller;

import com.hrbc.business.conf.PathConf;
import com.hrbc.business.domain.JobsCandidates;
import com.hrbc.business.domain.JobsCandidatesState;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.JobsCandidatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;

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
        int i = service.save(entity);

        if(i==-3){
            return new ResponseDTO(false, "候选人Offer确认,无法操作", entity.getId());
        }

        return new ResponseDTO(true, "操作成功", entity.getId());
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

        }else if (res == -3) {
            return new ResponseDTO(false, "候选人Offer确认,已锁定", null);

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
            JobsCandidates dto = new JobsCandidates();
            dto.setId(id);
            service.remove(dto);
        }
        return new ResponseDTO(true, "操作成功", id);
    }

    @GetMapping("state/{id}/{state}")
    public ResponseDTO changeState(@PathVariable Integer id, @PathVariable Integer state) {
        if (state != null) {
            JobsCandidates dto = new JobsCandidates();
            dto.setId(id);
            dto.setState(state);
            service.changeState(dto);
        }
        return new ResponseDTO(true, "操作成功", id);
    }

    @PostMapping("changeflowstate")
    public ResponseDTO changeFlowState(@RequestBody JobsCandidatesState state) {
        if (state == null || state.getJcid() == null || state.getFlowstate() == null) {
            return new ResponseDTO(false, "职位选定错误", state);
        }

        int i = service.changeFlowState(state);
        if(i==-3){
            return new ResponseDTO(false, "候选人Offer确认,无法操作", state.getId());
        }
        if (i == -1) {
            return new ResponseDTO(false, "已经执行该状态", state);

        }
        return new ResponseDTO(true, "操作成功", state);

    }

    @PostMapping(value = "/upload/report")
    public ResponseDTO fileUpload(@RequestParam(value = "file") MultipartFile file,  Model model, HttpServletRequest request) {

        if (file.isEmpty()) {
            System.out.println("文件为空/数据为空");
        }
        String fileName = file.getOriginalFilename();
        File dest = null;
        String suffixName = fileName.substring(fileName.lastIndexOf("."));

        fileName = PathConf.SUFFIX_REPORT.concat(new Date().getTime() + "").concat(suffixName);
        dest = new File(PathConf.getSavePathReport().concat(fileName));

        if (dest != null) {
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            } else {
                try {
                    Files.delete(dest.toPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                file.transferTo(dest);
            } catch (IOException e) {
                e.printStackTrace();
                return new ResponseDTO(false, "上传失败", null);
            }
        }

        return new ResponseDTO(true, "fileName", fileName);
    }
}
