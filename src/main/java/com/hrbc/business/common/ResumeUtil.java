package com.hrbc.business.common;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.domain.onlinecv.OnlineCv;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 集成第三方简历解析,该接口收费
 */
public class ResumeUtil {
    private static String AppKey = "203733639";
    private static String AppCode = "575a44f5857a458d82a22fcdddd14629";
    private static String AppSecret = "wowserbj9lb2fszsi9eswlhbqggvtsv5";
    private static String host = "http://xiaoxi.market.alicloudapi.com";
    private static String path = "/v1/parser/parse_base";
    private static String method = "POST";

    public static void getResume(byte[] data) {
        try {
            Map<String, String> headers = new HashMap<String, String>();
            //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
            headers.put("Authorization", "APPCODE " + AppCode);
            //根据API的要求，定义相对应的Content-Type
            headers.put("Content-Type", "application/json; charset=UTF-8");
            headers.put("Content-Type", "application/json");
            Map<String, String> querys = new HashMap<String, String>();
            querys.put("rawtext", "0");
            JSONObject bodys = new JSONObject();

            bodys.put("resume_base", Base64.encodeBase64String(data));
            bodys.put("file_name", "resume.html");

            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys.toJSONString());
            String result = EntityUtils.toString(response.getEntity());
            OnlineCv onlineCv = JSONObject.parseObject(result, OnlineCv.class);
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

       /* try {
            FileInputStream fileInputStream = new FileInputStream("/Users/huangyongchao/ideaProjects/gcq/business/src/main/java/com/hrbc/business/common/aaa.html");
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            // 只要没读完，不断的读取
            while ((len = fileInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
            // 得到内存中写入的所有数据
            byte[] data = outputStream.toByteArray();
            getResume(data);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();result
        }*/

        String result = "{\"cv_name\":\"74c864664c9ddac755d71fb29d0c2070.tmp\",\"src_id\":\"\",\"cv_language\":\"zh\",\"src_site\":\"zhilian\",\"errormessage\":\"succeed\",\"cv_id\":\"\",\"english_parsing_result\":{},\"updated_time\":\"\",\"errorcode\":0,\"parsing_result\":{\"project_experience\":[],\"training_experience\":[],\"work_experience\":[{\"salary\":\"\",\"description\":\"对接销售部: 进行广告下单、帐户开通、充值续费、物料更新、客户合同审核、催收款项、发票申请等。\\n对接媒体: 定期核对业务款项、跟进回款事宜、发票申请、媒体合同审核等\",\"end_time_year\":\"2019\",\"still_active\":1,\"company_type\":\"\",\"industry\":\"广告/会展/公关\",\"end_time_month\":\"08\",\"location\":\"\",\"company_size\":\"\",\"job_function\":\"公关/媒介\",\"start_time_year\":\"2017\",\"company_name\":\"霍尔果斯乐湛科技有限公司\",\"department\":\"对接销售部\",\"job_title\":\"媒介运营\",\"start_time_month\":\"07\"},{\"salary\":\"\",\"description\":\"• 依据广告法对广告素材进行审核及规范，上线前的测试调整\\n• 负责智能电视广告投放，跟进广告执行，保证所负责广告正常上线\\n• 广告上线后监控及优化，组织上下游资源，不断优化广告投放效果，达到预期广告投放效果\\n• 完成广告下线后的数据总结及分析，为后续广告投放提供数据支持\",\"end_time_year\":\"2016\",\"still_active\":0,\"company_type\":\"股份制企业\",\"industry\":\"互联网/电子商务\",\"end_time_month\":\"11\",\"location\":\"广州\",\"company_size\":\"\",\"job_function\":\"市场\",\"start_time_year\":\"2015\",\"company_name\":\"广州欢网科技有限责任公司\",\"department\":\"\",\"job_title\":\"广告运营\",\"start_time_month\":\"03\"},{\"salary\":\"\",\"description\":\"负责平台广告主投放计划制定以及日常投放。\\n负责平台广告主资源的合作对接和沟通，整理内外资源，将产品效果最大化。\\n对广告数据进行全面分析，根据分析结果给出优化建议并跟进执行。\\n对各渠道的广告投放进行数据整理，日报周报及各种报表的整理。\\n制作项目投放总结报告。\",\"end_time_year\":\"2015\",\"still_active\":0,\"company_type\":\"民营\",\"industry\":\"互联网/电子商务\",\"end_time_month\":\"03\",\"location\":\"北京\",\"company_size\":\"20-99人\",\"job_function\":\"市场\",\"start_time_year\":\"2011\",\"company_name\":\"（4年1个月）北京青年报网际传播技术有限公司\",\"department\":\"\",\"job_title\":\"广告运营\",\"start_time_month\":\"03\"}],\"contact_info\":{\"phone_number\":\"\",\"QQ\":\"\",\"wechat\":\"\",\"email\":\"\",\"home_phone_number\":\"\"},\"social_experience\":[],\"resume_rawtext\":\"\",\"others\":{\"language\":[\"英语\"],\"certificate\":[],\"skills\":[\"Java\",\"Word\",\"html\",\"Excel\",\"英语\",\"电子商务\",\"旅游英语\",\"工商管理\",\"信息技术\",\"计算机软件\"],\"self_evaluation\":\"作为积极向上的职业人，我有积极主动的工作态度，独立工作和团队合作的能力；有效计划，合理安排的能力，兼具灵活性和创造性；乐观，友善，勇于接受新挑战，快速适应新环境。\\n真切期望能够到贵公司工作，不断提升自己并承担更多责任，成为贵公司优秀的员工。也许我不是最优秀的，但我有很强的责任感和不断进取的精神；也许我不是一个全能的英雄，但我善于和同事共同协作完满地完成任务和工作。\",\"awards\":[],\"it_skills\":[\"Java\",\"html\",\"Excel\",\"计算机软件\"],\"business_skills\":[\"Word\",\"Excel\",\"电子商务\",\"工商管理\"]},\"education_experience\":[{\"ranking\":\"\",\"major\":\"编辑出版学\",\"degree\":\"本科\",\"end_time_year\":\"2014\",\"still_active\":0,\"school_rank\":\"316\",\"school_level\":\"\",\"end_time_month\":\"06\",\"school_name\":\"北京印刷学院\",\"GPA\":\"\",\"courses\":\"\",\"start_time_year\":\"2012\",\"location\":\"北京\",\"department\":\"\",\"study_model\":\"\",\"start_time_month\":\"04\"},{\"ranking\":\"\",\"major\":\"旅游英语\",\"degree\":\"大专\",\"end_time_year\":\"2008\",\"still_active\":0,\"school_rank\":\"\",\"school_level\":\"\",\"end_time_month\":\"06\",\"school_name\":\"北京财贸职业学院\",\"GPA\":\"\",\"courses\":\"旅游英语\",\"start_time_year\":\"2005\",\"location\":\"北京\",\"department\":\"\",\"study_model\":\"\",\"start_time_month\":\"09\"}],\"basic_info\":{\"major\":\"编辑出版学\",\"expect_location\":\"\",\"current_salary\":\"\",\"current_location\":\"北京朝阳\",\"desired_salary\":\"6001-8000元/月\",\"birthplace\":\"北京\",\"degree\":\"本科\",\"desired_position\":\"广告制作执行\",\"zipcode\":\"\",\"national_identity_number\":\"\",\"date_of_birth\":\"1986-10\",\"num_work_experience\":8,\"current_position\":\"媒介运营\",\"work_start_year\":\"2014\",\"political_status\":\"团员\",\"current_company\":\"霍尔果斯乐湛科技有限公司\",\"school_name\":\"北京印刷学院\",\"ethnic\":\"\",\"name\":\"全部\",\"lastupdate_time\":\"2019-08-12-14-20-15\",\"gender\":\"女\",\"age\":33,\"marital_status\":\"已婚\",\"current_status\":\"在职，正在找工作\",\"school_type\":\"\",\"detailed_location\":\"\",\"industry\":\"广告/会展/公关\"}},\"version\":\"2.2.0\"}";
        OnlineCv onlineCv = JSONObject.parseObject(result, OnlineCv.class);

    }
}
