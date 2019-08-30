package com.hrbc.business.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CandidatesResumeProjectinfo {
    private Integer id;

    private Integer resumeid;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startdate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date enddate;

    private String projectname;

    private String title;

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

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getCandidatesnum() {
        return candidatesnum;
    }

    public void setCandidatesnum(Integer candidatesnum) {
        this.candidatesnum = candidatesnum;
    }
}