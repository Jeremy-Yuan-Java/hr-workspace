package com.hrbc.business.domain.aliylincv;

/**
 * @program: hr-workspace
 * @description: 简历 教育详情
 * @author: 波波烤鸭
 * @create: 2019-08-18 22:47
 */
public class EducationInfo {
    public String StartDate ;// 起始时间
    public String EndDate ;// 终止时间
    public String School ;// 学校名称
    /**
     *  院校类别：取值为 0，1，2，3，4，5
     *     0：普通，1：211 院校，2：985 院校，
     *     3：既是 211 又是 985 院校，4：外国院校，5：台湾大学
     */
    public String SchoolType;
    public String SchoolLabel ;// 学校特征标签（非简历中内容）
    public String Speciality; // 专业
    public String AdvancedDegree; // 学位
    public String Education ;// 学历
    public String Department; // 院系
    public String Summary;// 详细介绍
    public String IsStudii; // 留学经历

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

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getSchoolType() {
        return SchoolType;
    }

    public void setSchoolType(String schoolType) {
        SchoolType = schoolType;
    }

    public String getSchoolLabel() {
        return SchoolLabel;
    }

    public void setSchoolLabel(String schoolLabel) {
        SchoolLabel = schoolLabel;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public String getAdvancedDegree() {
        return AdvancedDegree;
    }

    public void setAdvancedDegree(String advancedDegree) {
        AdvancedDegree = advancedDegree;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public String getIsStudii() {
        return IsStudii;
    }

    public void setIsStudii(String isStudii) {
        IsStudii = isStudii;
    }
}
