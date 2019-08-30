package com.hrbc.business.controller;

import ch.qos.logback.classic.pattern.ClassNameOnlyAbbreviator;
import cn.afterturn.easypoi.entity.ImageEntity;
import cn.afterturn.easypoi.word.WordExportUtil;
import com.hrbc.business.common.Constants;
import com.hrbc.business.conf.PathConf;
import com.hrbc.business.domain.*;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.service.CandidatesResumeService;
import com.hrbc.business.service.CandidatesService;
import com.hrbc.business.util.QuickTimeUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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

    @RequestMapping("/exportWordFromTemplate/{id}")
    public void exportWordFromTemplate(@PathVariable Integer id, HttpServletRequest request, HttpServletResponse response){
        // 根据 候选人编号 获取相关的信息
        CandidatesWithBLOBs candidates = candidatesService.getWithBLOBs(id);
        Map<String, Object> map = resolveExportCandidatesInfo(id);
        try {
            XWPFDocument doc = WordExportUtil.exportWord07(PathConf.getResumeReportPath() + "ytmb.docx", map);
            //设置响应头和客户端保存文件名
            response.setCharacterEncoding("utf-8");
            response.setContentType("multipart/form-data");
            response.setHeader("Content-Disposition", "attachment;fileName=" + candidates.getUsername() + "的简历报告.docx" );
            response.setHeader("fileName",candidates.getUsername() + "的简历报告.docx");
            ServletOutputStream out = response.getOutputStream();
            doc.write(out);
            doc.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 处理导出数据
     * @param candidatesId
     * @return
     */
    public Map<String,Object> resolveExportCandidatesInfo(Integer candidatesId){
        Map<String, Object> map = new HashMap<String, Object>();
        // 根据 候选人编号 获取相关的信息
        CandidatesWithBLOBs candidates = candidatesService.getWithBLOBs(candidatesId);
        CandidatesResumeDetail resumeDetail = resumeService.queryResumeDetail(candidatesId);
        List<CandidatesResumeEducationinfo> edus = resumeService.queryResumeEdus(resumeDetail.getId());
        List<CandidatesResumeExperienceinfoWithBLOBs> exprs = resumeService.queryResumeExprs(resumeDetail.getId());
        List<CandidatesResumeProjectinfoWithBLOBs> pros = resumeService.queryResumePros(resumeDetail.getId());
        // 应聘职位
        map.put("forwardvocation",resumeDetail.getTitle()+" ");
        // 应聘时间
        map.put("now",new Date());
        // 姓名
        map.put("name",resumeDetail.getName() == null ?" ":resumeDetail.getName());
        // 性别
        map.put("sex",resumeDetail.getSex() == null ? " ":resumeDetail.getSex());
        // 年龄
        map.put("age",resumeDetail.getAge() == null ?" ":resumeDetail.getAge());
        // 籍贯
        map.put("jiguan",resumeDetail.getJiguan()==null? " " : resumeDetail.getJiguan());
        // 婚姻
        map.put("marry",resumeDetail.getMarryied() == null ? " " : resumeDetail.getMarryied());
        // 现居
        map.put("location",resumeDetail.getNowlocation() == null ? " ":resumeDetail.getNowlocation());
        // 学历
        map.put("education",resumeDetail.getEducation() == null ? " ":resumeDetail.getEducation());
        // 是否统招
        map.put("studenttype","0".equals(resumeDetail.getStudenttype())?"统招":"自考" + " ");

        // 头像
        String imgPath = candidates.getPicpath();
        if (StringUtils.isNotEmpty(imgPath)) {
            ImageEntity image = new ImageEntity();
            image.setHeight(150);
            image.setWidth(150);
            image.setUrl(PathConf.getSavePathPic() + candidates.getPicpath());
            image.setType(ImageEntity.URL);
            map.put("imgcode", image);
        }else {
            map.put("imgcode", "未上传");
        }

        // 职业经历
        String works = getWorkInfo(exprs);
        map.put("works",works);
        // 职业状态
        map.put("jobstatus",resumeDetail.getIsjobsearch()==null?  " " :resumeDetail.getIsjobsearch() ) ;
        // 薪资
        map.put("nowsalary",resumeDetail.getSalary() == null  ? " ":resumeDetail.getSalary() );
        map.put("aimsalary",resumeDetail.getAimsalary() == null ? " " :resumeDetail.getAimsalary());

        // 到岗时间
        map.put("startfrom",resumeDetail.getStartfrom()==null ? " ":resumeDetail.getStartfrom());

        // 工作经历
        map.put("workdetail",getWorkDedatilInfo(exprs) );
        // 项目经历
        map.put("proj",getCandidatesProject(pros)  );
        // 教育经历
        map.put("edu",getCandidatesEdu(edus)  );

        return map;
    }

    public String getCandidatesEdu(List<CandidatesResumeEducationinfo > edus){
        StringBuilder sb = new StringBuilder();
        if (edus != null && edus.size() > 0) {
            for (CandidatesResumeEducationinfo edu:edus) {
                String start = QuickTimeUtil.dateParseString(edu.getStartdate(),"yyyy.MM");
                String endDate = QuickTimeUtil.dateParseString(edu.getEnddate(),"yyyy.MM") ;
                sb.append(start) ;
                sb.append(" ");
                sb.append(endDate);
                sb.append(" ");
                sb.append(edu.getSchool());
                sb.append(" ");
                sb.append(edu.getSpeciality());
                sb.append(" ");
                sb.append(edu.getEducation());
                sb.append(Constants.LF1);
            }
        }
        return sb.toString()+" ";
    }

    /**
     * 获取候选人的项目经历
     * @param pros
     * @return
     */
    public  String getCandidatesProject(List<CandidatesResumeProjectinfoWithBLOBs> pros){
        StringBuilder sb = new StringBuilder();
        if (pros != null && pros.size() > 0) {
            for (CandidatesResumeProjectinfoWithBLOBs p:pros){
                String start = QuickTimeUtil.dateParseString(p.getStartdate(),"yyyy.MM");
                sb.append(start);
                sb.append(" ");
                String endDate = QuickTimeUtil.dateParseString(p.getEnddate(),"yyyy.MM");
                sb.append(endDate);
                sb.append(" ");
                sb.append(p.getProjectname()==null?"":p.getProjectname());
                sb.append(" ");
                sb.append(p.getTitle()==null?"":p.getTitle()) ;
                sb.append(Constants.LF1);
                sb.append("项目介绍:"+p.getProjectdescription());
                sb.append(Constants.LF1);
                sb.append("个人职责:"+p.getResponsiblities());
                sb.append(Constants.LF1);
                sb.append(Constants.LF1);
            }
        }
        return sb.toString()+" ";
    }



    /**
     * 获取候选人的工作经历
     * @param exp
     * @return
     */
    public String getWorkInfo(List<CandidatesResumeExperienceinfoWithBLOBs>  exp){
        StringBuilder sb = new StringBuilder();
        if (exp != null && exp.size() > 0) {
            for (CandidatesResumeExperienceinfoWithBLOBs e: exp) {
                String start = QuickTimeUtil.dateParseString(e.getStartdate(),"yyyy.MM");
                sb.append(start);
                sb.append(" ");
                String endDate = QuickTimeUtil.dateParseString(e.getEnddate(),"yyyy.MM");
                sb.append(endDate == null?"至今":endDate);
                sb.append(" ");
                sb.append(e.getCompany());
                sb.append(" ");
                sb.append("(" + e.getPeriodsoftime() + "年)");
                sb.append(" ");
                sb.append(e.getTitle());
                sb.append(Constants.LF1) ;
            }
        }
        return sb.toString() + " ";
    }

    /**
     * 获取候选人 详细的工作经历
     * @param es
     * @return
     */
    public String getWorkDedatilInfo(List<CandidatesResumeExperienceinfoWithBLOBs> es){
        StringBuilder sb = new StringBuilder();
        if (es != null && es.size() > 0) {
            for (CandidatesResumeExperienceinfoWithBLOBs e:es) {
                String start = QuickTimeUtil.dateParseString(e.getStartdate(),"yyyy.MM" );
                sb.append(start);
                sb.append(" ");
                String endDate =  QuickTimeUtil.dateParseString(e.getEnddate(),"yyyy.MM");

                sb.append(endDate == null ?"至今":endDate);
                sb.append(" ");
                sb.append(e.getCompany() == null ? "" : e.getCompany());
                sb.append(" ");
                sb.append(e.getTitle() == null ? "" : e.getTitle());
                sb.append(Constants.LF1);
                sb.append("公司介绍:");
                sb.append(e.getCompanydescription() == null ? "" : e.getCompanydescription());
                sb.append(Constants.LF1);
                sb.append("汇报对象:");
                sb.append(e.getLeader()==null ? "": e.getLeader());
                sb.append(Constants.LF1);
                sb.append("下属人数:");
                sb.append(e.getUnderlingnumber()==null ? "" : e.getUnderlingnumber());
                sb.append(Constants.LF1);
                sb.append("工作职责:");
                sb.append(e.getSummary()==null ? "" : e.getSummary());
                sb.append(Constants.LF1);
                sb.append(Constants.LF1);
            }
        }
        return sb.toString() + " ";
    }


}
