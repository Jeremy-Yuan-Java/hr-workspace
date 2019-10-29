package com.hrbc.business.domain;

import java.util.Date;

/**
 * @program: hr-workspace
 * @description: 绩效
 * @author: 波波烤鸭
 * @create: 2019-09-29 16:30
 */
public class Performance {

    private String opdate;



    private String opuser;

    private String id;

    private String opusername;

    private String khs;

    private String jobnum;

    private String tjl;

    private String interview;

    private String offer;

    private String rzdg;

    private String rzfq;

    private String byqlz;

    private String msl;

    private String offerl;

    private String pdl;

    private Integer tjf; // 推荐积分

    private Integer msf; // 面试积分

    private Integer qyf; // 签约分

    private Double off; // 面试积分

    private Double total; // 累加总分
    /****查询条件***/
    private Date createtimest;

    private Date createtimeed;

    private String createtimeststr;

    private String createtimeedstr;

    private String qcustomername;

    private String qjobname;

    private String qopusername;

    /****分组条件***/

    private String group1;

    private String group2;

    private String cno;
    private String jobid;
    private String jobdesc;
    // 当前登录用户
    private String currentuser;

    private boolean hasChildren = true;

    public String getCurrentuser() {
        return currentuser;
    }

    public void setCurrentuser(String currentuser) {
        this.currentuser = currentuser;
    }

    public Integer getQyf() {
        return qyf;
    }

    public void setQyf(Integer qyf) {
        this.qyf = qyf;
    }

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

    public String getJobdesc() {
        return jobdesc;
    }

    public void setJobdesc(String jobdesc) {
        this.jobdesc = jobdesc;
    }

    public String getJobnum() {
        return jobnum;
    }

    public void setJobnum(String jobnum) {
        this.jobnum = jobnum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

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

    public String getQcustomername() {
        return qcustomername;
    }

    public void setQcustomername(String qcustomername) {
        this.qcustomername = qcustomername;
    }

    public String getQjobname() {
        return qjobname;
    }

    public void setQjobname(String qjobname) {
        this.qjobname = qjobname;
    }

    public String getQopusername() {
        return qopusername;
    }

    public void setQopusername(String qopusername) {
        this.qopusername = qopusername;
    }

    public String getGroup1() {
        return group1;
    }

    public void setGroup1(String group1) {
        this.group1 = group1;
    }

    public String getGroup2() {
        return group2;
    }

    public void setGroup2(String group2) {
        this.group2 = group2;
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

    public String getOpusername() {
        return opusername;
    }

    public void setOpusername(String opusername) {
        this.opusername = opusername;
    }

    public String getKhs() {
        return khs;
    }

    public void setKhs(String khs) {
        this.khs = khs;
    }

    public String getTjl() {
        return tjl;
    }

    public void setTjl(String tjl) {
        this.tjl = tjl;
    }

    public String getInterview() {
        return interview;
    }

    public void setInterview(String interview) {
        this.interview = interview;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public String getRzdg() {
        return rzdg;
    }

    public void setRzdg(String rzdg) {
        this.rzdg = rzdg;
    }

    public String getRzfq() {
        return rzfq;
    }

    public void setRzfq(String rzfq) {
        this.rzfq = rzfq;
    }

    public String getByqlz() {
        return byqlz;
    }

    public void setByqlz(String byqlz) {
        this.byqlz = byqlz;
    }

    public String getMsl() {
        return msl;
    }

    public void setMsl(String msl) {
        this.msl = msl;
    }

    public String getOfferl() {
        return offerl;
    }

    public void setOfferl(String offerl) {
        this.offerl = offerl;
    }

    public String getPdl() {
        return pdl;
    }

    public void setPdl(String pdl) {
        this.pdl = pdl;
    }


    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public Integer getTjf() {
        return tjf;
    }

    public void setTjf(Integer tjf) {
        this.tjf = tjf;
    }

    public Integer getMsf() {
        return msf;
    }

    public void setMsf(Integer msf) {
        this.msf = msf;
    }

    public Double getOff() {
        return off;
    }

    public void setOff(Double off) {
        this.off = off;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
