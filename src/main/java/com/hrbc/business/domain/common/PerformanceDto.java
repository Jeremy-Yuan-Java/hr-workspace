package com.hrbc.business.domain.common;

import com.hrbc.business.domain.Performance;

import java.util.List;

/**
 * @program: hr-workspace
 * @description: 绩效对应的DTO文件
 * @author: 波波烤鸭
 * @create: 2019-09-26 11:15
 */
public class PerformanceDto {

   private List<Performance> days;

   private List<Performance> months;

    private List<Performance> years;

    private List<Performance> rowsdata;

    private List<Performance> monthly;

    public List<Performance> getMonthly() {
        return monthly;
    }

    public void setMonthly(List<Performance> monthly) {
        this.monthly = monthly;
    }

    public List<Performance> getYears() {
        return years;
    }

    public void setYears(List<Performance> years) {
        this.years = years;
    }

    public List<Performance> getRowsdata() {
        return rowsdata;
    }

    public void setRowsdata(List<Performance> rowsdata) {
        this.rowsdata = rowsdata;
    }

    public List<Performance> getDays() {
        return days;
    }

    public void setDays(List<Performance> days) {
        this.days = days;
    }

    public List<Performance> getMonths() {
        return months;
    }

    public void setMonths(List<Performance> months) {
        this.months = months;
    }
}
