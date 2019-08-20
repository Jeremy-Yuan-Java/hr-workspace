package com.hrbc.business.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CandidatesJobsReport {
    private Integer id;

    private Integer customerId;

    private Integer candidatesId;

    private String reportpath;

    private Integer uploadUserid;

    private String uploadUsername;

    private String uploadUsercname;

    private Integer state;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    private String backup1;

    private String backup2;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCandidatesId() {
        return candidatesId;
    }

    public void setCandidatesId(Integer candidatesId) {
        this.candidatesId = candidatesId;
    }

    public String getReportpath() {
        return reportpath;
    }

    public void setReportpath(String reportpath) {
        this.reportpath = reportpath == null ? null : reportpath.trim();
    }

    public Integer getUploadUserid() {
        return uploadUserid;
    }

    public void setUploadUserid(Integer uploadUserid) {
        this.uploadUserid = uploadUserid;
    }

    public String getUploadUsername() {
        return uploadUsername;
    }

    public void setUploadUsername(String uploadUsername) {
        this.uploadUsername = uploadUsername == null ? null : uploadUsername.trim();
    }

    public String getUploadUsercname() {
        return uploadUsercname;
    }

    public void setUploadUsercname(String uploadUsercname) {
        this.uploadUsercname = uploadUsercname == null ? null : uploadUsercname.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getBackup1() {
        return backup1;
    }

    public void setBackup1(String backup1) {
        this.backup1 = backup1 == null ? null : backup1.trim();
    }

    public String getBackup2() {
        return backup2;
    }

    public void setBackup2(String backup2) {
        this.backup2 = backup2 == null ? null : backup2.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}