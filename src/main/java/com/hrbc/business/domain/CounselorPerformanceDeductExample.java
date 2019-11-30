package com.hrbc.business.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CounselorPerformanceDeductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CounselorPerformanceDeductExample() {
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

        public Criteria andJcidIsNull() {
            addCriterion("jcid is null");
            return (Criteria) this;
        }

        public Criteria andJcidIsNotNull() {
            addCriterion("jcid is not null");
            return (Criteria) this;
        }

        public Criteria andJcidEqualTo(Integer value) {
            addCriterion("jcid =", value, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidNotEqualTo(Integer value) {
            addCriterion("jcid <>", value, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidGreaterThan(Integer value) {
            addCriterion("jcid >", value, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jcid >=", value, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidLessThan(Integer value) {
            addCriterion("jcid <", value, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidLessThanOrEqualTo(Integer value) {
            addCriterion("jcid <=", value, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidIn(List<Integer> values) {
            addCriterion("jcid in", values, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidNotIn(List<Integer> values) {
            addCriterion("jcid not in", values, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidBetween(Integer value1, Integer value2) {
            addCriterion("jcid between", value1, value2, "jcid");
            return (Criteria) this;
        }

        public Criteria andJcidNotBetween(Integer value1, Integer value2) {
            addCriterion("jcid not between", value1, value2, "jcid");
            return (Criteria) this;
        }

        public Criteria andJobsCandidatesIdIsNull() {
            addCriterion("jobs_candidates_id is null");
            return (Criteria) this;
        }

        public Criteria andJobsCandidatesIdIsNotNull() {
            addCriterion("jobs_candidates_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobsCandidatesIdEqualTo(Integer value) {
            addCriterion("jobs_candidates_id =", value, "jobsCandidatesId");
            return (Criteria) this;
        }

        public Criteria andJobsCandidatesIdNotEqualTo(Integer value) {
            addCriterion("jobs_candidates_id <>", value, "jobsCandidatesId");
            return (Criteria) this;
        }

        public Criteria andJobsCandidatesIdGreaterThan(Integer value) {
            addCriterion("jobs_candidates_id >", value, "jobsCandidatesId");
            return (Criteria) this;
        }

        public Criteria andJobsCandidatesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobs_candidates_id >=", value, "jobsCandidatesId");
            return (Criteria) this;
        }

        public Criteria andJobsCandidatesIdLessThan(Integer value) {
            addCriterion("jobs_candidates_id <", value, "jobsCandidatesId");
            return (Criteria) this;
        }

        public Criteria andJobsCandidatesIdLessThanOrEqualTo(Integer value) {
            addCriterion("jobs_candidates_id <=", value, "jobsCandidatesId");
            return (Criteria) this;
        }

        public Criteria andJobsCandidatesIdIn(List<Integer> values) {
            addCriterion("jobs_candidates_id in", values, "jobsCandidatesId");
            return (Criteria) this;
        }

        public Criteria andJobsCandidatesIdNotIn(List<Integer> values) {
            addCriterion("jobs_candidates_id not in", values, "jobsCandidatesId");
            return (Criteria) this;
        }

        public Criteria andJobsCandidatesIdBetween(Integer value1, Integer value2) {
            addCriterion("jobs_candidates_id between", value1, value2, "jobsCandidatesId");
            return (Criteria) this;
        }

        public Criteria andJobsCandidatesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jobs_candidates_id not between", value1, value2, "jobsCandidatesId");
            return (Criteria) this;
        }

        public Criteria andCnoIsNull() {
            addCriterion("cno is null");
            return (Criteria) this;
        }

        public Criteria andCnoIsNotNull() {
            addCriterion("cno is not null");
            return (Criteria) this;
        }

        public Criteria andCnoEqualTo(String value) {
            addCriterion("cno =", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotEqualTo(String value) {
            addCriterion("cno <>", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThan(String value) {
            addCriterion("cno >", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThanOrEqualTo(String value) {
            addCriterion("cno >=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThan(String value) {
            addCriterion("cno <", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThanOrEqualTo(String value) {
            addCriterion("cno <=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLike(String value) {
            addCriterion("cno like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotLike(String value) {
            addCriterion("cno not like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoIn(List<String> values) {
            addCriterion("cno in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotIn(List<String> values) {
            addCriterion("cno not in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoBetween(String value1, String value2) {
            addCriterion("cno between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotBetween(String value1, String value2) {
            addCriterion("cno not between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andJobnoIsNull() {
            addCriterion("jobno is null");
            return (Criteria) this;
        }

        public Criteria andJobnoIsNotNull() {
            addCriterion("jobno is not null");
            return (Criteria) this;
        }

        public Criteria andJobnoEqualTo(String value) {
            addCriterion("jobno =", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotEqualTo(String value) {
            addCriterion("jobno <>", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoGreaterThan(String value) {
            addCriterion("jobno >", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoGreaterThanOrEqualTo(String value) {
            addCriterion("jobno >=", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoLessThan(String value) {
            addCriterion("jobno <", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoLessThanOrEqualTo(String value) {
            addCriterion("jobno <=", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoLike(String value) {
            addCriterion("jobno like", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotLike(String value) {
            addCriterion("jobno not like", value, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoIn(List<String> values) {
            addCriterion("jobno in", values, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotIn(List<String> values) {
            addCriterion("jobno not in", values, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoBetween(String value1, String value2) {
            addCriterion("jobno between", value1, value2, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobnoNotBetween(String value1, String value2) {
            addCriterion("jobno not between", value1, value2, "jobno");
            return (Criteria) this;
        }

        public Criteria andJobdescIsNull() {
            addCriterion("jobdesc is null");
            return (Criteria) this;
        }

        public Criteria andJobdescIsNotNull() {
            addCriterion("jobdesc is not null");
            return (Criteria) this;
        }

        public Criteria andJobdescEqualTo(String value) {
            addCriterion("jobdesc =", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotEqualTo(String value) {
            addCriterion("jobdesc <>", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescGreaterThan(String value) {
            addCriterion("jobdesc >", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescGreaterThanOrEqualTo(String value) {
            addCriterion("jobdesc >=", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescLessThan(String value) {
            addCriterion("jobdesc <", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescLessThanOrEqualTo(String value) {
            addCriterion("jobdesc <=", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescLike(String value) {
            addCriterion("jobdesc like", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotLike(String value) {
            addCriterion("jobdesc not like", value, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescIn(List<String> values) {
            addCriterion("jobdesc in", values, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotIn(List<String> values) {
            addCriterion("jobdesc not in", values, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescBetween(String value1, String value2) {
            addCriterion("jobdesc between", value1, value2, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andJobdescNotBetween(String value1, String value2) {
            addCriterion("jobdesc not between", value1, value2, "jobdesc");
            return (Criteria) this;
        }

        public Criteria andCandidatesidIsNull() {
            addCriterion("candidatesid is null");
            return (Criteria) this;
        }

        public Criteria andCandidatesidIsNotNull() {
            addCriterion("candidatesid is not null");
            return (Criteria) this;
        }

        public Criteria andCandidatesidEqualTo(Integer value) {
            addCriterion("candidatesid =", value, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidNotEqualTo(Integer value) {
            addCriterion("candidatesid <>", value, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidGreaterThan(Integer value) {
            addCriterion("candidatesid >", value, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("candidatesid >=", value, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidLessThan(Integer value) {
            addCriterion("candidatesid <", value, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidLessThanOrEqualTo(Integer value) {
            addCriterion("candidatesid <=", value, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidIn(List<Integer> values) {
            addCriterion("candidatesid in", values, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidNotIn(List<Integer> values) {
            addCriterion("candidatesid not in", values, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidBetween(Integer value1, Integer value2) {
            addCriterion("candidatesid between", value1, value2, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidNotBetween(Integer value1, Integer value2) {
            addCriterion("candidatesid not between", value1, value2, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesnameIsNull() {
            addCriterion("candidatesname is null");
            return (Criteria) this;
        }

        public Criteria andCandidatesnameIsNotNull() {
            addCriterion("candidatesname is not null");
            return (Criteria) this;
        }

        public Criteria andCandidatesnameEqualTo(String value) {
            addCriterion("candidatesname =", value, "candidatesname");
            return (Criteria) this;
        }

        public Criteria andCandidatesnameNotEqualTo(String value) {
            addCriterion("candidatesname <>", value, "candidatesname");
            return (Criteria) this;
        }

        public Criteria andCandidatesnameGreaterThan(String value) {
            addCriterion("candidatesname >", value, "candidatesname");
            return (Criteria) this;
        }

        public Criteria andCandidatesnameGreaterThanOrEqualTo(String value) {
            addCriterion("candidatesname >=", value, "candidatesname");
            return (Criteria) this;
        }

        public Criteria andCandidatesnameLessThan(String value) {
            addCriterion("candidatesname <", value, "candidatesname");
            return (Criteria) this;
        }

        public Criteria andCandidatesnameLessThanOrEqualTo(String value) {
            addCriterion("candidatesname <=", value, "candidatesname");
            return (Criteria) this;
        }

        public Criteria andCandidatesnameLike(String value) {
            addCriterion("candidatesname like", value, "candidatesname");
            return (Criteria) this;
        }

        public Criteria andCandidatesnameNotLike(String value) {
            addCriterion("candidatesname not like", value, "candidatesname");
            return (Criteria) this;
        }

        public Criteria andCandidatesnameIn(List<String> values) {
            addCriterion("candidatesname in", values, "candidatesname");
            return (Criteria) this;
        }

        public Criteria andCandidatesnameNotIn(List<String> values) {
            addCriterion("candidatesname not in", values, "candidatesname");
            return (Criteria) this;
        }

        public Criteria andCandidatesnameBetween(String value1, String value2) {
            addCriterion("candidatesname between", value1, value2, "candidatesname");
            return (Criteria) this;
        }

        public Criteria andCandidatesnameNotBetween(String value1, String value2) {
            addCriterion("candidatesname not between", value1, value2, "candidatesname");
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

        public Criteria andCreateuserIsNull() {
            addCriterion("createuser is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("createuser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("createuser =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("createuser <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("createuser >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("createuser >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("createuser <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("createuser <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("createuser like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("createuser not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("createuser in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("createuser not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("createuser between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("createuser not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andEnsurencetimeIsNull() {
            addCriterion("ensurencetime is null");
            return (Criteria) this;
        }

        public Criteria andEnsurencetimeIsNotNull() {
            addCriterion("ensurencetime is not null");
            return (Criteria) this;
        }

        public Criteria andEnsurencetimeEqualTo(Date value) {
            addCriterionForJDBCDate("ensurencetime =", value, "ensurencetime");
            return (Criteria) this;
        }

        public Criteria andEnsurencetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ensurencetime <>", value, "ensurencetime");
            return (Criteria) this;
        }

        public Criteria andEnsurencetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ensurencetime >", value, "ensurencetime");
            return (Criteria) this;
        }

        public Criteria andEnsurencetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ensurencetime >=", value, "ensurencetime");
            return (Criteria) this;
        }

        public Criteria andEnsurencetimeLessThan(Date value) {
            addCriterionForJDBCDate("ensurencetime <", value, "ensurencetime");
            return (Criteria) this;
        }

        public Criteria andEnsurencetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ensurencetime <=", value, "ensurencetime");
            return (Criteria) this;
        }

        public Criteria andEnsurencetimeIn(List<Date> values) {
            addCriterionForJDBCDate("ensurencetime in", values, "ensurencetime");
            return (Criteria) this;
        }

        public Criteria andEnsurencetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ensurencetime not in", values, "ensurencetime");
            return (Criteria) this;
        }

        public Criteria andEnsurencetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ensurencetime between", value1, value2, "ensurencetime");
            return (Criteria) this;
        }

        public Criteria andEnsurencetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ensurencetime not between", value1, value2, "ensurencetime");
            return (Criteria) this;
        }

        public Criteria andAccounttimeIsNull() {
            addCriterion("accounttime is null");
            return (Criteria) this;
        }

        public Criteria andAccounttimeIsNotNull() {
            addCriterion("accounttime is not null");
            return (Criteria) this;
        }

        public Criteria andAccounttimeEqualTo(Date value) {
            addCriterionForJDBCDate("accounttime =", value, "accounttime");
            return (Criteria) this;
        }

        public Criteria andAccounttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("accounttime <>", value, "accounttime");
            return (Criteria) this;
        }

        public Criteria andAccounttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("accounttime >", value, "accounttime");
            return (Criteria) this;
        }

        public Criteria andAccounttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accounttime >=", value, "accounttime");
            return (Criteria) this;
        }

        public Criteria andAccounttimeLessThan(Date value) {
            addCriterionForJDBCDate("accounttime <", value, "accounttime");
            return (Criteria) this;
        }

        public Criteria andAccounttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("accounttime <=", value, "accounttime");
            return (Criteria) this;
        }

        public Criteria andAccounttimeIn(List<Date> values) {
            addCriterionForJDBCDate("accounttime in", values, "accounttime");
            return (Criteria) this;
        }

        public Criteria andAccounttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("accounttime not in", values, "accounttime");
            return (Criteria) this;
        }

        public Criteria andAccounttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accounttime between", value1, value2, "accounttime");
            return (Criteria) this;
        }

        public Criteria andAccounttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("accounttime not between", value1, value2, "accounttime");
            return (Criteria) this;
        }

        public Criteria andAccountmoneyIsNull() {
            addCriterion("accountmoney is null");
            return (Criteria) this;
        }

        public Criteria andAccountmoneyIsNotNull() {
            addCriterion("accountmoney is not null");
            return (Criteria) this;
        }

        public Criteria andAccountmoneyEqualTo(Double value) {
            addCriterion("accountmoney =", value, "accountmoney");
            return (Criteria) this;
        }

        public Criteria andAccountmoneyNotEqualTo(Double value) {
            addCriterion("accountmoney <>", value, "accountmoney");
            return (Criteria) this;
        }

        public Criteria andAccountmoneyGreaterThan(Double value) {
            addCriterion("accountmoney >", value, "accountmoney");
            return (Criteria) this;
        }

        public Criteria andAccountmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("accountmoney >=", value, "accountmoney");
            return (Criteria) this;
        }

        public Criteria andAccountmoneyLessThan(Double value) {
            addCriterion("accountmoney <", value, "accountmoney");
            return (Criteria) this;
        }

        public Criteria andAccountmoneyLessThanOrEqualTo(Double value) {
            addCriterion("accountmoney <=", value, "accountmoney");
            return (Criteria) this;
        }

        public Criteria andAccountmoneyIn(List<Double> values) {
            addCriterion("accountmoney in", values, "accountmoney");
            return (Criteria) this;
        }

        public Criteria andAccountmoneyNotIn(List<Double> values) {
            addCriterion("accountmoney not in", values, "accountmoney");
            return (Criteria) this;
        }

        public Criteria andAccountmoneyBetween(Double value1, Double value2) {
            addCriterion("accountmoney between", value1, value2, "accountmoney");
            return (Criteria) this;
        }

        public Criteria andAccountmoneyNotBetween(Double value1, Double value2) {
            addCriterion("accountmoney not between", value1, value2, "accountmoney");
            return (Criteria) this;
        }

        public Criteria andPrepareperformanceIsNull() {
            addCriterion("prepareperformance is null");
            return (Criteria) this;
        }

        public Criteria andPrepareperformanceIsNotNull() {
            addCriterion("prepareperformance is not null");
            return (Criteria) this;
        }

        public Criteria andPrepareperformanceEqualTo(Double value) {
            addCriterion("prepareperformance =", value, "prepareperformance");
            return (Criteria) this;
        }

        public Criteria andPrepareperformanceNotEqualTo(Double value) {
            addCriterion("prepareperformance <>", value, "prepareperformance");
            return (Criteria) this;
        }

        public Criteria andPrepareperformanceGreaterThan(Double value) {
            addCriterion("prepareperformance >", value, "prepareperformance");
            return (Criteria) this;
        }

        public Criteria andPrepareperformanceGreaterThanOrEqualTo(Double value) {
            addCriterion("prepareperformance >=", value, "prepareperformance");
            return (Criteria) this;
        }

        public Criteria andPrepareperformanceLessThan(Double value) {
            addCriterion("prepareperformance <", value, "prepareperformance");
            return (Criteria) this;
        }

        public Criteria andPrepareperformanceLessThanOrEqualTo(Double value) {
            addCriterion("prepareperformance <=", value, "prepareperformance");
            return (Criteria) this;
        }

        public Criteria andPrepareperformanceIn(List<Double> values) {
            addCriterion("prepareperformance in", values, "prepareperformance");
            return (Criteria) this;
        }

        public Criteria andPrepareperformanceNotIn(List<Double> values) {
            addCriterion("prepareperformance not in", values, "prepareperformance");
            return (Criteria) this;
        }

        public Criteria andPrepareperformanceBetween(Double value1, Double value2) {
            addCriterion("prepareperformance between", value1, value2, "prepareperformance");
            return (Criteria) this;
        }

        public Criteria andPrepareperformanceNotBetween(Double value1, Double value2) {
            addCriterion("prepareperformance not between", value1, value2, "prepareperformance");
            return (Criteria) this;
        }

        public Criteria andPracticeperformanceIsNull() {
            addCriterion("practiceperformance is null");
            return (Criteria) this;
        }

        public Criteria andPracticeperformanceIsNotNull() {
            addCriterion("practiceperformance is not null");
            return (Criteria) this;
        }

        public Criteria andPracticeperformanceEqualTo(Double value) {
            addCriterion("practiceperformance =", value, "practiceperformance");
            return (Criteria) this;
        }

        public Criteria andPracticeperformanceNotEqualTo(Double value) {
            addCriterion("practiceperformance <>", value, "practiceperformance");
            return (Criteria) this;
        }

        public Criteria andPracticeperformanceGreaterThan(Double value) {
            addCriterion("practiceperformance >", value, "practiceperformance");
            return (Criteria) this;
        }

        public Criteria andPracticeperformanceGreaterThanOrEqualTo(Double value) {
            addCriterion("practiceperformance >=", value, "practiceperformance");
            return (Criteria) this;
        }

        public Criteria andPracticeperformanceLessThan(Double value) {
            addCriterion("practiceperformance <", value, "practiceperformance");
            return (Criteria) this;
        }

        public Criteria andPracticeperformanceLessThanOrEqualTo(Double value) {
            addCriterion("practiceperformance <=", value, "practiceperformance");
            return (Criteria) this;
        }

        public Criteria andPracticeperformanceIn(List<Double> values) {
            addCriterion("practiceperformance in", values, "practiceperformance");
            return (Criteria) this;
        }

        public Criteria andPracticeperformanceNotIn(List<Double> values) {
            addCriterion("practiceperformance not in", values, "practiceperformance");
            return (Criteria) this;
        }

        public Criteria andPracticeperformanceBetween(Double value1, Double value2) {
            addCriterion("practiceperformance between", value1, value2, "practiceperformance");
            return (Criteria) this;
        }

        public Criteria andPracticeperformanceNotBetween(Double value1, Double value2) {
            addCriterion("practiceperformance not between", value1, value2, "practiceperformance");
            return (Criteria) this;
        }

        public Criteria andDeductmoneyIsNull() {
            addCriterion("deductmoney is null");
            return (Criteria) this;
        }

        public Criteria andDeductmoneyIsNotNull() {
            addCriterion("deductmoney is not null");
            return (Criteria) this;
        }

        public Criteria andDeductmoneyEqualTo(Double value) {
            addCriterion("deductmoney =", value, "deductmoney");
            return (Criteria) this;
        }

        public Criteria andDeductmoneyNotEqualTo(Double value) {
            addCriterion("deductmoney <>", value, "deductmoney");
            return (Criteria) this;
        }

        public Criteria andDeductmoneyGreaterThan(Double value) {
            addCriterion("deductmoney >", value, "deductmoney");
            return (Criteria) this;
        }

        public Criteria andDeductmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("deductmoney >=", value, "deductmoney");
            return (Criteria) this;
        }

        public Criteria andDeductmoneyLessThan(Double value) {
            addCriterion("deductmoney <", value, "deductmoney");
            return (Criteria) this;
        }

        public Criteria andDeductmoneyLessThanOrEqualTo(Double value) {
            addCriterion("deductmoney <=", value, "deductmoney");
            return (Criteria) this;
        }

        public Criteria andDeductmoneyIn(List<Double> values) {
            addCriterion("deductmoney in", values, "deductmoney");
            return (Criteria) this;
        }

        public Criteria andDeductmoneyNotIn(List<Double> values) {
            addCriterion("deductmoney not in", values, "deductmoney");
            return (Criteria) this;
        }

        public Criteria andDeductmoneyBetween(Double value1, Double value2) {
            addCriterion("deductmoney between", value1, value2, "deductmoney");
            return (Criteria) this;
        }

        public Criteria andDeductmoneyNotBetween(Double value1, Double value2) {
            addCriterion("deductmoney not between", value1, value2, "deductmoney");
            return (Criteria) this;
        }

        public Criteria andDeductratioIsNull() {
            addCriterion("deductratio is null");
            return (Criteria) this;
        }

        public Criteria andDeductratioIsNotNull() {
            addCriterion("deductratio is not null");
            return (Criteria) this;
        }

        public Criteria andDeductratioEqualTo(Double value) {
            addCriterion("deductratio =", value, "deductratio");
            return (Criteria) this;
        }

        public Criteria andDeductratioNotEqualTo(Double value) {
            addCriterion("deductratio <>", value, "deductratio");
            return (Criteria) this;
        }

        public Criteria andDeductratioGreaterThan(Double value) {
            addCriterion("deductratio >", value, "deductratio");
            return (Criteria) this;
        }

        public Criteria andDeductratioGreaterThanOrEqualTo(Double value) {
            addCriterion("deductratio >=", value, "deductratio");
            return (Criteria) this;
        }

        public Criteria andDeductratioLessThan(Double value) {
            addCriterion("deductratio <", value, "deductratio");
            return (Criteria) this;
        }

        public Criteria andDeductratioLessThanOrEqualTo(Double value) {
            addCriterion("deductratio <=", value, "deductratio");
            return (Criteria) this;
        }

        public Criteria andDeductratioIn(List<Double> values) {
            addCriterion("deductratio in", values, "deductratio");
            return (Criteria) this;
        }

        public Criteria andDeductratioNotIn(List<Double> values) {
            addCriterion("deductratio not in", values, "deductratio");
            return (Criteria) this;
        }

        public Criteria andDeductratioBetween(Double value1, Double value2) {
            addCriterion("deductratio between", value1, value2, "deductratio");
            return (Criteria) this;
        }

        public Criteria andDeductratioNotBetween(Double value1, Double value2) {
            addCriterion("deductratio not between", value1, value2, "deductratio");
            return (Criteria) this;
        }

        public Criteria andDeducttypeIsNull() {
            addCriterion("deducttype is null");
            return (Criteria) this;
        }

        public Criteria andDeducttypeIsNotNull() {
            addCriterion("deducttype is not null");
            return (Criteria) this;
        }

        public Criteria andDeducttypeEqualTo(String value) {
            addCriterion("deducttype =", value, "deducttype");
            return (Criteria) this;
        }

        public Criteria andDeducttypeNotEqualTo(String value) {
            addCriterion("deducttype <>", value, "deducttype");
            return (Criteria) this;
        }

        public Criteria andDeducttypeGreaterThan(String value) {
            addCriterion("deducttype >", value, "deducttype");
            return (Criteria) this;
        }

        public Criteria andDeducttypeGreaterThanOrEqualTo(String value) {
            addCriterion("deducttype >=", value, "deducttype");
            return (Criteria) this;
        }

        public Criteria andDeducttypeLessThan(String value) {
            addCriterion("deducttype <", value, "deducttype");
            return (Criteria) this;
        }

        public Criteria andDeducttypeLessThanOrEqualTo(String value) {
            addCriterion("deducttype <=", value, "deducttype");
            return (Criteria) this;
        }

        public Criteria andDeducttypeLike(String value) {
            addCriterion("deducttype like", value, "deducttype");
            return (Criteria) this;
        }

        public Criteria andDeducttypeNotLike(String value) {
            addCriterion("deducttype not like", value, "deducttype");
            return (Criteria) this;
        }

        public Criteria andDeducttypeIn(List<String> values) {
            addCriterion("deducttype in", values, "deducttype");
            return (Criteria) this;
        }

        public Criteria andDeducttypeNotIn(List<String> values) {
            addCriterion("deducttype not in", values, "deducttype");
            return (Criteria) this;
        }

        public Criteria andDeducttypeBetween(String value1, String value2) {
            addCriterion("deducttype between", value1, value2, "deducttype");
            return (Criteria) this;
        }

        public Criteria andDeducttypeNotBetween(String value1, String value2) {
            addCriterion("deducttype not between", value1, value2, "deducttype");
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

        public Criteria andGrantmoneyIsNull() {
            addCriterion("grantmoney is null");
            return (Criteria) this;
        }

        public Criteria andGrantmoneyIsNotNull() {
            addCriterion("grantmoney is not null");
            return (Criteria) this;
        }

        public Criteria andGrantmoneyEqualTo(Double value) {
            addCriterion("grantmoney =", value, "grantmoney");
            return (Criteria) this;
        }

        public Criteria andGrantmoneyNotEqualTo(Double value) {
            addCriterion("grantmoney <>", value, "grantmoney");
            return (Criteria) this;
        }

        public Criteria andGrantmoneyGreaterThan(Double value) {
            addCriterion("grantmoney >", value, "grantmoney");
            return (Criteria) this;
        }

        public Criteria andGrantmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("grantmoney >=", value, "grantmoney");
            return (Criteria) this;
        }

        public Criteria andGrantmoneyLessThan(Double value) {
            addCriterion("grantmoney <", value, "grantmoney");
            return (Criteria) this;
        }

        public Criteria andGrantmoneyLessThanOrEqualTo(Double value) {
            addCriterion("grantmoney <=", value, "grantmoney");
            return (Criteria) this;
        }

        public Criteria andGrantmoneyIn(List<Double> values) {
            addCriterion("grantmoney in", values, "grantmoney");
            return (Criteria) this;
        }

        public Criteria andGrantmoneyNotIn(List<Double> values) {
            addCriterion("grantmoney not in", values, "grantmoney");
            return (Criteria) this;
        }

        public Criteria andGrantmoneyBetween(Double value1, Double value2) {
            addCriterion("grantmoney between", value1, value2, "grantmoney");
            return (Criteria) this;
        }

        public Criteria andGrantmoneyNotBetween(Double value1, Double value2) {
            addCriterion("grantmoney not between", value1, value2, "grantmoney");
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