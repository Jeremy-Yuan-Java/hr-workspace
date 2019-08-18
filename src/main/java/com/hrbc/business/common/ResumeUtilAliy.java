package com.hrbc.business.common;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.domain.CandidatesWithBLOBs;
import com.hrbc.business.domain.onlinecv.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

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
/*    private static String AppKey = "203735496";
    private static String AppCode = "192a6811b5a4458f9402da3b0c3b9aa5";
     private static String AppSecret = "k5a0dx9fm57cp3hi8xhmicsqtt0kxihk";
    private static String host = "http://jljxjk.market.alicloudapi.com";
    private static String path = "aliyunservice.aspx";
    private static String method = "POST";*/

    public static void getResume(byte[] data,String fileName) {
        String host = "http://jljxjk.market.alicloudapi.com";
        String path = "/aliyunapp/aliyunservice.aspx";
        String method = "POST";
        String appcode = "9a880387dba4486bba3edff29cda6680";
        try {
            Map<String, String> headers = new HashMap<String, String>();
            //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
            headers.put("Authorization", "APPCODE " + appcode);
            //根据API的要求，定义相对应的Content-Type
            headers.put("Content-Type", "application/json; charset=UTF-8");
            Map<String, String> querys = new HashMap<String, String>();

           String bodys = "cid=1&content="+Base64.encodeBase64String(data)+"&ext=.docx";

            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
           // HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
              HttpResponse response = HttpUtils.doPost(host,path,method,headers,querys,bodys);
            //System.out.println(response.getStatusLine().getReasonPhrase() + " "+ response.getStatusLine().getStatusCode());
            //String result = EntityUtils.toString(response.getEntity());
           // OnlineCv onlineCv = JSONObject.parseObject(result, OnlineCv.class);
            System.out.println(response.toString());
            System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 简历解析
     * @return
     */
    public static void parseResume(InputStream in, CandidatesWithBLOBs candidates) {
        // 字节流转换为字节数组
        byte[] data = inputStreamConvertByteArray(in);
        // 解析 简历 获取到对应的包装对象
        OnlineCv onlineCv = null ;//getResume(data);
        // 解析包装到对象，将数据保存到对应 CandidateWithBLOBs 中
        if(onlineCv != null){
            Parsing_result parsingResult = onlineCv.getParsing_result();
            // 获取解析的信息
            if(parsingResult != null){
                // 获取基本信息
                Basic_info basicInfo = parsingResult.getBasic_info();
                if(basicInfo != null){
                    // 设置姓名
                    candidates.setUsername(basicInfo.getName());
                    // 设置性别
                    candidates.setGender(basicInfo.getGender());
                    // 身份证号
                    candidates.setIdcard(basicInfo.getNational_identity_number());
                    String birth = basicInfo.getDate_of_birth();

                    try{
                        candidates.setBirthday(DateUtils.parseDate(birth,"yyyy-MM-dd"));
                    }catch (ParseException e){

                    }
                    // 年龄
                    candidates.setAge(basicInfo.getAge());
                    // 工作年限
                    candidates.setWorkyears(basicInfo.getNum_work_experience());
                    // 所在地
                    candidates.setLivebase(basicInfo.getCurrent_location());
                    // 学历
                    candidates.setDegree(basicInfo.getDegree());
                    // 毕业学校
                    candidates.setEdu1(basicInfo.getSchool_name());
                    // 获取工作状态
                    String currentStatus = basicInfo.getCurrent_status();
                    if(currentStatus.contains("在职")){
                        candidates.setWorksate(0);
                        candidates.setState(0);
                    }else if(currentStatus.contains("离职")){
                        candidates.setWorksate(2);
                        candidates.setState(2);
                    }else{
                        // 休假
                        candidates.setWorksate(1);
                        candidates.setState(1);
                    }
                    // 婚姻状态
                    candidates.setMarried(basicInfo.getMarital_status());
                    // 期望工作
                    candidates.setExpectjob(basicInfo.getDesired_position());
                    // 期望工作地点
                    candidates.setExpectworkbase(basicInfo.getDetailed_location());
                    // 期望薪资
                    String desiredSalary = basicInfo.getDesired_salary();
                    if(desiredSalary.contains("-")){
                        String[] salarys = desiredSalary.split("-");
                        try{
                            candidates.setSalarymin(Integer.parseInt(salarys[0]));
                            candidates.setSalarymax(Integer.parseInt(salarys[1]));
                        }catch(Exception e){

                        }
                    }
                    // 所属行业
                    candidates.setMajor(basicInfo.getIndustry());
                    // 当前就职公司
                    candidates.setWork1(basicInfo.getCurrent_company());
                   // candidates.setSalary(basicInfo.getCurrent_salary());

                }
                // 获取联系方式
                Contact_info contactInfo = parsingResult.getContact_info();
                if (contactInfo != null){
                    // 电话号码
                    candidates.setPhoneno(contactInfo.getPhone_number());
                    candidates.setPhonenobak(contactInfo.getHome_phone_number());
                    // 邮箱
                    candidates.setEmail(contactInfo.getEmail());

                }

                // 获取 教育经历
                List<Education_experience> educationExperiences = parsingResult.getEducation_experience();
                if (educationExperiences != null && educationExperiences.size() > 0) {
                    for (int i = 0 ; i < educationExperiences.size()  ; i ++){
                        Education_experience edu = educationExperiences.get(i);
                        String start  = edu.getStart_time_year() + "-" + edu.getStart_time_month() + "-01" ;
                        String end = edu.getEnd_time_year() + "-" + edu.getEnd_time_month() + "-01";
                        Date startDate = new Date();
                        Date endDate = new Date();
                        try{
                            startDate = DateUtils.parseDate(start,"yyyy-MM-dd");
                            endDate = DateUtils.parseDate(end,"yyyy-MM-dd");
                        }catch ( ParseException e){
                            e.printStackTrace();
                        }
                        if ( i == 0 ) {
                            candidates.setEdu1(edu.getSchool_name());
                            candidates.setEdu1stdate(startDate);
                            candidates.setEdu1eddate(endDate);
                            // 最高学位
                            candidates.setEducations(edu.getDegree());
                        } else if ( i == 1){
                            candidates.setEdu2(edu.getSchool_name());
                            candidates.setEdu2stdate(startDate);
                            candidates.setEdu2eddate(endDate);
                        } else if ( i == 2 ) {
                            candidates.setEdu3(edu.getSchool_name());
                            candidates.setEdu3stdate(startDate);
                            candidates.setEdu3eddate(endDate);
                        }

                    }
                }

                // 获取工作经历
                List<Work_experience> workExperiences = parsingResult.getWork_experience();
                if (workExperiences != null && workExperiences.size() > 0 ){
                    for (int i = 0 ; i < workExperiences.size() ; i++ ){
                        Work_experience work = workExperiences.get(i) ;
                        String start = work.getStart_time_year() + "-" + work.getStart_time_month() + "-01";

                        String end = work.getEnd_time_year() + "-" + work.getEnd_time_month() + "-01";
                        Date startDate = new Date();
                        Date endDate = new Date();
                        try{
                            startDate = DateUtils.parseDate(start,"yyyy-MM-dd");
                            endDate = DateUtils.parseDate(end,"yyyy-MM-dd");
                        }catch ( ParseException e){
                            e.printStackTrace();
                        }
                        if ( i == 0) {
                            // 公司名称
                            candidates.setWork1(work.getCompany_name());
                            // 职位名称
                            candidates.setJobtitle(work.getJob_title());
                            candidates.setWork1stdate(startDate);
                            candidates.setWork1eddate(endDate);
                            // 工作描述
                            candidates.setWork1desc(work.getDescription());
                        } else if (i == 1) {
                            // 公司名称
                            candidates.setWork2(work.getCompany_name());
                            // 职位名称
                            candidates.setWork2jobtitle(work.getJob_title());
                            candidates.setWork2stdate(startDate);
                            candidates.setWork2eddate(endDate);
                            // 工作描述
                            candidates.setWork2desc(work.getDescription());
                        }else if (i == 2) {
                            // 公司名称
                            candidates.setWork3(work.getCompany_name());
                            // 职位名称
                            candidates.setWork3jobtitle(work.getJob_title());
                            candidates.setWork3stdate(startDate);
                            candidates.setWork3eddate(endDate);
                            // 工作描述
                            candidates.setWork3desc(work.getDescription());
                        }else if (i == 3) {
                            // 公司名称
                            candidates.setWork4(work.getCompany_name());
                            // 职位名称
                            candidates.setWork4jobtitle(work.getJob_title());
                            candidates.setWork4stdate(startDate);
                            candidates.setWork4eddate(endDate);
                            // 工作描述
                            candidates.setWork4desc(work.getDescription());
                        }
                    }
                }

                // 获取社会经历
                List<Social_experience> socialExperiences = parsingResult.getSocial_experience();

                // 获取项目经验
                List<Project_experience> projectExperiences = parsingResult.getProject_experience();

                // 获取培训经验
                List<Training_experience> trainingExperiences = parsingResult.getTraining_experience();

                // 获取其他信息
                Others others = parsingResult.getOthers();
                // 证书 信息
                List<String> certificates = others.getCertificate();
                candidates.setCertifications(String.join(",",certificates));
                // 自我评价
                candidates.setPerprofile(others.getSelf_evaluation());
                // 专业技能
                candidates.setPersonaliy(String.join(",",others.getIt_skills()));
            }
        }
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

        try {
            File file = new File("C:/Users/dengp/Desktop/dpb.docx");
            InputStream in = new FileInputStream(file);
            // 得到内存中写入的所有数据
            byte[] data = inputStreamConvertByteArray(in);
            //System.out.println("64:"+Base64.encodeBase64String(data));
            getResume(data,file.getName());
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

       // String result = "{\"cv_name\":\"74c864664c9ddac755d71fb29d0c2070.tmp\",\"src_id\":\"\",\"cv_language\":\"zh\",\"src_site\":\"zhilian\",\"errormessage\":\"succeed\",\"cv_id\":\"\",\"english_parsing_result\":{},\"updated_time\":\"\",\"errorcode\":0,\"parsing_result\":{\"project_experience\":[],\"training_experience\":[],\"work_experience\":[{\"salary\":\"\",\"description\":\"对接销售部: 进行广告下单、帐户开通、充值续费、物料更新、客户合同审核、催收款项、发票申请等。\\n对接媒体: 定期核对业务款项、跟进回款事宜、发票申请、媒体合同审核等\",\"end_time_year\":\"2019\",\"still_active\":1,\"company_type\":\"\",\"industry\":\"广告/会展/公关\",\"end_time_month\":\"08\",\"location\":\"\",\"company_size\":\"\",\"job_function\":\"公关/媒介\",\"start_time_year\":\"2017\",\"company_name\":\"霍尔果斯乐湛科技有限公司\",\"department\":\"对接销售部\",\"job_title\":\"媒介运营\",\"start_time_month\":\"07\"},{\"salary\":\"\",\"description\":\"• 依据广告法对广告素材进行审核及规范，上线前的测试调整\\n• 负责智能电视广告投放，跟进广告执行，保证所负责广告正常上线\\n• 广告上线后监控及优化，组织上下游资源，不断优化广告投放效果，达到预期广告投放效果\\n• 完成广告下线后的数据总结及分析，为后续广告投放提供数据支持\",\"end_time_year\":\"2016\",\"still_active\":0,\"company_type\":\"股份制企业\",\"industry\":\"互联网/电子商务\",\"end_time_month\":\"11\",\"location\":\"广州\",\"company_size\":\"\",\"job_function\":\"市场\",\"start_time_year\":\"2015\",\"company_name\":\"广州欢网科技有限责任公司\",\"department\":\"\",\"job_title\":\"广告运营\",\"start_time_month\":\"03\"},{\"salary\":\"\",\"description\":\"负责平台广告主投放计划制定以及日常投放。\\n负责平台广告主资源的合作对接和沟通，整理内外资源，将产品效果最大化。\\n对广告数据进行全面分析，根据分析结果给出优化建议并跟进执行。\\n对各渠道的广告投放进行数据整理，日报周报及各种报表的整理。\\n制作项目投放总结报告。\",\"end_time_year\":\"2015\",\"still_active\":0,\"company_type\":\"民营\",\"industry\":\"互联网/电子商务\",\"end_time_month\":\"03\",\"location\":\"北京\",\"company_size\":\"20-99人\",\"job_function\":\"市场\",\"start_time_year\":\"2011\",\"company_name\":\"（4年1个月）北京青年报网际传播技术有限公司\",\"department\":\"\",\"job_title\":\"广告运营\",\"start_time_month\":\"03\"}],\"contact_info\":{\"phone_number\":\"\",\"QQ\":\"\",\"wechat\":\"\",\"email\":\"\",\"home_phone_number\":\"\"},\"social_experience\":[],\"resume_rawtext\":\"\",\"others\":{\"language\":[\"英语\"],\"certificate\":[],\"skills\":[\"Java\",\"Word\",\"html\",\"Excel\",\"英语\",\"电子商务\",\"旅游英语\",\"工商管理\",\"信息技术\",\"计算机软件\"],\"self_evaluation\":\"作为积极向上的职业人，我有积极主动的工作态度，独立工作和团队合作的能力；有效计划，合理安排的能力，兼具灵活性和创造性；乐观，友善，勇于接受新挑战，快速适应新环境。\\n真切期望能够到贵公司工作，不断提升自己并承担更多责任，成为贵公司优秀的员工。也许我不是最优秀的，但我有很强的责任感和不断进取的精神；也许我不是一个全能的英雄，但我善于和同事共同协作完满地完成任务和工作。\",\"awards\":[],\"it_skills\":[\"Java\",\"html\",\"Excel\",\"计算机软件\"],\"business_skills\":[\"Word\",\"Excel\",\"电子商务\",\"工商管理\"]},\"education_experience\":[{\"ranking\":\"\",\"major\":\"编辑出版学\",\"degree\":\"本科\",\"end_time_year\":\"2014\",\"still_active\":0,\"school_rank\":\"316\",\"school_level\":\"\",\"end_time_month\":\"06\",\"school_name\":\"北京印刷学院\",\"GPA\":\"\",\"courses\":\"\",\"start_time_year\":\"2012\",\"location\":\"北京\",\"department\":\"\",\"study_model\":\"\",\"start_time_month\":\"04\"},{\"ranking\":\"\",\"major\":\"旅游英语\",\"degree\":\"大专\",\"end_time_year\":\"2008\",\"still_active\":0,\"school_rank\":\"\",\"school_level\":\"\",\"end_time_month\":\"06\",\"school_name\":\"北京财贸职业学院\",\"GPA\":\"\",\"courses\":\"旅游英语\",\"start_time_year\":\"2005\",\"location\":\"北京\",\"department\":\"\",\"study_model\":\"\",\"start_time_month\":\"09\"}],\"basic_info\":{\"major\":\"编辑出版学\",\"expect_location\":\"\",\"current_salary\":\"\",\"current_location\":\"北京朝阳\",\"desired_salary\":\"6001-8000元/月\",\"birthplace\":\"北京\",\"degree\":\"本科\",\"desired_position\":\"广告制作执行\",\"zipcode\":\"\",\"national_identity_number\":\"\",\"date_of_birth\":\"1986-10\",\"num_work_experience\":8,\"current_position\":\"媒介运营\",\"work_start_year\":\"2014\",\"political_status\":\"团员\",\"current_company\":\"霍尔果斯乐湛科技有限公司\",\"school_name\":\"北京印刷学院\",\"ethnic\":\"\",\"name\":\"全部\",\"lastupdate_time\":\"2019-08-12-14-20-15\",\"gender\":\"女\",\"age\":33,\"marital_status\":\"已婚\",\"current_status\":\"在职，正在找工作\",\"school_type\":\"\",\"detailed_location\":\"\",\"industry\":\"广告/会展/公关\"}},\"version\":\"2.2.0\"}";
       // OnlineCv onlineCv = JSONObject.parseObject(result, OnlineCv.class);

    }

    public static String dateParseString(Date date ,String pattern){
        if(date == null){
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
}
