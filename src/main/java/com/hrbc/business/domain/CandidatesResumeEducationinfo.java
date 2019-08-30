package com.hrbc.business.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CandidatesResumeEducationinfo {
    private Integer id;

    private Integer resumeid;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startdate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date enddate;

    private String school;

    private String schooltype;

    private String schoollabel;

    private String speciality;

    private String advanceddegree;

    private String education;

    private String department;

    private String summary;

    private String isstudii;

    private Integer candidatesnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResumeid() {
        return resumeid;
    }

    public void setResumeid(Integer resumeid) {
        this.resumeid = resumeid;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getSchooltype() {
        return schooltype;
    }

    public void setSchooltype(String schooltype) {
        this.schooltype = schooltype == null ? null : schooltype.trim();
    }

    public String getSchoollabel() {
        return schoollabel;
    }

    public void setSchoollabel(String schoollabel) {
        this.schoollabel = schoollabel == null ? null : schoollabel.trim();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality == null ? null : speciality.trim();
    }

    public String getAdvanceddegree() {
        return advanceddegree;
    }

    public void setAdvanceddegree(String advanceddegree) {
        this.advanceddegree = advanceddegree == null ? null : advanceddegree.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getIsstudii() {
        return isstudii;
    }

    public void setIsstudii(String isstudii) {
        this.isstudii = isstudii == null ? null : isstudii.trim();
    }

    public Integer getCandidatesnum() {
        return candidatesnum;
    }

    public void setCandidatesnum(Integer candidatesnum) {
        this.candidatesnum = candidatesnum;
    }
}