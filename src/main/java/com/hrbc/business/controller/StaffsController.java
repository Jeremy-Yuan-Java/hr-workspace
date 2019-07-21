package com.hrbc.business.controller;

import com.hrbc.business.conf.PathConf;
import com.hrbc.business.domain.Staffs;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.StaffsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

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
        entity.setPicpath(null);
        int i = service.save(entity);
        if (i == -1) {
            return new ResponseDTO(false, "系统账户存在", null);
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


    @PostMapping(value = "/upload/pic")
    public ResponseDTO fileUpload(@RequestParam(value = "file") MultipartFile file, @RequestParam(value = "id") String id, Model model, HttpServletRequest request) {
        if (file.isEmpty() || StringUtils.isEmpty(id)) {
            System.out.println("文件为空/数据为空");
        }
        String fileName = file.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        fileName = PathConf.SUFFIX_STAFFPIC.concat(id) + suffixName;
        File dest = new File(PathConf.getSavePathPic().concat(fileName));
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

            Staffs staffs = new Staffs();
            staffs.setId(Integer.parseInt(id));
            staffs.setPicpath(fileName);
            service.save(staffs);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ResponseDTO(true, "", PathConf.ACCESS_PATH_PIC.concat(fileName));
    }

}
