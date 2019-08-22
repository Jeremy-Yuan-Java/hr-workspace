package com.hrbc.business.controller;

import com.hrbc.business.common.ResumeUtilAliy;
import com.hrbc.business.conf.PathConf;
import com.hrbc.business.domain.Candidates;
import com.hrbc.business.domain.CandidatesWithBLOBs;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.mapper.CandidatesMapper;
import com.hrbc.business.service.CandidatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping(value = "api/candidates", produces = {"application/json;charset=UTF-8"})
public class CandidatesController {

    @Autowired
    private CandidatesService service;

    @Autowired
    private CandidatesMapper mapper;

    @GetMapping("get/{id}")
    public CandidatesWithBLOBs get(@PathVariable Integer id) {
        return service.getWithBLOBs(id);
    }

    @PostMapping("save")
    public ResponseDTO save(@RequestBody CandidatesWithBLOBs entity) {
        entity.setPicpath(null);
        entity.setPostcard(null);
        entity.setResumefile(null);
        int i = service.save(entity);
        if (i == -3) {
            return new ResponseDTO(false, "候选人手机号存在", entity.getId());

        }
        return new ResponseDTO(true, "操作成功", entity.getId());
    }

    @PostMapping("loadPage")
    public PageResultDTO loadPage(@RequestBody PageQueryParamDTO params) {
        return service.loadPage(params);
    }

    @GetMapping("remove/{id}")
    public ResponseDTO remove(@PathVariable Integer id) {
        if (id != null) {
            CandidatesWithBLOBs dto = new CandidatesWithBLOBs();
            dto.setId(id);
            service.remove(dto);
        }
        return new ResponseDTO(true, "操作成功", id);
    }

    @GetMapping("state/{id}/{state}")
    public ResponseDTO changeState(@PathVariable Integer id, @PathVariable Integer state) {
        if (state != null) {
            CandidatesWithBLOBs dto = new CandidatesWithBLOBs();
            dto.setId(id);
            dto.setState(state);
            service.changeState(dto);
        }
        return new ResponseDTO(true, "操作成功", id);
    }

    @PostMapping(value = "/upload/pic")
    public ResponseDTO fileUpload(@RequestParam(value = "file") MultipartFile file, @RequestParam(value = "id") String id, @RequestParam(value = "type") String type, Model model, HttpServletRequest request) {

        if (file.isEmpty() || StringUtils.isEmpty(id) || StringUtils.isEmpty(type)) {
            System.out.println("文件为空/数据为空");
        }
        String fileName = file.getOriginalFilename();
        File dest = null;
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        // 1 代表上传头像 2 代表上传明信片 3 代表上传 简历  4 上传简历模板
        if ("1".equalsIgnoreCase(type)) {
            fileName = PathConf.SUFFIX_CAPIC.concat(id).concat(suffixName);
            dest = new File(PathConf.getSavePathPic().concat(fileName));

        } else if ("2".equalsIgnoreCase(type)) {
            fileName = PathConf.SUFFIX_CAPOSTCART.concat(id).concat(suffixName);
            dest = new File(PathConf.getSavePathPostcard().concat(fileName));

        } else if ("3".equalsIgnoreCase(type)) {
            fileName = PathConf.SUFFIX_CARESUME.concat(id).concat(suffixName);
            dest = new File(PathConf.getSavePathResume().concat(fileName));
        } else if ( "4".equalsIgnoreCase(type)){
            fileName = PathConf.SUFFIX_REPORT.concat(new Date().getTime() + "").concat(suffixName);
            dest = new File(PathConf.getSavePathReport().concat(fileName));
        }
        if (dest != null) {
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            } else {
                try {
                    Files.delete(dest.toPath());
                } catch (IOException e) {
                    // e.printStackTrace();
                }
            }
            try {
                file.transferTo(dest);

                CandidatesWithBLOBs candidates = new CandidatesWithBLOBs();
                candidates.setId(Integer.parseInt(id));
                if ("1".equalsIgnoreCase(type)) {
                    candidates.setPicpath(fileName);

                } else if ("2".equalsIgnoreCase(type)) {
                    candidates.setPostcard(fileName);

                } else if ("3".equalsIgnoreCase(type)) {
                    candidates.setResumefile(fileName);
                    candidates.setResumestate(1);

                } else {
                    return new ResponseDTO(false, "上传失败", null);
                }
                mapper.updateByPrimaryKeySelective(candidates);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return new ResponseDTO(true, "", null);
    }


    /**
     *  上传简历 并解析简历
     * @param file
     * @param model
     * @param request
     * @return
     */
    @PostMapping(value = "/upload/resume")
    public ResponseDTO fileUploadResume(@RequestParam(value = "file") MultipartFile file, Model model, HttpServletRequest request) {
        if (file.isEmpty() ) {
            System.out.println("文件为空/数据为空");
        }
        String fileName = file.getOriginalFilename();
        File dest = null;
        String suffixName = fileName.substring(fileName.lastIndexOf("."));

        fileName = PathConf.SUFFIX_CARESUME.concat(new Date().getTime()+"").concat(suffixName);
        dest = new File(PathConf.getSavePathResume().concat(fileName));



        if (dest != null) {
            try {
                file.transferTo(dest);
                CandidatesWithBLOBs candidates = new CandidatesWithBLOBs();
                candidates.setPicpath(null);
                candidates.setPostcard(null);
                candidates.setResumefile(fileName);
                // 解析简历
                InputStream in = new FileInputStream(dest);
                // 解析 简历
                ResumeUtilAliy.parseResume(in,candidates,suffixName);


                //mapper.insertSelective(candidates);
                int flag = service.save(candidates);
                if ( flag == -3) {
                    // 表示手机号码已经存在了
                    return new ResponseDTO(false, "手机号已经存在了", null);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return new ResponseDTO(true, "", null);
    }



}
