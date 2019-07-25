package com.hrbc.business.domain;

import java.util.Date;

public class JobsCandidates {
    private Integer id;

    private Integer candidateid;

    private String candidatename;

    private Date optime;

    private Integer opuser;

    private String opusername;

    private String remark;

    private Integer state;

    private Integer delflag;

    private Date createtime;

    private Date updatetime;

    private String createuser;

    private String updateuser;

    private String createstaff;

    private String updatestaff;

    private String fulltexts;

    private String jobtitle;

    private String lastcompany;

    private String phoneno;

    private Integer jobid;

    private byte[] communicaterecs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        this.candidatename = candidatename == null ? null : candidatename.trim();
    }

    public Date getOptime() {
        return optime;
    }

    public void setOptime(Date optime) {
        this.optime = optime;
    }

    public Integer getOpuser() {
        return opuser;
    }

    public void setOpuser(Integer opuser) {
        this.opuser = opuser;
    }

    public String getOpusername() {
        return opusername;
    }

    public void setOpusername(String opusername) {
        this.opusername = opusername == null ? null : opusername.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDelflag() {
        return delflag;
    }

    public void setDelflag(Integer delflag) {
        this.delflag = delflag;
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

    public String getCreatestaff() {
        return createstaff;
    }

    public void setCreatestaff(String createstaff) {
        this.createstaff = createstaff == null ? null : createstaff.trim();
    }

    public String getUpdatestaff() {
        return updatestaff;
    }

    public void setUpdatestaff(String updatestaff) {
        this.updatestaff = updatestaff == null ? null : updatestaff.trim();
    }

    public String getFulltexts() {
        return fulltexts;
    }

    public void setFulltexts(String fulltexts) {
        this.fulltexts = fulltexts == null ? null : fulltexts.trim();
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle == null ? null : jobtitle.trim();
    }

    public String getLastcompany() {
        return lastcompany;
    }

    public void setLastcompany(String lastcompany) {
        this.lastcompany = lastcompany == null ? null : lastcompany.trim();
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno == null ? null : phoneno.trim();
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public byte[] getCommunicaterecs() {
        return communicaterecs;
    }

    public void setCommunicaterecs(byte[] communicaterecs) {
        this.communicaterecs = communicaterecs;
    }
}