package com.hrbc.business.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TrainDataExample() {
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

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNull() {
            addCriterion("file_url is null");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNotNull() {
            addCriterion("file_url is not null");
            return (Criteria) this;
        }

        public Criteria andFileUrlEqualTo(String value) {
            addCriterion("file_url =", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotEqualTo(String value) {
            addCriterion("file_url <>", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThan(String value) {
            addCriterion("file_url >", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("file_url >=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThan(String value) {
            addCriterion("file_url <", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThanOrEqualTo(String value) {
            addCriterion("file_url <=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLike(String value) {
            addCriterion("file_url like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotLike(String value) {
            addCriterion("file_url not like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlIn(List<String> values) {
            addCriterion("file_url in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotIn(List<String> values) {
            addCriterion("file_url not in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlBetween(String value1, String value2) {
            addCriterion("file_url between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotBetween(String value1, String value2) {
            addCriterion("file_url not between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("file_type =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("file_type <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("file_type >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("file_type >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("file_type <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("file_type <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("file_type like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("file_type not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("file_type in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("file_type not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andAuthcUserIsNull() {
            addCriterion("authc_user is null");
            return (Criteria) this;
        }

        public Criteria andAuthcUserIsNotNull() {
            addCriterion("authc_user is not null");
            return (Criteria) this;
        }

        public Criteria andAuthcUserEqualTo(String value) {
            addCriterion("authc_user =", value, "authcUser");
            return (Criteria) this;
        }

        public Criteria andAuthcUserNotEqualTo(String value) {
            addCriterion("authc_user <>", value, "authcUser");
            return (Criteria) this;
        }

        public Criteria andAuthcUserGreaterThan(String value) {
            addCriterion("authc_user >", value, "authcUser");
            return (Criteria) this;
        }

        public Criteria andAuthcUserGreaterThanOrEqualTo(String value) {
            addCriterion("authc_user >=", value, "authcUser");
            return (Criteria) this;
        }

        public Criteria andAuthcUserLessThan(String value) {
            addCriterion("authc_user <", value, "authcUser");
            return (Criteria) this;
        }

        public Criteria andAuthcUserLessThanOrEqualTo(String value) {
            addCriterion("authc_user <=", value, "authcUser");
            return (Criteria) this;
        }

        public Criteria andAuthcUserLike(String value) {
            addCriterion("authc_user like", value, "authcUser");
            return (Criteria) this;
        }

        public Criteria andAuthcUserNotLike(String value) {
            addCriterion("authc_user not like", value, "authcUser");
            return (Criteria) this;
        }

        public Criteria andAuthcUserIn(List<String> values) {
            addCriterion("authc_user in", values, "authcUser");
            return (Criteria) this;
        }

        public Criteria andAuthcUserNotIn(List<String> values) {
            addCriterion("authc_user not in", values, "authcUser");
            return (Criteria) this;
        }

        public Criteria andAuthcUserBetween(String value1, String value2) {
            addCriterion("authc_user between", value1, value2, "authcUser");
            return (Criteria) this;
        }

        public Criteria andAuthcUserNotBetween(String value1, String value2) {
            addCriterion("authc_user not between", value1, value2, "authcUser");
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

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andBacki1IsNull() {
            addCriterion("backi1 is null");
            return (Criteria) this;
        }

        public Criteria andBacki1IsNotNull() {
            addCriterion("backi1 is not null");
            return (Criteria) this;
        }

        public Criteria andBacki1EqualTo(Integer value) {
            addCriterion("backi1 =", value, "backi1");
            return (Criteria) this;
        }

        public Criteria andBacki1NotEqualTo(Integer value) {
            addCriterion("backi1 <>", value, "backi1");
            return (Criteria) this;
        }

        public Criteria andBacki1GreaterThan(Integer value) {
            addCriterion("backi1 >", value, "backi1");
            return (Criteria) this;
        }

        public Criteria andBacki1GreaterThanOrEqualTo(Integer value) {
            addCriterion("backi1 >=", value, "backi1");
            return (Criteria) this;
        }

        public Criteria andBacki1LessThan(Integer value) {
            addCriterion("backi1 <", value, "backi1");
            return (Criteria) this;
        }

        public Criteria andBacki1LessThanOrEqualTo(Integer value) {
            addCriterion("backi1 <=", value, "backi1");
            return (Criteria) this;
        }

        public Criteria andBacki1In(List<Integer> values) {
            addCriterion("backi1 in", values, "backi1");
            return (Criteria) this;
        }

        public Criteria andBacki1NotIn(List<Integer> values) {
            addCriterion("backi1 not in", values, "backi1");
            return (Criteria) this;
        }

        public Criteria andBacki1Between(Integer value1, Integer value2) {
            addCriterion("backi1 between", value1, value2, "backi1");
            return (Criteria) this;
        }

        public Criteria andBacki1NotBetween(Integer value1, Integer value2) {
            addCriterion("backi1 not between", value1, value2, "backi1");
            return (Criteria) this;
        }

        public Criteria andBacki2IsNull() {
            addCriterion("backi2 is null");
            return (Criteria) this;
        }

        public Criteria andBacki2IsNotNull() {
            addCriterion("backi2 is not null");
            return (Criteria) this;
        }

        public Criteria andBacki2EqualTo(Integer value) {
            addCriterion("backi2 =", value, "backi2");
            return (Criteria) this;
        }

        public Criteria andBacki2NotEqualTo(Integer value) {
            addCriterion("backi2 <>", value, "backi2");
            return (Criteria) this;
        }

        public Criteria andBacki2GreaterThan(Integer value) {
            addCriterion("backi2 >", value, "backi2");
            return (Criteria) this;
        }

        public Criteria andBacki2GreaterThanOrEqualTo(Integer value) {
            addCriterion("backi2 >=", value, "backi2");
            return (Criteria) this;
        }

        public Criteria andBacki2LessThan(Integer value) {
            addCriterion("backi2 <", value, "backi2");
            return (Criteria) this;
        }

        public Criteria andBacki2LessThanOrEqualTo(Integer value) {
            addCriterion("backi2 <=", value, "backi2");
            return (Criteria) this;
        }

        public Criteria andBacki2In(List<Integer> values) {
            addCriterion("backi2 in", values, "backi2");
            return (Criteria) this;
        }

        public Criteria andBacki2NotIn(List<Integer> values) {
            addCriterion("backi2 not in", values, "backi2");
            return (Criteria) this;
        }

        public Criteria andBacki2Between(Integer value1, Integer value2) {
            addCriterion("backi2 between", value1, value2, "backi2");
            return (Criteria) this;
        }

        public Criteria andBacki2NotBetween(Integer value1, Integer value2) {
            addCriterion("backi2 not between", value1, value2, "backi2");
            return (Criteria) this;
        }

        public Criteria andBacki3IsNull() {
            addCriterion("backi3 is null");
            return (Criteria) this;
        }

        public Criteria andBacki3IsNotNull() {
            addCriterion("backi3 is not null");
            return (Criteria) this;
        }

        public Criteria andBacki3EqualTo(Integer value) {
            addCriterion("backi3 =", value, "backi3");
            return (Criteria) this;
        }

        public Criteria andBacki3NotEqualTo(Integer value) {
            addCriterion("backi3 <>", value, "backi3");
            return (Criteria) this;
        }

        public Criteria andBacki3GreaterThan(Integer value) {
            addCriterion("backi3 >", value, "backi3");
            return (Criteria) this;
        }

        public Criteria andBacki3GreaterThanOrEqualTo(Integer value) {
            addCriterion("backi3 >=", value, "backi3");
            return (Criteria) this;
        }

        public Criteria andBacki3LessThan(Integer value) {
            addCriterion("backi3 <", value, "backi3");
            return (Criteria) this;
        }

        public Criteria andBacki3LessThanOrEqualTo(Integer value) {
            addCriterion("backi3 <=", value, "backi3");
            return (Criteria) this;
        }

        public Criteria andBacki3In(List<Integer> values) {
            addCriterion("backi3 in", values, "backi3");
            return (Criteria) this;
        }

        public Criteria andBacki3NotIn(List<Integer> values) {
            addCriterion("backi3 not in", values, "backi3");
            return (Criteria) this;
        }

        public Criteria andBacki3Between(Integer value1, Integer value2) {
            addCriterion("backi3 between", value1, value2, "backi3");
            return (Criteria) this;
        }

        public Criteria andBacki3NotBetween(Integer value1, Integer value2) {
            addCriterion("backi3 not between", value1, value2, "backi3");
            return (Criteria) this;
        }

        public Criteria andBackv1IsNull() {
            addCriterion("backv1 is null");
            return (Criteria) this;
        }

        public Criteria andBackv1IsNotNull() {
            addCriterion("backv1 is not null");
            return (Criteria) this;
        }

        public Criteria andBackv1EqualTo(String value) {
            addCriterion("backv1 =", value, "backv1");
            return (Criteria) this;
        }

        public Criteria andBackv1NotEqualTo(String value) {
            addCriterion("backv1 <>", value, "backv1");
            return (Criteria) this;
        }

        public Criteria andBackv1GreaterThan(String value) {
            addCriterion("backv1 >", value, "backv1");
            return (Criteria) this;
        }

        public Criteria andBackv1GreaterThanOrEqualTo(String value) {
            addCriterion("backv1 >=", value, "backv1");
            return (Criteria) this;
        }

        public Criteria andBackv1LessThan(String value) {
            addCriterion("backv1 <", value, "backv1");
            return (Criteria) this;
        }

        public Criteria andBackv1LessThanOrEqualTo(String value) {
            addCriterion("backv1 <=", value, "backv1");
            return (Criteria) this;
        }

        public Criteria andBackv1Like(String value) {
            addCriterion("backv1 like", value, "backv1");
            return (Criteria) this;
        }

        public Criteria andBackv1NotLike(String value) {
            addCriterion("backv1 not like", value, "backv1");
            return (Criteria) this;
        }

        public Criteria andBackv1In(List<String> values) {
            addCriterion("backv1 in", values, "backv1");
            return (Criteria) this;
        }

        public Criteria andBackv1NotIn(List<String> values) {
            addCriterion("backv1 not in", values, "backv1");
            return (Criteria) this;
        }

        public Criteria andBackv1Between(String value1, String value2) {
            addCriterion("backv1 between", value1, value2, "backv1");
            return (Criteria) this;
        }

        public Criteria andBackv1NotBetween(String value1, String value2) {
            addCriterion("backv1 not between", value1, value2, "backv1");
            return (Criteria) this;
        }

        public Criteria andBackv2IsNull() {
            addCriterion("backv2 is null");
            return (Criteria) this;
        }

        public Criteria andBackv2IsNotNull() {
            addCriterion("backv2 is not null");
            return (Criteria) this;
        }

        public Criteria andBackv2EqualTo(String value) {
            addCriterion("backv2 =", value, "backv2");
            return (Criteria) this;
        }

        public Criteria andBackv2NotEqualTo(String value) {
            addCriterion("backv2 <>", value, "backv2");
            return (Criteria) this;
        }

        public Criteria andBackv2GreaterThan(String value) {
            addCriterion("backv2 >", value, "backv2");
            return (Criteria) this;
        }

        public Criteria andBackv2GreaterThanOrEqualTo(String value) {
            addCriterion("backv2 >=", value, "backv2");
            return (Criteria) this;
        }

        public Criteria andBackv2LessThan(String value) {
            addCriterion("backv2 <", value, "backv2");
            return (Criteria) this;
        }

        public Criteria andBackv2LessThanOrEqualTo(String value) {
            addCriterion("backv2 <=", value, "backv2");
            return (Criteria) this;
        }

        public Criteria andBackv2Like(String value) {
            addCriterion("backv2 like", value, "backv2");
            return (Criteria) this;
        }

        public Criteria andBackv2NotLike(String value) {
            addCriterion("backv2 not like", value, "backv2");
            return (Criteria) this;
        }

        public Criteria andBackv2In(List<String> values) {
            addCriterion("backv2 in", values, "backv2");
            return (Criteria) this;
        }

        public Criteria andBackv2NotIn(List<String> values) {
            addCriterion("backv2 not in", values, "backv2");
            return (Criteria) this;
        }

        public Criteria andBackv2Between(String value1, String value2) {
            addCriterion("backv2 between", value1, value2, "backv2");
            return (Criteria) this;
        }

        public Criteria andBackv2NotBetween(String value1, String value2) {
            addCriterion("backv2 not between", value1, value2, "backv2");
            return (Criteria) this;
        }

        public Criteria andBackv3IsNull() {
            addCriterion("backv3 is null");
            return (Criteria) this;
        }

        public Criteria andBackv3IsNotNull() {
            addCriterion("backv3 is not null");
            return (Criteria) this;
        }

        public Criteria andBackv3EqualTo(String value) {
            addCriterion("backv3 =", value, "backv3");
            return (Criteria) this;
        }

        public Criteria andBackv3NotEqualTo(String value) {
            addCriterion("backv3 <>", value, "backv3");
            return (Criteria) this;
        }

        public Criteria andBackv3GreaterThan(String value) {
            addCriterion("backv3 >", value, "backv3");
            return (Criteria) this;
        }

        public Criteria andBackv3GreaterThanOrEqualTo(String value) {
            addCriterion("backv3 >=", value, "backv3");
            return (Criteria) this;
        }

        public Criteria andBackv3LessThan(String value) {
            addCriterion("backv3 <", value, "backv3");
            return (Criteria) this;
        }

        public Criteria andBackv3LessThanOrEqualTo(String value) {
            addCriterion("backv3 <=", value, "backv3");
            return (Criteria) this;
        }

        public Criteria andBackv3Like(String value) {
            addCriterion("backv3 like", value, "backv3");
            return (Criteria) this;
        }

        public Criteria andBackv3NotLike(String value) {
            addCriterion("backv3 not like", value, "backv3");
            return (Criteria) this;
        }

        public Criteria andBackv3In(List<String> values) {
            addCriterion("backv3 in", values, "backv3");
            return (Criteria) this;
        }

        public Criteria andBackv3NotIn(List<String> values) {
            addCriterion("backv3 not in", values, "backv3");
            return (Criteria) this;
        }

        public Criteria andBackv3Between(String value1, String value2) {
            addCriterion("backv3 between", value1, value2, "backv3");
            return (Criteria) this;
        }

        public Criteria andBackv3NotBetween(String value1, String value2) {
            addCriterion("backv3 not between", value1, value2, "backv3");
            return (Criteria) this;
        }

        public Criteria andBackd1IsNull() {
            addCriterion("backd1 is null");
            return (Criteria) this;
        }

        public Criteria andBackd1IsNotNull() {
            addCriterion("backd1 is not null");
            return (Criteria) this;
        }

        public Criteria andBackd1EqualTo(Date value) {
            addCriterion("backd1 =", value, "backd1");
            return (Criteria) this;
        }

        public Criteria andBackd1NotEqualTo(Date value) {
            addCriterion("backd1 <>", value, "backd1");
            return (Criteria) this;
        }

        public Criteria andBackd1GreaterThan(Date value) {
            addCriterion("backd1 >", value, "backd1");
            return (Criteria) this;
        }

        public Criteria andBackd1GreaterThanOrEqualTo(Date value) {
            addCriterion("backd1 >=", value, "backd1");
            return (Criteria) this;
        }

        public Criteria andBackd1LessThan(Date value) {
            addCriterion("backd1 <", value, "backd1");
            return (Criteria) this;
        }

        public Criteria andBackd1LessThanOrEqualTo(Date value) {
            addCriterion("backd1 <=", value, "backd1");
            return (Criteria) this;
        }

        public Criteria andBackd1In(List<Date> values) {
            addCriterion("backd1 in", values, "backd1");
            return (Criteria) this;
        }

        public Criteria andBackd1NotIn(List<Date> values) {
            addCriterion("backd1 not in", values, "backd1");
            return (Criteria) this;
        }

        public Criteria andBackd1Between(Date value1, Date value2) {
            addCriterion("backd1 between", value1, value2, "backd1");
            return (Criteria) this;
        }

        public Criteria andBackd1NotBetween(Date value1, Date value2) {
            addCriterion("backd1 not between", value1, value2, "backd1");
            return (Criteria) this;
        }

        public Criteria andBackd2IsNull() {
            addCriterion("backd2 is null");
            return (Criteria) this;
        }

        public Criteria andBackd2IsNotNull() {
            addCriterion("backd2 is not null");
            return (Criteria) this;
        }

        public Criteria andBackd2EqualTo(Date value) {
            addCriterion("backd2 =", value, "backd2");
            return (Criteria) this;
        }

        public Criteria andBackd2NotEqualTo(Date value) {
            addCriterion("backd2 <>", value, "backd2");
            return (Criteria) this;
        }

        public Criteria andBackd2GreaterThan(Date value) {
            addCriterion("backd2 >", value, "backd2");
            return (Criteria) this;
        }

        public Criteria andBackd2GreaterThanOrEqualTo(Date value) {
            addCriterion("backd2 >=", value, "backd2");
            return (Criteria) this;
        }

        public Criteria andBackd2LessThan(Date value) {
            addCriterion("backd2 <", value, "backd2");
            return (Criteria) this;
        }

        public Criteria andBackd2LessThanOrEqualTo(Date value) {
            addCriterion("backd2 <=", value, "backd2");
            return (Criteria) this;
        }

        public Criteria andBackd2In(List<Date> values) {
            addCriterion("backd2 in", values, "backd2");
            return (Criteria) this;
        }

        public Criteria andBackd2NotIn(List<Date> values) {
            addCriterion("backd2 not in", values, "backd2");
            return (Criteria) this;
        }

        public Criteria andBackd2Between(Date value1, Date value2) {
            addCriterion("backd2 between", value1, value2, "backd2");
            return (Criteria) this;
        }

        public Criteria andBackd2NotBetween(Date value1, Date value2) {
            addCriterion("backd2 not between", value1, value2, "backd2");
            return (Criteria) this;
        }

        public Criteria andBackd3IsNull() {
            addCriterion("backd3 is null");
            return (Criteria) this;
        }

        public Criteria andBackd3IsNotNull() {
            addCriterion("backd3 is not null");
            return (Criteria) this;
        }

        public Criteria andBackd3EqualTo(Date value) {
            addCriterion("backd3 =", value, "backd3");
            return (Criteria) this;
        }

        public Criteria andBackd3NotEqualTo(Date value) {
            addCriterion("backd3 <>", value, "backd3");
            return (Criteria) this;
        }

        public Criteria andBackd3GreaterThan(Date value) {
            addCriterion("backd3 >", value, "backd3");
            return (Criteria) this;
        }

        public Criteria andBackd3GreaterThanOrEqualTo(Date value) {
            addCriterion("backd3 >=", value, "backd3");
            return (Criteria) this;
        }

        public Criteria andBackd3LessThan(Date value) {
            addCriterion("backd3 <", value, "backd3");
            return (Criteria) this;
        }

        public Criteria andBackd3LessThanOrEqualTo(Date value) {
            addCriterion("backd3 <=", value, "backd3");
            return (Criteria) this;
        }

        public Criteria andBackd3In(List<Date> values) {
            addCriterion("backd3 in", values, "backd3");
            return (Criteria) this;
        }

        public Criteria andBackd3NotIn(List<Date> values) {
            addCriterion("backd3 not in", values, "backd3");
            return (Criteria) this;
        }

        public Criteria andBackd3Between(Date value1, Date value2) {
            addCriterion("backd3 between", value1, value2, "backd3");
            return (Criteria) this;
        }

        public Criteria andBackd3NotBetween(Date value1, Date value2) {
            addCriterion("backd3 not between", value1, value2, "backd3");
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