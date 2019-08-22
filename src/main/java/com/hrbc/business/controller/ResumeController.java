package com.hrbc.business.controller;

import cn.afterturn.easypoi.entity.ImageEntity;
import cn.afterturn.easypoi.word.WordExportUtil;
import com.hrbc.business.common.Constants;
import com.hrbc.business.conf.PathConf;
import com.hrbc.business.domain.Candidates;
import com.hrbc.business.domain.CandidatesWithBLOBs;
import com.hrbc.business.service.CandidatesService;
import com.hrbc.business.util.QuickTimeUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
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


    @RequestMapping("/exportWordFromTemplate/{id}")
    public void exportWordFromTemplate(@PathVariable Integer id, HttpServletRequest request, HttpServletResponse response){
        // 根据 候选人编号 获取相关的信息
        CandidatesWithBLOBs candidates = candidatesService.getWithBLOBs(id);
        if (StringUtils.isEmpty(candidates.getWorkbase())) {
            candidates.setWorkbase("未知");
        }
        if (StringUtils.isEmpty(candidates.getLivebase())) {
            candidates.setLivebase("未知");
        }
        if ( StringUtils.isEmpty( candidates.getNowsalary())) {
            candidates.setNowsalary("未知");
        }
        if ( StringUtils.isEmpty( candidates.getAimsalary())) {
            candidates.setAimsalary("未知");
        }
        if ( StringUtils.isEmpty(candidates.getStartfrom())) {
            candidates.setStartfrom("未知");
        }
        if ( StringUtils.isEmpty(candidates.getEducationdetail())) {
            candidates.setExperiencedetail("未知");
        }
        if (StringUtils.isEmpty(candidates.getJiguan())){
            candidates.setJiguan("未知");
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("candidates",candidates);
        map.put("now", new Date());
        String work = getWorkInfo(candidates);
        // 保存工作经历
        map.put("work",work);

        // 保存工作经历  逐条
        map.put("wd",getWorkDedatilInfo(candidates));
        // 获取项目经历
        map.put("projects",getCandidatesProject(candidates));

        String imgPath = candidates.getPicpath();
        if (StringUtils.isNotEmpty(imgPath)) {
            ImageEntity image = new ImageEntity();
            image.setHeight(200);
            image.setWidth(200);
            image.setUrl(PathConf.getSavePathPic() + candidates.getPicpath());
            image.setType(ImageEntity.URL);
            map.put("imgCode", image);
        }

        try {
            //InputStream in = new FileInputStream("doc/ytmb1.docx");
            ClassPathResource resource = new ClassPathResource("doc" + File.separator + "ytmb.docx");
            // 获取文件流
            // InputStream inputStream = resource.getInputStream();
            // 获取文件
            File file = resource.getFile();
            if ( file.exists()) {
                XWPFDocument doc = WordExportUtil.exportWord07(file.getPath(), map);
                // FileOutputStream fos = new FileOutputStream("c:/tools/2.docx");
                //设置响应头和客户端保存文件名
                response.setCharacterEncoding("utf-8");
                response.setContentType("multipart/form-data");
                response.setHeader("Content-Disposition", "attachment;fileName=" + candidates.getUsername() + "的简历报告.docx" );
                response.setHeader("fileName",candidates.getUsername() + "的简历报告.docx");
                ServletOutputStream out = response.getOutputStream();
                doc.write(out);
                out.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取候选人的项目经历
     * @param candidates
     * @return
     */
    public static String getCandidatesProject(CandidatesWithBLOBs candidates){
        StringBuilder sb = new StringBuilder();
        String projects = candidates.getProjectdetails2().replace("<br/>",Constants.LF1);
        projects = projects.replace("<b>","");
        projects = projects.replace("</b>" , "");
        sb.append(projects.replace("\u2500",Constants.LF1));
       /* String work1projs = candidates.getWork1projs();
        if ( StringUtils.isNotEmpty(work1projs)) {
            sb.append(work1projs) ;
            sb.append(Constants.LF1) ;
        }
        String work2projs = candidates.getWork2projs();
        if ( StringUtils.isNotEmpty(work2projs)) {
            sb.append(work2projs) ;
            sb.append(Constants.LF1) ;
        }
        String work3projs = candidates.getWork3projs();
        if ( StringUtils.isNotEmpty(work3projs)) {
            sb.append(work3projs) ;
            sb.append(Constants.LF1) ;
        }
        String work4projs = candidates.getWork4projs();
        if ( StringUtils.isNotEmpty(work4projs)) {
            sb.append(work4projs) ;
            sb.append(Constants.LF1) ;
        }*/
        return sb.toString()+" ";
    }



    /**
     * 获取候选人的工作经历
     * @param candidates
     * @return
     */
    public String getWorkInfo(Candidates candidates){
        StringBuilder work = new StringBuilder();
        if(!StringUtils.isEmpty(candidates.getWork1())){
            work.append(QuickTimeUtil.dateParseString(candidates.getWork1stdate(),"yyyy.MM"));
            work.append(" - ");
            String endDate = QuickTimeUtil.dateParseString(candidates.getWork1eddate(),"yyyy.MM");
            work.append(endDate == null?"至今":endDate);
            work.append(" ");
            work.append(candidates.getWork1());
            work.append(" ");
            work.append("(" + candidates.getWorkyears() + "年)");
            work.append(" " + candidates.getJobtitle());
            work.append( Constants.LF1);
        }
        if( !StringUtils.isEmpty(candidates.getWork2())){
            work.append(QuickTimeUtil.dateParseString(candidates.getWork2stdate(),"yyyy.MM"));
            work.append(" - ");
            work.append(QuickTimeUtil.dateParseString(candidates.getWork2eddate(),"yyyy.MM"));
            work.append(" ");
            work.append(candidates.getWork2());
            work.append(" " + candidates.getWork2jobtitle());
            work.append( Constants.LF1);
        }

        if( !StringUtils.isEmpty(candidates.getWork3())){
            work.append(QuickTimeUtil.dateParseString(candidates.getWork3stdate(),"yyyy.MM"));
            work.append(" - ");
            work.append(QuickTimeUtil.dateParseString(candidates.getWork3eddate(),"yyyy.MM"));
            work.append(" ");
            work.append(candidates.getWork3());
            work.append(" " + candidates.getWork3jobtitle());
            work.append(Constants.LF1);
        }
        if( !StringUtils.isEmpty(candidates.getWork4())){
            work.append(QuickTimeUtil.dateParseString(candidates.getWork4stdate(),"yyyy.MM"));
            work.append(" - ");
            work.append(QuickTimeUtil.dateParseString(candidates.getWork4eddate(),"yyyy.MM"));
            work.append(" ");
            work.append(candidates.getWork4());
            work.append(" " + candidates.getWork4jobtitle());
            work.append( Constants.LF1);
        }
        return work.toString() + " ";
    }

    /**
     * 获取候选人 详细的工作经历
     * @param candidates
     * @return
     */
    public Map<String,Object> getWorkDedatilInfo(Candidates candidates){
        Map<String,Object> map = new HashMap<>();
        map.put("work1"," ");
        map.put("work1Info"," ");
        map.put("work2"," ");
        map.put("work2Info"," ");
        map.put("work3"," ");
        map.put("work3Info"," ");
        map.put("work4"," ");
        map.put("work4Info"," ");
        if(!StringUtils.isEmpty(candidates.getWork1())){
            // 时间  公司名称  职位
            StringBuilder work1 = new StringBuilder();
            work1.append(QuickTimeUtil.dateParseString(candidates.getWork1stdate(),"yyyy.MM"));
            work1.append(" - ");
            work1.append(QuickTimeUtil.dateParseString(candidates.getWork1eddate(),"yyyy.MM"));
            work1.append(" ");
            work1.append(candidates.getWork1() + " ");
            work1.append(candidates.getJobtitle()) ;
            map.put("work1",work1.toString());
            // 公司介绍： 汇报对象：  下属人数：工作职责： 求职原因：

            map.put("work1Info",getCommonInfo());
        }

        if(!StringUtils.isEmpty(candidates.getWork2())){
            // 时间  公司名称  职位
            StringBuilder work2 = new StringBuilder();
            work2.append(QuickTimeUtil.dateParseString(candidates.getWork2stdate(),"yyyy.MM"));
            work2.append(" - ");
            work2.append(QuickTimeUtil.dateParseString(candidates.getWork2eddate(),"yyyy.MM"));
            work2.append(" ");
            work2.append(candidates.getWork2() + " ");
            work2.append(candidates.getWork2jobtitle()) ;
            map.put("work2",work2.toString());
            // 公司介绍： 汇报对象：  下属人数：工作职责： 求职原因：
            map.put("work2Info",getCommonInfo());
        }

        if(!StringUtils.isEmpty(candidates.getWork3())){
            // 时间  公司名称  职位
            StringBuilder work3 = new StringBuilder();
            work3.append(QuickTimeUtil.dateParseString(candidates.getWork3stdate(),"yyyy.MM"));
            work3.append(" - ");
            work3.append(QuickTimeUtil.dateParseString(candidates.getWork3eddate(),"yyyy.MM"));
            work3.append(" ");
            work3.append(candidates.getWork3() + " ");
            work3.append(candidates.getWork3jobtitle()) ;
            map.put("work3",work3.toString());
            // 公司介绍： 汇报对象：  下属人数：工作职责： 求职原因：
            map.put("work3Info",getCommonInfo());
        }
        if(!StringUtils.isEmpty(candidates.getWork4())){
            // 时间  公司名称  职位
            StringBuilder work4 = new StringBuilder();
            work4.append(QuickTimeUtil.dateParseString(candidates.getWork4stdate(),"yyyy.MM"));
            work4.append(" - ");
            work4.append(QuickTimeUtil.dateParseString(candidates.getWork4eddate(),"yyyy.MM"));
            work4.append(" ");
            work4.append(candidates.getWork4() + " ");
            work4.append(candidates.getWork4jobtitle()) ;
            work4.append(Constants.LF1);
            map.put("work4",work4.toString());
            // 公司介绍： 汇报对象：  下属人数：工作职责： 求职原因：
            map.put("work4Info",getCommonInfo());
        }
        return map;
    }

    public String getCommonInfo(){
        StringBuilder work1Info = new StringBuilder();
        work1Info.append("公司介绍：" + Constants.LF1 );
        work1Info.append("汇报对象：" + Constants.LF1 );
        work1Info.append("下属人数：" + Constants.LF1 );
        work1Info.append("工作职责：" + Constants.LF1 );
        work1Info.append("求职原因：" + Constants.LF1 );
        return work1Info.toString() + " ";
    }
}
