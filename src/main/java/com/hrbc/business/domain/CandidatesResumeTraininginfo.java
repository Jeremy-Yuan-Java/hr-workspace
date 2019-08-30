package com.hrbc.business.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CandidatesResumeTraininginfo {
    private Integer id;

    private Integer resumeid;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startdate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date enddate;

    private String title;

    private String traininginstituion;

    private String traininglocation;

    private String trainingcourse;

    private String certificate;

    private Integer candidatesnum;

    private String descriptionindetails;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTraininginstituion() {
        return traininginstituion;
    }

    public void setTraininginstituion(String traininginstituion) {
        this.traininginstituion = traininginstituion == null ? null : traininginstituion.trim();
    }

    public String getTraininglocation() {
        return traininglocation;
    }

    public void setTraininglocation(String traininglocation) {
        this.traininglocation = traininglocation == null ? null : traininglocation.trim();
    }

    public String getTrainingcourse() {
        return trainingcourse;
    }

    public void setTrainingcourse(String trainingcourse) {
        this.trainingcourse = trainingcourse == null ? null : trainingcourse.trim();
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate == null ? null : certificate.trim();
    }

    public Integer getCandidatesnum() {
        return candidatesnum;
    }

    public void setCandidatesnum(Integer candidatesnum) {
        this.candidatesnum = candidatesnum;
    }

    public String getDescriptionindetails() {
        return descriptionindetails;
    }

    public void setDescriptionindetails(String descriptionindetails) {
        this.descriptionindetails = descriptionindetails == null ? null : descriptionindetails.trim();
    }
}