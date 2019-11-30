package com.hrbc.business.domain;

import java.util.Date;

public class WorkPlan {
    private Integer id;

    private String username;

    private String cnname;

    private Integer years;

    private String remark;

    private Date createtime;

    private Date updatetime;

    private Integer isdelete;

    private Integer months;

    private String offers;

    private String realizeoffers;

    private String performances;

    private String realizeperformances;

    private String signs;

    private String realizesigns;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }

    public String getOffers() {
        return offers;
    }

    public void setOffers(String offers) {
        this.offers = offers == null ? null : offers.trim();
    }

    public String getRealizeoffers() {
        return realizeoffers;
    }

    public void setRealizeoffers(String realizeoffers) {
        this.realizeoffers = realizeoffers == null ? null : realizeoffers.trim();
    }

    public String getPerformances() {
        return performances;
    }

    public void setPerformances(String performances) {
        this.performances = performances == null ? null : performances.trim();
    }

    public String getRealizeperformances() {
        return realizeperformances;
    }

    public void setRealizeperformances(String realizeperformances) {
        this.realizeperformances = realizeperformances == null ? null : realizeperformances.trim();
    }

    public String getSigns() {
        return signs;
    }

    public void setSigns(String signs) {
        this.signs = signs == null ? null : signs.trim();
    }

    public String getRealizesigns() {
        return realizesigns;
    }

    public void setRealizesigns(String realizesigns) {
        this.realizesigns = realizesigns == null ? null : realizesigns.trim();
    }
}