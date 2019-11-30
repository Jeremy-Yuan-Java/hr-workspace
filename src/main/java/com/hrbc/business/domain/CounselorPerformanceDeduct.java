package com.hrbc.business.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CounselorPerformanceDeduct {
    private Integer id;

    private Integer jcid;

    private Integer jobsCandidatesId;

    private String cno;

    private String cname;

    private String jobno;

    private String jobdesc;

    private Integer candidatesid;

    private String candidatesname;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updatetime;

    private String createuser;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ensurencetime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date accounttime;

    private Double accountmoney;

    private Double prepareperformance;

    private Double practiceperformance;

    private Double deductmoney;

    private Double deductratio;

    private String deducttype;

    private String username;

    private String cnname;

    private Double grantmoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJcid() {
        return jcid;
    }

    public void setJcid(Integer jcid) {
        this.jcid = jcid;
    }

    public Integer getJobsCandidatesId() {
        return jobsCandidatesId;
    }

    public void setJobsCandidatesId(Integer jobsCandidatesId) {
        this.jobsCandidatesId = jobsCandidatesId;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
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

    public Date getEnsurencetime() {
        return ensurencetime;
    }

    public void setEnsurencetime(Date ensurencetime) {
        this.ensurencetime = ensurencetime;
    }

    public Date getAccounttime() {
        return accounttime;
    }

    public void setAccounttime(Date accounttime) {
        this.accounttime = accounttime;
    }

    public Double getAccountmoney() {
        return accountmoney;
    }

    public void setAccountmoney(Double accountmoney) {
        this.accountmoney = accountmoney;
    }

    public Double getPrepareperformance() {
        return prepareperformance;
    }

    public void setPrepareperformance(Double prepareperformance) {
        this.prepareperformance = prepareperformance;
    }

    public Double getPracticeperformance() {
        return practiceperformance;
    }

    public void setPracticeperformance(Double practiceperformance) {
        this.practiceperformance = practiceperformance;
    }

    public Double getDeductmoney() {
        return deductmoney;
    }

    public void setDeductmoney(Double deductmoney) {
        this.deductmoney = deductmoney;
    }

    public Double getDeductratio() {
        return deductratio;
    }

    public void setDeductratio(Double deductratio) {
        this.deductratio = deductratio;
    }

    public String getDeducttype() {
        return deducttype;
    }

    public void setDeducttype(String deducttype) {
        this.deducttype = deducttype == null ? null : deducttype.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname == null ? null : cnname.trim();
    }

    public Double getGrantmoney() {
        return grantmoney;
    }

    public void setGrantmoney(Double grantmoney) {
        this.grantmoney = grantmoney;
    }
}