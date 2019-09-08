package com.hrbc.business.domain;

import java.util.Date;

public class CandidatesResume {
    private Integer id;

    private Integer candidatesId;

    private Date createTime;

    private Date updateTime;

    private byte[] resumeJson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCandidatesId() {
        return candidatesId;
    }

    public void setCandidatesId(Integer candidatesId) {
        this.candidatesId = candidatesId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public byte[] getResumeJson() {
        return resumeJson;
    }

    public void setResumeJson(byte[] resumeJson) {
        this.resumeJson = resumeJson;
    }
}