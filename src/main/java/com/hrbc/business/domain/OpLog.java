package com.hrbc.business.domain;

import java.util.Date;

public class OpLog {
    private Integer id;

    private String opuser;

    private String opcontent;

    private Date optime;

    private String dataid;

    private String datakey1;

    private String datakey2;

    private String opcontent1;

    private String business;

    private String func;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpuser() {
        return opuser;
    }

    public void setOpuser(String opuser) {
        this.opuser = opuser == null ? null : opuser.trim();
    }

    public String getOpcontent() {
        return opcontent;
    }

    public void setOpcontent(String opcontent) {
        this.opcontent = opcontent == null ? null : opcontent.trim();
    }

    public Date getOptime() {
        return optime;
    }

    public void setOptime(Date optime) {
        this.optime = optime;
    }

    public String getDataid() {
        return dataid;
    }

    public void setDataid(String dataid) {
        this.dataid = dataid == null ? null : dataid.trim();
    }

    public String getDatakey1() {
        return datakey1;
    }

    public void setDatakey1(String datakey1) {
        this.datakey1 = datakey1 == null ? null : datakey1.trim();
    }

    public String getDatakey2() {
        return datakey2;
    }

    public void setDatakey2(String datakey2) {
        this.datakey2 = datakey2 == null ? null : datakey2.trim();
    }

    public String getOpcontent1() {
        return opcontent1;
    }

    public void setOpcontent1(String opcontent1) {
        this.opcontent1 = opcontent1 == null ? null : opcontent1.trim();
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func == null ? null : func.trim();
    }
}