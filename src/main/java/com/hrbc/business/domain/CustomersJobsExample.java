package com.hrbc.business.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomersJobsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CustomersJobsExample() {
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

        public Criteria andJobresourceIsNull() {
            addCriterion("jobresource is null");
            return (Criteria) this;
        }

        public Criteria andJobresourceIsNotNull() {
            addCriterion("jobresource is not null");
            return (Criteria) this;
        }

        public Criteria andJobresourceEqualTo(String value) {
            addCriterion("jobresource =", value, "jobresource");
            return (Criteria) this;
        }

        public Criteria andJobresourceNotEqualTo(String value) {
            addCriterion("jobresource <>", value, "jobresource");
            return (Criteria) this;
        }

        public Criteria andJobresourceGreaterThan(String value) {
            addCriterion("jobresource >", value, "jobresource");
            return (Criteria) this;
        }

        public Criteria andJobresourceGreaterThanOrEqualTo(String value) {
            addCriterion("jobresource >=", value, "jobresource");
            return (Criteria) this;
        }

        public Criteria andJobresourceLessThan(String value) {
            addCriterion("jobresource <", value, "jobresource");
            return (Criteria) this;
        }

        public Criteria andJobresourceLessThanOrEqualTo(String value) {
            addCriterion("jobresource <=", value, "jobresource");
            return (Criteria) this;
        }

        public Criteria andJobresourceLike(String value) {
            addCriterion("jobresource like", value, "jobresource");
            return (Criteria) this;
        }

        public Criteria andJobresourceNotLike(String value) {
            addCriterion("jobresource not like", value, "jobresource");
            return (Criteria) this;
        }

        public Criteria andJobresourceIn(List<String> values) {
            addCriterion("jobresource in", values, "jobresource");
            return (Criteria) this;
        }

        public Criteria andJobresourceNotIn(List<String> values) {
            addCriterion("jobresource not in", values, "jobresource");
            return (Criteria) this;
        }

        public Criteria andJobresourceBetween(String value1, String value2) {
            addCriterion("jobresource between", value1, value2, "jobresource");
            return (Criteria) this;
        }

        public Criteria andJobresourceNotBetween(String value1, String value2) {
            addCriterion("jobresource not between", value1, value2, "jobresource");
            return (Criteria) this;
        }

        public Criteria andJobstateIsNull() {
            addCriterion("jobstate is null");
            return (Criteria) this;
        }

        public Criteria andJobstateIsNotNull() {
            addCriterion("jobstate is not null");
            return (Criteria) this;
        }

        public Criteria andJobstateEqualTo(String value) {
            addCriterion("jobstate =", value, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateNotEqualTo(String value) {
            addCriterion("jobstate <>", value, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateGreaterThan(String value) {
            addCriterion("jobstate >", value, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateGreaterThanOrEqualTo(String value) {
            addCriterion("jobstate >=", value, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateLessThan(String value) {
            addCriterion("jobstate <", value, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateLessThanOrEqualTo(String value) {
            addCriterion("jobstate <=", value, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateLike(String value) {
            addCriterion("jobstate like", value, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateNotLike(String value) {
            addCriterion("jobstate not like", value, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateIn(List<String> values) {
            addCriterion("jobstate in", values, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateNotIn(List<String> values) {
            addCriterion("jobstate not in", values, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateBetween(String value1, String value2) {
            addCriterion("jobstate between", value1, value2, "jobstate");
            return (Criteria) this;
        }

        public Criteria andJobstateNotBetween(String value1, String value2) {
            addCriterion("jobstate not between", value1, value2, "jobstate");
            return (Criteria) this;
        }

        public Criteria andOpsteamIsNull() {
            addCriterion("opsteam is null");
            return (Criteria) this;
        }

        public Criteria andOpsteamIsNotNull() {
            addCriterion("opsteam is not null");
            return (Criteria) this;
        }

        public Criteria andOpsteamEqualTo(String value) {
            addCriterion("opsteam =", value, "opsteam");
            return (Criteria) this;
        }

        public Criteria andOpsteamNotEqualTo(String value) {
            addCriterion("opsteam <>", value, "opsteam");
            return (Criteria) this;
        }

        public Criteria andOpsteamGreaterThan(String value) {
            addCriterion("opsteam >", value, "opsteam");
            return (Criteria) this;
        }

        public Criteria andOpsteamGreaterThanOrEqualTo(String value) {
            addCriterion("opsteam >=", value, "opsteam");
            return (Criteria) this;
        }

        public Criteria andOpsteamLessThan(String value) {
            addCriterion("opsteam <", value, "opsteam");
            return (Criteria) this;
        }

        public Criteria andOpsteamLessThanOrEqualTo(String value) {
            addCriterion("opsteam <=", value, "opsteam");
            return (Criteria) this;
        }

        public Criteria andOpsteamLike(String value) {
            addCriterion("opsteam like", value, "opsteam");
            return (Criteria) this;
        }

        public Criteria andOpsteamNotLike(String value) {
            addCriterion("opsteam not like", value, "opsteam");
            return (Criteria) this;
        }

        public Criteria andOpsteamIn(List<String> values) {
            addCriterion("opsteam in", values, "opsteam");
            return (Criteria) this;
        }

        public Criteria andOpsteamNotIn(List<String> values) {
            addCriterion("opsteam not in", values, "opsteam");
            return (Criteria) this;
        }

        public Criteria andOpsteamBetween(String value1, String value2) {
            addCriterion("opsteam between", value1, value2, "opsteam");
            return (Criteria) this;
        }

        public Criteria andOpsteamNotBetween(String value1, String value2) {
            addCriterion("opsteam not between", value1, value2, "opsteam");
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

        public Criteria andOpuserEqualTo(String value) {
            addCriterion("opuser =", value, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserNotEqualTo(String value) {
            addCriterion("opuser <>", value, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserGreaterThan(String value) {
            addCriterion("opuser >", value, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserGreaterThanOrEqualTo(String value) {
            addCriterion("opuser >=", value, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserLessThan(String value) {
            addCriterion("opuser <", value, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserLessThanOrEqualTo(String value) {
            addCriterion("opuser <=", value, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserLike(String value) {
            addCriterion("opuser like", value, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserNotLike(String value) {
            addCriterion("opuser not like", value, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserIn(List<String> values) {
            addCriterion("opuser in", values, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserNotIn(List<String> values) {
            addCriterion("opuser not in", values, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserBetween(String value1, String value2) {
            addCriterion("opuser between", value1, value2, "opuser");
            return (Criteria) this;
        }

        public Criteria andOpuserNotBetween(String value1, String value2) {
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

        public Criteria andHardkpiIsNull() {
            addCriterion("hardkpi is null");
            return (Criteria) this;
        }

        public Criteria andHardkpiIsNotNull() {
            addCriterion("hardkpi is not null");
            return (Criteria) this;
        }

        public Criteria andHardkpiEqualTo(String value) {
            addCriterion("hardkpi =", value, "hardkpi");
            return (Criteria) this;
        }

        public Criteria andHardkpiNotEqualTo(String value) {
            addCriterion("hardkpi <>", value, "hardkpi");
            return (Criteria) this;
        }

        public Criteria andHardkpiGreaterThan(String value) {
            addCriterion("hardkpi >", value, "hardkpi");
            return (Criteria) this;
        }

        public Criteria andHardkpiGreaterThanOrEqualTo(String value) {
            addCriterion("hardkpi >=", value, "hardkpi");
            return (Criteria) this;
        }

        public Criteria andHardkpiLessThan(String value) {
            addCriterion("hardkpi <", value, "hardkpi");
            return (Criteria) this;
        }

        public Criteria andHardkpiLessThanOrEqualTo(String value) {
            addCriterion("hardkpi <=", value, "hardkpi");
            return (Criteria) this;
        }

        public Criteria andHardkpiLike(String value) {
            addCriterion("hardkpi like", value, "hardkpi");
            return (Criteria) this;
        }

        public Criteria andHardkpiNotLike(String value) {
            addCriterion("hardkpi not like", value, "hardkpi");
            return (Criteria) this;
        }

        public Criteria andHardkpiIn(List<String> values) {
            addCriterion("hardkpi in", values, "hardkpi");
            return (Criteria) this;
        }

        public Criteria andHardkpiNotIn(List<String> values) {
            addCriterion("hardkpi not in", values, "hardkpi");
            return (Criteria) this;
        }

        public Criteria andHardkpiBetween(String value1, String value2) {
            addCriterion("hardkpi between", value1, value2, "hardkpi");
            return (Criteria) this;
        }

        public Criteria andHardkpiNotBetween(String value1, String value2) {
            addCriterion("hardkpi not between", value1, value2, "hardkpi");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("dept like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("dept not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("dept not between", value1, value2, "dept");
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

        public Criteria andContactuserIsNull() {
            addCriterion("contactuser is null");
            return (Criteria) this;
        }

        public Criteria andContactuserIsNotNull() {
            addCriterion("contactuser is not null");
            return (Criteria) this;
        }

        public Criteria andContactuserEqualTo(String value) {
            addCriterion("contactuser =", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserNotEqualTo(String value) {
            addCriterion("contactuser <>", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserGreaterThan(String value) {
            addCriterion("contactuser >", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserGreaterThanOrEqualTo(String value) {
            addCriterion("contactuser >=", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserLessThan(String value) {
            addCriterion("contactuser <", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserLessThanOrEqualTo(String value) {
            addCriterion("contactuser <=", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserLike(String value) {
            addCriterion("contactuser like", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserNotLike(String value) {
            addCriterion("contactuser not like", value, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserIn(List<String> values) {
            addCriterion("contactuser in", values, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserNotIn(List<String> values) {
            addCriterion("contactuser not in", values, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserBetween(String value1, String value2) {
            addCriterion("contactuser between", value1, value2, "contactuser");
            return (Criteria) this;
        }

        public Criteria andContactuserNotBetween(String value1, String value2) {
            addCriterion("contactuser not between", value1, value2, "contactuser");
            return (Criteria) this;
        }

        public Criteria andPhonenoIsNull() {
            addCriterion("phoneno is null");
            return (Criteria) this;
        }

        public Criteria andPhonenoIsNotNull() {
            addCriterion("phoneno is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenoEqualTo(String value) {
            addCriterion("phoneno =", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotEqualTo(String value) {
            addCriterion("phoneno <>", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoGreaterThan(String value) {
            addCriterion("phoneno >", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoGreaterThanOrEqualTo(String value) {
            addCriterion("phoneno >=", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLessThan(String value) {
            addCriterion("phoneno <", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLessThanOrEqualTo(String value) {
            addCriterion("phoneno <=", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLike(String value) {
            addCriterion("phoneno like", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotLike(String value) {
            addCriterion("phoneno not like", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoIn(List<String> values) {
            addCriterion("phoneno in", values, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotIn(List<String> values) {
            addCriterion("phoneno not in", values, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoBetween(String value1, String value2) {
            addCriterion("phoneno between", value1, value2, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotBetween(String value1, String value2) {
            addCriterion("phoneno not between", value1, value2, "phoneno");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andJobtitleIsNull() {
            addCriterion("jobtitle is null");
            return (Criteria) this;
        }

        public Criteria andJobtitleIsNotNull() {
            addCriterion("jobtitle is not null");
            return (Criteria) this;
        }

        public Criteria andJobtitleEqualTo(String value) {
            addCriterion("jobtitle =", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotEqualTo(String value) {
            addCriterion("jobtitle <>", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleGreaterThan(String value) {
            addCriterion("jobtitle >", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleGreaterThanOrEqualTo(String value) {
            addCriterion("jobtitle >=", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLessThan(String value) {
            addCriterion("jobtitle <", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLessThanOrEqualTo(String value) {
            addCriterion("jobtitle <=", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleLike(String value) {
            addCriterion("jobtitle like", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotLike(String value) {
            addCriterion("jobtitle not like", value, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleIn(List<String> values) {
            addCriterion("jobtitle in", values, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotIn(List<String> values) {
            addCriterion("jobtitle not in", values, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleBetween(String value1, String value2) {
            addCriterion("jobtitle between", value1, value2, "jobtitle");
            return (Criteria) this;
        }

        public Criteria andJobtitleNotBetween(String value1, String value2) {
            addCriterion("jobtitle not between", value1, value2, "jobtitle");
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

        public Criteria andMajoridIsNull() {
            addCriterion("majorid is null");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNotNull() {
            addCriterion("majorid is not null");
            return (Criteria) this;
        }

        public Criteria andMajoridEqualTo(Integer value) {
            addCriterion("majorid =", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotEqualTo(Integer value) {
            addCriterion("majorid <>", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThan(Integer value) {
            addCriterion("majorid >", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("majorid >=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThan(Integer value) {
            addCriterion("majorid <", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThanOrEqualTo(Integer value) {
            addCriterion("majorid <=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridIn(List<Integer> values) {
            addCriterion("majorid in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotIn(List<Integer> values) {
            addCriterion("majorid not in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridBetween(Integer value1, Integer value2) {
            addCriterion("majorid between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotBetween(Integer value1, Integer value2) {
            addCriterion("majorid not between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajordescIsNull() {
            addCriterion("majordesc is null");
            return (Criteria) this;
        }

        public Criteria andMajordescIsNotNull() {
            addCriterion("majordesc is not null");
            return (Criteria) this;
        }

        public Criteria andMajordescEqualTo(String value) {
            addCriterion("majordesc =", value, "majordesc");
            return (Criteria) this;
        }

        public Criteria andMajordescNotEqualTo(String value) {
            addCriterion("majordesc <>", value, "majordesc");
            return (Criteria) this;
        }

        public Criteria andMajordescGreaterThan(String value) {
            addCriterion("majordesc >", value, "majordesc");
            return (Criteria) this;
        }

        public Criteria andMajordescGreaterThanOrEqualTo(String value) {
            addCriterion("majordesc >=", value, "majordesc");
            return (Criteria) this;
        }

        public Criteria andMajordescLessThan(String value) {
            addCriterion("majordesc <", value, "majordesc");
            return (Criteria) this;
        }

        public Criteria andMajordescLessThanOrEqualTo(String value) {
            addCriterion("majordesc <=", value, "majordesc");
            return (Criteria) this;
        }

        public Criteria andMajordescLike(String value) {
            addCriterion("majordesc like", value, "majordesc");
            return (Criteria) this;
        }

        public Criteria andMajordescNotLike(String value) {
            addCriterion("majordesc not like", value, "majordesc");
            return (Criteria) this;
        }

        public Criteria andMajordescIn(List<String> values) {
            addCriterion("majordesc in", values, "majordesc");
            return (Criteria) this;
        }

        public Criteria andMajordescNotIn(List<String> values) {
            addCriterion("majordesc not in", values, "majordesc");
            return (Criteria) this;
        }

        public Criteria andMajordescBetween(String value1, String value2) {
            addCriterion("majordesc between", value1, value2, "majordesc");
            return (Criteria) this;
        }

        public Criteria andMajordescNotBetween(String value1, String value2) {
            addCriterion("majordesc not between", value1, value2, "majordesc");
            return (Criteria) this;
        }

        public Criteria andMajorid2IsNull() {
            addCriterion("majorid2 is null");
            return (Criteria) this;
        }

        public Criteria andMajorid2IsNotNull() {
            addCriterion("majorid2 is not null");
            return (Criteria) this;
        }

        public Criteria andMajorid2EqualTo(Integer value) {
            addCriterion("majorid2 =", value, "majorid2");
            return (Criteria) this;
        }

        public Criteria andMajorid2NotEqualTo(Integer value) {
            addCriterion("majorid2 <>", value, "majorid2");
            return (Criteria) this;
        }

        public Criteria andMajorid2GreaterThan(Integer value) {
            addCriterion("majorid2 >", value, "majorid2");
            return (Criteria) this;
        }

        public Criteria andMajorid2GreaterThanOrEqualTo(Integer value) {
            addCriterion("majorid2 >=", value, "majorid2");
            return (Criteria) this;
        }

        public Criteria andMajorid2LessThan(Integer value) {
            addCriterion("majorid2 <", value, "majorid2");
            return (Criteria) this;
        }

        public Criteria andMajorid2LessThanOrEqualTo(Integer value) {
            addCriterion("majorid2 <=", value, "majorid2");
            return (Criteria) this;
        }

        public Criteria andMajorid2In(List<Integer> values) {
            addCriterion("majorid2 in", values, "majorid2");
            return (Criteria) this;
        }

        public Criteria andMajorid2NotIn(List<Integer> values) {
            addCriterion("majorid2 not in", values, "majorid2");
            return (Criteria) this;
        }

        public Criteria andMajorid2Between(Integer value1, Integer value2) {
            addCriterion("majorid2 between", value1, value2, "majorid2");
            return (Criteria) this;
        }

        public Criteria andMajorid2NotBetween(Integer value1, Integer value2) {
            addCriterion("majorid2 not between", value1, value2, "majorid2");
            return (Criteria) this;
        }

        public Criteria andMajordesc2IsNull() {
            addCriterion("majordesc2 is null");
            return (Criteria) this;
        }

        public Criteria andMajordesc2IsNotNull() {
            addCriterion("majordesc2 is not null");
            return (Criteria) this;
        }

        public Criteria andMajordesc2EqualTo(String value) {
            addCriterion("majordesc2 =", value, "majordesc2");
            return (Criteria) this;
        }

        public Criteria andMajordesc2NotEqualTo(String value) {
            addCriterion("majordesc2 <>", value, "majordesc2");
            return (Criteria) this;
        }

        public Criteria andMajordesc2GreaterThan(String value) {
            addCriterion("majordesc2 >", value, "majordesc2");
            return (Criteria) this;
        }

        public Criteria andMajordesc2GreaterThanOrEqualTo(String value) {
            addCriterion("majordesc2 >=", value, "majordesc2");
            return (Criteria) this;
        }

        public Criteria andMajordesc2LessThan(String value) {
            addCriterion("majordesc2 <", value, "majordesc2");
            return (Criteria) this;
        }

        public Criteria andMajordesc2LessThanOrEqualTo(String value) {
            addCriterion("majordesc2 <=", value, "majordesc2");
            return (Criteria) this;
        }

        public Criteria andMajordesc2Like(String value) {
            addCriterion("majordesc2 like", value, "majordesc2");
            return (Criteria) this;
        }

        public Criteria andMajordesc2NotLike(String value) {
            addCriterion("majordesc2 not like", value, "majordesc2");
            return (Criteria) this;
        }

        public Criteria andMajordesc2In(List<String> values) {
            addCriterion("majordesc2 in", values, "majordesc2");
            return (Criteria) this;
        }

        public Criteria andMajordesc2NotIn(List<String> values) {
            addCriterion("majordesc2 not in", values, "majordesc2");
            return (Criteria) this;
        }

        public Criteria andMajordesc2Between(String value1, String value2) {
            addCriterion("majordesc2 between", value1, value2, "majordesc2");
            return (Criteria) this;
        }

        public Criteria andMajordesc2NotBetween(String value1, String value2) {
            addCriterion("majordesc2 not between", value1, value2, "majordesc2");
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

        public Criteria andSalaryEqualTo(Integer value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Integer value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Integer value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Integer value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Integer> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Integer> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Integer value1, Integer value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryminIsNull() {
            addCriterion("salarymin is null");
            return (Criteria) this;
        }

        public Criteria andSalaryminIsNotNull() {
            addCriterion("salarymin is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryminEqualTo(Integer value) {
            addCriterion("salarymin =", value, "salarymin");
            return (Criteria) this;
        }

        public Criteria andSalaryminNotEqualTo(Integer value) {
            addCriterion("salarymin <>", value, "salarymin");
            return (Criteria) this;
        }

        public Criteria andSalaryminGreaterThan(Integer value) {
            addCriterion("salarymin >", value, "salarymin");
            return (Criteria) this;
        }

        public Criteria andSalaryminGreaterThanOrEqualTo(Integer value) {
            addCriterion("salarymin >=", value, "salarymin");
            return (Criteria) this;
        }

        public Criteria andSalaryminLessThan(Integer value) {
            addCriterion("salarymin <", value, "salarymin");
            return (Criteria) this;
        }

        public Criteria andSalaryminLessThanOrEqualTo(Integer value) {
            addCriterion("salarymin <=", value, "salarymin");
            return (Criteria) this;
        }

        public Criteria andSalaryminIn(List<Integer> values) {
            addCriterion("salarymin in", values, "salarymin");
            return (Criteria) this;
        }

        public Criteria andSalaryminNotIn(List<Integer> values) {
            addCriterion("salarymin not in", values, "salarymin");
            return (Criteria) this;
        }

        public Criteria andSalaryminBetween(Integer value1, Integer value2) {
            addCriterion("salarymin between", value1, value2, "salarymin");
            return (Criteria) this;
        }

        public Criteria andSalaryminNotBetween(Integer value1, Integer value2) {
            addCriterion("salarymin not between", value1, value2, "salarymin");
            return (Criteria) this;
        }

        public Criteria andSalarymaxIsNull() {
            addCriterion("salarymax is null");
            return (Criteria) this;
        }

        public Criteria andSalarymaxIsNotNull() {
            addCriterion("salarymax is not null");
            return (Criteria) this;
        }

        public Criteria andSalarymaxEqualTo(Integer value) {
            addCriterion("salarymax =", value, "salarymax");
            return (Criteria) this;
        }

        public Criteria andSalarymaxNotEqualTo(Integer value) {
            addCriterion("salarymax <>", value, "salarymax");
            return (Criteria) this;
        }

        public Criteria andSalarymaxGreaterThan(Integer value) {
            addCriterion("salarymax >", value, "salarymax");
            return (Criteria) this;
        }

        public Criteria andSalarymaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("salarymax >=", value, "salarymax");
            return (Criteria) this;
        }

        public Criteria andSalarymaxLessThan(Integer value) {
            addCriterion("salarymax <", value, "salarymax");
            return (Criteria) this;
        }

        public Criteria andSalarymaxLessThanOrEqualTo(Integer value) {
            addCriterion("salarymax <=", value, "salarymax");
            return (Criteria) this;
        }

        public Criteria andSalarymaxIn(List<Integer> values) {
            addCriterion("salarymax in", values, "salarymax");
            return (Criteria) this;
        }

        public Criteria andSalarymaxNotIn(List<Integer> values) {
            addCriterion("salarymax not in", values, "salarymax");
            return (Criteria) this;
        }

        public Criteria andSalarymaxBetween(Integer value1, Integer value2) {
            addCriterion("salarymax between", value1, value2, "salarymax");
            return (Criteria) this;
        }

        public Criteria andSalarymaxNotBetween(Integer value1, Integer value2) {
            addCriterion("salarymax not between", value1, value2, "salarymax");
            return (Criteria) this;
        }

        public Criteria andWorkbaseIsNull() {
            addCriterion("workbase is null");
            return (Criteria) this;
        }

        public Criteria andWorkbaseIsNotNull() {
            addCriterion("workbase is not null");
            return (Criteria) this;
        }

        public Criteria andWorkbaseEqualTo(String value) {
            addCriterion("workbase =", value, "workbase");
            return (Criteria) this;
        }

        public Criteria andWorkbaseNotEqualTo(String value) {
            addCriterion("workbase <>", value, "workbase");
            return (Criteria) this;
        }

        public Criteria andWorkbaseGreaterThan(String value) {
            addCriterion("workbase >", value, "workbase");
            return (Criteria) this;
        }

        public Criteria andWorkbaseGreaterThanOrEqualTo(String value) {
            addCriterion("workbase >=", value, "workbase");
            return (Criteria) this;
        }

        public Criteria andWorkbaseLessThan(String value) {
            addCriterion("workbase <", value, "workbase");
            return (Criteria) this;
        }

        public Criteria andWorkbaseLessThanOrEqualTo(String value) {
            addCriterion("workbase <=", value, "workbase");
            return (Criteria) this;
        }

        public Criteria andWorkbaseLike(String value) {
            addCriterion("workbase like", value, "workbase");
            return (Criteria) this;
        }

        public Criteria andWorkbaseNotLike(String value) {
            addCriterion("workbase not like", value, "workbase");
            return (Criteria) this;
        }

        public Criteria andWorkbaseIn(List<String> values) {
            addCriterion("workbase in", values, "workbase");
            return (Criteria) this;
        }

        public Criteria andWorkbaseNotIn(List<String> values) {
            addCriterion("workbase not in", values, "workbase");
            return (Criteria) this;
        }

        public Criteria andWorkbaseBetween(String value1, String value2) {
            addCriterion("workbase between", value1, value2, "workbase");
            return (Criteria) this;
        }

        public Criteria andWorkbaseNotBetween(String value1, String value2) {
            addCriterion("workbase not between", value1, value2, "workbase");
            return (Criteria) this;
        }

        public Criteria andExpectcompanyIsNull() {
            addCriterion("expectcompany is null");
            return (Criteria) this;
        }

        public Criteria andExpectcompanyIsNotNull() {
            addCriterion("expectcompany is not null");
            return (Criteria) this;
        }

        public Criteria andExpectcompanyEqualTo(String value) {
            addCriterion("expectcompany =", value, "expectcompany");
            return (Criteria) this;
        }

        public Criteria andExpectcompanyNotEqualTo(String value) {
            addCriterion("expectcompany <>", value, "expectcompany");
            return (Criteria) this;
        }

        public Criteria andExpectcompanyGreaterThan(String value) {
            addCriterion("expectcompany >", value, "expectcompany");
            return (Criteria) this;
        }

        public Criteria andExpectcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("expectcompany >=", value, "expectcompany");
            return (Criteria) this;
        }

        public Criteria andExpectcompanyLessThan(String value) {
            addCriterion("expectcompany <", value, "expectcompany");
            return (Criteria) this;
        }

        public Criteria andExpectcompanyLessThanOrEqualTo(String value) {
            addCriterion("expectcompany <=", value, "expectcompany");
            return (Criteria) this;
        }

        public Criteria andExpectcompanyLike(String value) {
            addCriterion("expectcompany like", value, "expectcompany");
            return (Criteria) this;
        }

        public Criteria andExpectcompanyNotLike(String value) {
            addCriterion("expectcompany not like", value, "expectcompany");
            return (Criteria) this;
        }

        public Criteria andExpectcompanyIn(List<String> values) {
            addCriterion("expectcompany in", values, "expectcompany");
            return (Criteria) this;
        }

        public Criteria andExpectcompanyNotIn(List<String> values) {
            addCriterion("expectcompany not in", values, "expectcompany");
            return (Criteria) this;
        }

        public Criteria andExpectcompanyBetween(String value1, String value2) {
            addCriterion("expectcompany between", value1, value2, "expectcompany");
            return (Criteria) this;
        }

        public Criteria andExpectcompanyNotBetween(String value1, String value2) {
            addCriterion("expectcompany not between", value1, value2, "expectcompany");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
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

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishtime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishtime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(Date value) {
            addCriterion("publishtime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(Date value) {
            addCriterion("publishtime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(Date value) {
            addCriterion("publishtime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publishtime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(Date value) {
            addCriterion("publishtime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("publishtime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<Date> values) {
            addCriterion("publishtime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<Date> values) {
            addCriterion("publishtime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(Date value1, Date value2) {
            addCriterion("publishtime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("publishtime not between", value1, value2, "publishtime");
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