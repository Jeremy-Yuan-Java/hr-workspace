package com.hrbc.business.controller;

import cn.afterturn.easypoi.entity.ImageEntity;
import cn.afterturn.easypoi.word.WordExportUtil;
import com.hrbc.business.common.Constants;
import com.hrbc.business.common.ResumeUtil;
import com.hrbc.business.conf.PathConf;
import com.hrbc.business.domain.Candidates;
import com.hrbc.business.service.CandidatesService;
import com.hrbc.business.util.QuickTimeUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
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
import java.io.FileInputStream;
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
        Candidates candidates = candidatesService.get(id);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("candidates",candidates);
        map.put("now", new Date());
        String work = getWorkInfo(candidates);
        // 保存工作经历
        map.put("work",work);
        // 保存教育经历
        map.put("edu",getCandidateEdu(candidates));
        // 保存工作经历  逐条
        map.put("wd",getWorkDedatilInfo(candidates));

        ImageEntity image = new ImageEntity();
        image.setHeight(200);
        image.setWidth(200);
        image.setUrl(PathConf.getSavePathPic() + candidates.getPicpath());
        image.setType(ImageEntity.URL);
        map.put("imgCode", image);
        try {
            //InputStream in = new FileInputStream("doc/ytmb1.docx");
            ClassPathResource resource = new ClassPathResource("doc" + File.separator + "ytmb.docx");
            // 获取文件流
            InputStream inputStream = resource.getInputStream();
            // 获取文件
            File file = resource.getFile();

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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取候选人的教育经历
     * @return
     */
    public String getCandidateEdu(Candidates candidates){
        StringBuilder edu = new StringBuilder();
        if(! StringUtils.isEmpty(candidates.getEducations())){
            edu.append("最高学历:"+candidates.getEducations() + "\r");
        }
        if ( !StringUtils.isEmpty(candidates.getEdu1())) {
            edu.append(candidates.getEdu1());
            edu.append(" ( ");
            edu.append(QuickTimeUtil.dateParseString(candidates.getEdu1stdate(),"yyyy.MM"));
            edu.append(" - ");
            edu.append(QuickTimeUtil.dateParseString(candidates.getEdu1eddate(),"yyyy.MM"));
            edu.append(" ) "+"\r");
        }
        if ( !StringUtils.isEmpty(candidates.getEdu2())) {
            edu.append(candidates.getEdu2());
            edu.append(" ( ");
            edu.append(QuickTimeUtil.dateParseString(candidates.getEdu2stdate(),"yyyy.MM"));
            edu.append(" - ");
            edu.append(QuickTimeUtil.dateParseString(candidates.getEdu2eddate(),"yyyy.MM"));
            edu.append(" ) "+"\r");
        }
        if ( !StringUtils.isEmpty(candidates.getEdu3())) {
            edu.append(candidates.getEdu3());
            edu.append(" ( ");
            edu.append(QuickTimeUtil.dateParseString(candidates.getEdu3stdate(),"yyyy.MM"));
            edu.append(" - ");
            edu.append(QuickTimeUtil.dateParseString(candidates.getEdu3eddate(),"yyyy.MM"));
            edu.append(" ) "+"\r");
        }
        return edu.toString() + " ";
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
            work.append(QuickTimeUtil.dateParseString(candidates.getWork1eddate(),"yyyy.MM"));
            work.append(" ");
            work.append(candidates.getWork1());
            work.append(" ");
            work.append("(" + candidates.getWorkyears() + "年)");
            work.append(" " + candidates.getJobtitle());
            work.append( "\r");
        }
        if( !StringUtils.isEmpty(candidates.getWork2())){
            work.append(QuickTimeUtil.dateParseString(candidates.getWork2stdate(),"yyyy.MM"));
            work.append(" - ");
            work.append(QuickTimeUtil.dateParseString(candidates.getWork2eddate(),"yyyy.MM"));
            work.append(" ");
            work.append(candidates.getWork2());
            work.append(" " + candidates.getWork2jobtitle());
            work.append( "\r");
        }

        if( !StringUtils.isEmpty(candidates.getWork3())){
            work.append(QuickTimeUtil.dateParseString(candidates.getWork3stdate(),"yyyy.MM"));
            work.append(" - ");
            work.append(QuickTimeUtil.dateParseString(candidates.getWork3eddate(),"yyyy.MM"));
            work.append(" ");
            work.append(candidates.getWork3());
            work.append(" " + candidates.getWork3jobtitle());
            work.append("\r");
        }
        if( !StringUtils.isEmpty(candidates.getWork4())){
            work.append(QuickTimeUtil.dateParseString(candidates.getWork4stdate(),"yyyy.MM"));
            work.append(" - ");
            work.append(QuickTimeUtil.dateParseString(candidates.getWork4eddate(),"yyyy.MM"));
            work.append(" ");
            work.append(candidates.getWork4());
            work.append(" " + candidates.getWork4jobtitle());
            work.append( "\r");
        }
        return work.toString();
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
            work4.append("\r");
            map.put("work4",work4.toString());
            // 公司介绍： 汇报对象：  下属人数：工作职责： 求职原因：
            map.put("work4Info",getCommonInfo());
        }
        return map;
    }

    public String getCommonInfo(){
        StringBuilder work1Info = new StringBuilder();
        work1Info.append("公司介绍：" + "\r" );
        work1Info.append("汇报对象：" + "\r" );
        work1Info.append("下属人数：" + "\r" );
        work1Info.append("工作职责：" + "\r" );
        work1Info.append("求职原因：" + "\r" );
        return work1Info.toString();
    }
}