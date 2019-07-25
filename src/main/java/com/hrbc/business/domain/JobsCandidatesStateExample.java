package com.hrbc.business.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobsCandidatesStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public JobsCandidatesStateExample() {
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

        public Criteria andFlowstateIsNull() {
            addCriterion("flowstate is null");
            return (Criteria) this;
        }

        public Criteria andFlowstateIsNotNull() {
            addCriterion("flowstate is not null");
            return (Criteria) this;
        }

        public Criteria andFlowstateEqualTo(Integer value) {
            addCriterion("flowstate =", value, "flowstate");
            return (Criteria) this;
        }

        public Criteria andFlowstateNotEqualTo(Integer value) {
            addCriterion("flowstate <>", value, "flowstate");
            return (Criteria) this;
        }

        public Criteria andFlowstateGreaterThan(Integer value) {
            addCriterion("flowstate >", value, "flowstate");
            return (Criteria) this;
        }

        public Criteria andFlowstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("flowstate >=", value, "flowstate");
            return (Criteria) this;
        }

        public Criteria andFlowstateLessThan(Integer value) {
            addCriterion("flowstate <", value, "flowstate");
            return (Criteria) this;
        }

        public Criteria andFlowstateLessThanOrEqualTo(Integer value) {
            addCriterion("flowstate <=", value, "flowstate");
            return (Criteria) this;
        }

        public Criteria andFlowstateIn(List<Integer> values) {
            addCriterion("flowstate in", values, "flowstate");
            return (Criteria) this;
        }

        public Criteria andFlowstateNotIn(List<Integer> values) {
            addCriterion("flowstate not in", values, "flowstate");
            return (Criteria) this;
        }

        public Criteria andFlowstateBetween(Integer value1, Integer value2) {
            addCriterion("flowstate between", value1, value2, "flowstate");
            return (Criteria) this;
        }

        public Criteria andFlowstateNotBetween(Integer value1, Integer value2) {
            addCriterion("flowstate not between", value1, value2, "flowstate");
            return (Criteria) this;
        }

        public Criteria andFlowstatedescIsNull() {
            addCriterion("flowstatedesc is null");
            return (Criteria) this;
        }

        public Criteria andFlowstatedescIsNotNull() {
            addCriterion("flowstatedesc is not null");
            return (Criteria) this;
        }

        public Criteria andFlowstatedescEqualTo(String value) {
            addCriterion("flowstatedesc =", value, "flowstatedesc");
            return (Criteria) this;
        }

        public Criteria andFlowstatedescNotEqualTo(String value) {
            addCriterion("flowstatedesc <>", value, "flowstatedesc");
            return (Criteria) this;
        }

        public Criteria andFlowstatedescGreaterThan(String value) {
            addCriterion("flowstatedesc >", value, "flowstatedesc");
            return (Criteria) this;
        }

        public Criteria andFlowstatedescGreaterThanOrEqualTo(String value) {
            addCriterion("flowstatedesc >=", value, "flowstatedesc");
            return (Criteria) this;
        }

        public Criteria andFlowstatedescLessThan(String value) {
            addCriterion("flowstatedesc <", value, "flowstatedesc");
            return (Criteria) this;
        }

        public Criteria andFlowstatedescLessThanOrEqualTo(String value) {
            addCriterion("flowstatedesc <=", value, "flowstatedesc");
            return (Criteria) this;
        }

        public Criteria andFlowstatedescLike(String value) {
            addCriterion("flowstatedesc like", value, "flowstatedesc");
            return (Criteria) this;
        }

        public Criteria andFlowstatedescNotLike(String value) {
            addCriterion("flowstatedesc not like", value, "flowstatedesc");
            return (Criteria) this;
        }

        public Criteria andFlowstatedescIn(List<String> values) {
            addCriterion("flowstatedesc in", values, "flowstatedesc");
            return (Criteria) this;
        }

        public Criteria andFlowstatedescNotIn(List<String> values) {
            addCriterion("flowstatedesc not in", values, "flowstatedesc");
            return (Criteria) this;
        }

        public Criteria andFlowstatedescBetween(String value1, String value2) {
            addCriterion("flowstatedesc between", value1, value2, "flowstatedesc");
            return (Criteria) this;
        }

        public Criteria andFlowstatedescNotBetween(String value1, String value2) {
            addCriterion("flowstatedesc not between", value1, value2, "flowstatedesc");
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

        public Criteria andText1IsNull() {
            addCriterion("text1 is null");
            return (Criteria) this;
        }

        public Criteria andText1IsNotNull() {
            addCriterion("text1 is not null");
            return (Criteria) this;
        }

        public Criteria andText1EqualTo(String value) {
            addCriterion("text1 =", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotEqualTo(String value) {
            addCriterion("text1 <>", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1GreaterThan(String value) {
            addCriterion("text1 >", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1GreaterThanOrEqualTo(String value) {
            addCriterion("text1 >=", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1LessThan(String value) {
            addCriterion("text1 <", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1LessThanOrEqualTo(String value) {
            addCriterion("text1 <=", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1Like(String value) {
            addCriterion("text1 like", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotLike(String value) {
            addCriterion("text1 not like", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1In(List<String> values) {
            addCriterion("text1 in", values, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotIn(List<String> values) {
            addCriterion("text1 not in", values, "text1");
            return (Criteria) this;
        }

        public Criteria andText1Between(String value1, String value2) {
            addCriterion("text1 between", value1, value2, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotBetween(String value1, String value2) {
            addCriterion("text1 not between", value1, value2, "text1");
            return (Criteria) this;
        }

        public Criteria andText2IsNull() {
            addCriterion("text2 is null");
            return (Criteria) this;
        }

        public Criteria andText2IsNotNull() {
            addCriterion("text2 is not null");
            return (Criteria) this;
        }

        public Criteria andText2EqualTo(String value) {
            addCriterion("text2 =", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotEqualTo(String value) {
            addCriterion("text2 <>", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2GreaterThan(String value) {
            addCriterion("text2 >", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2GreaterThanOrEqualTo(String value) {
            addCriterion("text2 >=", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2LessThan(String value) {
            addCriterion("text2 <", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2LessThanOrEqualTo(String value) {
            addCriterion("text2 <=", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2Like(String value) {
            addCriterion("text2 like", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotLike(String value) {
            addCriterion("text2 not like", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2In(List<String> values) {
            addCriterion("text2 in", values, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotIn(List<String> values) {
            addCriterion("text2 not in", values, "text2");
            return (Criteria) this;
        }

        public Criteria andText2Between(String value1, String value2) {
            addCriterion("text2 between", value1, value2, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotBetween(String value1, String value2) {
            addCriterion("text2 not between", value1, value2, "text2");
            return (Criteria) this;
        }

        public Criteria andText3IsNull() {
            addCriterion("text3 is null");
            return (Criteria) this;
        }

        public Criteria andText3IsNotNull() {
            addCriterion("text3 is not null");
            return (Criteria) this;
        }

        public Criteria andText3EqualTo(String value) {
            addCriterion("text3 =", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3NotEqualTo(String value) {
            addCriterion("text3 <>", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3GreaterThan(String value) {
            addCriterion("text3 >", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3GreaterThanOrEqualTo(String value) {
            addCriterion("text3 >=", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3LessThan(String value) {
            addCriterion("text3 <", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3LessThanOrEqualTo(String value) {
            addCriterion("text3 <=", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3Like(String value) {
            addCriterion("text3 like", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3NotLike(String value) {
            addCriterion("text3 not like", value, "text3");
            return (Criteria) this;
        }

        public Criteria andText3In(List<String> values) {
            addCriterion("text3 in", values, "text3");
            return (Criteria) this;
        }

        public Criteria andText3NotIn(List<String> values) {
            addCriterion("text3 not in", values, "text3");
            return (Criteria) this;
        }

        public Criteria andText3Between(String value1, String value2) {
            addCriterion("text3 between", value1, value2, "text3");
            return (Criteria) this;
        }

        public Criteria andText3NotBetween(String value1, String value2) {
            addCriterion("text3 not between", value1, value2, "text3");
            return (Criteria) this;
        }

        public Criteria andText4IsNull() {
            addCriterion("text4 is null");
            return (Criteria) this;
        }

        public Criteria andText4IsNotNull() {
            addCriterion("text4 is not null");
            return (Criteria) this;
        }

        public Criteria andText4EqualTo(String value) {
            addCriterion("text4 =", value, "text4");
            return (Criteria) this;
        }

        public Criteria andText4NotEqualTo(String value) {
            addCriterion("text4 <>", value, "text4");
            return (Criteria) this;
        }

        public Criteria andText4GreaterThan(String value) {
            addCriterion("text4 >", value, "text4");
            return (Criteria) this;
        }

        public Criteria andText4GreaterThanOrEqualTo(String value) {
            addCriterion("text4 >=", value, "text4");
            return (Criteria) this;
        }

        public Criteria andText4LessThan(String value) {
            addCriterion("text4 <", value, "text4");
            return (Criteria) this;
        }

        public Criteria andText4LessThanOrEqualTo(String value) {
            addCriterion("text4 <=", value, "text4");
            return (Criteria) this;
        }

        public Criteria andText4Like(String value) {
            addCriterion("text4 like", value, "text4");
            return (Criteria) this;
        }

        public Criteria andText4NotLike(String value) {
            addCriterion("text4 not like", value, "text4");
            return (Criteria) this;
        }

        public Criteria andText4In(List<String> values) {
            addCriterion("text4 in", values, "text4");
            return (Criteria) this;
        }

        public Criteria andText4NotIn(List<String> values) {
            addCriterion("text4 not in", values, "text4");
            return (Criteria) this;
        }

        public Criteria andText4Between(String value1, String value2) {
            addCriterion("text4 between", value1, value2, "text4");
            return (Criteria) this;
        }

        public Criteria andText4NotBetween(String value1, String value2) {
            addCriterion("text4 not between", value1, value2, "text4");
            return (Criteria) this;
        }

        public Criteria andText5IsNull() {
            addCriterion("text5 is null");
            return (Criteria) this;
        }

        public Criteria andText5IsNotNull() {
            addCriterion("text5 is not null");
            return (Criteria) this;
        }

        public Criteria andText5EqualTo(String value) {
            addCriterion("text5 =", value, "text5");
            return (Criteria) this;
        }

        public Criteria andText5NotEqualTo(String value) {
            addCriterion("text5 <>", value, "text5");
            return (Criteria) this;
        }

        public Criteria andText5GreaterThan(String value) {
            addCriterion("text5 >", value, "text5");
            return (Criteria) this;
        }

        public Criteria andText5GreaterThanOrEqualTo(String value) {
            addCriterion("text5 >=", value, "text5");
            return (Criteria) this;
        }

        public Criteria andText5LessThan(String value) {
            addCriterion("text5 <", value, "text5");
            return (Criteria) this;
        }

        public Criteria andText5LessThanOrEqualTo(String value) {
            addCriterion("text5 <=", value, "text5");
            return (Criteria) this;
        }

        public Criteria andText5Like(String value) {
            addCriterion("text5 like", value, "text5");
            return (Criteria) this;
        }

        public Criteria andText5NotLike(String value) {
            addCriterion("text5 not like", value, "text5");
            return (Criteria) this;
        }

        public Criteria andText5In(List<String> values) {
            addCriterion("text5 in", values, "text5");
            return (Criteria) this;
        }

        public Criteria andText5NotIn(List<String> values) {
            addCriterion("text5 not in", values, "text5");
            return (Criteria) this;
        }

        public Criteria andText5Between(String value1, String value2) {
            addCriterion("text5 between", value1, value2, "text5");
            return (Criteria) this;
        }

        public Criteria andText5NotBetween(String value1, String value2) {
            addCriterion("text5 not between", value1, value2, "text5");
            return (Criteria) this;
        }

        public Criteria andDate1IsNull() {
            addCriterion("date1 is null");
            return (Criteria) this;
        }

        public Criteria andDate1IsNotNull() {
            addCriterion("date1 is not null");
            return (Criteria) this;
        }

        public Criteria andDate1EqualTo(Date value) {
            addCriterion("date1 =", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotEqualTo(Date value) {
            addCriterion("date1 <>", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1GreaterThan(Date value) {
            addCriterion("date1 >", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1GreaterThanOrEqualTo(Date value) {
            addCriterion("date1 >=", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1LessThan(Date value) {
            addCriterion("date1 <", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1LessThanOrEqualTo(Date value) {
            addCriterion("date1 <=", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1In(List<Date> values) {
            addCriterion("date1 in", values, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotIn(List<Date> values) {
            addCriterion("date1 not in", values, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1Between(Date value1, Date value2) {
            addCriterion("date1 between", value1, value2, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotBetween(Date value1, Date value2) {
            addCriterion("date1 not between", value1, value2, "date1");
            return (Criteria) this;
        }

        public Criteria andDate2IsNull() {
            addCriterion("date2 is null");
            return (Criteria) this;
        }

        public Criteria andDate2IsNotNull() {
            addCriterion("date2 is not null");
            return (Criteria) this;
        }

        public Criteria andDate2EqualTo(Date value) {
            addCriterion("date2 =", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2NotEqualTo(Date value) {
            addCriterion("date2 <>", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2GreaterThan(Date value) {
            addCriterion("date2 >", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2GreaterThanOrEqualTo(Date value) {
            addCriterion("date2 >=", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2LessThan(Date value) {
            addCriterion("date2 <", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2LessThanOrEqualTo(Date value) {
            addCriterion("date2 <=", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2In(List<Date> values) {
            addCriterion("date2 in", values, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2NotIn(List<Date> values) {
            addCriterion("date2 not in", values, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2Between(Date value1, Date value2) {
            addCriterion("date2 between", value1, value2, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2NotBetween(Date value1, Date value2) {
            addCriterion("date2 not between", value1, value2, "date2");
            return (Criteria) this;
        }

        public Criteria andDate3IsNull() {
            addCriterion("date3 is null");
            return (Criteria) this;
        }

        public Criteria andDate3IsNotNull() {
            addCriterion("date3 is not null");
            return (Criteria) this;
        }

        public Criteria andDate3EqualTo(Date value) {
            addCriterion("date3 =", value, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3NotEqualTo(Date value) {
            addCriterion("date3 <>", value, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3GreaterThan(Date value) {
            addCriterion("date3 >", value, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3GreaterThanOrEqualTo(Date value) {
            addCriterion("date3 >=", value, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3LessThan(Date value) {
            addCriterion("date3 <", value, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3LessThanOrEqualTo(Date value) {
            addCriterion("date3 <=", value, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3In(List<Date> values) {
            addCriterion("date3 in", values, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3NotIn(List<Date> values) {
            addCriterion("date3 not in", values, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3Between(Date value1, Date value2) {
            addCriterion("date3 between", value1, value2, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3NotBetween(Date value1, Date value2) {
            addCriterion("date3 not between", value1, value2, "date3");
            return (Criteria) this;
        }

        public Criteria andDate4IsNull() {
            addCriterion("date4 is null");
            return (Criteria) this;
        }

        public Criteria andDate4IsNotNull() {
            addCriterion("date4 is not null");
            return (Criteria) this;
        }

        public Criteria andDate4EqualTo(Date value) {
            addCriterion("date4 =", value, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4NotEqualTo(Date value) {
            addCriterion("date4 <>", value, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4GreaterThan(Date value) {
            addCriterion("date4 >", value, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4GreaterThanOrEqualTo(Date value) {
            addCriterion("date4 >=", value, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4LessThan(Date value) {
            addCriterion("date4 <", value, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4LessThanOrEqualTo(Date value) {
            addCriterion("date4 <=", value, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4In(List<Date> values) {
            addCriterion("date4 in", values, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4NotIn(List<Date> values) {
            addCriterion("date4 not in", values, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4Between(Date value1, Date value2) {
            addCriterion("date4 between", value1, value2, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4NotBetween(Date value1, Date value2) {
            addCriterion("date4 not between", value1, value2, "date4");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNull() {
            addCriterion("ischeck is null");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNotNull() {
            addCriterion("ischeck is not null");
            return (Criteria) this;
        }

        public Criteria andIscheckEqualTo(Integer value) {
            addCriterion("ischeck =", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotEqualTo(Integer value) {
            addCriterion("ischeck <>", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThan(Integer value) {
            addCriterion("ischeck >", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("ischeck >=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThan(Integer value) {
            addCriterion("ischeck <", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThanOrEqualTo(Integer value) {
            addCriterion("ischeck <=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckIn(List<Integer> values) {
            addCriterion("ischeck in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotIn(List<Integer> values) {
            addCriterion("ischeck not in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckBetween(Integer value1, Integer value2) {
            addCriterion("ischeck between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotBetween(Integer value1, Integer value2) {
            addCriterion("ischeck not between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIsapproveIsNull() {
            addCriterion("isapprove is null");
            return (Criteria) this;
        }

        public Criteria andIsapproveIsNotNull() {
            addCriterion("isapprove is not null");
            return (Criteria) this;
        }

        public Criteria andIsapproveEqualTo(Integer value) {
            addCriterion("isapprove =", value, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveNotEqualTo(Integer value) {
            addCriterion("isapprove <>", value, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveGreaterThan(Integer value) {
            addCriterion("isapprove >", value, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveGreaterThanOrEqualTo(Integer value) {
            addCriterion("isapprove >=", value, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveLessThan(Integer value) {
            addCriterion("isapprove <", value, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveLessThanOrEqualTo(Integer value) {
            addCriterion("isapprove <=", value, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveIn(List<Integer> values) {
            addCriterion("isapprove in", values, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveNotIn(List<Integer> values) {
            addCriterion("isapprove not in", values, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveBetween(Integer value1, Integer value2) {
            addCriterion("isapprove between", value1, value2, "isapprove");
            return (Criteria) this;
        }

        public Criteria andIsapproveNotBetween(Integer value1, Integer value2) {
            addCriterion("isapprove not between", value1, value2, "isapprove");
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