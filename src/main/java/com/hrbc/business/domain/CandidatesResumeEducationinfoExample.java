package com.hrbc.business.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CandidatesResumeEducationinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CandidatesResumeEducationinfoExample() {
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

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchooltypeIsNull() {
            addCriterion("schooltype is null");
            return (Criteria) this;
        }

        public Criteria andSchooltypeIsNotNull() {
            addCriterion("schooltype is not null");
            return (Criteria) this;
        }

        public Criteria andSchooltypeEqualTo(String value) {
            addCriterion("schooltype =", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeNotEqualTo(String value) {
            addCriterion("schooltype <>", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeGreaterThan(String value) {
            addCriterion("schooltype >", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeGreaterThanOrEqualTo(String value) {
            addCriterion("schooltype >=", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeLessThan(String value) {
            addCriterion("schooltype <", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeLessThanOrEqualTo(String value) {
            addCriterion("schooltype <=", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeLike(String value) {
            addCriterion("schooltype like", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeNotLike(String value) {
            addCriterion("schooltype not like", value, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeIn(List<String> values) {
            addCriterion("schooltype in", values, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeNotIn(List<String> values) {
            addCriterion("schooltype not in", values, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeBetween(String value1, String value2) {
            addCriterion("schooltype between", value1, value2, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchooltypeNotBetween(String value1, String value2) {
            addCriterion("schooltype not between", value1, value2, "schooltype");
            return (Criteria) this;
        }

        public Criteria andSchoollabelIsNull() {
            addCriterion("schoollabel is null");
            return (Criteria) this;
        }

        public Criteria andSchoollabelIsNotNull() {
            addCriterion("schoollabel is not null");
            return (Criteria) this;
        }

        public Criteria andSchoollabelEqualTo(String value) {
            addCriterion("schoollabel =", value, "schoollabel");
            return (Criteria) this;
        }

        public Criteria andSchoollabelNotEqualTo(String value) {
            addCriterion("schoollabel <>", value, "schoollabel");
            return (Criteria) this;
        }

        public Criteria andSchoollabelGreaterThan(String value) {
            addCriterion("schoollabel >", value, "schoollabel");
            return (Criteria) this;
        }

        public Criteria andSchoollabelGreaterThanOrEqualTo(String value) {
            addCriterion("schoollabel >=", value, "schoollabel");
            return (Criteria) this;
        }

        public Criteria andSchoollabelLessThan(String value) {
            addCriterion("schoollabel <", value, "schoollabel");
            return (Criteria) this;
        }

        public Criteria andSchoollabelLessThanOrEqualTo(String value) {
            addCriterion("schoollabel <=", value, "schoollabel");
            return (Criteria) this;
        }

        public Criteria andSchoollabelLike(String value) {
            addCriterion("schoollabel like", value, "schoollabel");
            return (Criteria) this;
        }

        public Criteria andSchoollabelNotLike(String value) {
            addCriterion("schoollabel not like", value, "schoollabel");
            return (Criteria) this;
        }

        public Criteria andSchoollabelIn(List<String> values) {
            addCriterion("schoollabel in", values, "schoollabel");
            return (Criteria) this;
        }

        public Criteria andSchoollabelNotIn(List<String> values) {
            addCriterion("schoollabel not in", values, "schoollabel");
            return (Criteria) this;
        }

        public Criteria andSchoollabelBetween(String value1, String value2) {
            addCriterion("schoollabel between", value1, value2, "schoollabel");
            return (Criteria) this;
        }

        public Criteria andSchoollabelNotBetween(String value1, String value2) {
            addCriterion("schoollabel not between", value1, value2, "schoollabel");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNull() {
            addCriterion("speciality is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNotNull() {
            addCriterion("speciality is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityEqualTo(String value) {
            addCriterion("speciality =", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotEqualTo(String value) {
            addCriterion("speciality <>", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThan(String value) {
            addCriterion("speciality >", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThanOrEqualTo(String value) {
            addCriterion("speciality >=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThan(String value) {
            addCriterion("speciality <", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThanOrEqualTo(String value) {
            addCriterion("speciality <=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLike(String value) {
            addCriterion("speciality like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotLike(String value) {
            addCriterion("speciality not like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityIn(List<String> values) {
            addCriterion("speciality in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotIn(List<String> values) {
            addCriterion("speciality not in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityBetween(String value1, String value2) {
            addCriterion("speciality between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotBetween(String value1, String value2) {
            addCriterion("speciality not between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andAdvanceddegreeIsNull() {
            addCriterion("advanceddegree is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceddegreeIsNotNull() {
            addCriterion("advanceddegree is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceddegreeEqualTo(String value) {
            addCriterion("advanceddegree =", value, "advanceddegree");
            return (Criteria) this;
        }

        public Criteria andAdvanceddegreeNotEqualTo(String value) {
            addCriterion("advanceddegree <>", value, "advanceddegree");
            return (Criteria) this;
        }

        public Criteria andAdvanceddegreeGreaterThan(String value) {
            addCriterion("advanceddegree >", value, "advanceddegree");
            return (Criteria) this;
        }

        public Criteria andAdvanceddegreeGreaterThanOrEqualTo(String value) {
            addCriterion("advanceddegree >=", value, "advanceddegree");
            return (Criteria) this;
        }

        public Criteria andAdvanceddegreeLessThan(String value) {
            addCriterion("advanceddegree <", value, "advanceddegree");
            return (Criteria) this;
        }

        public Criteria andAdvanceddegreeLessThanOrEqualTo(String value) {
            addCriterion("advanceddegree <=", value, "advanceddegree");
            return (Criteria) this;
        }

        public Criteria andAdvanceddegreeLike(String value) {
            addCriterion("advanceddegree like", value, "advanceddegree");
            return (Criteria) this;
        }

        public Criteria andAdvanceddegreeNotLike(String value) {
            addCriterion("advanceddegree not like", value, "advanceddegree");
            return (Criteria) this;
        }

        public Criteria andAdvanceddegreeIn(List<String> values) {
            addCriterion("advanceddegree in", values, "advanceddegree");
            return (Criteria) this;
        }

        public Criteria andAdvanceddegreeNotIn(List<String> values) {
            addCriterion("advanceddegree not in", values, "advanceddegree");
            return (Criteria) this;
        }

        public Criteria andAdvanceddegreeBetween(String value1, String value2) {
            addCriterion("advanceddegree between", value1, value2, "advanceddegree");
            return (Criteria) this;
        }

        public Criteria andAdvanceddegreeNotBetween(String value1, String value2) {
            addCriterion("advanceddegree not between", value1, value2, "advanceddegree");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
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