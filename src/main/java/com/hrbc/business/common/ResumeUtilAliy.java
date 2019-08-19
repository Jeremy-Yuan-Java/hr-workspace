package com.hrbc.business.common;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.domain.Candidates;
import com.hrbc.business.domain.CandidatesWithBLOBs;
import com.hrbc.business.domain.aliylincv.EducationInfo;
import com.hrbc.business.domain.aliylincv.ExperienceInfo;
import com.hrbc.business.domain.aliylincv.ResumeInfo;
import com.hrbc.business.domain.onlinecv.*;
import com.hrbc.business.util.QuickTimeUtil;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.data.util.CastUtils;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 集成第三方简历解析,该接口收费
 */
public class ResumeUtilAliy {

    static String host = "http://jljxjk.market.alicloudapi.com";
    static String path = "/aliyunapp/aliyunservice.aspx";
    static String method = "POST";
    static String appcode = "192a6811b5a4458f9402da3b0c3b9aa5";

    /**
     *  通过 第三方服务解析简历内容
     * @param data
     * @return
     */
    public static ResumeInfo getResume(byte[] data,String suffixName) {
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
            System.out.println(result);
            ResumeInfo info = JSONObject.parseObject(result, ResumeInfo.class);
            return info;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 简历解析
     * @return
     */
    public static void parseResume(InputStream in, CandidatesWithBLOBs candidates,String suffixName) {
        // 字节流转换为字节数组
        byte[] data = inputStreamConvertByteArray(in);
        // 解析 简历 获取到对应的包装对象
        ResumeInfo info = getResume(data,suffixName);
        // 解析包装到对象，将数据保存到对应 CandidateWithBLOBs 中
        if(info != null){
            /*** 获取基本信息 ***/
            getCandidatesBasic(candidates,info);

            /********** 获取工作经历 **********/
            getCandidatesJobs(candidates,info);
            /*** 获取教育经历 ***/
            getCandidatesEdu(candidates,info);
            String json = JSONObject.toJSON(info).toString();
            /** 最后将整个 简历解析的内容以 JSON 格式 存储到字段中 **/
            candidates.setResumedetail(json.getBytes());
        }
    }

    /**
     * 获取候选人 教育经历
     */
    public static void getCandidatesEdu(Candidates candidates,ResumeInfo info){
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
    public static void getCandidatesJobs(Candidates candidates,ResumeInfo info){
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
                if ( i == 0) {
                    // 公司名称
                    String company = ei.getCompany();
                    if( StringUtils.isNotBlank(company)){
                        candidates.setWork1(company);
                    }
                    // 职位名称
                    candidates.setJobtitle(ei.getTitle());
                    // 起始时间
                    candidates.setWork1stdate(QuickTimeUtil.stringParseDate(ei.getStartDate(),"yyyy-MM"));
                    candidates.setWork1eddate(QuickTimeUtil.stringParseDate(ei.getEndDate(),"yyyy-MM"));
                    // 工作描述
                    candidates.setWork1desc(ei.getSummary());
                    // 工作年限
                    candidates.setWorkyears(NumberUtils.toInt(periodsTime,0));
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
                    candidates.setWork2stdate(QuickTimeUtil.stringParseDate(ei.getStartDate(),"yyyy-MM"));
                    candidates.setWork2eddate(QuickTimeUtil.stringParseDate(ei.getEndDate(),"yyyy-MM"));
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
                    candidates.setWork3stdate(QuickTimeUtil.stringParseDate(ei.getStartDate(),"yyyy-MM"));
                    candidates.setWork3eddate(QuickTimeUtil.stringParseDate(ei.getEndDate(),"yyyy-MM"));
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
                    candidates.setWork4stdate(QuickTimeUtil.stringParseDate(ei.getStartDate(),"yyyy-MM"));
                    candidates.setWork4eddate(QuickTimeUtil.stringParseDate(ei.getEndDate(),"yyyy-MM"));
                    // 工作描述
                    candidates.setWork4desc(ei.getSummary());
                    break;
                }
            }
        }
    }

    /**
     * 获取候选人的基本信息
     */
    public static void getCandidatesBasic(Candidates candidates,ResumeInfo info){
        // 姓名
        candidates.setUsername(info.getName());
        // 性别
        candidates.setGender(info.getSex());
        // 身份证
        candidates.setIdcard(info.getIDNO());
        // 年龄
        candidates.setAge(NumberUtils.toInt(info.getAge(),0));
        // 工作年限 当前时间-参加工作的时间 例如：2000-09
        String begin = info.getBeginworktime();
        if(StringUtils.isNotEmpty(begin)){
            Date beginDate = QuickTimeUtil.stringParseDate(begin,"yyyy-MM");
            candidates.setWorkyears(QuickTimeUtil.getDateBetweenYear(new Date(),beginDate));
        }
        // 所在地
        candidates.setLivebase(info.getAddress());
        // 学历
        candidates.setDegree(info.getEducation());
        // 毕业学校
        candidates.setEdu1(info.getSchool());
        // 工作状态
        //candidates.setWorksate();
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
                if ( StringUtils.isNotBlank(maxStr) && maxStr.contains("/")){
                    candidates.setSalarymax(NumberUtils.toInt(maxStr.split("/")[0],0));
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
        }else if (StringUtils.isNotBlank(phone2)){
            candidates.setPhoneno(phone2);
        }else {
            candidates.setPhoneno("无");
        }

        candidates.setPhonenobak(info.getPhone());
        // 邮箱
        candidates.setEmail(info.getEmail());
        candidates.setEmailbak(info.getFax());

        // 所获证书
        candidates.setCertifications(info.getCertificate());
        // 自我评价
        candidates.setPerprofile(info.getPersonal());
        // 专业技能
        candidates.setPersonaliy(info.getSkill());
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
            System.out.println("---" + json );
        }catch (Exception e){
            e.printStackTrace();
        }



    }

    public static String dateParseString(Date date ,String pattern){
        if(date == null){
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
}
