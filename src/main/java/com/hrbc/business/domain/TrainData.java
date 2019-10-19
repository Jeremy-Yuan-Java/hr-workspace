package com.hrbc.business.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TrainData {
    private Integer id;

    private String fileName;

    private String fileUrl;

    private String fileType;

    private String authcUser;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateTime;

    private String createUser;

    private Integer backi1;

    private Integer backi2;

    private Integer backi3;

    private String backv1;

    private String backv2;

    private String backv3;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date backd1;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date backd2;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date backd3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getAuthcUser() {
        return authcUser;
    }

    public void setAuthcUser(String authcUser) {
        this.authcUser = authcUser == null ? null : authcUser.trim();
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

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Integer getBacki1() {
        return backi1;
    }

    public void setBacki1(Integer backi1) {
        this.backi1 = backi1;
    }

    public Integer getBacki2() {
        return backi2;
    }

    public void setBacki2(Integer backi2) {
        this.backi2 = backi2;
    }

    public Integer getBacki3() {
        return backi3;
    }

    public void setBacki3(Integer backi3) {
        this.backi3 = backi3;
    }

    public String getBackv1() {
        return backv1;
    }

    public void setBackv1(String backv1) {
        this.backv1 = backv1 == null ? null : backv1.trim();
    }

    public String getBackv2() {
        return backv2;
    }

    public void setBackv2(String backv2) {
        this.backv2 = backv2 == null ? null : backv2.trim();
    }

    public String getBackv3() {
        return backv3;
    }

    public void setBackv3(String backv3) {
        this.backv3 = backv3 == null ? null : backv3.trim();
    }

    public Date getBackd1() {
        return backd1;
    }

    public void setBackd1(Date backd1) {
        this.backd1 = backd1;
    }

    public Date getBackd2() {
        return backd2;
    }

    public void setBackd2(Date backd2) {
        this.backd2 = backd2;
    }

    public Date getBackd3() {
        return backd3;
    }

    public void setBackd3(Date backd3) {
        this.backd3 = backd3;
    }
}