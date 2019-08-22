package com.hrbc.business.common;

import com.google.common.collect.Sets;
import com.hrbc.business.domain.enums.JobFlowE;

import java.util.Set;

/**
 * @author huangyongchao
 */
public class Constants {


    /**
     * 系统对内提供服务的api基础路径
     */
    public static String BASE_API = "api";

    /**
     * 系统对外提供服务的api基础路径 比如暴露给公网的一些资源地址等
     */
    public static String OPEN_API = "openapi";
    public static String DEFAULT_PWD = "123456";
    public static Set<Integer> CANDIDATE_LOCK_STATE = Sets.newHashSet();

    static {
        CANDIDATE_LOCK_STATE.add(JobFlowE.OFFER确认.code);
        CANDIDATE_LOCK_STATE.add(JobFlowE.入职到岗.code);
        CANDIDATE_LOCK_STATE.add(JobFlowE.过保.code);
        CANDIDATE_LOCK_STATE.add(JobFlowE.协商延长保用期.code);
    }

    //签名算法HmacSha256
    public static final String HMAC_SHA256 = "HmacSHA256";
    //编码UTF-8
    public static final String ENCODING = "UTF-8";
    //UserAgent
    public static final String USER_AGENT = "demo/aliyun/java";
    //换行符
    public static final String LF = "\n";
    //  跨系统换行符
    public static final String LF1 = System.getProperty("line.separator");
    // 项目分隔符
    public static final String DECOLLATOR = "\u2500";
    //串联符
    public static final String SPE1 = ",";
    //示意符
    public static final String SPE2 = ":";
    //连接符
    public static final String SPE3 = "&";
    //赋值符
    public static final String SPE4 = "=";
    //问号符
    public static final String SPE5 = "?";
    //默认请求超时时间,单位毫秒
    public static final int DEFAULT_TIMEOUT = 1000;
    //参与签名的系统Header前缀,只有指定前缀的Header才会参与到签名中
    public static final String CA_HEADER_TO_SIGN_PREFIX_SYSTEM = "X-Ca-";
}
