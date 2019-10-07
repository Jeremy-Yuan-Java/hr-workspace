package com.hrbc.business.controller;


import com.hrbc.business.conf.PathConf;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.CandidatesResumeService;
import com.hrbc.business.service.CandidatesService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Path;
import java.util.Date;
import java.util.Map;

/**
 * @program: business
 * @description: 简历模块
 * @author: 波波烤鸭
 * @create: 2019-08-09 09:46
 */
@CrossOrigin
@Controller
@RequestMapping("/api/resume")
public class ResumeController {

    @Autowired
    private CandidatesService candidatesService;

    @Autowired
    private CandidatesResumeService resumeService;

    /**
     * 导出简历模板
     * @param id
     * @param request
     * @param response
     */
    @RequestMapping("/exportWordFromTemplate/{id}")
    public void exportWordFromTemplate(@PathVariable Integer id, HttpServletRequest request, HttpServletResponse response){
        Map<String, Object> map = resumeService.resolveExportCandidatesInfo(id);
        try {
            // 通过freemarker创建一个文档
            File file = createWord(map, map.get("name"));
            InputStream in = new FileInputStream(file);
            //设置响应头和客户端保存文件名
            response.setCharacterEncoding("utf-8");
            response.setContentType("multipart/form-data");
            response.setHeader("Content-Disposition", "attachment;fileName=" + map.get("name") + "的简历报告.doc" );
            ServletOutputStream out = response.getOutputStream();
            byte[] b = new byte[1024];
            int num = 0 ;
            while( (num = in.read(b)) != -1 ){
                out.write(b,0,num);
            }
            in.close();
            out.flush();
            out.close();
            // 删除临时文件
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 导出简历模板
     * @param reportfile
     * @param request
     * @param response
     */
    @RequestMapping("/exportResumeReportFile/{reportfile}")
    public void exportResumeReportFile(@PathVariable String reportfile, HttpServletRequest request, HttpServletResponse response){

        try {
            // 通过freemarker创建一个文档
            File file = new File(PathConf.getSavePathReport(),reportfile);
            InputStream in = new FileInputStream(file);
            //设置响应头和客户端保存文件名
            response.setCharacterEncoding("utf-8");
            response.setContentType("multipart/form-data");
            response.setHeader("Content-Disposition", "attachment;fileName=" + reportfile + "的简历报告.doc" );
            ServletOutputStream out = response.getOutputStream();
            byte[] b = new byte[1024];
            int num = 0 ;
            while( (num = in.read(b)) != -1 ){
                out.write(b,0,num);
            }
            in.close();
            out.flush();
            out.close();
            // 删除临时文件
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建简历模板
     * @param dataMap
     * @param fileName
     * @return
     */
    public File createWord(Map<String,Object> dataMap,Object fileName){
        Configuration configuration = new Configuration();
        //设置编码
        configuration.setDefaultEncoding("UTF-8");
        try {
            configuration.setDirectoryForTemplateLoading(new File(PathConf.getResumeReportPath()));
            Template template = configuration.getTemplate("ytmb.ftl");
            File path = new File("tmp");
            if (!path.exists()) {
                path.mkdirs();
            }
            File outFile = new File(path,fileName+".docx");
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile),"UTF-8"));
            //生成文件
            template.process(dataMap, out);
            //关闭流
            out.flush();
            out.close();
            return outFile;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    /**
     *  上传简历 并解析简历
     * @param file
     * @param model
     * @param request
     * @return
     */
    @PostMapping(value = "/upload/resume")
    @ResponseBody
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
                // 解析简历
                InputStream in = new FileInputStream(dest);
                // 解析 简历
                int flag =resumeService.resolveResume(in,suffixName);
                if ( flag == -3) {
                    // 表示手机号码已经存在了
                    return new ResponseDTO(false, "手机号已经存在了", null);
                } else if ( flag <= 0) {
                    return new ResponseDTO(false, "解析操作失败了", null);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new ResponseDTO(true, "", null);
    }


    /**
     * 根据候选人的编号返回其对应的  简历详情
     * 简历预览功能
     * @param candidatesId
     */
    @GetMapping(value = "/loadResumeDetails/{candidatesId}")
    @ResponseBody
    public ResponseDTO loadResumeDetails(@PathVariable Integer candidatesId){
        if (candidatesId != null) {
            return resumeService.loadResumeDetail(candidatesId);
        }
        return new ResponseDTO(false,"候选人编号不能为空",null);
    }
}
