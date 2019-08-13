package com.hrbc.business.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class JobsCandidatesState {
    private Integer id;

    private Integer jcid;

    private Integer flowstate;

    private String flowstatedesc;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date optime;

    private String opuser;

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

    private String text1;

    private String text2;

    private String text3;

    private String text4;

    private String text5;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date1;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date2;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date3;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date4;

    private Integer ischeck;

    private Integer isapprove;

    private byte[] communicaterecs;

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

    public Integer getFlowstate() {
        return flowstate;
    }

    public void setFlowstate(Integer flowstate) {
        this.flowstate = flowstate;
    }

    public String getFlowstatedesc() {
        return flowstatedesc;
    }

    public void setFlowstatedesc(String flowstatedesc) {
        this.flowstatedesc = flowstatedesc == null ? null : flowstatedesc.trim();
    }

    public Date getOptime() {
        return optime;
    }

    public void setOptime(Date optime) {
        this.optime = optime;
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

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1 == null ? null : text1.trim();
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2 == null ? null : text2.trim();
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3 == null ? null : text3.trim();
    }

    public String getText4() {
        return text4;
    }

    public void setText4(String text4) {
        this.text4 = text4 == null ? null : text4.trim();
    }

    public String getText5() {
        return text5;
    }

    public void setText5(String text5) {
        this.text5 = text5 == null ? null : text5.trim();
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public Date getDate3() {
        return date3;
    }

    public void setDate3(Date date3) {
        this.date3 = date3;
    }

    public Date getDate4() {
        return date4;
    }

    public void setDate4(Date date4) {
        this.date4 = date4;
    }

    public Integer getIscheck() {
        return ischeck;
    }

    public void setIscheck(Integer ischeck) {
        this.ischeck = ischeck;
    }

    public Integer getIsapprove() {
        return isapprove;
    }

    public void setIsapprove(Integer isapprove) {
        this.isapprove = isapprove;
    }

    public byte[] getCommunicaterecs() {
        return communicaterecs;
    }

    public void setCommunicaterecs(byte[] communicaterecs) {
        this.communicaterecs = communicaterecs;
    }
}