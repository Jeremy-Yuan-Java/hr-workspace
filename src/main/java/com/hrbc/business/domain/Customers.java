package com.hrbc.business.domain;

import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Customers {
    private Integer id;

    private String cno;

    private String cname;

    private String opsstaffname;

    private String opsstaffno;

    private String contactuser;

    private String phoneno;

    private String phonenobak;

    private String email;

    private String emailbak;

    private String wechat;

    private String jobtitle;

    private String businessstate;

    private String verify;

    private Integer state;

    private Integer delflag;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updatetime;

    private String major;

    private String majorsub;
    private String communicaterec;

    private byte[] followrec;
    private JSONArray follows;

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
        this.cno = cno == null ? null : cno.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getOpsstaffname() {
        return opsstaffname;
    }

    public void setOpsstaffname(String opsstaffname) {
        this.opsstaffname = opsstaffname == null ? null : opsstaffname.trim();
    }

    public String getOpsstaffno() {
        return opsstaffno;
    }

    public void setOpsstaffno(String opsstaffno) {
        this.opsstaffno = opsstaffno == null ? null : opsstaffno.trim();
    }

    public String getContactuser() {
        return contactuser;
    }

    public void setContactuser(String contactuser) {
        this.contactuser = contactuser == null ? null : contactuser.trim();
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno == null ? null : phoneno.trim();
    }

    public String getPhonenobak() {
        return phonenobak;
    }

    public void setPhonenobak(String phonenobak) {
        this.phonenobak = phonenobak == null ? null : phonenobak.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEmailbak() {
        return emailbak;
    }

    public void setEmailbak(String emailbak) {
        this.emailbak = emailbak == null ? null : emailbak.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle == null ? null : jobtitle.trim();
    }

    public String getBusinessstate() {
        return businessstate;
    }

    public void setBusinessstate(String businessstate) {
        this.businessstate = businessstate == null ? null : businessstate.trim();
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify == null ? null : verify.trim();
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getMajorsub() {
        return majorsub;
    }

    public void setMajorsub(String majorsub) {
        this.majorsub = majorsub == null ? null : majorsub.trim();
    }

    public byte[] getFollowrec() {
        return followrec;
    }

    public void setFollowrec(byte[] followrec) {
        this.followrec = followrec;
    }

    public String getCommunicaterec() {
        return communicaterec;
    }

    public void setCommunicaterec(String communicaterec) {
        this.communicaterec = communicaterec;
    }

    /**
     * 不要轻易改动
     * @return
     */
    public JSONArray getFollows() {
        JSONArray array = null;
        if (followrec == null) {
            array = JSONArray.parseArray("[]");
        } else {

            array = JSONArray.parseArray(new String(followrec));
        }
        followrec = null;
        return array;
    }

    public void setFollows(JSONArray follows) {
        this.follows = follows;
    }
}