package com.hrbc.business.domain;

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

    private String createuser;

    private String updateuser;

    private String createstaff;

    private String updatestaff;

    private String remark;

    private String customerdesc;

    private byte[] followrec;

    public String getCommunicaterec() {
        return communicaterec;
    }

    public void setCommunicaterec(String communicaterec) {
        this.communicaterec = communicaterec;
    }

    private String communicaterec;

    private String fulltexts;

    private Integer opsstaffid;

    private String contactuser1;

    private String phoneno1;

    private String contactuser2;

    private String phoneno2;

    private String deducts;

    private String payments;

    private String ensurences;



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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCustomerdesc() {
        return customerdesc;
    }

    public void setCustomerdesc(String customerdesc) {
        this.customerdesc = customerdesc == null ? null : customerdesc.trim();
    }

    public String getFulltexts() {
        return fulltexts;
    }

    public void setFulltexts(String fulltexts) {
        this.fulltexts = fulltexts == null ? null : fulltexts.trim();
    }

    public Integer getOpsstaffid() {
        return opsstaffid;
    }

    public void setOpsstaffid(Integer opsstaffid) {
        this.opsstaffid = opsstaffid;
    }

    public String getContactuser1() {
        return contactuser1;
    }

    public void setContactuser1(String contactuser1) {
        this.contactuser1 = contactuser1 == null ? null : contactuser1.trim();
    }

    public String getPhoneno1() {
        return phoneno1;
    }

    public void setPhoneno1(String phoneno1) {
        this.phoneno1 = phoneno1 == null ? null : phoneno1.trim();
    }

    public String getContactuser2() {
        return contactuser2;
    }

    public void setContactuser2(String contactuser2) {
        this.contactuser2 = contactuser2 == null ? null : contactuser2.trim();
    }

    public String getPhoneno2() {
        return phoneno2;
    }

    public void setPhoneno2(String phoneno2) {
        this.phoneno2 = phoneno2 == null ? null : phoneno2.trim();
    }

    public String getDeducts() {
        return deducts;
    }

    public void setDeducts(String deducts) {
        this.deducts = deducts == null ? null : deducts.trim();
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments == null ? null : payments.trim();
    }

    public String getEnsurences() {
        return ensurences;
    }

    public void setEnsurences(String ensurences) {
        this.ensurences = ensurences == null ? null : ensurences.trim();
    }

    public byte[] getFollowrec() {
        return followrec;
    }

    public void setFollowrec(byte[] followrec) {
        this.followrec = followrec;
    }
}