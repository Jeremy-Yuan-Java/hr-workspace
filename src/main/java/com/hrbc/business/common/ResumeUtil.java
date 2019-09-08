package com.hrbc.business.common;


import com.hrbc.business.domain.*;
import com.hrbc.business.domain.aliylincv.*;
import com.hrbc.business.domain.common.CandidatesDto;
import com.hrbc.business.util.QuickTimeUtil;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;


import java.io.*;

import java.util.*;

/**
 * 集成第三方简历解析,该接口收费
 */
public class ResumeUtil {

    static String host = "http://jljxjk.market.alicloudapi.com";
    static String path = "/aliyunapp/aliyunservice.aspx";
    static String method = "POST";
   //  static String appcode = "192a6811b5a4458f9402da3b0c3b9aa5";
    static String appcode = "99a909a55532473aa7dfb80e435060ac";

    /**
     *  通过 第三方服务解析简历内容
     * @param data
     * @return
     */
    public static String getResume(byte[] data,String suffixName) {
        Map<String,Object> map = new HashMap<>();
        try {
            Map<String, String> headers = new HashMap<String, String>();
            //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
            headers.put("Authorization", "APPCODE " + appcode);
            //根据API的要求，定义相对应的Content-Type
            headers.put("Content-Type", "application/json; charset=UTF-8");
            Map<String, String> querys = new HashMap<String, String>();

           String bodys = "cid=1&content="+Base64.encodeBase64String(data)+"&ext=" + suffixName;

            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doPost(host,path,method,headers,querys,bodys);
            return EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



    /**
     * 简历解析 保存到 候选人对象中
     * @param info
     */
    public static CandidatesDto resolveResumeCandidates(ResumeInfo info){
        CandidatesDto candidates = new CandidatesDto();
        try {
            /*** 获取基本信息 ***/
            getCandidatesBasic(candidates,info);
            /*** 获取工作经历 ***/
            getCandidatesJobs(candidates,info);
            /*** 获取项目经历 ***/
            getCandidatesProjects(candidates,info);
            /*** 获取教育经历 ***/
            getCandidatesEdu(candidates,info);
        } catch (Exception e) {

        }
        return candidates;
    }

    /**
     * 获取候选人的项目经历
     * @param candidates
     * @param info
     */
    public static void getCandidatesProjects(CandidatesWithBLOBs candidates ,ResumeInfo info){
        // 设置 候选人的所有的项目信息
        //candidates.setProjectdetails1(info.getProject());
        // 获取候选人的每条 项目经历
        ProjectInfo[] projectInfos = info.getProjectInfo();
        if (projectInfos != null && projectInfos.length > 0) {
            for (int i = 0 ; i < projectInfos.length ; i++) {
                ProjectInfo p = projectInfos[i];
                StringBuilder sb = new StringBuilder();
                sb.append(p.getStartDate() + " " + p.getEndDate() ) ;
                sb.append("项目描述:" +p.getProjectName() + Constants.LF1);
                sb.append("项目职责:" +p.getProjectDescription() + " ");
                if ( i == 0) {
                    candidates.setWork1projs(sb.toString());
                }
                if (i == 1) {
                    candidates.setWork2projs(sb.toString());
                }
                if ( i == 2) {
                    candidates.setWork3projs(sb.toString());
                }
                if ( i == 3) {
                    candidates.setWork4projs(sb.toString());
                }
            }
        }
    }

    /**
     * 获取候选人 教育经历
     */
    public static void getCandidatesEdu(CandidatesWithBLOBs candidates, ResumeInfo info){
        EducationInfo[] eis = info.getEducationInfo();
        if ( eis != null && eis.length > 0) {
            for (int i = 0 ; i < eis.length ;  i ++) {
                EducationInfo ei = eis[i];
                if ( i == 0) {
                    // 最高学历
                    candidates.setEducations(info.getEducation());

                    // 学校名称
                    candidates.setEdu1(ei.getSchool());
                    // 起始
                    candidates.setEdu1stdate(QuickTimeUtil.stringParseDate(ei.getStartDate(),"yyyy"));
                    candidates.setEdu1eddate(QuickTimeUtil.stringParseDate(ei.getEndDate(),"yyyy"));
                }

                if ( i == 1) {
                    // 学校名称
                    candidates.setEdu2(ei.getSchool());
                    // 起始
                    candidates.setEdu2stdate(QuickTimeUtil.stringParseDate(ei.getStartDate(),"yyyy"));
                    candidates.setEdu2eddate(QuickTimeUtil.stringParseDate(ei.getEndDate(),"yyyy"));
                }

                if ( i == 2 ) {
                    // 学校名称
                    candidates.setEdu3(ei.getSchool());
                    // 起始
                    candidates.setEdu3stdate(QuickTimeUtil.stringParseDate(ei.getStartDate(),"yyyy"));
                    candidates.setEdu3eddate(QuickTimeUtil.stringParseDate(ei.getEndDate(),"yyyy"));
                    break;
                }
            }
        }
    }

    /**
     * 获取候选人的工作经历
     * @param candidates
     * @param info
     */
    public static void getCandidatesJobs(CandidatesWithBLOBs candidates,ResumeInfo info){
        ExperienceInfo[] experienceInfos = info.getExperienceInfo();
        if (experienceInfos != null && experienceInfos.length > 0) {
            for (int i = 0 ; i < experienceInfos.length ; i ++ ) {
                ExperienceInfo ei = experienceInfos[i];
                // 获取工作年限
                String periodsTime = ei.getPeriodsOfTime();
                if ( StringUtils.isNotBlank(periodsTime) ) {
                    if(periodsTime.contains("年")){
                        periodsTime = periodsTime.substring(0,periodsTime.indexOf("年"));
                    }
                }
                Date startDate = QuickTimeUtil.stringParseDate(ei.getStartDate(),"yyyy-MM");
                Date endDate = QuickTimeUtil.stringParseDate(ei.getEndDate(),"yyyy-MM");
                if ( i == 0) {
                    // 公司名称
                    String company = ei.getCompany();
                    if( StringUtils.isNotBlank(company)){
                        candidates.setWork1(company);
                    }
                    // 职位名称
                    candidates.setJobtitle(ei.getTitle());
                    // 起始时间
                    candidates.setWork1stdate(startDate);
                    candidates.setWork1eddate(endDate);
                    // 工作描述
                    candidates.setWork1desc(ei.getSummary());
                }

                if( i == 1){
                    // 公司名称
                    String company = ei.getCompany();
                    if( StringUtils.isNotBlank(company)){
                        candidates.setWork2(company);
                    }
                    // 职位名称
                    candidates.setWork2jobtitle(ei.getTitle());
                    // 起始时间
                    candidates.setWork2stdate(startDate);
                    candidates.setWork2eddate(endDate);
                    // 工作描述
                    candidates.setWork2desc(ei.getSummary());

                }
                if( i == 2){
                    // 公司名称
                    String company = ei.getCompany();
                    if( StringUtils.isNotBlank(company)){
                        candidates.setWork3(company);
                    }
                    // 职位名称
                    candidates.setWork3jobtitle(ei.getTitle());
                    // 起始时间
                    candidates.setWork3stdate(startDate);
                    candidates.setWork3eddate(endDate);
                    // 工作描述
                    candidates.setWork3desc(ei.getSummary());
                }
                if( i == 3){
                    // 公司名称
                    String company = ei.getCompany();
                    if( StringUtils.isNotBlank(company)){
                        candidates.setWork4(company);
                    }
                    // 职位名称
                    candidates.setWork4jobtitle(ei.getTitle());
                    // 起始时间
                    candidates.setWork4stdate(startDate);
                    candidates.setWork4eddate(endDate);
                    // 工作描述
                    candidates.setWork4desc(ei.getSummary());
                }
            }
        }
    }

    /**
     * 获取候选人的基本信息
     */
    public static void getCandidatesBasic(CandidatesWithBLOBs candidates, ResumeInfo info){
        // 姓名
        candidates.setUsername(info.getName());
        // 性别
        candidates.setGender(info.getSex());
        // 身份证
        candidates.setIdcard(info.getIDNO());
        // 年龄
        candidates.setAge(NumberUtils.toInt(info.getAge(),0));

        // 工作年限
        candidates.setWorkyears(NumberUtils.toInt(info.getExperience() , 0));
        // 所在地
        candidates.setLivebase(info.getNowLocation());
        // 学历
        candidates.setDegree(info.getEducation());
        // 毕业学校
        candidates.setEdu1(info.getSchool());
        // 工作状态
        candidates.setWorkbase(info.getSwitch());
        // 婚姻状态
        candidates.setMarried(info.getMarried());
        // 期望工作
        candidates.setExpectjob(info.getTitle());
        // 期望工作地点
        candidates.setExpectworkbase(info.getForwardlocation());
        // tag不能为null
        candidates.setTags(" ");
        // 期望薪资
        String salary = info.getSalary();
        if ( StringUtils.isNotBlank(salary)){
            if ( salary.contains("-")) {
                String[] s = salary.split("-");
                candidates.setSalarymin(NumberUtils.toInt(s[0],0));
                String maxStr = s[1];
                if ( StringUtils.isNotBlank(maxStr) && maxStr.contains("元")){
                    candidates.setSalarymax(NumberUtils.toInt(maxStr.split("元")[0],0));
                }

            }
        }
        // 所属行业
        candidates.setMajor(info.getVocation());
        // 当前就职公司
        candidates.setWork1(info.getLastCompany());
        // 电话号码
        String phone1 = info.getMobile();
        String phone2 = info.getPhone();

        if( StringUtils.isNotBlank(phone1)){
            candidates.setPhoneno(phone1);
            candidates.setPhonenobak(phone1);
        }else if (StringUtils.isNotBlank(phone2)){
            candidates.setPhoneno(phone2);
            candidates.setPhonenobak(phone2);
        }else {
            candidates.setPhoneno("无");
        }


        // 邮箱
        candidates.setEmail(info.getEmail());
        candidates.setEmailbak(info.getEmail());

        // 所获证书
        candidates.setCertifications(info.getCertificate());
        // 自我评价
        candidates.setPerprofile(info.getPersonal());
        // 专业技能
        candidates.setPersonaliy(info.getSkill());
        // 学历
        candidates.setEducations(info.getEducation());

    }

    /**
     * 将流转换为byte[]
     * @param in
     * @return
     */
    public static byte[] inputStreamConvertByteArray(InputStream in){
        if(in != null){
            try{
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int len = 0;
                // 只要没读完，不断的读取
                while ((len = in.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, len);
                }
                // 得到内存中写入的所有数据
                byte[] data = outputStream.toByteArray();
                return data;
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return null;
    }



    public static void main(String[] args) {
        /*File file = new File("C:\\Users\\dengp\\Desktop\\hr-workspace\\src\\main\\java\\com\\hrbc\\business\\common\\data.json");
        try {
            InputStream in = new FileInputStream(file);
            StringBuilder sb = new StringBuilder();
            byte[] b = new byte[1024];
            int num = 0;
            while((num = in.read(b)) != -1){
               sb.append(new String(b,0,num));
            }
            in.close();
            System.out.println(sb.toString());
            ResumeInfo info = JSONObject.parseObject(sb.toString(), ResumeInfo.class);
            String json = JSONObject.toJSON(info).toString();
            System.out.println("---" + json );
        }catch (Exception e){
            e.printStackTrace();
        }*/
    }


    public static String resolveMsgIsNull(String msg){
        if (StringUtils.isNotBlank(msg)) {
            return msg;
        }
        return " ";
    }
}
