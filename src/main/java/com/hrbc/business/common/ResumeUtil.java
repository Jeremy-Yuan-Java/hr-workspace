package com.hrbc.business.common;

import com.alibaba.fastjson.JSONObject;
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
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

        try {
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
            e.printStackTrace();
        }
    }
}
