package com.hrbc.business.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CandidatesResumeTraininginfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CandidatesResumeTraininginfoExample() {
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

        public Criteria andTraininginstituionIsNull() {
            addCriterion("traininginstituion is null");
            return (Criteria) this;
        }

        public Criteria andTraininginstituionIsNotNull() {
            addCriterion("traininginstituion is not null");
            return (Criteria) this;
        }

        public Criteria andTraininginstituionEqualTo(String value) {
            addCriterion("traininginstituion =", value, "traininginstituion");
            return (Criteria) this;
        }

        public Criteria andTraininginstituionNotEqualTo(String value) {
            addCriterion("traininginstituion <>", value, "traininginstituion");
            return (Criteria) this;
        }

        public Criteria andTraininginstituionGreaterThan(String value) {
            addCriterion("traininginstituion >", value, "traininginstituion");
            return (Criteria) this;
        }

        public Criteria andTraininginstituionGreaterThanOrEqualTo(String value) {
            addCriterion("traininginstituion >=", value, "traininginstituion");
            return (Criteria) this;
        }

        public Criteria andTraininginstituionLessThan(String value) {
            addCriterion("traininginstituion <", value, "traininginstituion");
            return (Criteria) this;
        }

        public Criteria andTraininginstituionLessThanOrEqualTo(String value) {
            addCriterion("traininginstituion <=", value, "traininginstituion");
            return (Criteria) this;
        }

        public Criteria andTraininginstituionLike(String value) {
            addCriterion("traininginstituion like", value, "traininginstituion");
            return (Criteria) this;
        }

        public Criteria andTraininginstituionNotLike(String value) {
            addCriterion("traininginstituion not like", value, "traininginstituion");
            return (Criteria) this;
        }

        public Criteria andTraininginstituionIn(List<String> values) {
            addCriterion("traininginstituion in", values, "traininginstituion");
            return (Criteria) this;
        }

        public Criteria andTraininginstituionNotIn(List<String> values) {
            addCriterion("traininginstituion not in", values, "traininginstituion");
            return (Criteria) this;
        }

        public Criteria andTraininginstituionBetween(String value1, String value2) {
            addCriterion("traininginstituion between", value1, value2, "traininginstituion");
            return (Criteria) this;
        }

        public Criteria andTraininginstituionNotBetween(String value1, String value2) {
            addCriterion("traininginstituion not between", value1, value2, "traininginstituion");
            return (Criteria) this;
        }

        public Criteria andTraininglocationIsNull() {
            addCriterion("traininglocation is null");
            return (Criteria) this;
        }

        public Criteria andTraininglocationIsNotNull() {
            addCriterion("traininglocation is not null");
            return (Criteria) this;
        }

        public Criteria andTraininglocationEqualTo(String value) {
            addCriterion("traininglocation =", value, "traininglocation");
            return (Criteria) this;
        }

        public Criteria andTraininglocationNotEqualTo(String value) {
            addCriterion("traininglocation <>", value, "traininglocation");
            return (Criteria) this;
        }

        public Criteria andTraininglocationGreaterThan(String value) {
            addCriterion("traininglocation >", value, "traininglocation");
            return (Criteria) this;
        }

        public Criteria andTraininglocationGreaterThanOrEqualTo(String value) {
            addCriterion("traininglocation >=", value, "traininglocation");
            return (Criteria) this;
        }

        public Criteria andTraininglocationLessThan(String value) {
            addCriterion("traininglocation <", value, "traininglocation");
            return (Criteria) this;
        }

        public Criteria andTraininglocationLessThanOrEqualTo(String value) {
            addCriterion("traininglocation <=", value, "traininglocation");
            return (Criteria) this;
        }

        public Criteria andTraininglocationLike(String value) {
            addCriterion("traininglocation like", value, "traininglocation");
            return (Criteria) this;
        }

        public Criteria andTraininglocationNotLike(String value) {
            addCriterion("traininglocation not like", value, "traininglocation");
            return (Criteria) this;
        }

        public Criteria andTraininglocationIn(List<String> values) {
            addCriterion("traininglocation in", values, "traininglocation");
            return (Criteria) this;
        }

        public Criteria andTraininglocationNotIn(List<String> values) {
            addCriterion("traininglocation not in", values, "traininglocation");
            return (Criteria) this;
        }

        public Criteria andTraininglocationBetween(String value1, String value2) {
            addCriterion("traininglocation between", value1, value2, "traininglocation");
            return (Criteria) this;
        }

        public Criteria andTraininglocationNotBetween(String value1, String value2) {
            addCriterion("traininglocation not between", value1, value2, "traininglocation");
            return (Criteria) this;
        }

        public Criteria andTrainingcourseIsNull() {
            addCriterion("trainingcourse is null");
            return (Criteria) this;
        }

        public Criteria andTrainingcourseIsNotNull() {
            addCriterion("trainingcourse is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingcourseEqualTo(String value) {
            addCriterion("trainingcourse =", value, "trainingcourse");
            return (Criteria) this;
        }

        public Criteria andTrainingcourseNotEqualTo(String value) {
            addCriterion("trainingcourse <>", value, "trainingcourse");
            return (Criteria) this;
        }

        public Criteria andTrainingcourseGreaterThan(String value) {
            addCriterion("trainingcourse >", value, "trainingcourse");
            return (Criteria) this;
        }

        public Criteria andTrainingcourseGreaterThanOrEqualTo(String value) {
            addCriterion("trainingcourse >=", value, "trainingcourse");
            return (Criteria) this;
        }

        public Criteria andTrainingcourseLessThan(String value) {
            addCriterion("trainingcourse <", value, "trainingcourse");
            return (Criteria) this;
        }

        public Criteria andTrainingcourseLessThanOrEqualTo(String value) {
            addCriterion("trainingcourse <=", value, "trainingcourse");
            return (Criteria) this;
        }

        public Criteria andTrainingcourseLike(String value) {
            addCriterion("trainingcourse like", value, "trainingcourse");
            return (Criteria) this;
        }

        public Criteria andTrainingcourseNotLike(String value) {
            addCriterion("trainingcourse not like", value, "trainingcourse");
            return (Criteria) this;
        }

        public Criteria andTrainingcourseIn(List<String> values) {
            addCriterion("trainingcourse in", values, "trainingcourse");
            return (Criteria) this;
        }

        public Criteria andTrainingcourseNotIn(List<String> values) {
            addCriterion("trainingcourse not in", values, "trainingcourse");
            return (Criteria) this;
        }

        public Criteria andTrainingcourseBetween(String value1, String value2) {
            addCriterion("trainingcourse between", value1, value2, "trainingcourse");
            return (Criteria) this;
        }

        public Criteria andTrainingcourseNotBetween(String value1, String value2) {
            addCriterion("trainingcourse not between", value1, value2, "trainingcourse");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNull() {
            addCriterion("certificate is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNotNull() {
            addCriterion("certificate is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEqualTo(String value) {
            addCriterion("certificate =", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotEqualTo(String value) {
            addCriterion("certificate <>", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThan(String value) {
            addCriterion("certificate >", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("certificate >=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThan(String value) {
            addCriterion("certificate <", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThanOrEqualTo(String value) {
            addCriterion("certificate <=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLike(String value) {
            addCriterion("certificate like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotLike(String value) {
            addCriterion("certificate not like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateIn(List<String> values) {
            addCriterion("certificate in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotIn(List<String> values) {
            addCriterion("certificate not in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateBetween(String value1, String value2) {
            addCriterion("certificate between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotBetween(String value1, String value2) {
            addCriterion("certificate not between", value1, value2, "certificate");
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