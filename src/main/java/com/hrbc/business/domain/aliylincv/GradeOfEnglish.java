package com.hrbc.business.domain.aliylincv;

/**
 * @program: hr-workspace
 * @description: 简历  英语证书
 * @author: 波波烤鸭
 * @create: 2019-08-18 22:44
 */
public class GradeOfEnglish {

    public String NameOfCertificate; // 英语证书名称

    public String Score; // 分数

    public String ReceivingDate; // 获得日期


    public String getNameOfCertificate() {
        return NameOfCertificate;
    }

    public void setNameOfCertificate(String nameOfCertificate) {
        NameOfCertificate = nameOfCertificate;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

    public String getReceivingDate() {
        return ReceivingDate;
    }

    public void setReceivingDate(String receivingDate) {
        ReceivingDate = receivingDate;
    }
}
