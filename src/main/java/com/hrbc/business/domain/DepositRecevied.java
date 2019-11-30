package com.hrbc.business.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @program: hr-workspace
 * @description: 预收数据
 * @author: 波波烤鸭
 * @create: 2019-11-19 15:54
 */
public class DepositRecevied {
    private Integer id;

    private Integer offerset;

    private Integer limit;

    private String cno;

    private String cname;

    private String jobno;

    private String jobdesc;

    private String candidateid;

    private String candidatename;

    private double offermoney;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date offertime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private  Date entrytime;
    // 预收款
    private double deposit;
    @JsonFormat(pattern = "yyyy-MM-dd")
    // 预估回款时间
    private String estimatetime;

    // 所属顾问  账号
    private String opuser;
    // 所属顾问  姓名
    private String opusername;

    private String region;

    private String deducts;

    private String payments;

    private String ensurences;

    private String deposittype;

    private Date createtimest;

    private Date createtimeed;

    public Date getCreatetimest() {
        return createtimest;
    }

    public void setCreatetimest(Date createtimest) {
        this.createtimest = createtimest;
    }

    public Date getCreatetimeed() {
        return createtimeed;
    }

    public void setCreatetimeed(Date createtimeed) {
        this.createtimeed = createtimeed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getJobno() {
        return jobno;
    }

    public void setJobno(String jobno) {
        this.jobno = jobno;
    }

    public String getJobdesc() {
        return jobdesc;
    }

    public void setJobdesc(String jobdesc) {
        this.jobdesc = jobdesc;
    }

    public String getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(String candidateid) {
        this.candidateid = candidateid;
    }

    public String getCandidatename() {
        return candidatename;
    }

    public void setCandidatename(String candidatename) {
        this.candidatename = candidatename;
    }

    public double getOffermoney() {
        return offermoney;
    }

    public void setOffermoney(double offermoney) {
        this.offermoney = offermoney;
    }

    public Date getOffertime() {
        return offertime;
    }

    public void setOffertime(Date offertime) {
        this.offertime = offertime;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public String getEstimatetime() {
        return estimatetime;
    }

    public void setEstimatetime(String estimatetime) {
        this.estimatetime = estimatetime;
    }

    public String getOpuser() {
        return opuser;
    }

    public void setOpuser(String opuser) {
        this.opuser = opuser;
    }

    public String getOpusername() {
        return opusername;
    }

    public void setOpusername(String opusername) {
        this.opusername = opusername;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDeducts() {
        return deducts;
    }

    public void setDeducts(String deducts) {
        this.deducts = deducts;
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments;
    }

    public String getEnsurences() {
        return ensurences;
    }

    public void setEnsurences(String ensurences) {
        this.ensurences = ensurences;
    }

    public Integer getOfferset() {
        return offerset;
    }

    public void setOfferset(Integer offerset) {
        this.offerset = offerset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getDeposittype() {
        return deposittype;
    }

    public void setDeposittype(String deposittype) {
        this.deposittype = deposittype;
    }
}
