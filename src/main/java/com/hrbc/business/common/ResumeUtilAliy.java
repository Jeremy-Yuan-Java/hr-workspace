package com.hrbc.business.common;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.domain.*;
import com.hrbc.business.domain.aliylincv.*;
import com.hrbc.business.domain.common.CandidatesDto;
import com.hrbc.business.util.QuickTimeUtil;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.BeanUtils;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 集成第三方简历解析,该接口收费
 */
public class ResumeUtilAliy {

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
    public static Map<String,Object> getResume(byte[] data,String suffixName) {
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
            String result = EntityUtils.toString(response.getEntity());
            // System.out.println(result);
            ResumeInfo info = JSONObject.parseObject(result, ResumeInfo.class);
            map.put("info",info);
            map.put("msg",result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 解析详细信息
     * @param info
     */
    public static CandidatesResumeDetailWithBLOBs resolveResumeDetails( ResumeInfo info){
        CandidatesResumeDetailWithBLOBs detail = new CandidatesResumeDetailWithBLOBs();
        if (info != null) {
            detail.setResumetype(info.getType() + "");
            detail.setResumegrade(info.getResumeGrade());
            detail.setMarryied(info.getMarried());
            detail.setFromwebsite(info.getFromWebSite());
            detail.setKeyword(info.getKeyword());
            detail.setIdno(info.getIDNO());
            detail.setEncouragement(info.getEncouragement());
            detail.setTeam(info.getTeam());
            detail.setVolunteer(info.getVolunteer());
            detail.setGraduatetime(info.getGraduatetime());
            detail.setBeginworktime(info.getBeginworktime());
            detail.setLastupdate(info.getLastUpdate());
            detail.setLastupdate2(info.getLastUpdate2());
            detail.setScore(NumberUtils.toInt(info.getScore(),0));
            detail.setCertificate(info.getCertificate());
            detail.setOriginal(info.getOriginal());
            detail.setPersonal(info.getPersonal());
            detail.setLesson(info.getLesson());
            detail.setComputer(info.getComputer());
            detail.setEnglish(info.getEnglish());
            detail.setSchool(info.getSchool());
            detail.setSchoolrankings(info.getSchoolRankings());
            detail.setSchooltype(getSchoolType(info.getSchoolType()));
            detail.setPostcode(info.getPostCode());
            detail.setSpeciality(info.getSpeciality());
            detail.setAddress(info.getAddress());
            detail.setJiguan(info.getJiguan());
            detail.setNational(info.getNational());
            detail.setNationality(info.getNationality());
            detail.setBirth(getBirth(info.getBirth()));
            detail.setName(info.getName());
            detail.setFamilyname(info.getFamilyName());
            detail.setHref(info.getHref());
            detail.setTitle(info.getTitle());
            detail.setTitle2(info.getTitle2());
            detail.setTitlestandard(info.getTitleStandard());
            detail.setAmiinstitution(info.getAimInstitution());
            detail.setAge(NumberUtils.toByte(info.getAge()==null?"0":info.getAge()));
            detail.setSex(info.getSex());
            detail.setHighr(info.getHigh());
            detail.setWeightr(info.getWeight());
            detail.setMobile(info.getMobile());
            detail.setPhone(info.getPhone());
            detail.setFax(info.getFax());
            detail.setEmail(info.getEmail());
            detail.setNowlocation(info.getNowLocation());
            detail.setForwardlocation(info.getForwardlocation());
            detail.setEducation(info.getEducation());
            detail.setAdvanceddegree(info.getAdvancedDegree());
            detail.setExperience(info.getExperience());
            detail.setVocation(info.getVocation());
            detail.setForwardvocation(info.getForwardVocation());
            detail.setVocationstandard(info.getVocationStandard());
            detail.setSalary(info.getSalary());
            detail.setAimsalary(info.getAimSalary());
            detail.setEducationdetail(info.getEducationDetail());
            detail.setExpriencedetail(info.getExperienceDetail());
            detail.setTraning(info.getTraining());
            detail.setProjects(info.getProject());
            detail.setSkill(info.getSkill());
            detail.setPolitical(info.getPolitical());
            detail.setStartfrom(info.getStartFrom());
            detail.setIsjobsearch(info.getSwitch());
            detail.setIssuedate(info.getIssueDate());
            detail.setQq(info.getQQ());
            detail.setStudenttype(info.getSchoolType());
            detail.setPhotourl(info.getPhotoUrl());
            detail.setPhotobase64string(info.getPhotoBase64String());
            detail.setAppletter(info.getAppLetter());
            detail.setLastcompany(info.getLastCompany());
            detail.setLasttitle(info.getLastTitle());
            detail.setOverseaswork(info.getOverseasWork());
            detail.setJobhoppingfrequency(info.getJobHoppingFrequency());
            detail.setIntegrity(info.getIntegrity());
            detail.setWorktype(info.getWorkType());
            detail.setMemo(info.getMemo());
            detail.setMemo0(info.getMemo0());
            detail.setLevel(info.getLevel());
            detail.setSort(info.getSort());
            detail.setMsn(info.getMsn());
            detail.setWebchat(info.getWebChat());
            detail.setDonotrecommend(info.getDoNotRecommend());
            detail.setPersonalinterests(info.getPersonalInterests());
            detail.setGradeofenglishs(getGradeOfEnglish(info.getGradeOfEnglish()));
            detail.setGradeofenglishslist(getGradeOfEnglishList(info.getGradeOfEnglishs()));
            detail.setItskills(getSkills(info.getITSkills()));
            detail.setArreducationdetail(getArrayListDetail(info.getArrEducationDetail()));
            detail.setArrexpericenedetail(getArrayListDetail(info.getArrExpericeneDetail()));
            detail.setArrprojectdetail(getArrayListDetail(info.getArrProjectDetail()));
            detail.setArrtrainingdetail(getArrayListDetail(info.getArrTrainingDetail()));
        }
        return detail;
    }

    /**
     * 培训详情信息
     * @param info
     * @param resumeId
     * @return
     */
    public static List<CandidatesResumeTraininginfo> resolveResumeTraining(ResumeInfo info , Integer resumeId){
        List<CandidatesResumeTraininginfo> trans = null;
        TrainingInfo[] trainingInfos = info.getTrainingInfo();
        if ( trainingInfos != null && trainingInfos.length > 0) {
            trans = new ArrayList<>();
            for ( int i = 0 ; i < trainingInfos.length ; i ++) {
                CandidatesResumeTraininginfo tran = new CandidatesResumeTraininginfo();
                TrainingInfo trainingInfo = trainingInfos[i] ;
                tran.setCertificate(trainingInfo.getCertificate());
                tran.setDescriptionindetails(trainingInfo.getDescriptionInDetails());
                tran.setResumeid(resumeId);
                tran.setTitle(trainingInfo.getTitle());
                tran.setTrainingcourse(trainingInfo.getTrainingCourse());
                tran.setTraininglocation(trainingInfo.getTrainingLocation());
                tran.setStartdate(QuickTimeUtil.stringParseDate(trainingInfo.getStartDate(),"yyyy-MM"));
                tran.setEnddate(QuickTimeUtil.stringParseDate(trainingInfo.getEndDate(),"yyyy-MM"));
                tran.setCandidatesnum(i+1);
                trans.add(tran);
            }
        }
        return trans;
    }
    /**
     * 获取项目详细信息
     * @param info
     * @param resumeId
     * @return
     */
    public static List<CandidatesResumeProjectinfoWithBLOBs> resolveResumeProjects(ResumeInfo info , Integer resumeId){
        List<CandidatesResumeProjectinfoWithBLOBs> projects = null;
        ProjectInfo[] pis = info.getProjectInfo();
        if ( pis != null && pis.length > 0) {
            projects = new ArrayList<>();
            for ( int i =0 ; i < pis.length ; i ++) {
                CandidatesResumeProjectinfoWithBLOBs pro = new CandidatesResumeProjectinfoWithBLOBs();
                ProjectInfo pi = pis[i];
                pro.setProjectdescription(pi.getProjectDescription());
                pro.setResponsiblities(pi.getResponsibilities());
                pro.setProjectname(pi.getProjectName());
                pro.setResumeid(resumeId);
                pro.setStartdate(QuickTimeUtil.stringParseDate(pi.getStartDate(),"yyyy-MM"));
                pro.setEnddate(QuickTimeUtil.stringParseDate(pi.getEndDate(),"yyyy-MM"));
                pro.setCandidatesnum(i+1);
                projects.add(pro);
            }
        }
        return projects;
    }

    /**
     * 解析工作经历
     * @param info
     * @param resumeId
     * @return
     */
    public static List<CandidatesResumeExperienceinfoWithBLOBs> resolveResumeExperience(ResumeInfo info , Integer resumeId){
        List<CandidatesResumeExperienceinfoWithBLOBs> res = null;
        ExperienceInfo[] eis = info.getExperienceInfo();
        if ( eis != null && eis.length > 0) {
            res = new ArrayList<>();
            for ( int i =0 ; i < eis.length ; i ++) {
                CandidatesResumeExperienceinfoWithBLOBs re = new CandidatesResumeExperienceinfoWithBLOBs();
                ExperienceInfo ei = eis[i];
                re.setAchievement(ei.getAchievement());
                re.setCompanydescription(ei.getCompanyDescription());
                re.setCompany(ei.getCompany());
                re.setOthers(ei.getOthers());
                re.setDepartment(ei.getDepartment());
                re.setDeponent(ei.getDeponent());
                re.setLeader(ei.getLeader());
                re.setLocation(ei.getLocation());
                re.setIsstudii(ei.getIsStudii());
                re.setTitle(ei.getTitle());
                re.setWorktype(ei.getWorkType());
                re.setVocation(ei.getVocation());
                re.setUnderlingnumber(ei.getUnderlingNumber());
                re.setTypecompany(ei.getType());
                re.setSummary(ei.getSummary());
                re.setSalary(ei.getSalary());
                re.setResumeid(resumeId);
                re.setReasonofleaving(ei.getReasonOfLeaving());
                re.setSizecompany(ei.getSize());
                re.setPeriodsoftime(ei.getPeriodsOfTime());
                re.setStartdate(QuickTimeUtil.stringParseDate(ei.getStartDate(),"yyyy-MM"));
                re.setEnddate(QuickTimeUtil.stringParseDate(ei.getEndDate(), "yyyy-MM"));
                re.setCandidatesnum(i+1);
                res.add(re);
            }
        }
        return res;
    }

    /**
     * 获取教育经历 详情信息
     * @param info
     * @param resumeId
     * @return
     */
    public static List<CandidatesResumeEducationinfo> resolveResumeEducation(ResumeInfo info , Integer resumeId){
        List<CandidatesResumeEducationinfo> edusInfo = null;
        EducationInfo[] edus = info.getEducationInfo();
        if (edus != null && edus.length > 0) {
            edusInfo = new ArrayList<>();
            for ( int i = 0 ; i < edus.length ; i ++){
                CandidatesResumeEducationinfo cr  = new CandidatesResumeEducationinfo();
                EducationInfo edu = edus[i];
                // 属性复制
                cr.setAdvanceddegree(edu.getAdvancedDegree());
                cr.setDepartment(edu.getDepartment());
                cr.setEducation(edu.getEducation());
                cr.setSchool(edu.getSchool());
                cr.setSchoollabel(edu.getSchoolLabel());
                cr.setIsstudii(edu.getIsStudii());
                cr.setStartdate(QuickTimeUtil.stringParseDate(edu.getStartDate(),"yyyy-MM"));
                cr.setEnddate(QuickTimeUtil.stringParseDate(edu.getEndDate(), "yyyy-MM"));
                cr.setSpeciality(edu.getSpeciality());
                cr.setSummary(edu.getSummary());
                cr.setResumeid(resumeId);
                cr.setCandidatesnum(i+1);
                edusInfo.add(cr);
            }
        }
        return edusInfo;
    }

    /**
     * 将 集合转换为字符串
     * @return
     */
    public static String getArrayListDetail(ArrayList<String> list){
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            for (String s: list) {
                sb.append(s);
                sb.append(Constants.DECOLLATOR);
            }
        }

        return sb.toString();
    }

    /**
     * 获取IT 技能信息
     * @param its
     * @return
     */
    public static String getSkills(ITSkills[] its) {
        StringBuilder sb = new StringBuilder();
        if (its != null && its.length > 0) {
            for (ITSkills it: its) {
                String level = it.getCompetencyLevel();
                String type = it.getSkillType();
                String time = it.getTimeOfUse();
                sb.append(type + "-" + level + "-" + time);
                sb.append(Constants.DECOLLATOR);
            }
        }
        return sb.toString();
    }

    /**
     * 获取 证书所有数据
     * @param gs
     * @return
     */
    public static String getGradeOfEnglishList(GradeOfEnglish[] gs){
        StringBuilder sb = new StringBuilder();
        if ( gs != null && gs.length > 0) {
            for (GradeOfEnglish g: gs ) {
                String name = g.getNameOfCertificate();
                String date = g.getReceivingDate();
                String score = g.getScore();
                sb.append(name + "-");
                sb.append(date + "-");
                sb.append(score);
                sb.append(Constants.DECOLLATOR);
            }
        }
        return sb.toString();
    }

    /**
     * 获取等级最高的证书
     * @param gradeOfEnglish
     * @return
     */
    public static String getGradeOfEnglish(GradeOfEnglish gradeOfEnglish){
        StringBuilder sb = new StringBuilder();
        if (gradeOfEnglish != null) {
            String name = gradeOfEnglish.getNameOfCertificate();
            String date = gradeOfEnglish.getReceivingDate();
            String score = gradeOfEnglish.getScore();
            sb.append(name + "-");
            sb.append(date + "-");
            sb.append(score);
        }
        return sb.toString();
    }

    /**
     * birth 转换
     * @return
     */
    public static Date getBirth(String msg){
        SimpleDateFormat sdf = null;
        Date birth = null;
        try {
            sdf = new SimpleDateFormat("yyyy年MM月dd日");
            birth = sdf.parse(msg);
        }catch (Exception e){
            sdf = new SimpleDateFormat("yyyy年MM月");
            try {
                birth = sdf.parse(msg);
            }catch (Exception e1) {

            }

        }
        return birth;
    }

    /**
     * 获取学习类型
     * @return
     */
    public static String getSchoolType(String type){
        String res = "未知";
        if ( StringUtils.isNotBlank(type)) {
            if ( "0".equalsIgnoreCase(type)) {
                res = "普通院校";
            }
            if ( "1".equalsIgnoreCase(type)) {
                res = "211 院校";
            }
            if ( "2".equalsIgnoreCase(type)) {
                res = "985 院校";
            }
            if ( "3".equalsIgnoreCase(type)) {
                res = "985、211院校";
            }
            if ( "4".equalsIgnoreCase(type)) {
                res = "国外院校";
            }
            if ( "5".equalsIgnoreCase(type)) {
                res = "台湾大学";
            }
        }
        return res;
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

    /**
     *  根据传入的 时间 查询出在次时间范围内的项目信息
     * @param start  公司入职时间
     * @param end    公司离职时间
     * @param info
     * @return
     */
    public static String getCandidatesProjectInfo (Date start , Date end ,ResumeInfo info) {
        ProjectInfo[] projects = info.ProjectInfo;
        StringBuilder sb = new StringBuilder();

        if( projects != null && projects.length > 0){
            for (ProjectInfo p : projects) {
                // 项目的 起始时间
                Date startDate = QuickTimeUtil.stringParseDate(p.getStartDate(),"yyyy-MM");
                if (startDate == null) {
                    continue;
                }

                if ( !startDate.before(start) &&  ( end == null || !startDate.after(end) )) {
                    sb.append(Constants.LF1);
                    sb.append(p.getStartDate() + "  " + p.getEndDate() );
                    sb.append(Constants.LF1);
                    sb.append( p.getProjectName() ) ;
                    sb.append(Constants.LF1);
                    sb.append("项目简介:" + p.getProjectDescription() );
                    sb.append(Constants.LF1);
                    sb.append("个人职责:" + p.getResponsibilities() );
                    sb.append(Constants.LF1);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

      /*  try {
            File file = new File("C:/Users/dengp/Desktop/dpb.docx");
            InputStream in = new FileInputStream(file);
            // 得到内存中写入的所有数据
            byte[] data = inputStreamConvertByteArray(in);
            //System.out.println("64:"+Base64.encodeBase64String(data));
            getResume(data,file.getName());
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

       // String result = "{\"cv_name\":\"74c864664c9ddac755d71fb29d0c2070.tmp\",\"src_id\":\"\",\"cv_language\":\"zh\",\"src_site\":\"zhilian\",\"errormessage\":\"succeed\",\"cv_id\":\"\",\"english_parsing_result\":{},\"updated_time\":\"\",\"errorcode\":0,\"parsing_result\":{\"project_experience\":[],\"training_experience\":[],\"work_experience\":[{\"salary\":\"\",\"description\":\"对接销售部: 进行广告下单、帐户开通、充值续费、物料更新、客户合同审核、催收款项、发票申请等。\\n对接媒体: 定期核对业务款项、跟进回款事宜、发票申请、媒体合同审核等\",\"end_time_year\":\"2019\",\"still_active\":1,\"company_type\":\"\",\"industry\":\"广告/会展/公关\",\"end_time_month\":\"08\",\"location\":\"\",\"company_size\":\"\",\"job_function\":\"公关/媒介\",\"start_time_year\":\"2017\",\"company_name\":\"霍尔果斯乐湛科技有限公司\",\"department\":\"对接销售部\",\"job_title\":\"媒介运营\",\"start_time_month\":\"07\"},{\"salary\":\"\",\"description\":\"• 依据广告法对广告素材进行审核及规范，上线前的测试调整\\n• 负责智能电视广告投放，跟进广告执行，保证所负责广告正常上线\\n• 广告上线后监控及优化，组织上下游资源，不断优化广告投放效果，达到预期广告投放效果\\n• 完成广告下线后的数据总结及分析，为后续广告投放提供数据支持\",\"end_time_year\":\"2016\",\"still_active\":0,\"company_type\":\"股份制企业\",\"industry\":\"互联网/电子商务\",\"end_time_month\":\"11\",\"location\":\"广州\",\"company_size\":\"\",\"job_function\":\"市场\",\"start_time_year\":\"2015\",\"company_name\":\"广州欢网科技有限责任公司\",\"department\":\"\",\"job_title\":\"广告运营\",\"start_time_month\":\"03\"},{\"salary\":\"\",\"description\":\"负责平台广告主投放计划制定以及日常投放。\\n负责平台广告主资源的合作对接和沟通，整理内外资源，将产品效果最大化。\\n对广告数据进行全面分析，根据分析结果给出优化建议并跟进执行。\\n对各渠道的广告投放进行数据整理，日报周报及各种报表的整理。\\n制作项目投放总结报告。\",\"end_time_year\":\"2015\",\"still_active\":0,\"company_type\":\"民营\",\"industry\":\"互联网/电子商务\",\"end_time_month\":\"03\",\"location\":\"北京\",\"company_size\":\"20-99人\",\"job_function\":\"市场\",\"start_time_year\":\"2011\",\"company_name\":\"（4年1个月）北京青年报网际传播技术有限公司\",\"department\":\"\",\"job_title\":\"广告运营\",\"start_time_month\":\"03\"}],\"contact_info\":{\"phone_number\":\"\",\"QQ\":\"\",\"wechat\":\"\",\"email\":\"\",\"home_phone_number\":\"\"},\"social_experience\":[],\"resume_rawtext\":\"\",\"others\":{\"language\":[\"英语\"],\"certificate\":[],\"skills\":[\"Java\",\"Word\",\"html\",\"Excel\",\"英语\",\"电子商务\",\"旅游英语\",\"工商管理\",\"信息技术\",\"计算机软件\"],\"self_evaluation\":\"作为积极向上的职业人，我有积极主动的工作态度，独立工作和团队合作的能力；有效计划，合理安排的能力，兼具灵活性和创造性；乐观，友善，勇于接受新挑战，快速适应新环境。\\n真切期望能够到贵公司工作，不断提升自己并承担更多责任，成为贵公司优秀的员工。也许我不是最优秀的，但我有很强的责任感和不断进取的精神；也许我不是一个全能的英雄，但我善于和同事共同协作完满地完成任务和工作。\",\"awards\":[],\"it_skills\":[\"Java\",\"html\",\"Excel\",\"计算机软件\"],\"business_skills\":[\"Word\",\"Excel\",\"电子商务\",\"工商管理\"]},\"education_experience\":[{\"ranking\":\"\",\"major\":\"编辑出版学\",\"degree\":\"本科\",\"end_time_year\":\"2014\",\"still_active\":0,\"school_rank\":\"316\",\"school_level\":\"\",\"end_time_month\":\"06\",\"school_name\":\"北京印刷学院\",\"GPA\":\"\",\"courses\":\"\",\"start_time_year\":\"2012\",\"location\":\"北京\",\"department\":\"\",\"study_model\":\"\",\"start_time_month\":\"04\"},{\"ranking\":\"\",\"major\":\"旅游英语\",\"degree\":\"大专\",\"end_time_year\":\"2008\",\"still_active\":0,\"school_rank\":\"\",\"school_level\":\"\",\"end_time_month\":\"06\",\"school_name\":\"北京财贸职业学院\",\"GPA\":\"\",\"courses\":\"旅游英语\",\"start_time_year\":\"2005\",\"location\":\"北京\",\"department\":\"\",\"study_model\":\"\",\"start_time_month\":\"09\"}],\"basic_info\":{\"major\":\"编辑出版学\",\"expect_location\":\"\",\"current_salary\":\"\",\"current_location\":\"北京朝阳\",\"desired_salary\":\"6001-8000元/月\",\"birthplace\":\"北京\",\"degree\":\"本科\",\"desired_position\":\"广告制作执行\",\"zipcode\":\"\",\"national_identity_number\":\"\",\"date_of_birth\":\"1986-10\",\"num_work_experience\":8,\"current_position\":\"媒介运营\",\"work_start_year\":\"2014\",\"political_status\":\"团员\",\"current_company\":\"霍尔果斯乐湛科技有限公司\",\"school_name\":\"北京印刷学院\",\"ethnic\":\"\",\"name\":\"全部\",\"lastupdate_time\":\"2019-08-12-14-20-15\",\"gender\":\"女\",\"age\":33,\"marital_status\":\"已婚\",\"current_status\":\"在职，正在找工作\",\"school_type\":\"\",\"detailed_location\":\"\",\"industry\":\"广告/会展/公关\"}},\"version\":\"2.2.0\"}";
       // OnlineCv onlineCv = JSONObject.parseObject(result, OnlineCv.class);
        File file = new File("C:\\Users\\dengp\\Desktop\\hr-workspace\\src\\main\\java\\com\\hrbc\\business\\common\\data.json");
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
            //System.out.println("---" + json );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
