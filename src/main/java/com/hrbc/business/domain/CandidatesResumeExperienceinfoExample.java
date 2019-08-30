package com.hrbc.business.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CandidatesResumeExperienceinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CandidatesResumeExperienceinfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andResumeidIsNull() {
            addCriterion("resumeid is null");
            return (Criteria) this;
        }

        public Criteria andResumeidIsNotNull() {
            addCriterion("resumeid is not null");
            return (Criteria) this;
        }

        public Criteria andResumeidEqualTo(Integer value) {
            addCriterion("resumeid =", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotEqualTo(Integer value) {
            addCriterion("resumeid <>", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThan(Integer value) {
            addCriterion("resumeid >", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resumeid >=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThan(Integer value) {
            addCriterion("resumeid <", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThanOrEqualTo(Integer value) {
            addCriterion("resumeid <=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidIn(List<Integer> values) {
            addCriterion("resumeid in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotIn(List<Integer> values) {
            addCriterion("resumeid not in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidBetween(Integer value1, Integer value2) {
            addCriterion("resumeid between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotBetween(Integer value1, Integer value2) {
            addCriterion("resumeid not between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andPeriodsoftimeIsNull() {
            addCriterion("periodsoftime is null");
            return (Criteria) this;
        }

        public Criteria andPeriodsoftimeIsNotNull() {
            addCriterion("periodsoftime is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodsoftimeEqualTo(String value) {
            addCriterion("periodsoftime =", value, "periodsoftime");
            return (Criteria) this;
        }

        public Criteria andPeriodsoftimeNotEqualTo(String value) {
            addCriterion("periodsoftime <>", value, "periodsoftime");
            return (Criteria) this;
        }

        public Criteria andPeriodsoftimeGreaterThan(String value) {
            addCriterion("periodsoftime >", value, "periodsoftime");
            return (Criteria) this;
        }

        public Criteria andPeriodsoftimeGreaterThanOrEqualTo(String value) {
            addCriterion("periodsoftime >=", value, "periodsoftime");
            return (Criteria) this;
        }

        public Criteria andPeriodsoftimeLessThan(String value) {
            addCriterion("periodsoftime <", value, "periodsoftime");
            return (Criteria) this;
        }

        public Criteria andPeriodsoftimeLessThanOrEqualTo(String value) {
            addCriterion("periodsoftime <=", value, "periodsoftime");
            return (Criteria) this;
        }

        public Criteria andPeriodsoftimeLike(String value) {
            addCriterion("periodsoftime like", value, "periodsoftime");
            return (Criteria) this;
        }

        public Criteria andPeriodsoftimeNotLike(String value) {
            addCriterion("periodsoftime not like", value, "periodsoftime");
            return (Criteria) this;
        }

        public Criteria andPeriodsoftimeIn(List<String> values) {
            addCriterion("periodsoftime in", values, "periodsoftime");
            return (Criteria) this;
        }

        public Criteria andPeriodsoftimeNotIn(List<String> values) {
            addCriterion("periodsoftime not in", values, "periodsoftime");
            return (Criteria) this;
        }

        public Criteria andPeriodsoftimeBetween(String value1, String value2) {
            addCriterion("periodsoftime between", value1, value2, "periodsoftime");
            return (Criteria) this;
        }

        public Criteria andPeriodsoftimeNotBetween(String value1, String value2) {
            addCriterion("periodsoftime not between", value1, value2, "periodsoftime");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andVocationIsNull() {
            addCriterion("vocation is null");
            return (Criteria) this;
        }

        public Criteria andVocationIsNotNull() {
            addCriterion("vocation is not null");
            return (Criteria) this;
        }

        public Criteria andVocationEqualTo(String value) {
            addCriterion("vocation =", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationNotEqualTo(String value) {
            addCriterion("vocation <>", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationGreaterThan(String value) {
            addCriterion("vocation >", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationGreaterThanOrEqualTo(String value) {
            addCriterion("vocation >=", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationLessThan(String value) {
            addCriterion("vocation <", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationLessThanOrEqualTo(String value) {
            addCriterion("vocation <=", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationLike(String value) {
            addCriterion("vocation like", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationNotLike(String value) {
            addCriterion("vocation not like", value, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationIn(List<String> values) {
            addCriterion("vocation in", values, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationNotIn(List<String> values) {
            addCriterion("vocation not in", values, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationBetween(String value1, String value2) {
            addCriterion("vocation between", value1, value2, "vocation");
            return (Criteria) this;
        }

        public Criteria andVocationNotBetween(String value1, String value2) {
            addCriterion("vocation not between", value1, value2, "vocation");
            return (Criteria) this;
        }

        public Criteria andSizecompanyIsNull() {
            addCriterion("sizecompany is null");
            return (Criteria) this;
        }

        public Criteria andSizecompanyIsNotNull() {
            addCriterion("sizecompany is not null");
            return (Criteria) this;
        }

        public Criteria andSizecompanyEqualTo(String value) {
            addCriterion("sizecompany =", value, "sizecompany");
            return (Criteria) this;
        }

        public Criteria andSizecompanyNotEqualTo(String value) {
            addCriterion("sizecompany <>", value, "sizecompany");
            return (Criteria) this;
        }

        public Criteria andSizecompanyGreaterThan(String value) {
            addCriterion("sizecompany >", value, "sizecompany");
            return (Criteria) this;
        }

        public Criteria andSizecompanyGreaterThanOrEqualTo(String value) {
            addCriterion("sizecompany >=", value, "sizecompany");
            return (Criteria) this;
        }

        public Criteria andSizecompanyLessThan(String value) {
            addCriterion("sizecompany <", value, "sizecompany");
            return (Criteria) this;
        }

        public Criteria andSizecompanyLessThanOrEqualTo(String value) {
            addCriterion("sizecompany <=", value, "sizecompany");
            return (Criteria) this;
        }

        public Criteria andSizecompanyLike(String value) {
            addCriterion("sizecompany like", value, "sizecompany");
            return (Criteria) this;
        }

        public Criteria andSizecompanyNotLike(String value) {
            addCriterion("sizecompany not like", value, "sizecompany");
            return (Criteria) this;
        }

        public Criteria andSizecompanyIn(List<String> values) {
            addCriterion("sizecompany in", values, "sizecompany");
            return (Criteria) this;
        }

        public Criteria andSizecompanyNotIn(List<String> values) {
            addCriterion("sizecompany not in", values, "sizecompany");
            return (Criteria) this;
        }

        public Criteria andSizecompanyBetween(String value1, String value2) {
            addCriterion("sizecompany between", value1, value2, "sizecompany");
            return (Criteria) this;
        }

        public Criteria andSizecompanyNotBetween(String value1, String value2) {
            addCriterion("sizecompany not between", value1, value2, "sizecompany");
            return (Criteria) this;
        }

        public Criteria andTypecompanyIsNull() {
            addCriterion("typecompany is null");
            return (Criteria) this;
        }

        public Criteria andTypecompanyIsNotNull() {
            addCriterion("typecompany is not null");
            return (Criteria) this;
        }

        public Criteria andTypecompanyEqualTo(String value) {
            addCriterion("typecompany =", value, "typecompany");
            return (Criteria) this;
        }

        public Criteria andTypecompanyNotEqualTo(String value) {
            addCriterion("typecompany <>", value, "typecompany");
            return (Criteria) this;
        }

        public Criteria andTypecompanyGreaterThan(String value) {
            addCriterion("typecompany >", value, "typecompany");
            return (Criteria) this;
        }

        public Criteria andTypecompanyGreaterThanOrEqualTo(String value) {
            addCriterion("typecompany >=", value, "typecompany");
            return (Criteria) this;
        }

        public Criteria andTypecompanyLessThan(String value) {
            addCriterion("typecompany <", value, "typecompany");
            return (Criteria) this;
        }

        public Criteria andTypecompanyLessThanOrEqualTo(String value) {
            addCriterion("typecompany <=", value, "typecompany");
            return (Criteria) this;
        }

        public Criteria andTypecompanyLike(String value) {
            addCriterion("typecompany like", value, "typecompany");
            return (Criteria) this;
        }

        public Criteria andTypecompanyNotLike(String value) {
            addCriterion("typecompany not like", value, "typecompany");
            return (Criteria) this;
        }

        public Criteria andTypecompanyIn(List<String> values) {
            addCriterion("typecompany in", values, "typecompany");
            return (Criteria) this;
        }

        public Criteria andTypecompanyNotIn(List<String> values) {
            addCriterion("typecompany not in", values, "typecompany");
            return (Criteria) this;
        }

        public Criteria andTypecompanyBetween(String value1, String value2) {
            addCriterion("typecompany between", value1, value2, "typecompany");
            return (Criteria) this;
        }

        public Criteria andTypecompanyNotBetween(String value1, String value2) {
            addCriterion("typecompany not between", value1, value2, "typecompany");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(String value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(String value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(String value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(String value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(String value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLike(String value) {
            addCriterion("salary like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotLike(String value) {
            addCriterion("salary not like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<String> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<String> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(String value1, String value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(String value1, String value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("leader is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("leader is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("leader =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("leader <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("leader >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("leader >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("leader <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("leader <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("leader like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("leader not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("leader in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("leader not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("leader between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("leader not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andUnderlingnumberIsNull() {
            addCriterion("underlingnumber is null");
            return (Criteria) this;
        }

        public Criteria andUnderlingnumberIsNotNull() {
            addCriterion("underlingnumber is not null");
            return (Criteria) this;
        }

        public Criteria andUnderlingnumberEqualTo(String value) {
            addCriterion("underlingnumber =", value, "underlingnumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingnumberNotEqualTo(String value) {
            addCriterion("underlingnumber <>", value, "underlingnumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingnumberGreaterThan(String value) {
            addCriterion("underlingnumber >", value, "underlingnumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingnumberGreaterThanOrEqualTo(String value) {
            addCriterion("underlingnumber >=", value, "underlingnumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingnumberLessThan(String value) {
            addCriterion("underlingnumber <", value, "underlingnumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingnumberLessThanOrEqualTo(String value) {
            addCriterion("underlingnumber <=", value, "underlingnumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingnumberLike(String value) {
            addCriterion("underlingnumber like", value, "underlingnumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingnumberNotLike(String value) {
            addCriterion("underlingnumber not like", value, "underlingnumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingnumberIn(List<String> values) {
            addCriterion("underlingnumber in", values, "underlingnumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingnumberNotIn(List<String> values) {
            addCriterion("underlingnumber not in", values, "underlingnumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingnumberBetween(String value1, String value2) {
            addCriterion("underlingnumber between", value1, value2, "underlingnumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingnumberNotBetween(String value1, String value2) {
            addCriterion("underlingnumber not between", value1, value2, "underlingnumber");
            return (Criteria) this;
        }

        public Criteria andReasonofleavingIsNull() {
            addCriterion("reasonofleaving is null");
            return (Criteria) this;
        }

        public Criteria andReasonofleavingIsNotNull() {
            addCriterion("reasonofleaving is not null");
            return (Criteria) this;
        }

        public Criteria andReasonofleavingEqualTo(String value) {
            addCriterion("reasonofleaving =", value, "reasonofleaving");
            return (Criteria) this;
        }

        public Criteria andReasonofleavingNotEqualTo(String value) {
            addCriterion("reasonofleaving <>", value, "reasonofleaving");
            return (Criteria) this;
        }

        public Criteria andReasonofleavingGreaterThan(String value) {
            addCriterion("reasonofleaving >", value, "reasonofleaving");
            return (Criteria) this;
        }

        public Criteria andReasonofleavingGreaterThanOrEqualTo(String value) {
            addCriterion("reasonofleaving >=", value, "reasonofleaving");
            return (Criteria) this;
        }

        public Criteria andReasonofleavingLessThan(String value) {
            addCriterion("reasonofleaving <", value, "reasonofleaving");
            return (Criteria) this;
        }

        public Criteria andReasonofleavingLessThanOrEqualTo(String value) {
            addCriterion("reasonofleaving <=", value, "reasonofleaving");
            return (Criteria) this;
        }

        public Criteria andReasonofleavingLike(String value) {
            addCriterion("reasonofleaving like", value, "reasonofleaving");
            return (Criteria) this;
        }

        public Criteria andReasonofleavingNotLike(String value) {
            addCriterion("reasonofleaving not like", value, "reasonofleaving");
            return (Criteria) this;
        }

        public Criteria andReasonofleavingIn(List<String> values) {
            addCriterion("reasonofleaving in", values, "reasonofleaving");
            return (Criteria) this;
        }

        public Criteria andReasonofleavingNotIn(List<String> values) {
            addCriterion("reasonofleaving not in", values, "reasonofleaving");
            return (Criteria) this;
        }

        public Criteria andReasonofleavingBetween(String value1, String value2) {
            addCriterion("reasonofleaving between", value1, value2, "reasonofleaving");
            return (Criteria) this;
        }

        public Criteria andReasonofleavingNotBetween(String value1, String value2) {
            addCriterion("reasonofleaving not between", value1, value2, "reasonofleaving");
            return (Criteria) this;
        }

        public Criteria andWorktypeIsNull() {
            addCriterion("worktype is null");
            return (Criteria) this;
        }

        public Criteria andWorktypeIsNotNull() {
            addCriterion("worktype is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypeEqualTo(String value) {
            addCriterion("worktype =", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotEqualTo(String value) {
            addCriterion("worktype <>", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeGreaterThan(String value) {
            addCriterion("worktype >", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeGreaterThanOrEqualTo(String value) {
            addCriterion("worktype >=", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeLessThan(String value) {
            addCriterion("worktype <", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeLessThanOrEqualTo(String value) {
            addCriterion("worktype <=", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeLike(String value) {
            addCriterion("worktype like", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotLike(String value) {
            addCriterion("worktype not like", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeIn(List<String> values) {
            addCriterion("worktype in", values, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotIn(List<String> values) {
            addCriterion("worktype not in", values, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeBetween(String value1, String value2) {
            addCriterion("worktype between", value1, value2, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotBetween(String value1, String value2) {
            addCriterion("worktype not between", value1, value2, "worktype");
            return (Criteria) this;
        }

        public Criteria andIsstudiiIsNull() {
            addCriterion("isstudii is null");
            return (Criteria) this;
        }

        public Criteria andIsstudiiIsNotNull() {
            addCriterion("isstudii is not null");
            return (Criteria) this;
        }

        public Criteria andIsstudiiEqualTo(String value) {
            addCriterion("isstudii =", value, "isstudii");
            return (Criteria) this;
        }

        public Criteria andIsstudiiNotEqualTo(String value) {
            addCriterion("isstudii <>", value, "isstudii");
            return (Criteria) this;
        }

        public Criteria andIsstudiiGreaterThan(String value) {
            addCriterion("isstudii >", value, "isstudii");
            return (Criteria) this;
        }

        public Criteria andIsstudiiGreaterThanOrEqualTo(String value) {
            addCriterion("isstudii >=", value, "isstudii");
            return (Criteria) this;
        }

        public Criteria andIsstudiiLessThan(String value) {
            addCriterion("isstudii <", value, "isstudii");
            return (Criteria) this;
        }

        public Criteria andIsstudiiLessThanOrEqualTo(String value) {
            addCriterion("isstudii <=", value, "isstudii");
            return (Criteria) this;
        }

        public Criteria andIsstudiiLike(String value) {
            addCriterion("isstudii like", value, "isstudii");
            return (Criteria) this;
        }

        public Criteria andIsstudiiNotLike(String value) {
            addCriterion("isstudii not like", value, "isstudii");
            return (Criteria) this;
        }

        public Criteria andIsstudiiIn(List<String> values) {
            addCriterion("isstudii in", values, "isstudii");
            return (Criteria) this;
        }

        public Criteria andIsstudiiNotIn(List<String> values) {
            addCriterion("isstudii not in", values, "isstudii");
            return (Criteria) this;
        }

        public Criteria andIsstudiiBetween(String value1, String value2) {
            addCriterion("isstudii between", value1, value2, "isstudii");
            return (Criteria) this;
        }

        public Criteria andIsstudiiNotBetween(String value1, String value2) {
            addCriterion("isstudii not between", value1, value2, "isstudii");
            return (Criteria) this;
        }

        public Criteria andDeponentIsNull() {
            addCriterion("deponent is null");
            return (Criteria) this;
        }

        public Criteria andDeponentIsNotNull() {
            addCriterion("deponent is not null");
            return (Criteria) this;
        }

        public Criteria andDeponentEqualTo(String value) {
            addCriterion("deponent =", value, "deponent");
            return (Criteria) this;
        }

        public Criteria andDeponentNotEqualTo(String value) {
            addCriterion("deponent <>", value, "deponent");
            return (Criteria) this;
        }

        public Criteria andDeponentGreaterThan(String value) {
            addCriterion("deponent >", value, "deponent");
            return (Criteria) this;
        }

        public Criteria andDeponentGreaterThanOrEqualTo(String value) {
            addCriterion("deponent >=", value, "deponent");
            return (Criteria) this;
        }

        public Criteria andDeponentLessThan(String value) {
            addCriterion("deponent <", value, "deponent");
            return (Criteria) this;
        }

        public Criteria andDeponentLessThanOrEqualTo(String value) {
            addCriterion("deponent <=", value, "deponent");
            return (Criteria) this;
        }

        public Criteria andDeponentLike(String value) {
            addCriterion("deponent like", value, "deponent");
            return (Criteria) this;
        }

        public Criteria andDeponentNotLike(String value) {
            addCriterion("deponent not like", value, "deponent");
            return (Criteria) this;
        }

        public Criteria andDeponentIn(List<String> values) {
            addCriterion("deponent in", values, "deponent");
            return (Criteria) this;
        }

        public Criteria andDeponentNotIn(List<String> values) {
            addCriterion("deponent not in", values, "deponent");
            return (Criteria) this;
        }

        public Criteria andDeponentBetween(String value1, String value2) {
            addCriterion("deponent between", value1, value2, "deponent");
            return (Criteria) this;
        }

        public Criteria andDeponentNotBetween(String value1, String value2) {
            addCriterion("deponent not between", value1, value2, "deponent");
            return (Criteria) this;
        }

        public Criteria andCandidatesnumIsNull() {
            addCriterion("candidatesnum is null");
            return (Criteria) this;
        }

        public Criteria andCandidatesnumIsNotNull() {
            addCriterion("candidatesnum is not null");
            return (Criteria) this;
        }

        public Criteria andCandidatesnumEqualTo(Integer value) {
            addCriterion("candidatesnum =", value, "candidatesnum");
            return (Criteria) this;
        }

        public Criteria andCandidatesnumNotEqualTo(Integer value) {
            addCriterion("candidatesnum <>", value, "candidatesnum");
            return (Criteria) this;
        }

        public Criteria andCandidatesnumGreaterThan(Integer value) {
            addCriterion("candidatesnum >", value, "candidatesnum");
            return (Criteria) this;
        }

        public Criteria andCandidatesnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("candidatesnum >=", value, "candidatesnum");
            return (Criteria) this;
        }

        public Criteria andCandidatesnumLessThan(Integer value) {
            addCriterion("candidatesnum <", value, "candidatesnum");
            return (Criteria) this;
        }

        public Criteria andCandidatesnumLessThanOrEqualTo(Integer value) {
            addCriterion("candidatesnum <=", value, "candidatesnum");
            return (Criteria) this;
        }

        public Criteria andCandidatesnumIn(List<Integer> values) {
            addCriterion("candidatesnum in", values, "candidatesnum");
            return (Criteria) this;
        }

        public Criteria andCandidatesnumNotIn(List<Integer> values) {
            addCriterion("candidatesnum not in", values, "candidatesnum");
            return (Criteria) this;
        }

        public Criteria andCandidatesnumBetween(Integer value1, Integer value2) {
            addCriterion("candidatesnum between", value1, value2, "candidatesnum");
            return (Criteria) this;
        }

        public Criteria andCandidatesnumNotBetween(Integer value1, Integer value2) {
            addCriterion("candidatesnum not between", value1, value2, "candidatesnum");
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