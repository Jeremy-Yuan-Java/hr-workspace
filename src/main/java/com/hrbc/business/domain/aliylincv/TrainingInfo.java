package com.hrbc.business.domain.aliylincv;

/**
 * @program: hr-workspace
 * @description: 简历 培训经历
 * @author: 波波烤鸭
 * @create: 2019-08-18 22:51
 */
public class TrainingInfo {
    public String StartDate ;// 开始时间
    public String EndDate ;// 结束时间
    public String Title ;// 培训名称
    public String TrainingInstitution ;// 培训机构
    public String TrainingLocation ;// 培训地点
    public String TrainingCourse ;// 培训课程
    public String Certificate ;// 所获证书
    public String DescriptionInDetails ;// 培训详情

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTrainingInstitution() {
        return TrainingInstitution;
    }

    public void setTrainingInstitution(String trainingInstitution) {
        TrainingInstitution = trainingInstitution;
    }

    public String getTrainingLocation() {
        return TrainingLocation;
    }

    public void setTrainingLocation(String trainingLocation) {
        TrainingLocation = trainingLocation;
    }

    public String getTrainingCourse() {
        return TrainingCourse;
    }

    public void setTrainingCourse(String trainingCourse) {
        TrainingCourse = trainingCourse;
    }

    public String getCertificate() {
        return Certificate;
    }

    public void setCertificate(String certificate) {
        Certificate = certificate;
    }

    public String getDescriptionInDetails() {
        return DescriptionInDetails;
    }

    public void setDescriptionInDetails(String descriptionInDetails) {
        DescriptionInDetails = descriptionInDetails;
    }
}
