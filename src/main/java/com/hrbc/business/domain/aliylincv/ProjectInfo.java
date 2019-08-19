package com.hrbc.business.domain.aliylincv;

/**
 * @program: hr-workspace
 * @description: 简历项目经验
 * @author: 波波烤鸭
 * @create: 2019-08-18 22:53
 */
public class ProjectInfo {

    public String StartDate ;// 开始时间
    public String EndDate ;// 结束时间
    public String ProjectName ;// 项目名称
    public String Title ;// 项目职务
    public String ProjectDescription ;// 项目描述
    public String Responsibilities ;// 项目职责

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

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getProjectDescription() {
        return ProjectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        ProjectDescription = projectDescription;
    }

    public String getResponsibilities() {
        return Responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        Responsibilities = responsibilities;
    }
}
