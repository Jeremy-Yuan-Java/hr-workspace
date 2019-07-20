package com.hrbc.business.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobsCandidatesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public JobsCandidatesExample() {
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

        public Criteria andCandidateidIsNull() {
            addCriterion("candidateid is null");
            return (Criteria) this;
        }

        public Criteria andCandidateidIsNotNull() {
            addCriterion("candidateid is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateidEqualTo(Integer value) {
            addCriterion("candidateid =", value, "candidateid");
            return (Criteria) this;
        }

        public Criteria andCandidateidNotEqualTo(Integer value) {
            addCriterion("candidateid <>", value, "candidateid");
            return (Criteria) this;
        }

        public Criteria andCandidateidGreaterThan(Integer value) {
            addCriterion("candidateid >", value, "candidateid");
            return (Criteria) this;
        }

        public Criteria andCandidateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("candidateid >=", value, "candidateid");
            return (Criteria) this;
        }

        public Criteria andCandidateidLessThan(Integer value) {
            addCriterion("candidateid <", value, "candidateid");
            return (Criteria) this;
        }

        public Criteria andCandidateidLessThanOrEqualTo(Integer value) {
            addCriterion("candidateid <=", value, "candidateid");
            return (Criteria) this;
        }

        public Criteria andCandidateidIn(List<Integer> values) {
            addCriterion("candidateid in", values, "candidateid");
            return (Criteria) this;
        }

        public Criteria andCandidateidNotIn(List<Integer> values) {
            addCriterion("candidateid not in", values, "candidateid");
            return (Criteria) this;
        }

        public Criteria andCandidateidBetween(Integer value1, Integer value2) {
            addCriterion("candidateid between", value1, value2, "candidateid");
            return (Criteria) this;
        }

        public Criteria andCandidateidNotBetween(Integer value1, Integer value2) {
            addCriterion("candidateid not between", value1, value2, "candidateid");
            return (Criteria) this;
        }

        public Criteria andCandidatenameIsNull() {
            addCriterion("candidatename is null");
            return (Criteria) this;
        }

        public Criteria andCandidatenameIsNotNull() {
            addCriterion("candidatename is not null");
            return (Criteria) this;
        }

        public Criteria andCandidatenameEqualTo(String value) {
            addCriterion("candidatename =", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameNotEqualTo(String value) {
            addCriterion("candidatename <>", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameGreaterThan(String value) {
            addCriterion("candidatename >", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameGreaterThanOrEqualTo(String value) {
            addCriterion("candidatename >=", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameLessThan(String value) {
            addCriterion("candidatename <", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameLessThanOrEqualTo(String value) {
            addCriterion("candidatename <=", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameLike(String value) {
            addCriterion("candidatename like", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameNotLike(String value) {
            addCriterion("candidatename not like", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameIn(List<String> values) {
            addCriterion("candidatename in", values, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameNotIn(List<String> values) {
            addCriterion("candidatename not in", values, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameBetween(String value1, String value2) {
            addCriterion("candidatename between", value1, value2, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameNotBetween(String value1, String value2) {
            addCriterion("candidatename not between", value1, value2, "candidatename");
            return (Criteria) this;
        }

        public Criteria andOptimeIsNull() {
            addCriterion("optime is null");
            return (Criteria) this;
        }

        public Criteria andOptimeIsNotNull() {
            addCriterion("optime is not null");
            return (Criteria) this;
        }

        public Criteria andOptimeEqualTo(Date value) {
            addCriterion("optime =", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotEqualTo(Date value) {
            addCriterion("optime <>", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeGreaterThan(Date value) {
            addCriterion("optime >", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("optime >=", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeLessThan(Date value) {
            addCriterion("optime <", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeLessThanOrEqualTo(Date value) {
            addCriterion("optime <=", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeIn(List<Date> values) {
            addCriterion("optime in", values, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotIn(List<Date> values) {
            addCriterion("optime not in", values, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeBetween(Date value1, Date value2) {
            addCriterion("optime between", value1, value2, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotBetween(Date value1, Date value2) {
            addCriterion("optime not between", value1, value2, "optime");
            return (Criteria) this;
        }

        public Criteria andOpuserIsNull() {
            addCriterion("opuser is null");
            return (Criteria) this;
        }

        public Criteria andOpuserIsNotNull() {
            addCriterion("opuser is not null");
            return (Criteria) this;
        }

        public Criteria andOpuserEqualTo(Integer value) {
            addCriterion("opuser =", value, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserNotEqualTo(Integer value) {
            addCriterion("opuser <>", value, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserGreaterThan(Integer value) {
            addCriterion("opuser >", value, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserGreaterThanOrEqualTo(Integer value) {
            addCriterion("opuser >=", value, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserLessThan(Integer value) {
            addCriterion("opuser <", value, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserLessThanOrEqualTo(Integer value) {
            addCriterion("opuser <=", value, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserIn(List<Integer> values) {
            addCriterion("opuser in", values, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserNotIn(List<Integer> values) {
            addCriterion("opuser not in", values, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserBetween(Integer value1, Integer value2) {
            addCriterion("opuser between", value1, value2, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserNotBetween(Integer value1, Integer value2) {
            addCriterion("opuser not between", value1, value2, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpusernameIsNull() {
            addCriterion("opusername is null");
            return (Criteria) this;
        }

        public Criteria andOpusernameIsNotNull() {
            addCriterion("opusername is not null");
            return (Criteria) this;
        }

        public Criteria andOpusernameEqualTo(String value) {
            addCriterion("opusername =", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameNotEqualTo(String value) {
            addCriterion("opusername <>", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameGreaterThan(String value) {
            addCriterion("opusername >", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameGreaterThanOrEqualTo(String value) {
            addCriterion("opusername >=", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameLessThan(String value) {
            addCriterion("opusername <", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameLessThanOrEqualTo(String value) {
            addCriterion("opusername <=", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameLike(String value) {
            addCriterion("opusername like", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameNotLike(String value) {
            addCriterion("opusername not like", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameIn(List<String> values) {
            addCriterion("opusername in", values, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameNotIn(List<String> values) {
            addCriterion("opusername not in", values, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameBetween(String value1, String value2) {
            addCriterion("opusername between", value1, value2, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameNotBetween(String value1, String value2) {
            addCriterion("opusername not between", value1, value2, "opusername");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNull() {
            addCriterion("delflag is null");
            return (Criteria) this;
        }

        public Criteria andDelflagIsNotNull() {
            addCriterion("delflag is not null");
            return (Criteria) this;
        }

        public Criteria andDelflagEqualTo(Integer value) {
            addCriterion("delflag =", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotEqualTo(Integer value) {
            addCriterion("delflag <>", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThan(Integer value) {
            addCriterion("delflag >", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("delflag >=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThan(Integer value) {
            addCriterion("delflag <", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagLessThanOrEqualTo(Integer value) {
            addCriterion("delflag <=", value, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagIn(List<Integer> values) {
            addCriterion("delflag in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotIn(List<Integer> values) {
            addCriterion("delflag not in", values, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagBetween(Integer value1, Integer value2) {
            addCriterion("delflag between", value1, value2, "delflag");
            return (Criteria) this;
        }

        public Criteria andDelflagNotBetween(Integer value1, Integer value2) {
            addCriterion("delflag not between", value1, value2, "delflag");
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

        public Criteria andUpdateuserIsNull() {
            addCriterion("updateuser is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNotNull() {
            addCriterion("updateuser is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserEqualTo(String value) {
            addCriterion("updateuser =", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotEqualTo(String value) {
            addCriterion("updateuser <>", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThan(String value) {
            addCriterion("updateuser >", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("updateuser >=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThan(String value) {
            addCriterion("updateuser <", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("updateuser <=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLike(String value) {
            addCriterion("updateuser like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotLike(String value) {
            addCriterion("updateuser not like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIn(List<String> values) {
            addCriterion("updateuser in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotIn(List<String> values) {
            addCriterion("updateuser not in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserBetween(String value1, String value2) {
            addCriterion("updateuser between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotBetween(String value1, String value2) {
            addCriterion("updateuser not between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andCreatestaffIsNull() {
            addCriterion("createstaff is null");
            return (Criteria) this;
        }

        public Criteria andCreatestaffIsNotNull() {
            addCriterion("createstaff is not null");
            return (Criteria) this;
        }

        public Criteria andCreatestaffEqualTo(String value) {
            addCriterion("createstaff =", value, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffNotEqualTo(String value) {
            addCriterion("createstaff <>", value, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffGreaterThan(String value) {
            addCriterion("createstaff >", value, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffGreaterThanOrEqualTo(String value) {
            addCriterion("createstaff >=", value, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffLessThan(String value) {
            addCriterion("createstaff <", value, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffLessThanOrEqualTo(String value) {
            addCriterion("createstaff <=", value, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffLike(String value) {
            addCriterion("createstaff like", value, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffNotLike(String value) {
            addCriterion("createstaff not like", value, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffIn(List<String> values) {
            addCriterion("createstaff in", values, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffNotIn(List<String> values) {
            addCriterion("createstaff not in", values, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffBetween(String value1, String value2) {
            addCriterion("createstaff between", value1, value2, "createstaff");
            return (Criteria) this;
        }

        public Criteria andCreatestaffNotBetween(String value1, String value2) {
            addCriterion("createstaff not between", value1, value2, "createstaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffIsNull() {
            addCriterion("updatestaff is null");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffIsNotNull() {
            addCriterion("updatestaff is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffEqualTo(String value) {
            addCriterion("updatestaff =", value, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffNotEqualTo(String value) {
            addCriterion("updatestaff <>", value, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffGreaterThan(String value) {
            addCriterion("updatestaff >", value, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffGreaterThanOrEqualTo(String value) {
            addCriterion("updatestaff >=", value, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffLessThan(String value) {
            addCriterion("updatestaff <", value, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffLessThanOrEqualTo(String value) {
            addCriterion("updatestaff <=", value, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffLike(String value) {
            addCriterion("updatestaff like", value, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffNotLike(String value) {
            addCriterion("updatestaff not like", value, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffIn(List<String> values) {
            addCriterion("updatestaff in", values, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffNotIn(List<String> values) {
            addCriterion("updatestaff not in", values, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffBetween(String value1, String value2) {
            addCriterion("updatestaff between", value1, value2, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andUpdatestaffNotBetween(String value1, String value2) {
            addCriterion("updatestaff not between", value1, value2, "updatestaff");
            return (Criteria) this;
        }

        public Criteria andFulltextsIsNull() {
            addCriterion("fulltexts is null");
            return (Criteria) this;
        }

        public Criteria andFulltextsIsNotNull() {
            addCriterion("fulltexts is not null");
            return (Criteria) this;
        }

        public Criteria andFulltextsEqualTo(String value) {
            addCriterion("fulltexts =", value, "fulltexts");
            return (Criteria) this;
        }

        public Criteria andFulltextsNotEqualTo(String value) {
            addCriterion("fulltexts <>", value, "fulltexts");
            return (Criteria) this;
        }

        public Criteria andFulltextsGreaterThan(String value) {
            addCriterion("fulltexts >", value, "fulltexts");
            return (Criteria) this;
        }

        public Criteria andFulltextsGreaterThanOrEqualTo(String value) {
            addCriterion("fulltexts >=", value, "fulltexts");
            return (Criteria) this;
        }

        public Criteria andFulltextsLessThan(String value) {
            addCriterion("fulltexts <", value, "fulltexts");
            return (Criteria) this;
        }

        public Criteria andFulltextsLessThanOrEqualTo(String value) {
            addCriterion("fulltexts <=", value, "fulltexts");
            return (Criteria) this;
        }

        public Criteria andFulltextsLike(String value) {
            addCriterion("fulltexts like", value, "fulltexts");
            return (Criteria) this;
        }

        public Criteria andFulltextsNotLike(String value) {
            addCriterion("fulltexts not like", value, "fulltexts");
            return (Criteria) this;
        }

        public Criteria andFulltextsIn(List<String> values) {
            addCriterion("fulltexts in", values, "fulltexts");
            return (Criteria) this;
        }

        public Criteria andFulltextsNotIn(List<String> values) {
            addCriterion("fulltexts not in", values, "fulltexts");
            return (Criteria) this;
        }

        public Criteria andFulltextsBetween(String value1, String value2) {
            addCriterion("fulltexts between", value1, value2, "fulltexts");
            return (Criteria) this;
        }

        public Criteria andFulltextsNotBetween(String value1, String value2) {
            addCriterion("fulltexts not between", value1, value2, "fulltexts");
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