package com.hrbc.business.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @program: hr-workspace
 * @description: 统计的详情数据
 * @author: 波波烤鸭
 * @create: 2019-10-02 08:38
 */
public class PerformanceDetail {
    private String id;

    private String jcid;

    private Integer flowstate;

    private String flowstatedesc;

    private String text1;

    private String text2;

    private String text3;

    private String text4;

    private String text5;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date1;
    private Date createtimest;
    private Date createtimeed;


    private String createtimeststr;

    private String createtimeedstr;


    private Integer candidateid;

    private String candidatename;

    private String cno;

    private String cname;

    private String opdate;

    private String opuser;

    private String opusername;

    private String jobid;

    private String jobtitle;

    public String getCreatetimeststr() {
        return createtimeststr;
    }

    public void setCreatetimeststr(String createtimeststr) {
        this.createtimeststr = createtimeststr;
    }

    public String getCreatetimeedstr() {
        return createtimeedstr;
    }

    public void setCreatetimeedstr(String createtimeedstr) {
        this.createtimeedstr = createtimeedstr;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date optime;

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

    public String getJcid() {
        return jcid;
    }

    public void setJcid(String jcid) {
        this.jcid = jcid;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getFlowstate() {
        return flowstate;
    }

    public void setFlowstate(Integer flowstate) {
        this.flowstate = flowstate;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getText4() {
        return text4;
    }

    public void setText4(String text4) {
        this.text4 = text4;
    }

    public String getText5() {
        return text5;
    }

    public void setText5(String text5) {
        this.text5 = text5;
    }

    public Integer getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(Integer candidateid) {
        this.candidateid = candidateid;
    }

    public String getCandidatename() {
        return candidatename;
    }

    public void setCandidatename(String candidatename) {
        this.candidatename = candidatename;
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

    public String getOpdate() {
        return opdate;
    }

    public void setOpdate(String opdate) {
        this.opdate = opdate;
    }

    public String getOpuser() {
        return opuser;
    }

    public void setOpuser(String opuser) {
        this.opuser = opuser;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getFlowstatedesc() {
        return flowstatedesc;
    }

    public void setFlowstatedesc(String flowstatedesc) {
        this.flowstatedesc = flowstatedesc;
    }

    public String getOpusername() {
        return opusername;
    }

    public void setOpusername(String opusername) {
        this.opusername = opusername;
    }

    public Date getOptime() {
        return optime;
    }

    public void setOptime(Date optime) {
        this.optime = optime;
    }
}
