package com.hrbc.business.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public WorkPlanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andCnnameIsNull() {
            addCriterion("cnname is null");
            return (Criteria) this;
        }

        public Criteria andCnnameIsNotNull() {
            addCriterion("cnname is not null");
            return (Criteria) this;
        }

        public Criteria andCnnameEqualTo(String value) {
            addCriterion("cnname =", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameNotEqualTo(String value) {
            addCriterion("cnname <>", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameGreaterThan(String value) {
            addCriterion("cnname >", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameGreaterThanOrEqualTo(String value) {
            addCriterion("cnname >=", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameLessThan(String value) {
            addCriterion("cnname <", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameLessThanOrEqualTo(String value) {
            addCriterion("cnname <=", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameLike(String value) {
            addCriterion("cnname like", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameNotLike(String value) {
            addCriterion("cnname not like", value, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameIn(List<String> values) {
            addCriterion("cnname in", values, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameNotIn(List<String> values) {
            addCriterion("cnname not in", values, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameBetween(String value1, String value2) {
            addCriterion("cnname between", value1, value2, "cnname");
            return (Criteria) this;
        }

        public Criteria andCnnameNotBetween(String value1, String value2) {
            addCriterion("cnname not between", value1, value2, "cnname");
            return (Criteria) this;
        }

        public Criteria andYearsIsNull() {
            addCriterion("years is null");
            return (Criteria) this;
        }

        public Criteria andYearsIsNotNull() {
            addCriterion("years is not null");
            return (Criteria) this;
        }

        public Criteria andYearsEqualTo(Integer value) {
            addCriterion("years =", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotEqualTo(Integer value) {
            addCriterion("years <>", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThan(Integer value) {
            addCriterion("years >", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("years >=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThan(Integer value) {
            addCriterion("years <", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThanOrEqualTo(Integer value) {
            addCriterion("years <=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsIn(List<Integer> values) {
            addCriterion("years in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotIn(List<Integer> values) {
            addCriterion("years not in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsBetween(Integer value1, Integer value2) {
            addCriterion("years between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("years not between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andMonthsIsNull() {
            addCriterion("months is null");
            return (Criteria) this;
        }

        public Criteria andMonthsIsNotNull() {
            addCriterion("months is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsEqualTo(Integer value) {
            addCriterion("months =", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotEqualTo(Integer value) {
            addCriterion("months <>", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsGreaterThan(Integer value) {
            addCriterion("months >", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsGreaterThanOrEqualTo(Integer value) {
            addCriterion("months >=", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsLessThan(Integer value) {
            addCriterion("months <", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsLessThanOrEqualTo(Integer value) {
            addCriterion("months <=", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsIn(List<Integer> values) {
            addCriterion("months in", values, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotIn(List<Integer> values) {
            addCriterion("months not in", values, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsBetween(Integer value1, Integer value2) {
            addCriterion("months between", value1, value2, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotBetween(Integer value1, Integer value2) {
            addCriterion("months not between", value1, value2, "months");
            return (Criteria) this;
        }

        public Criteria andOffersIsNull() {
            addCriterion("offers is null");
            return (Criteria) this;
        }

        public Criteria andOffersIsNotNull() {
            addCriterion("offers is not null");
            return (Criteria) this;
        }

        public Criteria andOffersEqualTo(String value) {
            addCriterion("offers =", value, "offers");
            return (Criteria) this;
        }

        public Criteria andOffersNotEqualTo(String value) {
            addCriterion("offers <>", value, "offers");
            return (Criteria) this;
        }

        public Criteria andOffersGreaterThan(String value) {
            addCriterion("offers >", value, "offers");
            return (Criteria) this;
        }

        public Criteria andOffersGreaterThanOrEqualTo(String value) {
            addCriterion("offers >=", value, "offers");
            return (Criteria) this;
        }

        public Criteria andOffersLessThan(String value) {
            addCriterion("offers <", value, "offers");
            return (Criteria) this;
        }

        public Criteria andOffersLessThanOrEqualTo(String value) {
            addCriterion("offers <=", value, "offers");
            return (Criteria) this;
        }

        public Criteria andOffersLike(String value) {
            addCriterion("offers like", value, "offers");
            return (Criteria) this;
        }

        public Criteria andOffersNotLike(String value) {
            addCriterion("offers not like", value, "offers");
            return (Criteria) this;
        }

        public Criteria andOffersIn(List<String> values) {
            addCriterion("offers in", values, "offers");
            return (Criteria) this;
        }

        public Criteria andOffersNotIn(List<String> values) {
            addCriterion("offers not in", values, "offers");
            return (Criteria) this;
        }

        public Criteria andOffersBetween(String value1, String value2) {
            addCriterion("offers between", value1, value2, "offers");
            return (Criteria) this;
        }

        public Criteria andOffersNotBetween(String value1, String value2) {
            addCriterion("offers not between", value1, value2, "offers");
            return (Criteria) this;
        }

        public Criteria andRealizeoffersIsNull() {
            addCriterion("realizeoffers is null");
            return (Criteria) this;
        }

        public Criteria andRealizeoffersIsNotNull() {
            addCriterion("realizeoffers is not null");
            return (Criteria) this;
        }

        public Criteria andRealizeoffersEqualTo(String value) {
            addCriterion("realizeoffers =", value, "realizeoffers");
            return (Criteria) this;
        }

        public Criteria andRealizeoffersNotEqualTo(String value) {
            addCriterion("realizeoffers <>", value, "realizeoffers");
            return (Criteria) this;
        }

        public Criteria andRealizeoffersGreaterThan(String value) {
            addCriterion("realizeoffers >", value, "realizeoffers");
            return (Criteria) this;
        }

        public Criteria andRealizeoffersGreaterThanOrEqualTo(String value) {
            addCriterion("realizeoffers >=", value, "realizeoffers");
            return (Criteria) this;
        }

        public Criteria andRealizeoffersLessThan(String value) {
            addCriterion("realizeoffers <", value, "realizeoffers");
            return (Criteria) this;
        }

        public Criteria andRealizeoffersLessThanOrEqualTo(String value) {
            addCriterion("realizeoffers <=", value, "realizeoffers");
            return (Criteria) this;
        }

        public Criteria andRealizeoffersLike(String value) {
            addCriterion("realizeoffers like", value, "realizeoffers");
            return (Criteria) this;
        }

        public Criteria andRealizeoffersNotLike(String value) {
            addCriterion("realizeoffers not like", value, "realizeoffers");
            return (Criteria) this;
        }

        public Criteria andRealizeoffersIn(List<String> values) {
            addCriterion("realizeoffers in", values, "realizeoffers");
            return (Criteria) this;
        }

        public Criteria andRealizeoffersNotIn(List<String> values) {
            addCriterion("realizeoffers not in", values, "realizeoffers");
            return (Criteria) this;
        }

        public Criteria andRealizeoffersBetween(String value1, String value2) {
            addCriterion("realizeoffers between", value1, value2, "realizeoffers");
            return (Criteria) this;
        }

        public Criteria andRealizeoffersNotBetween(String value1, String value2) {
            addCriterion("realizeoffers not between", value1, value2, "realizeoffers");
            return (Criteria) this;
        }

        public Criteria andPerformancesIsNull() {
            addCriterion("performances is null");
            return (Criteria) this;
        }

        public Criteria andPerformancesIsNotNull() {
            addCriterion("performances is not null");
            return (Criteria) this;
        }

        public Criteria andPerformancesEqualTo(String value) {
            addCriterion("performances =", value, "performances");
            return (Criteria) this;
        }

        public Criteria andPerformancesNotEqualTo(String value) {
            addCriterion("performances <>", value, "performances");
            return (Criteria) this;
        }

        public Criteria andPerformancesGreaterThan(String value) {
            addCriterion("performances >", value, "performances");
            return (Criteria) this;
        }

        public Criteria andPerformancesGreaterThanOrEqualTo(String value) {
            addCriterion("performances >=", value, "performances");
            return (Criteria) this;
        }

        public Criteria andPerformancesLessThan(String value) {
            addCriterion("performances <", value, "performances");
            return (Criteria) this;
        }

        public Criteria andPerformancesLessThanOrEqualTo(String value) {
            addCriterion("performances <=", value, "performances");
            return (Criteria) this;
        }

        public Criteria andPerformancesLike(String value) {
            addCriterion("performances like", value, "performances");
            return (Criteria) this;
        }

        public Criteria andPerformancesNotLike(String value) {
            addCriterion("performances not like", value, "performances");
            return (Criteria) this;
        }

        public Criteria andPerformancesIn(List<String> values) {
            addCriterion("performances in", values, "performances");
            return (Criteria) this;
        }

        public Criteria andPerformancesNotIn(List<String> values) {
            addCriterion("performances not in", values, "performances");
            return (Criteria) this;
        }

        public Criteria andPerformancesBetween(String value1, String value2) {
            addCriterion("performances between", value1, value2, "performances");
            return (Criteria) this;
        }

        public Criteria andPerformancesNotBetween(String value1, String value2) {
            addCriterion("performances not between", value1, value2, "performances");
            return (Criteria) this;
        }

        public Criteria andRealizeperformancesIsNull() {
            addCriterion("realizeperformances is null");
            return (Criteria) this;
        }

        public Criteria andRealizeperformancesIsNotNull() {
            addCriterion("realizeperformances is not null");
            return (Criteria) this;
        }

        public Criteria andRealizeperformancesEqualTo(String value) {
            addCriterion("realizeperformances =", value, "realizeperformances");
            return (Criteria) this;
        }

        public Criteria andRealizeperformancesNotEqualTo(String value) {
            addCriterion("realizeperformances <>", value, "realizeperformances");
            return (Criteria) this;
        }

        public Criteria andRealizeperformancesGreaterThan(String value) {
            addCriterion("realizeperformances >", value, "realizeperformances");
            return (Criteria) this;
        }

        public Criteria andRealizeperformancesGreaterThanOrEqualTo(String value) {
            addCriterion("realizeperformances >=", value, "realizeperformances");
            return (Criteria) this;
        }

        public Criteria andRealizeperformancesLessThan(String value) {
            addCriterion("realizeperformances <", value, "realizeperformances");
            return (Criteria) this;
        }

        public Criteria andRealizeperformancesLessThanOrEqualTo(String value) {
            addCriterion("realizeperformances <=", value, "realizeperformances");
            return (Criteria) this;
        }

        public Criteria andRealizeperformancesLike(String value) {
            addCriterion("realizeperformances like", value, "realizeperformances");
            return (Criteria) this;
        }

        public Criteria andRealizeperformancesNotLike(String value) {
            addCriterion("realizeperformances not like", value, "realizeperformances");
            return (Criteria) this;
        }

        public Criteria andRealizeperformancesIn(List<String> values) {
            addCriterion("realizeperformances in", values, "realizeperformances");
            return (Criteria) this;
        }

        public Criteria andRealizeperformancesNotIn(List<String> values) {
            addCriterion("realizeperformances not in", values, "realizeperformances");
            return (Criteria) this;
        }

        public Criteria andRealizeperformancesBetween(String value1, String value2) {
            addCriterion("realizeperformances between", value1, value2, "realizeperformances");
            return (Criteria) this;
        }

        public Criteria andRealizeperformancesNotBetween(String value1, String value2) {
            addCriterion("realizeperformances not between", value1, value2, "realizeperformances");
            return (Criteria) this;
        }

        public Criteria andSignsIsNull() {
            addCriterion("signs is null");
            return (Criteria) this;
        }

        public Criteria andSignsIsNotNull() {
            addCriterion("signs is not null");
            return (Criteria) this;
        }

        public Criteria andSignsEqualTo(String value) {
            addCriterion("signs =", value, "signs");
            return (Criteria) this;
        }

        public Criteria andSignsNotEqualTo(String value) {
            addCriterion("signs <>", value, "signs");
            return (Criteria) this;
        }

        public Criteria andSignsGreaterThan(String value) {
            addCriterion("signs >", value, "signs");
            return (Criteria) this;
        }

        public Criteria andSignsGreaterThanOrEqualTo(String value) {
            addCriterion("signs >=", value, "signs");
            return (Criteria) this;
        }

        public Criteria andSignsLessThan(String value) {
            addCriterion("signs <", value, "signs");
            return (Criteria) this;
        }

        public Criteria andSignsLessThanOrEqualTo(String value) {
            addCriterion("signs <=", value, "signs");
            return (Criteria) this;
        }

        public Criteria andSignsLike(String value) {
            addCriterion("signs like", value, "signs");
            return (Criteria) this;
        }

        public Criteria andSignsNotLike(String value) {
            addCriterion("signs not like", value, "signs");
            return (Criteria) this;
        }

        public Criteria andSignsIn(List<String> values) {
            addCriterion("signs in", values, "signs");
            return (Criteria) this;
        }

        public Criteria andSignsNotIn(List<String> values) {
            addCriterion("signs not in", values, "signs");
            return (Criteria) this;
        }

        public Criteria andSignsBetween(String value1, String value2) {
            addCriterion("signs between", value1, value2, "signs");
            return (Criteria) this;
        }

        public Criteria andSignsNotBetween(String value1, String value2) {
            addCriterion("signs not between", value1, value2, "signs");
            return (Criteria) this;
        }

        public Criteria andRealizesignsIsNull() {
            addCriterion("realizesigns is null");
            return (Criteria) this;
        }

        public Criteria andRealizesignsIsNotNull() {
            addCriterion("realizesigns is not null");
            return (Criteria) this;
        }

        public Criteria andRealizesignsEqualTo(String value) {
            addCriterion("realizesigns =", value, "realizesigns");
            return (Criteria) this;
        }

        public Criteria andRealizesignsNotEqualTo(String value) {
            addCriterion("realizesigns <>", value, "realizesigns");
            return (Criteria) this;
        }

        public Criteria andRealizesignsGreaterThan(String value) {
            addCriterion("realizesigns >", value, "realizesigns");
            return (Criteria) this;
        }

        public Criteria andRealizesignsGreaterThanOrEqualTo(String value) {
            addCriterion("realizesigns >=", value, "realizesigns");
            return (Criteria) this;
        }

        public Criteria andRealizesignsLessThan(String value) {
            addCriterion("realizesigns <", value, "realizesigns");
            return (Criteria) this;
        }

        public Criteria andRealizesignsLessThanOrEqualTo(String value) {
            addCriterion("realizesigns <=", value, "realizesigns");
            return (Criteria) this;
        }

        public Criteria andRealizesignsLike(String value) {
            addCriterion("realizesigns like", value, "realizesigns");
            return (Criteria) this;
        }

        public Criteria andRealizesignsNotLike(String value) {
            addCriterion("realizesigns not like", value, "realizesigns");
            return (Criteria) this;
        }

        public Criteria andRealizesignsIn(List<String> values) {
            addCriterion("realizesigns in", values, "realizesigns");
            return (Criteria) this;
        }

        public Criteria andRealizesignsNotIn(List<String> values) {
            addCriterion("realizesigns not in", values, "realizesigns");
            return (Criteria) this;
        }

        public Criteria andRealizesignsBetween(String value1, String value2) {
            addCriterion("realizesigns between", value1, value2, "realizesigns");
            return (Criteria) this;
        }

        public Criteria andRealizesignsNotBetween(String value1, String value2) {
            addCriterion("realizesigns not between", value1, value2, "realizesigns");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}