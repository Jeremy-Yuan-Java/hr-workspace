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
}
