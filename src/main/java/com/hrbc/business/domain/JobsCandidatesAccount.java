package com.hrbc.business.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class JobsCandidatesAccount {
    private Integer id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date accountDate;

    private Double accountMoney;

    private Integer jobsCandidatesId;

    private String cname;

    private String cno;

    private String jobno;

    private String jobdesc;

    private Integer candidatesid;

    private String candidatesname;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updatetime;

    private String createuser;

    private String updateuser;

    private String back1;

    private String back2;

    private String back3;

    private Integer isdelete;

    private Integer jobcandidateid;

    private String remark;

    private String accounttype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }

    public Double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(Double accountMoney) {
        this.accountMoney = accountMoney;
    }

    public Integer getJobsCandidatesId() {
        return jobsCandidatesId;
    }

    public void setJobsCandidatesId(Integer jobsCandidatesId) {
        this.jobsCandidatesId = jobsCandidatesId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }

    public String getJobno() {
        return jobno;
    }

    public void setJobno(String jobno) {
        this.jobno = jobno == null ? null : jobno.trim();
    }

    public String getJobdesc() {
        return jobdesc;
    }

    public void setJobdesc(String jobdesc) {
        this.jobdesc = jobdesc == null ? null : jobdesc.trim();
    }

    public Integer getCandidatesid() {
        return candidatesid;
    }

    public void setCandidatesid(Integer candidatesid) {
        this.candidatesid = candidatesid;
    }

    public String getCandidatesname() {
        return candidatesname;
    }

    public void setCandidatesname(String candidatesname) {
        this.candidatesname = candidatesname == null ? null : candidatesname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    public String getBack1() {
        return back1;
    }

    public void setBack1(String back1) {
        this.back1 = back1 == null ? null : back1.trim();
    }

    public String getBack2() {
        return back2;
    }

    public void setBack2(String back2) {
        this.back2 = back2 == null ? null : back2.trim();
    }

    public String getBack3() {
        return back3;
    }

    public void setBack3(String back3) {
        this.back3 = back3 == null ? null : back3.trim();
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getJobcandidateid() {
        return jobcandidateid;
    }

    public void setJobcandidateid(Integer jobcandidateid) {
        this.jobcandidateid = jobcandidateid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype == null ? null : accounttype.trim();
    }
}