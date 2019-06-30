package com.hrbc.business.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CandidatesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CandidatesExample() {
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

        public Criteria andPhonenobakIsNull() {
            addCriterion("phonenobak is null");
            return (Criteria) this;
        }

        public Criteria andPhonenobakIsNotNull() {
            addCriterion("phonenobak is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenobakEqualTo(String value) {
            addCriterion("phonenobak =", value, "phonenobak");
            return (Criteria) this;
        }

        public Criteria andPhonenobakNotEqualTo(String value) {
            addCriterion("phonenobak <>", value, "phonenobak");
            return (Criteria) this;
        }

        public Criteria andPhonenobakGreaterThan(String value) {
            addCriterion("phonenobak >", value, "phonenobak");
            return (Criteria) this;
        }

        public Criteria andPhonenobakGreaterThanOrEqualTo(String value) {
            addCriterion("phonenobak >=", value, "phonenobak");
            return (Criteria) this;
        }

        public Criteria andPhonenobakLessThan(String value) {
            addCriterion("phonenobak <", value, "phonenobak");
            return (Criteria) this;
        }

        public Criteria andPhonenobakLessThanOrEqualTo(String value) {
            addCriterion("phonenobak <=", value, "phonenobak");
            return (Criteria) this;
        }

        public Criteria andPhonenobakLike(String value) {
            addCriterion("phonenobak like", value, "phonenobak");
            return (Criteria) this;
        }

        public Criteria andPhonenobakNotLike(String value) {
            addCriterion("phonenobak not like", value, "phonenobak");
            return (Criteria) this;
        }

        public Criteria andPhonenobakIn(List<String> values) {
            addCriterion("phonenobak in", values, "phonenobak");
            return (Criteria) this;
        }

        public Criteria andPhonenobakNotIn(List<String> values) {
            addCriterion("phonenobak not in", values, "phonenobak");
            return (Criteria) this;
        }

        public Criteria andPhonenobakBetween(String value1, String value2) {
            addCriterion("phonenobak between", value1, value2, "phonenobak");
            return (Criteria) this;
        }

        public Criteria andPhonenobakNotBetween(String value1, String value2) {
            addCriterion("phonenobak not between", value1, value2, "phonenobak");
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

        public Criteria andEmailbakIsNull() {
            addCriterion("emailbak is null");
            return (Criteria) this;
        }

        public Criteria andEmailbakIsNotNull() {
            addCriterion("emailbak is not null");
            return (Criteria) this;
        }

        public Criteria andEmailbakEqualTo(String value) {
            addCriterion("emailbak =", value, "emailbak");
            return (Criteria) this;
        }

        public Criteria andEmailbakNotEqualTo(String value) {
            addCriterion("emailbak <>", value, "emailbak");
            return (Criteria) this;
        }

        public Criteria andEmailbakGreaterThan(String value) {
            addCriterion("emailbak >", value, "emailbak");
            return (Criteria) this;
        }

        public Criteria andEmailbakGreaterThanOrEqualTo(String value) {
            addCriterion("emailbak >=", value, "emailbak");
            return (Criteria) this;
        }

        public Criteria andEmailbakLessThan(String value) {
            addCriterion("emailbak <", value, "emailbak");
            return (Criteria) this;
        }

        public Criteria andEmailbakLessThanOrEqualTo(String value) {
            addCriterion("emailbak <=", value, "emailbak");
            return (Criteria) this;
        }

        public Criteria andEmailbakLike(String value) {
            addCriterion("emailbak like", value, "emailbak");
            return (Criteria) this;
        }

        public Criteria andEmailbakNotLike(String value) {
            addCriterion("emailbak not like", value, "emailbak");
            return (Criteria) this;
        }

        public Criteria andEmailbakIn(List<String> values) {
            addCriterion("emailbak in", values, "emailbak");
            return (Criteria) this;
        }

        public Criteria andEmailbakNotIn(List<String> values) {
            addCriterion("emailbak not in", values, "emailbak");
            return (Criteria) this;
        }

        public Criteria andEmailbakBetween(String value1, String value2) {
            addCriterion("emailbak between", value1, value2, "emailbak");
            return (Criteria) this;
        }

        public Criteria andEmailbakNotBetween(String value1, String value2) {
            addCriterion("emailbak not between", value1, value2, "emailbak");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNull() {
            addCriterion("picpath is null");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNotNull() {
            addCriterion("picpath is not null");
            return (Criteria) this;
        }

        public Criteria andPicpathEqualTo(String value) {
            addCriterion("picpath =", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotEqualTo(String value) {
            addCriterion("picpath <>", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThan(String value) {
            addCriterion("picpath >", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThanOrEqualTo(String value) {
            addCriterion("picpath >=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThan(String value) {
            addCriterion("picpath <", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThanOrEqualTo(String value) {
            addCriterion("picpath <=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLike(String value) {
            addCriterion("picpath like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotLike(String value) {
            addCriterion("picpath not like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathIn(List<String> values) {
            addCriterion("picpath in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotIn(List<String> values) {
            addCriterion("picpath not in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathBetween(String value1, String value2) {
            addCriterion("picpath between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotBetween(String value1, String value2) {
            addCriterion("picpath not between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andPostcardIsNull() {
            addCriterion("postcard is null");
            return (Criteria) this;
        }

        public Criteria andPostcardIsNotNull() {
            addCriterion("postcard is not null");
            return (Criteria) this;
        }

        public Criteria andPostcardEqualTo(String value) {
            addCriterion("postcard =", value, "postcard");
            return (Criteria) this;
        }

        public Criteria andPostcardNotEqualTo(String value) {
            addCriterion("postcard <>", value, "postcard");
            return (Criteria) this;
        }

        public Criteria andPostcardGreaterThan(String value) {
            addCriterion("postcard >", value, "postcard");
            return (Criteria) this;
        }

        public Criteria andPostcardGreaterThanOrEqualTo(String value) {
            addCriterion("postcard >=", value, "postcard");
            return (Criteria) this;
        }

        public Criteria andPostcardLessThan(String value) {
            addCriterion("postcard <", value, "postcard");
            return (Criteria) this;
        }

        public Criteria andPostcardLessThanOrEqualTo(String value) {
            addCriterion("postcard <=", value, "postcard");
            return (Criteria) this;
        }

        public Criteria andPostcardLike(String value) {
            addCriterion("postcard like", value, "postcard");
            return (Criteria) this;
        }

        public Criteria andPostcardNotLike(String value) {
            addCriterion("postcard not like", value, "postcard");
            return (Criteria) this;
        }

        public Criteria andPostcardIn(List<String> values) {
            addCriterion("postcard in", values, "postcard");
            return (Criteria) this;
        }

        public Criteria andPostcardNotIn(List<String> values) {
            addCriterion("postcard not in", values, "postcard");
            return (Criteria) this;
        }

        public Criteria andPostcardBetween(String value1, String value2) {
            addCriterion("postcard between", value1, value2, "postcard");
            return (Criteria) this;
        }

        public Criteria andPostcardNotBetween(String value1, String value2) {
            addCriterion("postcard not between", value1, value2, "postcard");
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

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
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

        public Criteria andConstellationIsNull() {
            addCriterion("constellation is null");
            return (Criteria) this;
        }

        public Criteria andConstellationIsNotNull() {
            addCriterion("constellation is not null");
            return (Criteria) this;
        }

        public Criteria andConstellationEqualTo(String value) {
            addCriterion("constellation =", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotEqualTo(String value) {
            addCriterion("constellation <>", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationGreaterThan(String value) {
            addCriterion("constellation >", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationGreaterThanOrEqualTo(String value) {
            addCriterion("constellation >=", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationLessThan(String value) {
            addCriterion("constellation <", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationLessThanOrEqualTo(String value) {
            addCriterion("constellation <=", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationLike(String value) {
            addCriterion("constellation like", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotLike(String value) {
            addCriterion("constellation not like", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationIn(List<String> values) {
            addCriterion("constellation in", values, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotIn(List<String> values) {
            addCriterion("constellation not in", values, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationBetween(String value1, String value2) {
            addCriterion("constellation between", value1, value2, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotBetween(String value1, String value2) {
            addCriterion("constellation not between", value1, value2, "constellation");
            return (Criteria) this;
        }

        public Criteria andHometownIsNull() {
            addCriterion("hometown is null");
            return (Criteria) this;
        }

        public Criteria andHometownIsNotNull() {
            addCriterion("hometown is not null");
            return (Criteria) this;
        }

        public Criteria andHometownEqualTo(String value) {
            addCriterion("hometown =", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotEqualTo(String value) {
            addCriterion("hometown <>", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownGreaterThan(String value) {
            addCriterion("hometown >", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownGreaterThanOrEqualTo(String value) {
            addCriterion("hometown >=", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLessThan(String value) {
            addCriterion("hometown <", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLessThanOrEqualTo(String value) {
            addCriterion("hometown <=", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLike(String value) {
            addCriterion("hometown like", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotLike(String value) {
            addCriterion("hometown not like", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownIn(List<String> values) {
            addCriterion("hometown in", values, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotIn(List<String> values) {
            addCriterion("hometown not in", values, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownBetween(String value1, String value2) {
            addCriterion("hometown between", value1, value2, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotBetween(String value1, String value2) {
            addCriterion("hometown not between", value1, value2, "hometown");
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

        public Criteria andExpectworkbaseIsNull() {
            addCriterion("expectworkbase is null");
            return (Criteria) this;
        }

        public Criteria andExpectworkbaseIsNotNull() {
            addCriterion("expectworkbase is not null");
            return (Criteria) this;
        }

        public Criteria andExpectworkbaseEqualTo(String value) {
            addCriterion("expectworkbase =", value, "expectworkbase");
            return (Criteria) this;
        }

        public Criteria andExpectworkbaseNotEqualTo(String value) {
            addCriterion("expectworkbase <>", value, "expectworkbase");
            return (Criteria) this;
        }

        public Criteria andExpectworkbaseGreaterThan(String value) {
            addCriterion("expectworkbase >", value, "expectworkbase");
            return (Criteria) this;
        }

        public Criteria andExpectworkbaseGreaterThanOrEqualTo(String value) {
            addCriterion("expectworkbase >=", value, "expectworkbase");
            return (Criteria) this;
        }

        public Criteria andExpectworkbaseLessThan(String value) {
            addCriterion("expectworkbase <", value, "expectworkbase");
            return (Criteria) this;
        }

        public Criteria andExpectworkbaseLessThanOrEqualTo(String value) {
            addCriterion("expectworkbase <=", value, "expectworkbase");
            return (Criteria) this;
        }

        public Criteria andExpectworkbaseLike(String value) {
            addCriterion("expectworkbase like", value, "expectworkbase");
            return (Criteria) this;
        }

        public Criteria andExpectworkbaseNotLike(String value) {
            addCriterion("expectworkbase not like", value, "expectworkbase");
            return (Criteria) this;
        }

        public Criteria andExpectworkbaseIn(List<String> values) {
            addCriterion("expectworkbase in", values, "expectworkbase");
            return (Criteria) this;
        }

        public Criteria andExpectworkbaseNotIn(List<String> values) {
            addCriterion("expectworkbase not in", values, "expectworkbase");
            return (Criteria) this;
        }

        public Criteria andExpectworkbaseBetween(String value1, String value2) {
            addCriterion("expectworkbase between", value1, value2, "expectworkbase");
            return (Criteria) this;
        }

        public Criteria andExpectworkbaseNotBetween(String value1, String value2) {
            addCriterion("expectworkbase not between", value1, value2, "expectworkbase");
            return (Criteria) this;
        }

        public Criteria andLastcompanyIsNull() {
            addCriterion("lastcompany is null");
            return (Criteria) this;
        }

        public Criteria andLastcompanyIsNotNull() {
            addCriterion("lastcompany is not null");
            return (Criteria) this;
        }

        public Criteria andLastcompanyEqualTo(String value) {
            addCriterion("lastcompany =", value, "lastcompany");
            return (Criteria) this;
        }

        public Criteria andLastcompanyNotEqualTo(String value) {
            addCriterion("lastcompany <>", value, "lastcompany");
            return (Criteria) this;
        }

        public Criteria andLastcompanyGreaterThan(String value) {
            addCriterion("lastcompany >", value, "lastcompany");
            return (Criteria) this;
        }

        public Criteria andLastcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("lastcompany >=", value, "lastcompany");
            return (Criteria) this;
        }

        public Criteria andLastcompanyLessThan(String value) {
            addCriterion("lastcompany <", value, "lastcompany");
            return (Criteria) this;
        }

        public Criteria andLastcompanyLessThanOrEqualTo(String value) {
            addCriterion("lastcompany <=", value, "lastcompany");
            return (Criteria) this;
        }

        public Criteria andLastcompanyLike(String value) {
            addCriterion("lastcompany like", value, "lastcompany");
            return (Criteria) this;
        }

        public Criteria andLastcompanyNotLike(String value) {
            addCriterion("lastcompany not like", value, "lastcompany");
            return (Criteria) this;
        }

        public Criteria andLastcompanyIn(List<String> values) {
            addCriterion("lastcompany in", values, "lastcompany");
            return (Criteria) this;
        }

        public Criteria andLastcompanyNotIn(List<String> values) {
            addCriterion("lastcompany not in", values, "lastcompany");
            return (Criteria) this;
        }

        public Criteria andLastcompanyBetween(String value1, String value2) {
            addCriterion("lastcompany between", value1, value2, "lastcompany");
            return (Criteria) this;
        }

        public Criteria andLastcompanyNotBetween(String value1, String value2) {
            addCriterion("lastcompany not between", value1, value2, "lastcompany");
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

        public Criteria andWorksateIsNull() {
            addCriterion("worksate is null");
            return (Criteria) this;
        }

        public Criteria andWorksateIsNotNull() {
            addCriterion("worksate is not null");
            return (Criteria) this;
        }

        public Criteria andWorksateEqualTo(Integer value) {
            addCriterion("worksate =", value, "worksate");
            return (Criteria) this;
        }

        public Criteria andWorksateNotEqualTo(Integer value) {
            addCriterion("worksate <>", value, "worksate");
            return (Criteria) this;
        }

        public Criteria andWorksateGreaterThan(Integer value) {
            addCriterion("worksate >", value, "worksate");
            return (Criteria) this;
        }

        public Criteria andWorksateGreaterThanOrEqualTo(Integer value) {
            addCriterion("worksate >=", value, "worksate");
            return (Criteria) this;
        }

        public Criteria andWorksateLessThan(Integer value) {
            addCriterion("worksate <", value, "worksate");
            return (Criteria) this;
        }

        public Criteria andWorksateLessThanOrEqualTo(Integer value) {
            addCriterion("worksate <=", value, "worksate");
            return (Criteria) this;
        }

        public Criteria andWorksateIn(List<Integer> values) {
            addCriterion("worksate in", values, "worksate");
            return (Criteria) this;
        }

        public Criteria andWorksateNotIn(List<Integer> values) {
            addCriterion("worksate not in", values, "worksate");
            return (Criteria) this;
        }

        public Criteria andWorksateBetween(Integer value1, Integer value2) {
            addCriterion("worksate between", value1, value2, "worksate");
            return (Criteria) this;
        }

        public Criteria andWorksateNotBetween(Integer value1, Integer value2) {
            addCriterion("worksate not between", value1, value2, "worksate");
            return (Criteria) this;
        }

        public Criteria andResumestateIsNull() {
            addCriterion("resumestate is null");
            return (Criteria) this;
        }

        public Criteria andResumestateIsNotNull() {
            addCriterion("resumestate is not null");
            return (Criteria) this;
        }

        public Criteria andResumestateEqualTo(Integer value) {
            addCriterion("resumestate =", value, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateNotEqualTo(Integer value) {
            addCriterion("resumestate <>", value, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateGreaterThan(Integer value) {
            addCriterion("resumestate >", value, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("resumestate >=", value, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateLessThan(Integer value) {
            addCriterion("resumestate <", value, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateLessThanOrEqualTo(Integer value) {
            addCriterion("resumestate <=", value, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateIn(List<Integer> values) {
            addCriterion("resumestate in", values, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateNotIn(List<Integer> values) {
            addCriterion("resumestate not in", values, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateBetween(Integer value1, Integer value2) {
            addCriterion("resumestate between", value1, value2, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumestateNotBetween(Integer value1, Integer value2) {
            addCriterion("resumestate not between", value1, value2, "resumestate");
            return (Criteria) this;
        }

        public Criteria andResumefileIsNull() {
            addCriterion("resumefile is null");
            return (Criteria) this;
        }

        public Criteria andResumefileIsNotNull() {
            addCriterion("resumefile is not null");
            return (Criteria) this;
        }

        public Criteria andResumefileEqualTo(String value) {
            addCriterion("resumefile =", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileNotEqualTo(String value) {
            addCriterion("resumefile <>", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileGreaterThan(String value) {
            addCriterion("resumefile >", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileGreaterThanOrEqualTo(String value) {
            addCriterion("resumefile >=", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileLessThan(String value) {
            addCriterion("resumefile <", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileLessThanOrEqualTo(String value) {
            addCriterion("resumefile <=", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileLike(String value) {
            addCriterion("resumefile like", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileNotLike(String value) {
            addCriterion("resumefile not like", value, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileIn(List<String> values) {
            addCriterion("resumefile in", values, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileNotIn(List<String> values) {
            addCriterion("resumefile not in", values, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileBetween(String value1, String value2) {
            addCriterion("resumefile between", value1, value2, "resumefile");
            return (Criteria) this;
        }

        public Criteria andResumefileNotBetween(String value1, String value2) {
            addCriterion("resumefile not between", value1, value2, "resumefile");
            return (Criteria) this;
        }

        public Criteria andDresumeIsNull() {
            addCriterion("dresume is null");
            return (Criteria) this;
        }

        public Criteria andDresumeIsNotNull() {
            addCriterion("dresume is not null");
            return (Criteria) this;
        }

        public Criteria andDresumeEqualTo(String value) {
            addCriterion("dresume =", value, "dresume");
            return (Criteria) this;
        }

        public Criteria andDresumeNotEqualTo(String value) {
            addCriterion("dresume <>", value, "dresume");
            return (Criteria) this;
        }

        public Criteria andDresumeGreaterThan(String value) {
            addCriterion("dresume >", value, "dresume");
            return (Criteria) this;
        }

        public Criteria andDresumeGreaterThanOrEqualTo(String value) {
            addCriterion("dresume >=", value, "dresume");
            return (Criteria) this;
        }

        public Criteria andDresumeLessThan(String value) {
            addCriterion("dresume <", value, "dresume");
            return (Criteria) this;
        }

        public Criteria andDresumeLessThanOrEqualTo(String value) {
            addCriterion("dresume <=", value, "dresume");
            return (Criteria) this;
        }

        public Criteria andDresumeLike(String value) {
            addCriterion("dresume like", value, "dresume");
            return (Criteria) this;
        }

        public Criteria andDresumeNotLike(String value) {
            addCriterion("dresume not like", value, "dresume");
            return (Criteria) this;
        }

        public Criteria andDresumeIn(List<String> values) {
            addCriterion("dresume in", values, "dresume");
            return (Criteria) this;
        }

        public Criteria andDresumeNotIn(List<String> values) {
            addCriterion("dresume not in", values, "dresume");
            return (Criteria) this;
        }

        public Criteria andDresumeBetween(String value1, String value2) {
            addCriterion("dresume between", value1, value2, "dresume");
            return (Criteria) this;
        }

        public Criteria andDresumeNotBetween(String value1, String value2) {
            addCriterion("dresume not between", value1, value2, "dresume");
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

        public Criteria andEducationsIsNull() {
            addCriterion("educations is null");
            return (Criteria) this;
        }

        public Criteria andEducationsIsNotNull() {
            addCriterion("educations is not null");
            return (Criteria) this;
        }

        public Criteria andEducationsEqualTo(String value) {
            addCriterion("educations =", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsNotEqualTo(String value) {
            addCriterion("educations <>", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsGreaterThan(String value) {
            addCriterion("educations >", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsGreaterThanOrEqualTo(String value) {
            addCriterion("educations >=", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsLessThan(String value) {
            addCriterion("educations <", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsLessThanOrEqualTo(String value) {
            addCriterion("educations <=", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsLike(String value) {
            addCriterion("educations like", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsNotLike(String value) {
            addCriterion("educations not like", value, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsIn(List<String> values) {
            addCriterion("educations in", values, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsNotIn(List<String> values) {
            addCriterion("educations not in", values, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsBetween(String value1, String value2) {
            addCriterion("educations between", value1, value2, "educations");
            return (Criteria) this;
        }

        public Criteria andEducationsNotBetween(String value1, String value2) {
            addCriterion("educations not between", value1, value2, "educations");
            return (Criteria) this;
        }

        public Criteria andWorkexperiencesIsNull() {
            addCriterion("workexperiences is null");
            return (Criteria) this;
        }

        public Criteria andWorkexperiencesIsNotNull() {
            addCriterion("workexperiences is not null");
            return (Criteria) this;
        }

        public Criteria andWorkexperiencesEqualTo(String value) {
            addCriterion("workexperiences =", value, "workexperiences");
            return (Criteria) this;
        }

        public Criteria andWorkexperiencesNotEqualTo(String value) {
            addCriterion("workexperiences <>", value, "workexperiences");
            return (Criteria) this;
        }

        public Criteria andWorkexperiencesGreaterThan(String value) {
            addCriterion("workexperiences >", value, "workexperiences");
            return (Criteria) this;
        }

        public Criteria andWorkexperiencesGreaterThanOrEqualTo(String value) {
            addCriterion("workexperiences >=", value, "workexperiences");
            return (Criteria) this;
        }

        public Criteria andWorkexperiencesLessThan(String value) {
            addCriterion("workexperiences <", value, "workexperiences");
            return (Criteria) this;
        }

        public Criteria andWorkexperiencesLessThanOrEqualTo(String value) {
            addCriterion("workexperiences <=", value, "workexperiences");
            return (Criteria) this;
        }

        public Criteria andWorkexperiencesLike(String value) {
            addCriterion("workexperiences like", value, "workexperiences");
            return (Criteria) this;
        }

        public Criteria andWorkexperiencesNotLike(String value) {
            addCriterion("workexperiences not like", value, "workexperiences");
            return (Criteria) this;
        }

        public Criteria andWorkexperiencesIn(List<String> values) {
            addCriterion("workexperiences in", values, "workexperiences");
            return (Criteria) this;
        }

        public Criteria andWorkexperiencesNotIn(List<String> values) {
            addCriterion("workexperiences not in", values, "workexperiences");
            return (Criteria) this;
        }

        public Criteria andWorkexperiencesBetween(String value1, String value2) {
            addCriterion("workexperiences between", value1, value2, "workexperiences");
            return (Criteria) this;
        }

        public Criteria andWorkexperiencesNotBetween(String value1, String value2) {
            addCriterion("workexperiences not between", value1, value2, "workexperiences");
            return (Criteria) this;
        }

        public Criteria andExpectjobIsNull() {
            addCriterion("expectjob is null");
            return (Criteria) this;
        }

        public Criteria andExpectjobIsNotNull() {
            addCriterion("expectjob is not null");
            return (Criteria) this;
        }

        public Criteria andExpectjobEqualTo(String value) {
            addCriterion("expectjob =", value, "expectjob");
            return (Criteria) this;
        }

        public Criteria andExpectjobNotEqualTo(String value) {
            addCriterion("expectjob <>", value, "expectjob");
            return (Criteria) this;
        }

        public Criteria andExpectjobGreaterThan(String value) {
            addCriterion("expectjob >", value, "expectjob");
            return (Criteria) this;
        }

        public Criteria andExpectjobGreaterThanOrEqualTo(String value) {
            addCriterion("expectjob >=", value, "expectjob");
            return (Criteria) this;
        }

        public Criteria andExpectjobLessThan(String value) {
            addCriterion("expectjob <", value, "expectjob");
            return (Criteria) this;
        }

        public Criteria andExpectjobLessThanOrEqualTo(String value) {
            addCriterion("expectjob <=", value, "expectjob");
            return (Criteria) this;
        }

        public Criteria andExpectjobLike(String value) {
            addCriterion("expectjob like", value, "expectjob");
            return (Criteria) this;
        }

        public Criteria andExpectjobNotLike(String value) {
            addCriterion("expectjob not like", value, "expectjob");
            return (Criteria) this;
        }

        public Criteria andExpectjobIn(List<String> values) {
            addCriterion("expectjob in", values, "expectjob");
            return (Criteria) this;
        }

        public Criteria andExpectjobNotIn(List<String> values) {
            addCriterion("expectjob not in", values, "expectjob");
            return (Criteria) this;
        }

        public Criteria andExpectjobBetween(String value1, String value2) {
            addCriterion("expectjob between", value1, value2, "expectjob");
            return (Criteria) this;
        }

        public Criteria andExpectjobNotBetween(String value1, String value2) {
            addCriterion("expectjob not between", value1, value2, "expectjob");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelIsNull() {
            addCriterion("languagelevel is null");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelIsNotNull() {
            addCriterion("languagelevel is not null");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelEqualTo(String value) {
            addCriterion("languagelevel =", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelNotEqualTo(String value) {
            addCriterion("languagelevel <>", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelGreaterThan(String value) {
            addCriterion("languagelevel >", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelGreaterThanOrEqualTo(String value) {
            addCriterion("languagelevel >=", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelLessThan(String value) {
            addCriterion("languagelevel <", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelLessThanOrEqualTo(String value) {
            addCriterion("languagelevel <=", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelLike(String value) {
            addCriterion("languagelevel like", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelNotLike(String value) {
            addCriterion("languagelevel not like", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelIn(List<String> values) {
            addCriterion("languagelevel in", values, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelNotIn(List<String> values) {
            addCriterion("languagelevel not in", values, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelBetween(String value1, String value2) {
            addCriterion("languagelevel between", value1, value2, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelNotBetween(String value1, String value2) {
            addCriterion("languagelevel not between", value1, value2, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(Integer value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(Integer value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(Integer value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(Integer value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<Integer> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<Integer> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(Integer value1, Integer value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("degree not between", value1, value2, "degree");
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