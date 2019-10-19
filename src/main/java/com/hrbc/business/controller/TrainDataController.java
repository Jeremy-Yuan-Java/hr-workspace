package com.hrbc.business.controller;

import com.hrbc.business.conf.PathConf;
import com.hrbc.business.domain.TrainData;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.TrainDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

/**
 * @program: hr-workspace
 * @description: 培训资料
 * @author: 波波烤鸭
 * @create: 2019-10-17 16:33
 */
@CrossOrigin
@RestController
@RequestMapping(value = "api/traindata", produces = {"application/json;charset=UTF-8"})
public class TrainDataController {

    @Autowired
    private TrainDataService service;

    @PostMapping("loadPage")
    public PageResultDTO loadPage(@RequestBody PageQueryParamDTO params) {
        return service.loadPage(params);
    }

    /**
     *  上传简历 并解析简历
     * @param file
     * @param model
     * @param request
     * @return
     */
    @PostMapping(value = "/upload/video")
    @ResponseBody
    public ResponseDTO fileUploadVedio(@RequestParam(value = "file") MultipartFile file, Model model, HttpServletRequest request) {
        if (file.isEmpty() ) {
            System.out.println("文件为空/数据为空");
        }
        String fileName = file.getOriginalFilename();
        File dest = null;
        String suffixName = fileName.substring(fileName.lastIndexOf("."));

        String newFileName = PathConf.SUFFIX_CAVIDEO.concat(new Date().getTime()+"").concat(suffixName);
        dest = new File(PathConf.getSavePathVideo().concat(newFileName));

        if (dest != null) {
            try {
                file.transferTo(dest);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new ResponseDTO(true, "", fileName + ";" + newFileName);
    }

    @PostMapping("save")
    public ResponseDTO save(@RequestBody TrainData entity) {

        service.save(entity);

        return new ResponseDTO(true, "操作成功", entity.getId());
    }

    @GetMapping("remove/{id}")
    public ResponseDTO remove(@PathVariable Integer id) {
        if (id != null) {
           /* Customers dto = new Customers();
            dto.setId(id);
            service.remove(dto);*/
           TrainData data = new TrainData();
           data.setId(id);
           service.remove(data);
        }
        return new ResponseDTO(true, "操作成功", id);
    }

}
