package com.hrbc.business.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CandidatesResumeExperienceinfo {
    private Integer id;

    private Integer resumeid;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startdate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date enddate;

    private String periodsoftime;

    private String company;

    private String location;

    private String vocation;

    private String sizecompany;

    private String typecompany;

    private String department;

    private String title;

    private String salary;

    private String summary;

    private String leader;

    private String underlingnumber;

    private String reasonofleaving;

    private String worktype;

    private String isstudii;

    private String deponent;

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

    public String getPeriodsoftime() {
        return periodsoftime;
    }

    public void setPeriodsoftime(String periodsoftime) {
        this.periodsoftime = periodsoftime == null ? null : periodsoftime.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getVocation() {
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation == null ? null : vocation.trim();
    }

    public String getSizecompany() {
        return sizecompany;
    }

    public void setSizecompany(String sizecompany) {
        this.sizecompany = sizecompany == null ? null : sizecompany.trim();
    }

    public String getTypecompany() {
        return typecompany;
    }

    public void setTypecompany(String typecompany) {
        this.typecompany = typecompany == null ? null : typecompany.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    public String getUnderlingnumber() {
        return underlingnumber;
    }

    public void setUnderlingnumber(String underlingnumber) {
        this.underlingnumber = underlingnumber == null ? null : underlingnumber.trim();
    }

    public String getReasonofleaving() {
        return reasonofleaving;
    }

    public void setReasonofleaving(String reasonofleaving) {
        this.reasonofleaving = reasonofleaving == null ? null : reasonofleaving.trim();
    }

    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype == null ? null : worktype.trim();
    }

    public String getIsstudii() {
        return isstudii;
    }

    public void setIsstudii(String isstudii) {
        this.isstudii = isstudii == null ? null : isstudii.trim();
    }

    public String getDeponent() {
        return deponent;
    }

    public void setDeponent(String deponent) {
        this.deponent = deponent == null ? null : deponent.trim();
    }

    public Integer getCandidatesnum() {
        return candidatesnum;
    }

    public void setCandidatesnum(Integer candidatesnum) {
        this.candidatesnum = candidatesnum;
    }
}