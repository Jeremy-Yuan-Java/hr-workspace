package com.hrbc.business.domain.enums;

/**
 * 候选人job流程枚举 前台后台保持一致,不要轻易乱改
 *
 * @author huangyongchao
 */
public enum JobFlowE {
    匹配职位(1),
    推给客户(2),
    约面管理(3),
    面试反馈(4),
    OFFER确认(5),
    入职到岗(6),
    过保(7),
    人选放弃(8),
    客户否决(9),
    顾问否决(10),
    保用期离职(11),
    协商延长保用期(13),
    背调否决(14);
    public int code;

    private JobFlowE(int code) {
        this.code = code;
    }

    public static void main(String[] args) {

        System.out.println(JobFlowE.OFFER确认.toString());
    }
}
