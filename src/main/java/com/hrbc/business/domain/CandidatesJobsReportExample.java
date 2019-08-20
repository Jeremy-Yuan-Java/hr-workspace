package com.hrbc.business.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CandidatesJobsReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CandidatesJobsReportExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCandidatesIdIsNull() {
            addCriterion("candidates_id is null");
            return (Criteria) this;
        }

        public Criteria andCandidatesIdIsNotNull() {
            addCriterion("candidates_id is not null");
            return (Criteria) this;
        }

        public Criteria andCandidatesIdEqualTo(Integer value) {
            addCriterion("candidates_id =", value, "candidatesId");
            return (Criteria) this;
        }

        public Criteria andCandidatesIdNotEqualTo(Integer value) {
            addCriterion("candidates_id <>", value, "candidatesId");
            return (Criteria) this;
        }

        public Criteria andCandidatesIdGreaterThan(Integer value) {
            addCriterion("candidates_id >", value, "candidatesId");
            return (Criteria) this;
        }

        public Criteria andCandidatesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("candidates_id >=", value, "candidatesId");
            return (Criteria) this;
        }

        public Criteria andCandidatesIdLessThan(Integer value) {
            addCriterion("candidates_id <", value, "candidatesId");
            return (Criteria) this;
        }

        public Criteria andCandidatesIdLessThanOrEqualTo(Integer value) {
            addCriterion("candidates_id <=", value, "candidatesId");
            return (Criteria) this;
        }

        public Criteria andCandidatesIdIn(List<Integer> values) {
            addCriterion("candidates_id in", values, "candidatesId");
            return (Criteria) this;
        }

        public Criteria andCandidatesIdNotIn(List<Integer> values) {
            addCriterion("candidates_id not in", values, "candidatesId");
            return (Criteria) this;
        }

        public Criteria andCandidatesIdBetween(Integer value1, Integer value2) {
            addCriterion("candidates_id between", value1, value2, "candidatesId");
            return (Criteria) this;
        }

        public Criteria andCandidatesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("candidates_id not between", value1, value2, "candidatesId");
            return (Criteria) this;
        }

        public Criteria andReportpathIsNull() {
            addCriterion("reportPath is null");
            return (Criteria) this;
        }

        public Criteria andReportpathIsNotNull() {
            addCriterion("reportPath is not null");
            return (Criteria) this;
        }

        public Criteria andReportpathEqualTo(String value) {
            addCriterion("reportPath =", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathNotEqualTo(String value) {
            addCriterion("reportPath <>", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathGreaterThan(String value) {
            addCriterion("reportPath >", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathGreaterThanOrEqualTo(String value) {
            addCriterion("reportPath >=", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathLessThan(String value) {
            addCriterion("reportPath <", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathLessThanOrEqualTo(String value) {
            addCriterion("reportPath <=", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathLike(String value) {
            addCriterion("reportPath like", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathNotLike(String value) {
            addCriterion("reportPath not like", value, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathIn(List<String> values) {
            addCriterion("reportPath in", values, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathNotIn(List<String> values) {
            addCriterion("reportPath not in", values, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathBetween(String value1, String value2) {
            addCriterion("reportPath between", value1, value2, "reportpath");
            return (Criteria) this;
        }

        public Criteria andReportpathNotBetween(String value1, String value2) {
            addCriterion("reportPath not between", value1, value2, "reportpath");
            return (Criteria) this;
        }

        public Criteria andUploadUseridIsNull() {
            addCriterion("upload_userid is null");
            return (Criteria) this;
        }

        public Criteria andUploadUseridIsNotNull() {
            addCriterion("upload_userid is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUseridEqualTo(Integer value) {
            addCriterion("upload_userid =", value, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridNotEqualTo(Integer value) {
            addCriterion("upload_userid <>", value, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridGreaterThan(Integer value) {
            addCriterion("upload_userid >", value, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("upload_userid >=", value, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridLessThan(Integer value) {
            addCriterion("upload_userid <", value, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridLessThanOrEqualTo(Integer value) {
            addCriterion("upload_userid <=", value, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridIn(List<Integer> values) {
            addCriterion("upload_userid in", values, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridNotIn(List<Integer> values) {
            addCriterion("upload_userid not in", values, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridBetween(Integer value1, Integer value2) {
            addCriterion("upload_userid between", value1, value2, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("upload_userid not between", value1, value2, "uploadUserid");
            return (Criteria) this;
        }

        public Criteria andUploadUsernameIsNull() {
            addCriterion("upload_username is null");
            return (Criteria) this;
        }

        public Criteria andUploadUsernameIsNotNull() {
            addCriterion("upload_username is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUsernameEqualTo(String value) {
            addCriterion("upload_username =", value, "uploadUsername");
            return (Criteria) this;
        }

        public Criteria andUploadUsernameNotEqualTo(String value) {
            addCriterion("upload_username <>", value, "uploadUsername");
            return (Criteria) this;
        }

        public Criteria andUploadUsernameGreaterThan(String value) {
            addCriterion("upload_username >", value, "uploadUsername");
            return (Criteria) this;
        }

        public Criteria andUploadUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("upload_username >=", value, "uploadUsername");
            return (Criteria) this;
        }

        public Criteria andUploadUsernameLessThan(String value) {
            addCriterion("upload_username <", value, "uploadUsername");
            return (Criteria) this;
        }

        public Criteria andUploadUsernameLessThanOrEqualTo(String value) {
            addCriterion("upload_username <=", value, "uploadUsername");
            return (Criteria) this;
        }

        public Criteria andUploadUsernameLike(String value) {
            addCriterion("upload_username like", value, "uploadUsername");
            return (Criteria) this;
        }

        public Criteria andUploadUsernameNotLike(String value) {
            addCriterion("upload_username not like", value, "uploadUsername");
            return (Criteria) this;
        }

        public Criteria andUploadUsernameIn(List<String> values) {
            addCriterion("upload_username in", values, "uploadUsername");
            return (Criteria) this;
        }

        public Criteria andUploadUsernameNotIn(List<String> values) {
            addCriterion("upload_username not in", values, "uploadUsername");
            return (Criteria) this;
        }

        public Criteria andUploadUsernameBetween(String value1, String value2) {
            addCriterion("upload_username between", value1, value2, "uploadUsername");
            return (Criteria) this;
        }

        public Criteria andUploadUsernameNotBetween(String value1, String value2) {
            addCriterion("upload_username not between", value1, value2, "uploadUsername");
            return (Criteria) this;
        }

        public Criteria andUploadUsercnameIsNull() {
            addCriterion("upload_usercname is null");
            return (Criteria) this;
        }

        public Criteria andUploadUsercnameIsNotNull() {
            addCriterion("upload_usercname is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUsercnameEqualTo(String value) {
            addCriterion("upload_usercname =", value, "uploadUsercname");
            return (Criteria) this;
        }

        public Criteria andUploadUsercnameNotEqualTo(String value) {
            addCriterion("upload_usercname <>", value, "uploadUsercname");
            return (Criteria) this;
        }

        public Criteria andUploadUsercnameGreaterThan(String value) {
            addCriterion("upload_usercname >", value, "uploadUsercname");
            return (Criteria) this;
        }

        public Criteria andUploadUsercnameGreaterThanOrEqualTo(String value) {
            addCriterion("upload_usercname >=", value, "uploadUsercname");
            return (Criteria) this;
        }

        public Criteria andUploadUsercnameLessThan(String value) {
            addCriterion("upload_usercname <", value, "uploadUsercname");
            return (Criteria) this;
        }

        public Criteria andUploadUsercnameLessThanOrEqualTo(String value) {
            addCriterion("upload_usercname <=", value, "uploadUsercname");
            return (Criteria) this;
        }

        public Criteria andUploadUsercnameLike(String value) {
            addCriterion("upload_usercname like", value, "uploadUsercname");
            return (Criteria) this;
        }

        public Criteria andUploadUsercnameNotLike(String value) {
            addCriterion("upload_usercname not like", value, "uploadUsercname");
            return (Criteria) this;
        }

        public Criteria andUploadUsercnameIn(List<String> values) {
            addCriterion("upload_usercname in", values, "uploadUsercname");
            return (Criteria) this;
        }

        public Criteria andUploadUsercnameNotIn(List<String> values) {
            addCriterion("upload_usercname not in", values, "uploadUsercname");
            return (Criteria) this;
        }

        public Criteria andUploadUsercnameBetween(String value1, String value2) {
            addCriterion("upload_usercname between", value1, value2, "uploadUsercname");
            return (Criteria) this;
        }

        public Criteria andUploadUsercnameNotBetween(String value1, String value2) {
            addCriterion("upload_usercname not between", value1, value2, "uploadUsercname");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andBackup1IsNull() {
            addCriterion("backup1 is null");
            return (Criteria) this;
        }

        public Criteria andBackup1IsNotNull() {
            addCriterion("backup1 is not null");
            return (Criteria) this;
        }

        public Criteria andBackup1EqualTo(String value) {
            addCriterion("backup1 =", value, "backup1");
            return (Criteria) this;
        }

        public Criteria andBackup1NotEqualTo(String value) {
            addCriterion("backup1 <>", value, "backup1");
            return (Criteria) this;
        }

        public Criteria andBackup1GreaterThan(String value) {
            addCriterion("backup1 >", value, "backup1");
            return (Criteria) this;
        }

        public Criteria andBackup1GreaterThanOrEqualTo(String value) {
            addCriterion("backup1 >=", value, "backup1");
            return (Criteria) this;
        }

        public Criteria andBackup1LessThan(String value) {
            addCriterion("backup1 <", value, "backup1");
            return (Criteria) this;
        }

        public Criteria andBackup1LessThanOrEqualTo(String value) {
            addCriterion("backup1 <=", value, "backup1");
            return (Criteria) this;
        }

        public Criteria andBackup1Like(String value) {
            addCriterion("backup1 like", value, "backup1");
            return (Criteria) this;
        }

        public Criteria andBackup1NotLike(String value) {
            addCriterion("backup1 not like", value, "backup1");
            return (Criteria) this;
        }

        public Criteria andBackup1In(List<String> values) {
            addCriterion("backup1 in", values, "backup1");
            return (Criteria) this;
        }

        public Criteria andBackup1NotIn(List<String> values) {
            addCriterion("backup1 not in", values, "backup1");
            return (Criteria) this;
        }

        public Criteria andBackup1Between(String value1, String value2) {
            addCriterion("backup1 between", value1, value2, "backup1");
            return (Criteria) this;
        }

        public Criteria andBackup1NotBetween(String value1, String value2) {
            addCriterion("backup1 not between", value1, value2, "backup1");
            return (Criteria) this;
        }

        public Criteria andBackup2IsNull() {
            addCriterion("backup2 is null");
            return (Criteria) this;
        }

        public Criteria andBackup2IsNotNull() {
            addCriterion("backup2 is not null");
            return (Criteria) this;
        }

        public Criteria andBackup2EqualTo(String value) {
            addCriterion("backup2 =", value, "backup2");
            return (Criteria) this;
        }

        public Criteria andBackup2NotEqualTo(String value) {
            addCriterion("backup2 <>", value, "backup2");
            return (Criteria) this;
        }

        public Criteria andBackup2GreaterThan(String value) {
            addCriterion("backup2 >", value, "backup2");
            return (Criteria) this;
        }

        public Criteria andBackup2GreaterThanOrEqualTo(String value) {
            addCriterion("backup2 >=", value, "backup2");
            return (Criteria) this;
        }

        public Criteria andBackup2LessThan(String value) {
            addCriterion("backup2 <", value, "backup2");
            return (Criteria) this;
        }

        public Criteria andBackup2LessThanOrEqualTo(String value) {
            addCriterion("backup2 <=", value, "backup2");
            return (Criteria) this;
        }

        public Criteria andBackup2Like(String value) {
            addCriterion("backup2 like", value, "backup2");
            return (Criteria) this;
        }

        public Criteria andBackup2NotLike(String value) {
            addCriterion("backup2 not like", value, "backup2");
            return (Criteria) this;
        }

        public Criteria andBackup2In(List<String> values) {
            addCriterion("backup2 in", values, "backup2");
            return (Criteria) this;
        }

        public Criteria andBackup2NotIn(List<String> values) {
            addCriterion("backup2 not in", values, "backup2");
            return (Criteria) this;
        }

        public Criteria andBackup2Between(String value1, String value2) {
            addCriterion("backup2 between", value1, value2, "backup2");
            return (Criteria) this;
        }

        public Criteria andBackup2NotBetween(String value1, String value2) {
            addCriterion("backup2 not between", value1, value2, "backup2");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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