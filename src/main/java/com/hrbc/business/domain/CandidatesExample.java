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

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorsubIsNull() {
            addCriterion("majorsub is null");
            return (Criteria) this;
        }

        public Criteria andMajorsubIsNotNull() {
            addCriterion("majorsub is not null");
            return (Criteria) this;
        }

        public Criteria andMajorsubEqualTo(String value) {
            addCriterion("majorsub =", value, "majorsub");
            return (Criteria) this;
        }

        public Criteria andMajorsubNotEqualTo(String value) {
            addCriterion("majorsub <>", value, "majorsub");
            return (Criteria) this;
        }

        public Criteria andMajorsubGreaterThan(String value) {
            addCriterion("majorsub >", value, "majorsub");
            return (Criteria) this;
        }

        public Criteria andMajorsubGreaterThanOrEqualTo(String value) {
            addCriterion("majorsub >=", value, "majorsub");
            return (Criteria) this;
        }

        public Criteria andMajorsubLessThan(String value) {
            addCriterion("majorsub <", value, "majorsub");
            return (Criteria) this;
        }

        public Criteria andMajorsubLessThanOrEqualTo(String value) {
            addCriterion("majorsub <=", value, "majorsub");
            return (Criteria) this;
        }

        public Criteria andMajorsubLike(String value) {
            addCriterion("majorsub like", value, "majorsub");
            return (Criteria) this;
        }

        public Criteria andMajorsubNotLike(String value) {
            addCriterion("majorsub not like", value, "majorsub");
            return (Criteria) this;
        }

        public Criteria andMajorsubIn(List<String> values) {
            addCriterion("majorsub in", values, "majorsub");
            return (Criteria) this;
        }

        public Criteria andMajorsubNotIn(List<String> values) {
            addCriterion("majorsub not in", values, "majorsub");
            return (Criteria) this;
        }

        public Criteria andMajorsubBetween(String value1, String value2) {
            addCriterion("majorsub between", value1, value2, "majorsub");
            return (Criteria) this;
        }

        public Criteria andMajorsubNotBetween(String value1, String value2) {
            addCriterion("majorsub not between", value1, value2, "majorsub");
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

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andLivebaseIsNull() {
            addCriterion("livebase is null");
            return (Criteria) this;
        }

        public Criteria andLivebaseIsNotNull() {
            addCriterion("livebase is not null");
            return (Criteria) this;
        }

        public Criteria andLivebaseEqualTo(String value) {
            addCriterion("livebase =", value, "livebase");
            return (Criteria) this;
        }

        public Criteria andLivebaseNotEqualTo(String value) {
            addCriterion("livebase <>", value, "livebase");
            return (Criteria) this;
        }

        public Criteria andLivebaseGreaterThan(String value) {
            addCriterion("livebase >", value, "livebase");
            return (Criteria) this;
        }

        public Criteria andLivebaseGreaterThanOrEqualTo(String value) {
            addCriterion("livebase >=", value, "livebase");
            return (Criteria) this;
        }

        public Criteria andLivebaseLessThan(String value) {
            addCriterion("livebase <", value, "livebase");
            return (Criteria) this;
        }

        public Criteria andLivebaseLessThanOrEqualTo(String value) {
            addCriterion("livebase <=", value, "livebase");
            return (Criteria) this;
        }

        public Criteria andLivebaseLike(String value) {
            addCriterion("livebase like", value, "livebase");
            return (Criteria) this;
        }

        public Criteria andLivebaseNotLike(String value) {
            addCriterion("livebase not like", value, "livebase");
            return (Criteria) this;
        }

        public Criteria andLivebaseIn(List<String> values) {
            addCriterion("livebase in", values, "livebase");
            return (Criteria) this;
        }

        public Criteria andLivebaseNotIn(List<String> values) {
            addCriterion("livebase not in", values, "livebase");
            return (Criteria) this;
        }

        public Criteria andLivebaseBetween(String value1, String value2) {
            addCriterion("livebase between", value1, value2, "livebase");
            return (Criteria) this;
        }

        public Criteria andLivebaseNotBetween(String value1, String value2) {
            addCriterion("livebase not between", value1, value2, "livebase");
            return (Criteria) this;
        }

        public Criteria andEdu1IsNull() {
            addCriterion("edu1 is null");
            return (Criteria) this;
        }

        public Criteria andEdu1IsNotNull() {
            addCriterion("edu1 is not null");
            return (Criteria) this;
        }

        public Criteria andEdu1EqualTo(String value) {
            addCriterion("edu1 =", value, "edu1");
            return (Criteria) this;
        }

        public Criteria andEdu1NotEqualTo(String value) {
            addCriterion("edu1 <>", value, "edu1");
            return (Criteria) this;
        }

        public Criteria andEdu1GreaterThan(String value) {
            addCriterion("edu1 >", value, "edu1");
            return (Criteria) this;
        }

        public Criteria andEdu1GreaterThanOrEqualTo(String value) {
            addCriterion("edu1 >=", value, "edu1");
            return (Criteria) this;
        }

        public Criteria andEdu1LessThan(String value) {
            addCriterion("edu1 <", value, "edu1");
            return (Criteria) this;
        }

        public Criteria andEdu1LessThanOrEqualTo(String value) {
            addCriterion("edu1 <=", value, "edu1");
            return (Criteria) this;
        }

        public Criteria andEdu1Like(String value) {
            addCriterion("edu1 like", value, "edu1");
            return (Criteria) this;
        }

        public Criteria andEdu1NotLike(String value) {
            addCriterion("edu1 not like", value, "edu1");
            return (Criteria) this;
        }

        public Criteria andEdu1In(List<String> values) {
            addCriterion("edu1 in", values, "edu1");
            return (Criteria) this;
        }

        public Criteria andEdu1NotIn(List<String> values) {
            addCriterion("edu1 not in", values, "edu1");
            return (Criteria) this;
        }

        public Criteria andEdu1Between(String value1, String value2) {
            addCriterion("edu1 between", value1, value2, "edu1");
            return (Criteria) this;
        }

        public Criteria andEdu1NotBetween(String value1, String value2) {
            addCriterion("edu1 not between", value1, value2, "edu1");
            return (Criteria) this;
        }

        public Criteria andEdu1stdateIsNull() {
            addCriterion("edu1stdate is null");
            return (Criteria) this;
        }

        public Criteria andEdu1stdateIsNotNull() {
            addCriterion("edu1stdate is not null");
            return (Criteria) this;
        }

        public Criteria andEdu1stdateEqualTo(Date value) {
            addCriterion("edu1stdate =", value, "edu1stdate");
            return (Criteria) this;
        }

        public Criteria andEdu1stdateNotEqualTo(Date value) {
            addCriterion("edu1stdate <>", value, "edu1stdate");
            return (Criteria) this;
        }

        public Criteria andEdu1stdateGreaterThan(Date value) {
            addCriterion("edu1stdate >", value, "edu1stdate");
            return (Criteria) this;
        }

        public Criteria andEdu1stdateGreaterThanOrEqualTo(Date value) {
            addCriterion("edu1stdate >=", value, "edu1stdate");
            return (Criteria) this;
        }

        public Criteria andEdu1stdateLessThan(Date value) {
            addCriterion("edu1stdate <", value, "edu1stdate");
            return (Criteria) this;
        }

        public Criteria andEdu1stdateLessThanOrEqualTo(Date value) {
            addCriterion("edu1stdate <=", value, "edu1stdate");
            return (Criteria) this;
        }

        public Criteria andEdu1stdateIn(List<Date> values) {
            addCriterion("edu1stdate in", values, "edu1stdate");
            return (Criteria) this;
        }

        public Criteria andEdu1stdateNotIn(List<Date> values) {
            addCriterion("edu1stdate not in", values, "edu1stdate");
            return (Criteria) this;
        }

        public Criteria andEdu1stdateBetween(Date value1, Date value2) {
            addCriterion("edu1stdate between", value1, value2, "edu1stdate");
            return (Criteria) this;
        }

        public Criteria andEdu1stdateNotBetween(Date value1, Date value2) {
            addCriterion("edu1stdate not between", value1, value2, "edu1stdate");
            return (Criteria) this;
        }

        public Criteria andEdu1eddateIsNull() {
            addCriterion("edu1eddate is null");
            return (Criteria) this;
        }

        public Criteria andEdu1eddateIsNotNull() {
            addCriterion("edu1eddate is not null");
            return (Criteria) this;
        }

        public Criteria andEdu1eddateEqualTo(Date value) {
            addCriterion("edu1eddate =", value, "edu1eddate");
            return (Criteria) this;
        }

        public Criteria andEdu1eddateNotEqualTo(Date value) {
            addCriterion("edu1eddate <>", value, "edu1eddate");
            return (Criteria) this;
        }

        public Criteria andEdu1eddateGreaterThan(Date value) {
            addCriterion("edu1eddate >", value, "edu1eddate");
            return (Criteria) this;
        }

        public Criteria andEdu1eddateGreaterThanOrEqualTo(Date value) {
            addCriterion("edu1eddate >=", value, "edu1eddate");
            return (Criteria) this;
        }

        public Criteria andEdu1eddateLessThan(Date value) {
            addCriterion("edu1eddate <", value, "edu1eddate");
            return (Criteria) this;
        }

        public Criteria andEdu1eddateLessThanOrEqualTo(Date value) {
            addCriterion("edu1eddate <=", value, "edu1eddate");
            return (Criteria) this;
        }

        public Criteria andEdu1eddateIn(List<Date> values) {
            addCriterion("edu1eddate in", values, "edu1eddate");
            return (Criteria) this;
        }

        public Criteria andEdu1eddateNotIn(List<Date> values) {
            addCriterion("edu1eddate not in", values, "edu1eddate");
            return (Criteria) this;
        }

        public Criteria andEdu1eddateBetween(Date value1, Date value2) {
            addCriterion("edu1eddate between", value1, value2, "edu1eddate");
            return (Criteria) this;
        }

        public Criteria andEdu1eddateNotBetween(Date value1, Date value2) {
            addCriterion("edu1eddate not between", value1, value2, "edu1eddate");
            return (Criteria) this;
        }

        public Criteria andEdu2IsNull() {
            addCriterion("edu2 is null");
            return (Criteria) this;
        }

        public Criteria andEdu2IsNotNull() {
            addCriterion("edu2 is not null");
            return (Criteria) this;
        }

        public Criteria andEdu2EqualTo(String value) {
            addCriterion("edu2 =", value, "edu2");
            return (Criteria) this;
        }

        public Criteria andEdu2NotEqualTo(String value) {
            addCriterion("edu2 <>", value, "edu2");
            return (Criteria) this;
        }

        public Criteria andEdu2GreaterThan(String value) {
            addCriterion("edu2 >", value, "edu2");
            return (Criteria) this;
        }

        public Criteria andEdu2GreaterThanOrEqualTo(String value) {
            addCriterion("edu2 >=", value, "edu2");
            return (Criteria) this;
        }

        public Criteria andEdu2LessThan(String value) {
            addCriterion("edu2 <", value, "edu2");
            return (Criteria) this;
        }

        public Criteria andEdu2LessThanOrEqualTo(String value) {
            addCriterion("edu2 <=", value, "edu2");
            return (Criteria) this;
        }

        public Criteria andEdu2Like(String value) {
            addCriterion("edu2 like", value, "edu2");
            return (Criteria) this;
        }

        public Criteria andEdu2NotLike(String value) {
            addCriterion("edu2 not like", value, "edu2");
            return (Criteria) this;
        }

        public Criteria andEdu2In(List<String> values) {
            addCriterion("edu2 in", values, "edu2");
            return (Criteria) this;
        }

        public Criteria andEdu2NotIn(List<String> values) {
            addCriterion("edu2 not in", values, "edu2");
            return (Criteria) this;
        }

        public Criteria andEdu2Between(String value1, String value2) {
            addCriterion("edu2 between", value1, value2, "edu2");
            return (Criteria) this;
        }

        public Criteria andEdu2NotBetween(String value1, String value2) {
            addCriterion("edu2 not between", value1, value2, "edu2");
            return (Criteria) this;
        }

        public Criteria andEdu2stdateIsNull() {
            addCriterion("edu2stdate is null");
            return (Criteria) this;
        }

        public Criteria andEdu2stdateIsNotNull() {
            addCriterion("edu2stdate is not null");
            return (Criteria) this;
        }

        public Criteria andEdu2stdateEqualTo(Date value) {
            addCriterion("edu2stdate =", value, "edu2stdate");
            return (Criteria) this;
        }

        public Criteria andEdu2stdateNotEqualTo(Date value) {
            addCriterion("edu2stdate <>", value, "edu2stdate");
            return (Criteria) this;
        }

        public Criteria andEdu2stdateGreaterThan(Date value) {
            addCriterion("edu2stdate >", value, "edu2stdate");
            return (Criteria) this;
        }

        public Criteria andEdu2stdateGreaterThanOrEqualTo(Date value) {
            addCriterion("edu2stdate >=", value, "edu2stdate");
            return (Criteria) this;
        }

        public Criteria andEdu2stdateLessThan(Date value) {
            addCriterion("edu2stdate <", value, "edu2stdate");
            return (Criteria) this;
        }

        public Criteria andEdu2stdateLessThanOrEqualTo(Date value) {
            addCriterion("edu2stdate <=", value, "edu2stdate");
            return (Criteria) this;
        }

        public Criteria andEdu2stdateIn(List<Date> values) {
            addCriterion("edu2stdate in", values, "edu2stdate");
            return (Criteria) this;
        }

        public Criteria andEdu2stdateNotIn(List<Date> values) {
            addCriterion("edu2stdate not in", values, "edu2stdate");
            return (Criteria) this;
        }

        public Criteria andEdu2stdateBetween(Date value1, Date value2) {
            addCriterion("edu2stdate between", value1, value2, "edu2stdate");
            return (Criteria) this;
        }

        public Criteria andEdu2stdateNotBetween(Date value1, Date value2) {
            addCriterion("edu2stdate not between", value1, value2, "edu2stdate");
            return (Criteria) this;
        }

        public Criteria andEdu2eddateIsNull() {
            addCriterion("edu2eddate is null");
            return (Criteria) this;
        }

        public Criteria andEdu2eddateIsNotNull() {
            addCriterion("edu2eddate is not null");
            return (Criteria) this;
        }

        public Criteria andEdu2eddateEqualTo(Date value) {
            addCriterion("edu2eddate =", value, "edu2eddate");
            return (Criteria) this;
        }

        public Criteria andEdu2eddateNotEqualTo(Date value) {
            addCriterion("edu2eddate <>", value, "edu2eddate");
            return (Criteria) this;
        }

        public Criteria andEdu2eddateGreaterThan(Date value) {
            addCriterion("edu2eddate >", value, "edu2eddate");
            return (Criteria) this;
        }

        public Criteria andEdu2eddateGreaterThanOrEqualTo(Date value) {
            addCriterion("edu2eddate >=", value, "edu2eddate");
            return (Criteria) this;
        }

        public Criteria andEdu2eddateLessThan(Date value) {
            addCriterion("edu2eddate <", value, "edu2eddate");
            return (Criteria) this;
        }

        public Criteria andEdu2eddateLessThanOrEqualTo(Date value) {
            addCriterion("edu2eddate <=", value, "edu2eddate");
            return (Criteria) this;
        }

        public Criteria andEdu2eddateIn(List<Date> values) {
            addCriterion("edu2eddate in", values, "edu2eddate");
            return (Criteria) this;
        }

        public Criteria andEdu2eddateNotIn(List<Date> values) {
            addCriterion("edu2eddate not in", values, "edu2eddate");
            return (Criteria) this;
        }

        public Criteria andEdu2eddateBetween(Date value1, Date value2) {
            addCriterion("edu2eddate between", value1, value2, "edu2eddate");
            return (Criteria) this;
        }

        public Criteria andEdu2eddateNotBetween(Date value1, Date value2) {
            addCriterion("edu2eddate not between", value1, value2, "edu2eddate");
            return (Criteria) this;
        }

        public Criteria andEdu3IsNull() {
            addCriterion("edu3 is null");
            return (Criteria) this;
        }

        public Criteria andEdu3IsNotNull() {
            addCriterion("edu3 is not null");
            return (Criteria) this;
        }

        public Criteria andEdu3EqualTo(String value) {
            addCriterion("edu3 =", value, "edu3");
            return (Criteria) this;
        }

        public Criteria andEdu3NotEqualTo(String value) {
            addCriterion("edu3 <>", value, "edu3");
            return (Criteria) this;
        }

        public Criteria andEdu3GreaterThan(String value) {
            addCriterion("edu3 >", value, "edu3");
            return (Criteria) this;
        }

        public Criteria andEdu3GreaterThanOrEqualTo(String value) {
            addCriterion("edu3 >=", value, "edu3");
            return (Criteria) this;
        }

        public Criteria andEdu3LessThan(String value) {
            addCriterion("edu3 <", value, "edu3");
            return (Criteria) this;
        }

        public Criteria andEdu3LessThanOrEqualTo(String value) {
            addCriterion("edu3 <=", value, "edu3");
            return (Criteria) this;
        }

        public Criteria andEdu3Like(String value) {
            addCriterion("edu3 like", value, "edu3");
            return (Criteria) this;
        }

        public Criteria andEdu3NotLike(String value) {
            addCriterion("edu3 not like", value, "edu3");
            return (Criteria) this;
        }

        public Criteria andEdu3In(List<String> values) {
            addCriterion("edu3 in", values, "edu3");
            return (Criteria) this;
        }

        public Criteria andEdu3NotIn(List<String> values) {
            addCriterion("edu3 not in", values, "edu3");
            return (Criteria) this;
        }

        public Criteria andEdu3Between(String value1, String value2) {
            addCriterion("edu3 between", value1, value2, "edu3");
            return (Criteria) this;
        }

        public Criteria andEdu3NotBetween(String value1, String value2) {
            addCriterion("edu3 not between", value1, value2, "edu3");
            return (Criteria) this;
        }

        public Criteria andEdu3stdateIsNull() {
            addCriterion("edu3stdate is null");
            return (Criteria) this;
        }

        public Criteria andEdu3stdateIsNotNull() {
            addCriterion("edu3stdate is not null");
            return (Criteria) this;
        }

        public Criteria andEdu3stdateEqualTo(Date value) {
            addCriterion("edu3stdate =", value, "edu3stdate");
            return (Criteria) this;
        }

        public Criteria andEdu3stdateNotEqualTo(Date value) {
            addCriterion("edu3stdate <>", value, "edu3stdate");
            return (Criteria) this;
        }

        public Criteria andEdu3stdateGreaterThan(Date value) {
            addCriterion("edu3stdate >", value, "edu3stdate");
            return (Criteria) this;
        }

        public Criteria andEdu3stdateGreaterThanOrEqualTo(Date value) {
            addCriterion("edu3stdate >=", value, "edu3stdate");
            return (Criteria) this;
        }

        public Criteria andEdu3stdateLessThan(Date value) {
            addCriterion("edu3stdate <", value, "edu3stdate");
            return (Criteria) this;
        }

        public Criteria andEdu3stdateLessThanOrEqualTo(Date value) {
            addCriterion("edu3stdate <=", value, "edu3stdate");
            return (Criteria) this;
        }

        public Criteria andEdu3stdateIn(List<Date> values) {
            addCriterion("edu3stdate in", values, "edu3stdate");
            return (Criteria) this;
        }

        public Criteria andEdu3stdateNotIn(List<Date> values) {
            addCriterion("edu3stdate not in", values, "edu3stdate");
            return (Criteria) this;
        }

        public Criteria andEdu3stdateBetween(Date value1, Date value2) {
            addCriterion("edu3stdate between", value1, value2, "edu3stdate");
            return (Criteria) this;
        }

        public Criteria andEdu3stdateNotBetween(Date value1, Date value2) {
            addCriterion("edu3stdate not between", value1, value2, "edu3stdate");
            return (Criteria) this;
        }

        public Criteria andEdu3eddateIsNull() {
            addCriterion("edu3eddate is null");
            return (Criteria) this;
        }

        public Criteria andEdu3eddateIsNotNull() {
            addCriterion("edu3eddate is not null");
            return (Criteria) this;
        }

        public Criteria andEdu3eddateEqualTo(Date value) {
            addCriterion("edu3eddate =", value, "edu3eddate");
            return (Criteria) this;
        }

        public Criteria andEdu3eddateNotEqualTo(Date value) {
            addCriterion("edu3eddate <>", value, "edu3eddate");
            return (Criteria) this;
        }

        public Criteria andEdu3eddateGreaterThan(Date value) {
            addCriterion("edu3eddate >", value, "edu3eddate");
            return (Criteria) this;
        }

        public Criteria andEdu3eddateGreaterThanOrEqualTo(Date value) {
            addCriterion("edu3eddate >=", value, "edu3eddate");
            return (Criteria) this;
        }

        public Criteria andEdu3eddateLessThan(Date value) {
            addCriterion("edu3eddate <", value, "edu3eddate");
            return (Criteria) this;
        }

        public Criteria andEdu3eddateLessThanOrEqualTo(Date value) {
            addCriterion("edu3eddate <=", value, "edu3eddate");
            return (Criteria) this;
        }

        public Criteria andEdu3eddateIn(List<Date> values) {
            addCriterion("edu3eddate in", values, "edu3eddate");
            return (Criteria) this;
        }

        public Criteria andEdu3eddateNotIn(List<Date> values) {
            addCriterion("edu3eddate not in", values, "edu3eddate");
            return (Criteria) this;
        }

        public Criteria andEdu3eddateBetween(Date value1, Date value2) {
            addCriterion("edu3eddate between", value1, value2, "edu3eddate");
            return (Criteria) this;
        }

        public Criteria andEdu3eddateNotBetween(Date value1, Date value2) {
            addCriterion("edu3eddate not between", value1, value2, "edu3eddate");
            return (Criteria) this;
        }

        public Criteria andWork1IsNull() {
            addCriterion("work1 is null");
            return (Criteria) this;
        }

        public Criteria andWork1IsNotNull() {
            addCriterion("work1 is not null");
            return (Criteria) this;
        }

        public Criteria andWork1EqualTo(String value) {
            addCriterion("work1 =", value, "work1");
            return (Criteria) this;
        }

        public Criteria andWork1NotEqualTo(String value) {
            addCriterion("work1 <>", value, "work1");
            return (Criteria) this;
        }

        public Criteria andWork1GreaterThan(String value) {
            addCriterion("work1 >", value, "work1");
            return (Criteria) this;
        }

        public Criteria andWork1GreaterThanOrEqualTo(String value) {
            addCriterion("work1 >=", value, "work1");
            return (Criteria) this;
        }

        public Criteria andWork1LessThan(String value) {
            addCriterion("work1 <", value, "work1");
            return (Criteria) this;
        }

        public Criteria andWork1LessThanOrEqualTo(String value) {
            addCriterion("work1 <=", value, "work1");
            return (Criteria) this;
        }

        public Criteria andWork1Like(String value) {
            addCriterion("work1 like", value, "work1");
            return (Criteria) this;
        }

        public Criteria andWork1NotLike(String value) {
            addCriterion("work1 not like", value, "work1");
            return (Criteria) this;
        }

        public Criteria andWork1In(List<String> values) {
            addCriterion("work1 in", values, "work1");
            return (Criteria) this;
        }

        public Criteria andWork1NotIn(List<String> values) {
            addCriterion("work1 not in", values, "work1");
            return (Criteria) this;
        }

        public Criteria andWork1Between(String value1, String value2) {
            addCriterion("work1 between", value1, value2, "work1");
            return (Criteria) this;
        }

        public Criteria andWork1NotBetween(String value1, String value2) {
            addCriterion("work1 not between", value1, value2, "work1");
            return (Criteria) this;
        }

        public Criteria andWork1stdateIsNull() {
            addCriterion("work1stdate is null");
            return (Criteria) this;
        }

        public Criteria andWork1stdateIsNotNull() {
            addCriterion("work1stdate is not null");
            return (Criteria) this;
        }

        public Criteria andWork1stdateEqualTo(Date value) {
            addCriterion("work1stdate =", value, "work1stdate");
            return (Criteria) this;
        }

        public Criteria andWork1stdateNotEqualTo(Date value) {
            addCriterion("work1stdate <>", value, "work1stdate");
            return (Criteria) this;
        }

        public Criteria andWork1stdateGreaterThan(Date value) {
            addCriterion("work1stdate >", value, "work1stdate");
            return (Criteria) this;
        }

        public Criteria andWork1stdateGreaterThanOrEqualTo(Date value) {
            addCriterion("work1stdate >=", value, "work1stdate");
            return (Criteria) this;
        }

        public Criteria andWork1stdateLessThan(Date value) {
            addCriterion("work1stdate <", value, "work1stdate");
            return (Criteria) this;
        }

        public Criteria andWork1stdateLessThanOrEqualTo(Date value) {
            addCriterion("work1stdate <=", value, "work1stdate");
            return (Criteria) this;
        }

        public Criteria andWork1stdateIn(List<Date> values) {
            addCriterion("work1stdate in", values, "work1stdate");
            return (Criteria) this;
        }

        public Criteria andWork1stdateNotIn(List<Date> values) {
            addCriterion("work1stdate not in", values, "work1stdate");
            return (Criteria) this;
        }

        public Criteria andWork1stdateBetween(Date value1, Date value2) {
            addCriterion("work1stdate between", value1, value2, "work1stdate");
            return (Criteria) this;
        }

        public Criteria andWork1stdateNotBetween(Date value1, Date value2) {
            addCriterion("work1stdate not between", value1, value2, "work1stdate");
            return (Criteria) this;
        }

        public Criteria andWork1eddateIsNull() {
            addCriterion("work1eddate is null");
            return (Criteria) this;
        }

        public Criteria andWork1eddateIsNotNull() {
            addCriterion("work1eddate is not null");
            return (Criteria) this;
        }

        public Criteria andWork1eddateEqualTo(Date value) {
            addCriterion("work1eddate =", value, "work1eddate");
            return (Criteria) this;
        }

        public Criteria andWork1eddateNotEqualTo(Date value) {
            addCriterion("work1eddate <>", value, "work1eddate");
            return (Criteria) this;
        }

        public Criteria andWork1eddateGreaterThan(Date value) {
            addCriterion("work1eddate >", value, "work1eddate");
            return (Criteria) this;
        }

        public Criteria andWork1eddateGreaterThanOrEqualTo(Date value) {
            addCriterion("work1eddate >=", value, "work1eddate");
            return (Criteria) this;
        }

        public Criteria andWork1eddateLessThan(Date value) {
            addCriterion("work1eddate <", value, "work1eddate");
            return (Criteria) this;
        }

        public Criteria andWork1eddateLessThanOrEqualTo(Date value) {
            addCriterion("work1eddate <=", value, "work1eddate");
            return (Criteria) this;
        }

        public Criteria andWork1eddateIn(List<Date> values) {
            addCriterion("work1eddate in", values, "work1eddate");
            return (Criteria) this;
        }

        public Criteria andWork1eddateNotIn(List<Date> values) {
            addCriterion("work1eddate not in", values, "work1eddate");
            return (Criteria) this;
        }

        public Criteria andWork1eddateBetween(Date value1, Date value2) {
            addCriterion("work1eddate between", value1, value2, "work1eddate");
            return (Criteria) this;
        }

        public Criteria andWork1eddateNotBetween(Date value1, Date value2) {
            addCriterion("work1eddate not between", value1, value2, "work1eddate");
            return (Criteria) this;
        }

        public Criteria andWork2IsNull() {
            addCriterion("work2 is null");
            return (Criteria) this;
        }

        public Criteria andWork2IsNotNull() {
            addCriterion("work2 is not null");
            return (Criteria) this;
        }

        public Criteria andWork2EqualTo(String value) {
            addCriterion("work2 =", value, "work2");
            return (Criteria) this;
        }

        public Criteria andWork2NotEqualTo(String value) {
            addCriterion("work2 <>", value, "work2");
            return (Criteria) this;
        }

        public Criteria andWork2GreaterThan(String value) {
            addCriterion("work2 >", value, "work2");
            return (Criteria) this;
        }

        public Criteria andWork2GreaterThanOrEqualTo(String value) {
            addCriterion("work2 >=", value, "work2");
            return (Criteria) this;
        }

        public Criteria andWork2LessThan(String value) {
            addCriterion("work2 <", value, "work2");
            return (Criteria) this;
        }

        public Criteria andWork2LessThanOrEqualTo(String value) {
            addCriterion("work2 <=", value, "work2");
            return (Criteria) this;
        }

        public Criteria andWork2Like(String value) {
            addCriterion("work2 like", value, "work2");
            return (Criteria) this;
        }

        public Criteria andWork2NotLike(String value) {
            addCriterion("work2 not like", value, "work2");
            return (Criteria) this;
        }

        public Criteria andWork2In(List<String> values) {
            addCriterion("work2 in", values, "work2");
            return (Criteria) this;
        }

        public Criteria andWork2NotIn(List<String> values) {
            addCriterion("work2 not in", values, "work2");
            return (Criteria) this;
        }

        public Criteria andWork2Between(String value1, String value2) {
            addCriterion("work2 between", value1, value2, "work2");
            return (Criteria) this;
        }

        public Criteria andWork2NotBetween(String value1, String value2) {
            addCriterion("work2 not between", value1, value2, "work2");
            return (Criteria) this;
        }

        public Criteria andWork2stdateIsNull() {
            addCriterion("work2stdate is null");
            return (Criteria) this;
        }

        public Criteria andWork2stdateIsNotNull() {
            addCriterion("work2stdate is not null");
            return (Criteria) this;
        }

        public Criteria andWork2stdateEqualTo(Date value) {
            addCriterion("work2stdate =", value, "work2stdate");
            return (Criteria) this;
        }

        public Criteria andWork2stdateNotEqualTo(Date value) {
            addCriterion("work2stdate <>", value, "work2stdate");
            return (Criteria) this;
        }

        public Criteria andWork2stdateGreaterThan(Date value) {
            addCriterion("work2stdate >", value, "work2stdate");
            return (Criteria) this;
        }

        public Criteria andWork2stdateGreaterThanOrEqualTo(Date value) {
            addCriterion("work2stdate >=", value, "work2stdate");
            return (Criteria) this;
        }

        public Criteria andWork2stdateLessThan(Date value) {
            addCriterion("work2stdate <", value, "work2stdate");
            return (Criteria) this;
        }

        public Criteria andWork2stdateLessThanOrEqualTo(Date value) {
            addCriterion("work2stdate <=", value, "work2stdate");
            return (Criteria) this;
        }

        public Criteria andWork2stdateIn(List<Date> values) {
            addCriterion("work2stdate in", values, "work2stdate");
            return (Criteria) this;
        }

        public Criteria andWork2stdateNotIn(List<Date> values) {
            addCriterion("work2stdate not in", values, "work2stdate");
            return (Criteria) this;
        }

        public Criteria andWork2stdateBetween(Date value1, Date value2) {
            addCriterion("work2stdate between", value1, value2, "work2stdate");
            return (Criteria) this;
        }

        public Criteria andWork2stdateNotBetween(Date value1, Date value2) {
            addCriterion("work2stdate not between", value1, value2, "work2stdate");
            return (Criteria) this;
        }

        public Criteria andWork2eddateIsNull() {
            addCriterion("work2eddate is null");
            return (Criteria) this;
        }

        public Criteria andWork2eddateIsNotNull() {
            addCriterion("work2eddate is not null");
            return (Criteria) this;
        }

        public Criteria andWork2eddateEqualTo(Date value) {
            addCriterion("work2eddate =", value, "work2eddate");
            return (Criteria) this;
        }

        public Criteria andWork2eddateNotEqualTo(Date value) {
            addCriterion("work2eddate <>", value, "work2eddate");
            return (Criteria) this;
        }

        public Criteria andWork2eddateGreaterThan(Date value) {
            addCriterion("work2eddate >", value, "work2eddate");
            return (Criteria) this;
        }

        public Criteria andWork2eddateGreaterThanOrEqualTo(Date value) {
            addCriterion("work2eddate >=", value, "work2eddate");
            return (Criteria) this;
        }

        public Criteria andWork2eddateLessThan(Date value) {
            addCriterion("work2eddate <", value, "work2eddate");
            return (Criteria) this;
        }

        public Criteria andWork2eddateLessThanOrEqualTo(Date value) {
            addCriterion("work2eddate <=", value, "work2eddate");
            return (Criteria) this;
        }

        public Criteria andWork2eddateIn(List<Date> values) {
            addCriterion("work2eddate in", values, "work2eddate");
            return (Criteria) this;
        }

        public Criteria andWork2eddateNotIn(List<Date> values) {
            addCriterion("work2eddate not in", values, "work2eddate");
            return (Criteria) this;
        }

        public Criteria andWork2eddateBetween(Date value1, Date value2) {
            addCriterion("work2eddate between", value1, value2, "work2eddate");
            return (Criteria) this;
        }

        public Criteria andWork2eddateNotBetween(Date value1, Date value2) {
            addCriterion("work2eddate not between", value1, value2, "work2eddate");
            return (Criteria) this;
        }

        public Criteria andWork3IsNull() {
            addCriterion("work3 is null");
            return (Criteria) this;
        }

        public Criteria andWork3IsNotNull() {
            addCriterion("work3 is not null");
            return (Criteria) this;
        }

        public Criteria andWork3EqualTo(String value) {
            addCriterion("work3 =", value, "work3");
            return (Criteria) this;
        }

        public Criteria andWork3NotEqualTo(String value) {
            addCriterion("work3 <>", value, "work3");
            return (Criteria) this;
        }

        public Criteria andWork3GreaterThan(String value) {
            addCriterion("work3 >", value, "work3");
            return (Criteria) this;
        }

        public Criteria andWork3GreaterThanOrEqualTo(String value) {
            addCriterion("work3 >=", value, "work3");
            return (Criteria) this;
        }

        public Criteria andWork3LessThan(String value) {
            addCriterion("work3 <", value, "work3");
            return (Criteria) this;
        }

        public Criteria andWork3LessThanOrEqualTo(String value) {
            addCriterion("work3 <=", value, "work3");
            return (Criteria) this;
        }

        public Criteria andWork3Like(String value) {
            addCriterion("work3 like", value, "work3");
            return (Criteria) this;
        }

        public Criteria andWork3NotLike(String value) {
            addCriterion("work3 not like", value, "work3");
            return (Criteria) this;
        }

        public Criteria andWork3In(List<String> values) {
            addCriterion("work3 in", values, "work3");
            return (Criteria) this;
        }

        public Criteria andWork3NotIn(List<String> values) {
            addCriterion("work3 not in", values, "work3");
            return (Criteria) this;
        }

        public Criteria andWork3Between(String value1, String value2) {
            addCriterion("work3 between", value1, value2, "work3");
            return (Criteria) this;
        }

        public Criteria andWork3NotBetween(String value1, String value2) {
            addCriterion("work3 not between", value1, value2, "work3");
            return (Criteria) this;
        }

        public Criteria andWork3stdateIsNull() {
            addCriterion("work3stdate is null");
            return (Criteria) this;
        }

        public Criteria andWork3stdateIsNotNull() {
            addCriterion("work3stdate is not null");
            return (Criteria) this;
        }

        public Criteria andWork3stdateEqualTo(Date value) {
            addCriterion("work3stdate =", value, "work3stdate");
            return (Criteria) this;
        }

        public Criteria andWork3stdateNotEqualTo(Date value) {
            addCriterion("work3stdate <>", value, "work3stdate");
            return (Criteria) this;
        }

        public Criteria andWork3stdateGreaterThan(Date value) {
            addCriterion("work3stdate >", value, "work3stdate");
            return (Criteria) this;
        }

        public Criteria andWork3stdateGreaterThanOrEqualTo(Date value) {
            addCriterion("work3stdate >=", value, "work3stdate");
            return (Criteria) this;
        }

        public Criteria andWork3stdateLessThan(Date value) {
            addCriterion("work3stdate <", value, "work3stdate");
            return (Criteria) this;
        }

        public Criteria andWork3stdateLessThanOrEqualTo(Date value) {
            addCriterion("work3stdate <=", value, "work3stdate");
            return (Criteria) this;
        }

        public Criteria andWork3stdateIn(List<Date> values) {
            addCriterion("work3stdate in", values, "work3stdate");
            return (Criteria) this;
        }

        public Criteria andWork3stdateNotIn(List<Date> values) {
            addCriterion("work3stdate not in", values, "work3stdate");
            return (Criteria) this;
        }

        public Criteria andWork3stdateBetween(Date value1, Date value2) {
            addCriterion("work3stdate between", value1, value2, "work3stdate");
            return (Criteria) this;
        }

        public Criteria andWork3stdateNotBetween(Date value1, Date value2) {
            addCriterion("work3stdate not between", value1, value2, "work3stdate");
            return (Criteria) this;
        }

        public Criteria andWork3eddateIsNull() {
            addCriterion("work3eddate is null");
            return (Criteria) this;
        }

        public Criteria andWork3eddateIsNotNull() {
            addCriterion("work3eddate is not null");
            return (Criteria) this;
        }

        public Criteria andWork3eddateEqualTo(Date value) {
            addCriterion("work3eddate =", value, "work3eddate");
            return (Criteria) this;
        }

        public Criteria andWork3eddateNotEqualTo(Date value) {
            addCriterion("work3eddate <>", value, "work3eddate");
            return (Criteria) this;
        }

        public Criteria andWork3eddateGreaterThan(Date value) {
            addCriterion("work3eddate >", value, "work3eddate");
            return (Criteria) this;
        }

        public Criteria andWork3eddateGreaterThanOrEqualTo(Date value) {
            addCriterion("work3eddate >=", value, "work3eddate");
            return (Criteria) this;
        }

        public Criteria andWork3eddateLessThan(Date value) {
            addCriterion("work3eddate <", value, "work3eddate");
            return (Criteria) this;
        }

        public Criteria andWork3eddateLessThanOrEqualTo(Date value) {
            addCriterion("work3eddate <=", value, "work3eddate");
            return (Criteria) this;
        }

        public Criteria andWork3eddateIn(List<Date> values) {
            addCriterion("work3eddate in", values, "work3eddate");
            return (Criteria) this;
        }

        public Criteria andWork3eddateNotIn(List<Date> values) {
            addCriterion("work3eddate not in", values, "work3eddate");
            return (Criteria) this;
        }

        public Criteria andWork3eddateBetween(Date value1, Date value2) {
            addCriterion("work3eddate between", value1, value2, "work3eddate");
            return (Criteria) this;
        }

        public Criteria andWork3eddateNotBetween(Date value1, Date value2) {
            addCriterion("work3eddate not between", value1, value2, "work3eddate");
            return (Criteria) this;
        }

        public Criteria andWork4IsNull() {
            addCriterion("work4 is null");
            return (Criteria) this;
        }

        public Criteria andWork4IsNotNull() {
            addCriterion("work4 is not null");
            return (Criteria) this;
        }

        public Criteria andWork4EqualTo(String value) {
            addCriterion("work4 =", value, "work4");
            return (Criteria) this;
        }

        public Criteria andWork4NotEqualTo(String value) {
            addCriterion("work4 <>", value, "work4");
            return (Criteria) this;
        }

        public Criteria andWork4GreaterThan(String value) {
            addCriterion("work4 >", value, "work4");
            return (Criteria) this;
        }

        public Criteria andWork4GreaterThanOrEqualTo(String value) {
            addCriterion("work4 >=", value, "work4");
            return (Criteria) this;
        }

        public Criteria andWork4LessThan(String value) {
            addCriterion("work4 <", value, "work4");
            return (Criteria) this;
        }

        public Criteria andWork4LessThanOrEqualTo(String value) {
            addCriterion("work4 <=", value, "work4");
            return (Criteria) this;
        }

        public Criteria andWork4Like(String value) {
            addCriterion("work4 like", value, "work4");
            return (Criteria) this;
        }

        public Criteria andWork4NotLike(String value) {
            addCriterion("work4 not like", value, "work4");
            return (Criteria) this;
        }

        public Criteria andWork4In(List<String> values) {
            addCriterion("work4 in", values, "work4");
            return (Criteria) this;
        }

        public Criteria andWork4NotIn(List<String> values) {
            addCriterion("work4 not in", values, "work4");
            return (Criteria) this;
        }

        public Criteria andWork4Between(String value1, String value2) {
            addCriterion("work4 between", value1, value2, "work4");
            return (Criteria) this;
        }

        public Criteria andWork4NotBetween(String value1, String value2) {
            addCriterion("work4 not between", value1, value2, "work4");
            return (Criteria) this;
        }

        public Criteria andWork4stdateIsNull() {
            addCriterion("work4stdate is null");
            return (Criteria) this;
        }

        public Criteria andWork4stdateIsNotNull() {
            addCriterion("work4stdate is not null");
            return (Criteria) this;
        }

        public Criteria andWork4stdateEqualTo(Date value) {
            addCriterion("work4stdate =", value, "work4stdate");
            return (Criteria) this;
        }

        public Criteria andWork4stdateNotEqualTo(Date value) {
            addCriterion("work4stdate <>", value, "work4stdate");
            return (Criteria) this;
        }

        public Criteria andWork4stdateGreaterThan(Date value) {
            addCriterion("work4stdate >", value, "work4stdate");
            return (Criteria) this;
        }

        public Criteria andWork4stdateGreaterThanOrEqualTo(Date value) {
            addCriterion("work4stdate >=", value, "work4stdate");
            return (Criteria) this;
        }

        public Criteria andWork4stdateLessThan(Date value) {
            addCriterion("work4stdate <", value, "work4stdate");
            return (Criteria) this;
        }

        public Criteria andWork4stdateLessThanOrEqualTo(Date value) {
            addCriterion("work4stdate <=", value, "work4stdate");
            return (Criteria) this;
        }

        public Criteria andWork4stdateIn(List<Date> values) {
            addCriterion("work4stdate in", values, "work4stdate");
            return (Criteria) this;
        }

        public Criteria andWork4stdateNotIn(List<Date> values) {
            addCriterion("work4stdate not in", values, "work4stdate");
            return (Criteria) this;
        }

        public Criteria andWork4stdateBetween(Date value1, Date value2) {
            addCriterion("work4stdate between", value1, value2, "work4stdate");
            return (Criteria) this;
        }

        public Criteria andWork4stdateNotBetween(Date value1, Date value2) {
            addCriterion("work4stdate not between", value1, value2, "work4stdate");
            return (Criteria) this;
        }

        public Criteria andWork4eddateIsNull() {
            addCriterion("work4eddate is null");
            return (Criteria) this;
        }

        public Criteria andWork4eddateIsNotNull() {
            addCriterion("work4eddate is not null");
            return (Criteria) this;
        }

        public Criteria andWork4eddateEqualTo(Date value) {
            addCriterion("work4eddate =", value, "work4eddate");
            return (Criteria) this;
        }

        public Criteria andWork4eddateNotEqualTo(Date value) {
            addCriterion("work4eddate <>", value, "work4eddate");
            return (Criteria) this;
        }

        public Criteria andWork4eddateGreaterThan(Date value) {
            addCriterion("work4eddate >", value, "work4eddate");
            return (Criteria) this;
        }

        public Criteria andWork4eddateGreaterThanOrEqualTo(Date value) {
            addCriterion("work4eddate >=", value, "work4eddate");
            return (Criteria) this;
        }

        public Criteria andWork4eddateLessThan(Date value) {
            addCriterion("work4eddate <", value, "work4eddate");
            return (Criteria) this;
        }

        public Criteria andWork4eddateLessThanOrEqualTo(Date value) {
            addCriterion("work4eddate <=", value, "work4eddate");
            return (Criteria) this;
        }

        public Criteria andWork4eddateIn(List<Date> values) {
            addCriterion("work4eddate in", values, "work4eddate");
            return (Criteria) this;
        }

        public Criteria andWork4eddateNotIn(List<Date> values) {
            addCriterion("work4eddate not in", values, "work4eddate");
            return (Criteria) this;
        }

        public Criteria andWork4eddateBetween(Date value1, Date value2) {
            addCriterion("work4eddate between", value1, value2, "work4eddate");
            return (Criteria) this;
        }

        public Criteria andWork4eddateNotBetween(Date value1, Date value2) {
            addCriterion("work4eddate not between", value1, value2, "work4eddate");
            return (Criteria) this;
        }

        public Criteria andPersonaliyIsNull() {
            addCriterion("personaliy is null");
            return (Criteria) this;
        }

        public Criteria andPersonaliyIsNotNull() {
            addCriterion("personaliy is not null");
            return (Criteria) this;
        }

        public Criteria andPersonaliyEqualTo(String value) {
            addCriterion("personaliy =", value, "personaliy");
            return (Criteria) this;
        }

        public Criteria andPersonaliyNotEqualTo(String value) {
            addCriterion("personaliy <>", value, "personaliy");
            return (Criteria) this;
        }

        public Criteria andPersonaliyGreaterThan(String value) {
            addCriterion("personaliy >", value, "personaliy");
            return (Criteria) this;
        }

        public Criteria andPersonaliyGreaterThanOrEqualTo(String value) {
            addCriterion("personaliy >=", value, "personaliy");
            return (Criteria) this;
        }

        public Criteria andPersonaliyLessThan(String value) {
            addCriterion("personaliy <", value, "personaliy");
            return (Criteria) this;
        }

        public Criteria andPersonaliyLessThanOrEqualTo(String value) {
            addCriterion("personaliy <=", value, "personaliy");
            return (Criteria) this;
        }

        public Criteria andPersonaliyLike(String value) {
            addCriterion("personaliy like", value, "personaliy");
            return (Criteria) this;
        }

        public Criteria andPersonaliyNotLike(String value) {
            addCriterion("personaliy not like", value, "personaliy");
            return (Criteria) this;
        }

        public Criteria andPersonaliyIn(List<String> values) {
            addCriterion("personaliy in", values, "personaliy");
            return (Criteria) this;
        }

        public Criteria andPersonaliyNotIn(List<String> values) {
            addCriterion("personaliy not in", values, "personaliy");
            return (Criteria) this;
        }

        public Criteria andPersonaliyBetween(String value1, String value2) {
            addCriterion("personaliy between", value1, value2, "personaliy");
            return (Criteria) this;
        }

        public Criteria andPersonaliyNotBetween(String value1, String value2) {
            addCriterion("personaliy not between", value1, value2, "personaliy");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
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

        public Criteria andMarriedIsNull() {
            addCriterion("married is null");
            return (Criteria) this;
        }

        public Criteria andMarriedIsNotNull() {
            addCriterion("married is not null");
            return (Criteria) this;
        }

        public Criteria andMarriedEqualTo(String value) {
            addCriterion("married =", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedNotEqualTo(String value) {
            addCriterion("married <>", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedGreaterThan(String value) {
            addCriterion("married >", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedGreaterThanOrEqualTo(String value) {
            addCriterion("married >=", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedLessThan(String value) {
            addCriterion("married <", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedLessThanOrEqualTo(String value) {
            addCriterion("married <=", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedLike(String value) {
            addCriterion("married like", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedNotLike(String value) {
            addCriterion("married not like", value, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedIn(List<String> values) {
            addCriterion("married in", values, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedNotIn(List<String> values) {
            addCriterion("married not in", values, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedBetween(String value1, String value2) {
            addCriterion("married between", value1, value2, "married");
            return (Criteria) this;
        }

        public Criteria andMarriedNotBetween(String value1, String value2) {
            addCriterion("married not between", value1, value2, "married");
            return (Criteria) this;
        }

        public Criteria andWorkyearsIsNull() {
            addCriterion("workyears is null");
            return (Criteria) this;
        }

        public Criteria andWorkyearsIsNotNull() {
            addCriterion("workyears is not null");
            return (Criteria) this;
        }

        public Criteria andWorkyearsEqualTo(Integer value) {
            addCriterion("workyears =", value, "workyears");
            return (Criteria) this;
        }

        public Criteria andWorkyearsNotEqualTo(Integer value) {
            addCriterion("workyears <>", value, "workyears");
            return (Criteria) this;
        }

        public Criteria andWorkyearsGreaterThan(Integer value) {
            addCriterion("workyears >", value, "workyears");
            return (Criteria) this;
        }

        public Criteria andWorkyearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("workyears >=", value, "workyears");
            return (Criteria) this;
        }

        public Criteria andWorkyearsLessThan(Integer value) {
            addCriterion("workyears <", value, "workyears");
            return (Criteria) this;
        }

        public Criteria andWorkyearsLessThanOrEqualTo(Integer value) {
            addCriterion("workyears <=", value, "workyears");
            return (Criteria) this;
        }

        public Criteria andWorkyearsIn(List<Integer> values) {
            addCriterion("workyears in", values, "workyears");
            return (Criteria) this;
        }

        public Criteria andWorkyearsNotIn(List<Integer> values) {
            addCriterion("workyears not in", values, "workyears");
            return (Criteria) this;
        }

        public Criteria andWorkyearsBetween(Integer value1, Integer value2) {
            addCriterion("workyears between", value1, value2, "workyears");
            return (Criteria) this;
        }

        public Criteria andWorkyearsNotBetween(Integer value1, Integer value2) {
            addCriterion("workyears not between", value1, value2, "workyears");
            return (Criteria) this;
        }

        public Criteria andWork2jobtitleIsNull() {
            addCriterion("work2jobtitle is null");
            return (Criteria) this;
        }

        public Criteria andWork2jobtitleIsNotNull() {
            addCriterion("work2jobtitle is not null");
            return (Criteria) this;
        }

        public Criteria andWork2jobtitleEqualTo(String value) {
            addCriterion("work2jobtitle =", value, "work2jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork2jobtitleNotEqualTo(String value) {
            addCriterion("work2jobtitle <>", value, "work2jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork2jobtitleGreaterThan(String value) {
            addCriterion("work2jobtitle >", value, "work2jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork2jobtitleGreaterThanOrEqualTo(String value) {
            addCriterion("work2jobtitle >=", value, "work2jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork2jobtitleLessThan(String value) {
            addCriterion("work2jobtitle <", value, "work2jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork2jobtitleLessThanOrEqualTo(String value) {
            addCriterion("work2jobtitle <=", value, "work2jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork2jobtitleLike(String value) {
            addCriterion("work2jobtitle like", value, "work2jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork2jobtitleNotLike(String value) {
            addCriterion("work2jobtitle not like", value, "work2jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork2jobtitleIn(List<String> values) {
            addCriterion("work2jobtitle in", values, "work2jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork2jobtitleNotIn(List<String> values) {
            addCriterion("work2jobtitle not in", values, "work2jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork2jobtitleBetween(String value1, String value2) {
            addCriterion("work2jobtitle between", value1, value2, "work2jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork2jobtitleNotBetween(String value1, String value2) {
            addCriterion("work2jobtitle not between", value1, value2, "work2jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork3jobtitleIsNull() {
            addCriterion("work3jobtitle is null");
            return (Criteria) this;
        }

        public Criteria andWork3jobtitleIsNotNull() {
            addCriterion("work3jobtitle is not null");
            return (Criteria) this;
        }

        public Criteria andWork3jobtitleEqualTo(String value) {
            addCriterion("work3jobtitle =", value, "work3jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork3jobtitleNotEqualTo(String value) {
            addCriterion("work3jobtitle <>", value, "work3jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork3jobtitleGreaterThan(String value) {
            addCriterion("work3jobtitle >", value, "work3jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork3jobtitleGreaterThanOrEqualTo(String value) {
            addCriterion("work3jobtitle >=", value, "work3jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork3jobtitleLessThan(String value) {
            addCriterion("work3jobtitle <", value, "work3jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork3jobtitleLessThanOrEqualTo(String value) {
            addCriterion("work3jobtitle <=", value, "work3jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork3jobtitleLike(String value) {
            addCriterion("work3jobtitle like", value, "work3jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork3jobtitleNotLike(String value) {
            addCriterion("work3jobtitle not like", value, "work3jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork3jobtitleIn(List<String> values) {
            addCriterion("work3jobtitle in", values, "work3jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork3jobtitleNotIn(List<String> values) {
            addCriterion("work3jobtitle not in", values, "work3jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork3jobtitleBetween(String value1, String value2) {
            addCriterion("work3jobtitle between", value1, value2, "work3jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork3jobtitleNotBetween(String value1, String value2) {
            addCriterion("work3jobtitle not between", value1, value2, "work3jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork4jobtitleIsNull() {
            addCriterion("work4jobtitle is null");
            return (Criteria) this;
        }

        public Criteria andWork4jobtitleIsNotNull() {
            addCriterion("work4jobtitle is not null");
            return (Criteria) this;
        }

        public Criteria andWork4jobtitleEqualTo(String value) {
            addCriterion("work4jobtitle =", value, "work4jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork4jobtitleNotEqualTo(String value) {
            addCriterion("work4jobtitle <>", value, "work4jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork4jobtitleGreaterThan(String value) {
            addCriterion("work4jobtitle >", value, "work4jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork4jobtitleGreaterThanOrEqualTo(String value) {
            addCriterion("work4jobtitle >=", value, "work4jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork4jobtitleLessThan(String value) {
            addCriterion("work4jobtitle <", value, "work4jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork4jobtitleLessThanOrEqualTo(String value) {
            addCriterion("work4jobtitle <=", value, "work4jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork4jobtitleLike(String value) {
            addCriterion("work4jobtitle like", value, "work4jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork4jobtitleNotLike(String value) {
            addCriterion("work4jobtitle not like", value, "work4jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork4jobtitleIn(List<String> values) {
            addCriterion("work4jobtitle in", values, "work4jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork4jobtitleNotIn(List<String> values) {
            addCriterion("work4jobtitle not in", values, "work4jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork4jobtitleBetween(String value1, String value2) {
            addCriterion("work4jobtitle between", value1, value2, "work4jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork4jobtitleNotBetween(String value1, String value2) {
            addCriterion("work4jobtitle not between", value1, value2, "work4jobtitle");
            return (Criteria) this;
        }

        public Criteria andWork4descIsNull() {
            addCriterion("work4desc is null");
            return (Criteria) this;
        }

        public Criteria andWork4descIsNotNull() {
            addCriterion("work4desc is not null");
            return (Criteria) this;
        }

        public Criteria andWork4descEqualTo(String value) {
            addCriterion("work4desc =", value, "work4desc");
            return (Criteria) this;
        }

        public Criteria andWork4descNotEqualTo(String value) {
            addCriterion("work4desc <>", value, "work4desc");
            return (Criteria) this;
        }

        public Criteria andWork4descGreaterThan(String value) {
            addCriterion("work4desc >", value, "work4desc");
            return (Criteria) this;
        }

        public Criteria andWork4descGreaterThanOrEqualTo(String value) {
            addCriterion("work4desc >=", value, "work4desc");
            return (Criteria) this;
        }

        public Criteria andWork4descLessThan(String value) {
            addCriterion("work4desc <", value, "work4desc");
            return (Criteria) this;
        }

        public Criteria andWork4descLessThanOrEqualTo(String value) {
            addCriterion("work4desc <=", value, "work4desc");
            return (Criteria) this;
        }

        public Criteria andWork4descLike(String value) {
            addCriterion("work4desc like", value, "work4desc");
            return (Criteria) this;
        }

        public Criteria andWork4descNotLike(String value) {
            addCriterion("work4desc not like", value, "work4desc");
            return (Criteria) this;
        }

        public Criteria andWork4descIn(List<String> values) {
            addCriterion("work4desc in", values, "work4desc");
            return (Criteria) this;
        }

        public Criteria andWork4descNotIn(List<String> values) {
            addCriterion("work4desc not in", values, "work4desc");
            return (Criteria) this;
        }

        public Criteria andWork4descBetween(String value1, String value2) {
            addCriterion("work4desc between", value1, value2, "work4desc");
            return (Criteria) this;
        }

        public Criteria andWork4descNotBetween(String value1, String value2) {
            addCriterion("work4desc not between", value1, value2, "work4desc");
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

        public Criteria andStudenttypeIsNull() {
            addCriterion("studenttype is null");
            return (Criteria) this;
        }

        public Criteria andStudenttypeIsNotNull() {
            addCriterion("studenttype is not null");
            return (Criteria) this;
        }

        public Criteria andStudenttypeEqualTo(String value) {
            addCriterion("studenttype =", value, "studenttype");
            return (Criteria) this;
        }

        public Criteria andStudenttypeNotEqualTo(String value) {
            addCriterion("studenttype <>", value, "studenttype");
            return (Criteria) this;
        }

        public Criteria andStudenttypeGreaterThan(String value) {
            addCriterion("studenttype >", value, "studenttype");
            return (Criteria) this;
        }

        public Criteria andStudenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("studenttype >=", value, "studenttype");
            return (Criteria) this;
        }

        public Criteria andStudenttypeLessThan(String value) {
            addCriterion("studenttype <", value, "studenttype");
            return (Criteria) this;
        }

        public Criteria andStudenttypeLessThanOrEqualTo(String value) {
            addCriterion("studenttype <=", value, "studenttype");
            return (Criteria) this;
        }

        public Criteria andStudenttypeLike(String value) {
            addCriterion("studenttype like", value, "studenttype");
            return (Criteria) this;
        }

        public Criteria andStudenttypeNotLike(String value) {
            addCriterion("studenttype not like", value, "studenttype");
            return (Criteria) this;
        }

        public Criteria andStudenttypeIn(List<String> values) {
            addCriterion("studenttype in", values, "studenttype");
            return (Criteria) this;
        }

        public Criteria andStudenttypeNotIn(List<String> values) {
            addCriterion("studenttype not in", values, "studenttype");
            return (Criteria) this;
        }

        public Criteria andStudenttypeBetween(String value1, String value2) {
            addCriterion("studenttype between", value1, value2, "studenttype");
            return (Criteria) this;
        }

        public Criteria andStudenttypeNotBetween(String value1, String value2) {
            addCriterion("studenttype not between", value1, value2, "studenttype");
            return (Criteria) this;
        }

        public Criteria andJiguanIsNull() {
            addCriterion("jiguan is null");
            return (Criteria) this;
        }

        public Criteria andJiguanIsNotNull() {
            addCriterion("jiguan is not null");
            return (Criteria) this;
        }

        public Criteria andJiguanEqualTo(String value) {
            addCriterion("jiguan =", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotEqualTo(String value) {
            addCriterion("jiguan <>", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanGreaterThan(String value) {
            addCriterion("jiguan >", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanGreaterThanOrEqualTo(String value) {
            addCriterion("jiguan >=", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanLessThan(String value) {
            addCriterion("jiguan <", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanLessThanOrEqualTo(String value) {
            addCriterion("jiguan <=", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanLike(String value) {
            addCriterion("jiguan like", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotLike(String value) {
            addCriterion("jiguan not like", value, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanIn(List<String> values) {
            addCriterion("jiguan in", values, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotIn(List<String> values) {
            addCriterion("jiguan not in", values, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanBetween(String value1, String value2) {
            addCriterion("jiguan between", value1, value2, "jiguan");
            return (Criteria) this;
        }

        public Criteria andJiguanNotBetween(String value1, String value2) {
            addCriterion("jiguan not between", value1, value2, "jiguan");
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

        public Criteria andForwordvocationIsNull() {
            addCriterion("forwordvocation is null");
            return (Criteria) this;
        }

        public Criteria andForwordvocationIsNotNull() {
            addCriterion("forwordvocation is not null");
            return (Criteria) this;
        }

        public Criteria andForwordvocationEqualTo(String value) {
            addCriterion("forwordvocation =", value, "forwordvocation");
            return (Criteria) this;
        }

        public Criteria andForwordvocationNotEqualTo(String value) {
            addCriterion("forwordvocation <>", value, "forwordvocation");
            return (Criteria) this;
        }

        public Criteria andForwordvocationGreaterThan(String value) {
            addCriterion("forwordvocation >", value, "forwordvocation");
            return (Criteria) this;
        }

        public Criteria andForwordvocationGreaterThanOrEqualTo(String value) {
            addCriterion("forwordvocation >=", value, "forwordvocation");
            return (Criteria) this;
        }

        public Criteria andForwordvocationLessThan(String value) {
            addCriterion("forwordvocation <", value, "forwordvocation");
            return (Criteria) this;
        }

        public Criteria andForwordvocationLessThanOrEqualTo(String value) {
            addCriterion("forwordvocation <=", value, "forwordvocation");
            return (Criteria) this;
        }

        public Criteria andForwordvocationLike(String value) {
            addCriterion("forwordvocation like", value, "forwordvocation");
            return (Criteria) this;
        }

        public Criteria andForwordvocationNotLike(String value) {
            addCriterion("forwordvocation not like", value, "forwordvocation");
            return (Criteria) this;
        }

        public Criteria andForwordvocationIn(List<String> values) {
            addCriterion("forwordvocation in", values, "forwordvocation");
            return (Criteria) this;
        }

        public Criteria andForwordvocationNotIn(List<String> values) {
            addCriterion("forwordvocation not in", values, "forwordvocation");
            return (Criteria) this;
        }

        public Criteria andForwordvocationBetween(String value1, String value2) {
            addCriterion("forwordvocation between", value1, value2, "forwordvocation");
            return (Criteria) this;
        }

        public Criteria andForwordvocationNotBetween(String value1, String value2) {
            addCriterion("forwordvocation not between", value1, value2, "forwordvocation");
            return (Criteria) this;
        }

        public Criteria andNowsalaryIsNull() {
            addCriterion("nowsalary is null");
            return (Criteria) this;
        }

        public Criteria andNowsalaryIsNotNull() {
            addCriterion("nowsalary is not null");
            return (Criteria) this;
        }

        public Criteria andNowsalaryEqualTo(String value) {
            addCriterion("nowsalary =", value, "nowsalary");
            return (Criteria) this;
        }

        public Criteria andNowsalaryNotEqualTo(String value) {
            addCriterion("nowsalary <>", value, "nowsalary");
            return (Criteria) this;
        }

        public Criteria andNowsalaryGreaterThan(String value) {
            addCriterion("nowsalary >", value, "nowsalary");
            return (Criteria) this;
        }

        public Criteria andNowsalaryGreaterThanOrEqualTo(String value) {
            addCriterion("nowsalary >=", value, "nowsalary");
            return (Criteria) this;
        }

        public Criteria andNowsalaryLessThan(String value) {
            addCriterion("nowsalary <", value, "nowsalary");
            return (Criteria) this;
        }

        public Criteria andNowsalaryLessThanOrEqualTo(String value) {
            addCriterion("nowsalary <=", value, "nowsalary");
            return (Criteria) this;
        }

        public Criteria andNowsalaryLike(String value) {
            addCriterion("nowsalary like", value, "nowsalary");
            return (Criteria) this;
        }

        public Criteria andNowsalaryNotLike(String value) {
            addCriterion("nowsalary not like", value, "nowsalary");
            return (Criteria) this;
        }

        public Criteria andNowsalaryIn(List<String> values) {
            addCriterion("nowsalary in", values, "nowsalary");
            return (Criteria) this;
        }

        public Criteria andNowsalaryNotIn(List<String> values) {
            addCriterion("nowsalary not in", values, "nowsalary");
            return (Criteria) this;
        }

        public Criteria andNowsalaryBetween(String value1, String value2) {
            addCriterion("nowsalary between", value1, value2, "nowsalary");
            return (Criteria) this;
        }

        public Criteria andNowsalaryNotBetween(String value1, String value2) {
            addCriterion("nowsalary not between", value1, value2, "nowsalary");
            return (Criteria) this;
        }

        public Criteria andAimsalaryIsNull() {
            addCriterion("aimsalary is null");
            return (Criteria) this;
        }

        public Criteria andAimsalaryIsNotNull() {
            addCriterion("aimsalary is not null");
            return (Criteria) this;
        }

        public Criteria andAimsalaryEqualTo(String value) {
            addCriterion("aimsalary =", value, "aimsalary");
            return (Criteria) this;
        }

        public Criteria andAimsalaryNotEqualTo(String value) {
            addCriterion("aimsalary <>", value, "aimsalary");
            return (Criteria) this;
        }

        public Criteria andAimsalaryGreaterThan(String value) {
            addCriterion("aimsalary >", value, "aimsalary");
            return (Criteria) this;
        }

        public Criteria andAimsalaryGreaterThanOrEqualTo(String value) {
            addCriterion("aimsalary >=", value, "aimsalary");
            return (Criteria) this;
        }

        public Criteria andAimsalaryLessThan(String value) {
            addCriterion("aimsalary <", value, "aimsalary");
            return (Criteria) this;
        }

        public Criteria andAimsalaryLessThanOrEqualTo(String value) {
            addCriterion("aimsalary <=", value, "aimsalary");
            return (Criteria) this;
        }

        public Criteria andAimsalaryLike(String value) {
            addCriterion("aimsalary like", value, "aimsalary");
            return (Criteria) this;
        }

        public Criteria andAimsalaryNotLike(String value) {
            addCriterion("aimsalary not like", value, "aimsalary");
            return (Criteria) this;
        }

        public Criteria andAimsalaryIn(List<String> values) {
            addCriterion("aimsalary in", values, "aimsalary");
            return (Criteria) this;
        }

        public Criteria andAimsalaryNotIn(List<String> values) {
            addCriterion("aimsalary not in", values, "aimsalary");
            return (Criteria) this;
        }

        public Criteria andAimsalaryBetween(String value1, String value2) {
            addCriterion("aimsalary between", value1, value2, "aimsalary");
            return (Criteria) this;
        }

        public Criteria andAimsalaryNotBetween(String value1, String value2) {
            addCriterion("aimsalary not between", value1, value2, "aimsalary");
            return (Criteria) this;
        }

        public Criteria andPoliticalIsNull() {
            addCriterion("political is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalIsNotNull() {
            addCriterion("political is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalEqualTo(String value) {
            addCriterion("political =", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotEqualTo(String value) {
            addCriterion("political <>", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalGreaterThan(String value) {
            addCriterion("political >", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalGreaterThanOrEqualTo(String value) {
            addCriterion("political >=", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLessThan(String value) {
            addCriterion("political <", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLessThanOrEqualTo(String value) {
            addCriterion("political <=", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLike(String value) {
            addCriterion("political like", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotLike(String value) {
            addCriterion("political not like", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalIn(List<String> values) {
            addCriterion("political in", values, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotIn(List<String> values) {
            addCriterion("political not in", values, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalBetween(String value1, String value2) {
            addCriterion("political between", value1, value2, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotBetween(String value1, String value2) {
            addCriterion("political not between", value1, value2, "political");
            return (Criteria) this;
        }

        public Criteria andStartfromIsNull() {
            addCriterion("startfrom is null");
            return (Criteria) this;
        }

        public Criteria andStartfromIsNotNull() {
            addCriterion("startfrom is not null");
            return (Criteria) this;
        }

        public Criteria andStartfromEqualTo(String value) {
            addCriterion("startfrom =", value, "startfrom");
            return (Criteria) this;
        }

        public Criteria andStartfromNotEqualTo(String value) {
            addCriterion("startfrom <>", value, "startfrom");
            return (Criteria) this;
        }

        public Criteria andStartfromGreaterThan(String value) {
            addCriterion("startfrom >", value, "startfrom");
            return (Criteria) this;
        }

        public Criteria andStartfromGreaterThanOrEqualTo(String value) {
            addCriterion("startfrom >=", value, "startfrom");
            return (Criteria) this;
        }

        public Criteria andStartfromLessThan(String value) {
            addCriterion("startfrom <", value, "startfrom");
            return (Criteria) this;
        }

        public Criteria andStartfromLessThanOrEqualTo(String value) {
            addCriterion("startfrom <=", value, "startfrom");
            return (Criteria) this;
        }

        public Criteria andStartfromLike(String value) {
            addCriterion("startfrom like", value, "startfrom");
            return (Criteria) this;
        }

        public Criteria andStartfromNotLike(String value) {
            addCriterion("startfrom not like", value, "startfrom");
            return (Criteria) this;
        }

        public Criteria andStartfromIn(List<String> values) {
            addCriterion("startfrom in", values, "startfrom");
            return (Criteria) this;
        }

        public Criteria andStartfromNotIn(List<String> values) {
            addCriterion("startfrom not in", values, "startfrom");
            return (Criteria) this;
        }

        public Criteria andStartfromBetween(String value1, String value2) {
            addCriterion("startfrom between", value1, value2, "startfrom");
            return (Criteria) this;
        }

        public Criteria andStartfromNotBetween(String value1, String value2) {
            addCriterion("startfrom not between", value1, value2, "startfrom");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andEncouragementIsNull() {
            addCriterion("encouragement is null");
            return (Criteria) this;
        }

        public Criteria andEncouragementIsNotNull() {
            addCriterion("encouragement is not null");
            return (Criteria) this;
        }

        public Criteria andEncouragementEqualTo(String value) {
            addCriterion("encouragement =", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementNotEqualTo(String value) {
            addCriterion("encouragement <>", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementGreaterThan(String value) {
            addCriterion("encouragement >", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementGreaterThanOrEqualTo(String value) {
            addCriterion("encouragement >=", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementLessThan(String value) {
            addCriterion("encouragement <", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementLessThanOrEqualTo(String value) {
            addCriterion("encouragement <=", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementLike(String value) {
            addCriterion("encouragement like", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementNotLike(String value) {
            addCriterion("encouragement not like", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementIn(List<String> values) {
            addCriterion("encouragement in", values, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementNotIn(List<String> values) {
            addCriterion("encouragement not in", values, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementBetween(String value1, String value2) {
            addCriterion("encouragement between", value1, value2, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementNotBetween(String value1, String value2) {
            addCriterion("encouragement not between", value1, value2, "encouragement");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeIsNull() {
            addCriterion("graduatetime is null");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeIsNotNull() {
            addCriterion("graduatetime is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeEqualTo(String value) {
            addCriterion("graduatetime =", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeNotEqualTo(String value) {
            addCriterion("graduatetime <>", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeGreaterThan(String value) {
            addCriterion("graduatetime >", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("graduatetime >=", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeLessThan(String value) {
            addCriterion("graduatetime <", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeLessThanOrEqualTo(String value) {
            addCriterion("graduatetime <=", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeLike(String value) {
            addCriterion("graduatetime like", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeNotLike(String value) {
            addCriterion("graduatetime not like", value, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeIn(List<String> values) {
            addCriterion("graduatetime in", values, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeNotIn(List<String> values) {
            addCriterion("graduatetime not in", values, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeBetween(String value1, String value2) {
            addCriterion("graduatetime between", value1, value2, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andGraduatetimeNotBetween(String value1, String value2) {
            addCriterion("graduatetime not between", value1, value2, "graduatetime");
            return (Criteria) this;
        }

        public Criteria andBeginworktimeIsNull() {
            addCriterion("beginworktime is null");
            return (Criteria) this;
        }

        public Criteria andBeginworktimeIsNotNull() {
            addCriterion("beginworktime is not null");
            return (Criteria) this;
        }

        public Criteria andBeginworktimeEqualTo(String value) {
            addCriterion("beginworktime =", value, "beginworktime");
            return (Criteria) this;
        }

        public Criteria andBeginworktimeNotEqualTo(String value) {
            addCriterion("beginworktime <>", value, "beginworktime");
            return (Criteria) this;
        }

        public Criteria andBeginworktimeGreaterThan(String value) {
            addCriterion("beginworktime >", value, "beginworktime");
            return (Criteria) this;
        }

        public Criteria andBeginworktimeGreaterThanOrEqualTo(String value) {
            addCriterion("beginworktime >=", value, "beginworktime");
            return (Criteria) this;
        }

        public Criteria andBeginworktimeLessThan(String value) {
            addCriterion("beginworktime <", value, "beginworktime");
            return (Criteria) this;
        }

        public Criteria andBeginworktimeLessThanOrEqualTo(String value) {
            addCriterion("beginworktime <=", value, "beginworktime");
            return (Criteria) this;
        }

        public Criteria andBeginworktimeLike(String value) {
            addCriterion("beginworktime like", value, "beginworktime");
            return (Criteria) this;
        }

        public Criteria andBeginworktimeNotLike(String value) {
            addCriterion("beginworktime not like", value, "beginworktime");
            return (Criteria) this;
        }

        public Criteria andBeginworktimeIn(List<String> values) {
            addCriterion("beginworktime in", values, "beginworktime");
            return (Criteria) this;
        }

        public Criteria andBeginworktimeNotIn(List<String> values) {
            addCriterion("beginworktime not in", values, "beginworktime");
            return (Criteria) this;
        }

        public Criteria andBeginworktimeBetween(String value1, String value2) {
            addCriterion("beginworktime between", value1, value2, "beginworktime");
            return (Criteria) this;
        }

        public Criteria andBeginworktimeNotBetween(String value1, String value2) {
            addCriterion("beginworktime not between", value1, value2, "beginworktime");
            return (Criteria) this;
        }

        public Criteria andLessonIsNull() {
            addCriterion("lesson is null");
            return (Criteria) this;
        }

        public Criteria andLessonIsNotNull() {
            addCriterion("lesson is not null");
            return (Criteria) this;
        }

        public Criteria andLessonEqualTo(String value) {
            addCriterion("lesson =", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonNotEqualTo(String value) {
            addCriterion("lesson <>", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonGreaterThan(String value) {
            addCriterion("lesson >", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonGreaterThanOrEqualTo(String value) {
            addCriterion("lesson >=", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonLessThan(String value) {
            addCriterion("lesson <", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonLessThanOrEqualTo(String value) {
            addCriterion("lesson <=", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonLike(String value) {
            addCriterion("lesson like", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonNotLike(String value) {
            addCriterion("lesson not like", value, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonIn(List<String> values) {
            addCriterion("lesson in", values, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonNotIn(List<String> values) {
            addCriterion("lesson not in", values, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonBetween(String value1, String value2) {
            addCriterion("lesson between", value1, value2, "lesson");
            return (Criteria) this;
        }

        public Criteria andLessonNotBetween(String value1, String value2) {
            addCriterion("lesson not between", value1, value2, "lesson");
            return (Criteria) this;
        }

        public Criteria andComputerIsNull() {
            addCriterion("computer is null");
            return (Criteria) this;
        }

        public Criteria andComputerIsNotNull() {
            addCriterion("computer is not null");
            return (Criteria) this;
        }

        public Criteria andComputerEqualTo(String value) {
            addCriterion("computer =", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerNotEqualTo(String value) {
            addCriterion("computer <>", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerGreaterThan(String value) {
            addCriterion("computer >", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerGreaterThanOrEqualTo(String value) {
            addCriterion("computer >=", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerLessThan(String value) {
            addCriterion("computer <", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerLessThanOrEqualTo(String value) {
            addCriterion("computer <=", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerLike(String value) {
            addCriterion("computer like", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerNotLike(String value) {
            addCriterion("computer not like", value, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerIn(List<String> values) {
            addCriterion("computer in", values, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerNotIn(List<String> values) {
            addCriterion("computer not in", values, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerBetween(String value1, String value2) {
            addCriterion("computer between", value1, value2, "computer");
            return (Criteria) this;
        }

        public Criteria andComputerNotBetween(String value1, String value2) {
            addCriterion("computer not between", value1, value2, "computer");
            return (Criteria) this;
        }

        public Criteria andEnglishIsNull() {
            addCriterion("English is null");
            return (Criteria) this;
        }

        public Criteria andEnglishIsNotNull() {
            addCriterion("English is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishEqualTo(String value) {
            addCriterion("English =", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotEqualTo(String value) {
            addCriterion("English <>", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishGreaterThan(String value) {
            addCriterion("English >", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishGreaterThanOrEqualTo(String value) {
            addCriterion("English >=", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLessThan(String value) {
            addCriterion("English <", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLessThanOrEqualTo(String value) {
            addCriterion("English <=", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLike(String value) {
            addCriterion("English like", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotLike(String value) {
            addCriterion("English not like", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishIn(List<String> values) {
            addCriterion("English in", values, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotIn(List<String> values) {
            addCriterion("English not in", values, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishBetween(String value1, String value2) {
            addCriterion("English between", value1, value2, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotBetween(String value1, String value2) {
            addCriterion("English not between", value1, value2, "english");
            return (Criteria) this;
        }

        public Criteria andSchoolrankingsIsNull() {
            addCriterion("schoolrankings is null");
            return (Criteria) this;
        }

        public Criteria andSchoolrankingsIsNotNull() {
            addCriterion("schoolrankings is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolrankingsEqualTo(String value) {
            addCriterion("schoolrankings =", value, "schoolrankings");
            return (Criteria) this;
        }

        public Criteria andSchoolrankingsNotEqualTo(String value) {
            addCriterion("schoolrankings <>", value, "schoolrankings");
            return (Criteria) this;
        }

        public Criteria andSchoolrankingsGreaterThan(String value) {
            addCriterion("schoolrankings >", value, "schoolrankings");
            return (Criteria) this;
        }

        public Criteria andSchoolrankingsGreaterThanOrEqualTo(String value) {
            addCriterion("schoolrankings >=", value, "schoolrankings");
            return (Criteria) this;
        }

        public Criteria andSchoolrankingsLessThan(String value) {
            addCriterion("schoolrankings <", value, "schoolrankings");
            return (Criteria) this;
        }

        public Criteria andSchoolrankingsLessThanOrEqualTo(String value) {
            addCriterion("schoolrankings <=", value, "schoolrankings");
            return (Criteria) this;
        }

        public Criteria andSchoolrankingsLike(String value) {
            addCriterion("schoolrankings like", value, "schoolrankings");
            return (Criteria) this;
        }

        public Criteria andSchoolrankingsNotLike(String value) {
            addCriterion("schoolrankings not like", value, "schoolrankings");
            return (Criteria) this;
        }

        public Criteria andSchoolrankingsIn(List<String> values) {
            addCriterion("schoolrankings in", values, "schoolrankings");
            return (Criteria) this;
        }

        public Criteria andSchoolrankingsNotIn(List<String> values) {
            addCriterion("schoolrankings not in", values, "schoolrankings");
            return (Criteria) this;
        }

        public Criteria andSchoolrankingsBetween(String value1, String value2) {
            addCriterion("schoolrankings between", value1, value2, "schoolrankings");
            return (Criteria) this;
        }

        public Criteria andSchoolrankingsNotBetween(String value1, String value2) {
            addCriterion("schoolrankings not between", value1, value2, "schoolrankings");
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

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andNotionalIsNull() {
            addCriterion("notional is null");
            return (Criteria) this;
        }

        public Criteria andNotionalIsNotNull() {
            addCriterion("notional is not null");
            return (Criteria) this;
        }

        public Criteria andNotionalEqualTo(String value) {
            addCriterion("notional =", value, "notional");
            return (Criteria) this;
        }

        public Criteria andNotionalNotEqualTo(String value) {
            addCriterion("notional <>", value, "notional");
            return (Criteria) this;
        }

        public Criteria andNotionalGreaterThan(String value) {
            addCriterion("notional >", value, "notional");
            return (Criteria) this;
        }

        public Criteria andNotionalGreaterThanOrEqualTo(String value) {
            addCriterion("notional >=", value, "notional");
            return (Criteria) this;
        }

        public Criteria andNotionalLessThan(String value) {
            addCriterion("notional <", value, "notional");
            return (Criteria) this;
        }

        public Criteria andNotionalLessThanOrEqualTo(String value) {
            addCriterion("notional <=", value, "notional");
            return (Criteria) this;
        }

        public Criteria andNotionalLike(String value) {
            addCriterion("notional like", value, "notional");
            return (Criteria) this;
        }

        public Criteria andNotionalNotLike(String value) {
            addCriterion("notional not like", value, "notional");
            return (Criteria) this;
        }

        public Criteria andNotionalIn(List<String> values) {
            addCriterion("notional in", values, "notional");
            return (Criteria) this;
        }

        public Criteria andNotionalNotIn(List<String> values) {
            addCriterion("notional not in", values, "notional");
            return (Criteria) this;
        }

        public Criteria andNotionalBetween(String value1, String value2) {
            addCriterion("notional between", value1, value2, "notional");
            return (Criteria) this;
        }

        public Criteria andNotionalNotBetween(String value1, String value2) {
            addCriterion("notional not between", value1, value2, "notional");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("nationality like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("nationality not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andHrefIsNull() {
            addCriterion("href is null");
            return (Criteria) this;
        }

        public Criteria andHrefIsNotNull() {
            addCriterion("href is not null");
            return (Criteria) this;
        }

        public Criteria andHrefEqualTo(String value) {
            addCriterion("href =", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotEqualTo(String value) {
            addCriterion("href <>", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefGreaterThan(String value) {
            addCriterion("href >", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefGreaterThanOrEqualTo(String value) {
            addCriterion("href >=", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLessThan(String value) {
            addCriterion("href <", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLessThanOrEqualTo(String value) {
            addCriterion("href <=", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefLike(String value) {
            addCriterion("href like", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotLike(String value) {
            addCriterion("href not like", value, "href");
            return (Criteria) this;
        }

        public Criteria andHrefIn(List<String> values) {
            addCriterion("href in", values, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotIn(List<String> values) {
            addCriterion("href not in", values, "href");
            return (Criteria) this;
        }

        public Criteria andHrefBetween(String value1, String value2) {
            addCriterion("href between", value1, value2, "href");
            return (Criteria) this;
        }

        public Criteria andHrefNotBetween(String value1, String value2) {
            addCriterion("href not between", value1, value2, "href");
            return (Criteria) this;
        }

        public Criteria andHighIsNull() {
            addCriterion("high is null");
            return (Criteria) this;
        }

        public Criteria andHighIsNotNull() {
            addCriterion("high is not null");
            return (Criteria) this;
        }

        public Criteria andHighEqualTo(String value) {
            addCriterion("high =", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotEqualTo(String value) {
            addCriterion("high <>", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThan(String value) {
            addCriterion("high >", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThanOrEqualTo(String value) {
            addCriterion("high >=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThan(String value) {
            addCriterion("high <", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThanOrEqualTo(String value) {
            addCriterion("high <=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLike(String value) {
            addCriterion("high like", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotLike(String value) {
            addCriterion("high not like", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighIn(List<String> values) {
            addCriterion("high in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotIn(List<String> values) {
            addCriterion("high not in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighBetween(String value1, String value2) {
            addCriterion("high between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotBetween(String value1, String value2) {
            addCriterion("high not between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andTizhongIsNull() {
            addCriterion("tizhong is null");
            return (Criteria) this;
        }

        public Criteria andTizhongIsNotNull() {
            addCriterion("tizhong is not null");
            return (Criteria) this;
        }

        public Criteria andTizhongEqualTo(String value) {
            addCriterion("tizhong =", value, "tizhong");
            return (Criteria) this;
        }

        public Criteria andTizhongNotEqualTo(String value) {
            addCriterion("tizhong <>", value, "tizhong");
            return (Criteria) this;
        }

        public Criteria andTizhongGreaterThan(String value) {
            addCriterion("tizhong >", value, "tizhong");
            return (Criteria) this;
        }

        public Criteria andTizhongGreaterThanOrEqualTo(String value) {
            addCriterion("tizhong >=", value, "tizhong");
            return (Criteria) this;
        }

        public Criteria andTizhongLessThan(String value) {
            addCriterion("tizhong <", value, "tizhong");
            return (Criteria) this;
        }

        public Criteria andTizhongLessThanOrEqualTo(String value) {
            addCriterion("tizhong <=", value, "tizhong");
            return (Criteria) this;
        }

        public Criteria andTizhongLike(String value) {
            addCriterion("tizhong like", value, "tizhong");
            return (Criteria) this;
        }

        public Criteria andTizhongNotLike(String value) {
            addCriterion("tizhong not like", value, "tizhong");
            return (Criteria) this;
        }

        public Criteria andTizhongIn(List<String> values) {
            addCriterion("tizhong in", values, "tizhong");
            return (Criteria) this;
        }

        public Criteria andTizhongNotIn(List<String> values) {
            addCriterion("tizhong not in", values, "tizhong");
            return (Criteria) this;
        }

        public Criteria andTizhongBetween(String value1, String value2) {
            addCriterion("tizhong between", value1, value2, "tizhong");
            return (Criteria) this;
        }

        public Criteria andTizhongNotBetween(String value1, String value2) {
            addCriterion("tizhong not between", value1, value2, "tizhong");
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

        public Criteria andIsjobsearchIsNull() {
            addCriterion("isjobsearch is null");
            return (Criteria) this;
        }

        public Criteria andIsjobsearchIsNotNull() {
            addCriterion("isjobsearch is not null");
            return (Criteria) this;
        }

        public Criteria andIsjobsearchEqualTo(String value) {
            addCriterion("isjobsearch =", value, "isjobsearch");
            return (Criteria) this;
        }

        public Criteria andIsjobsearchNotEqualTo(String value) {
            addCriterion("isjobsearch <>", value, "isjobsearch");
            return (Criteria) this;
        }

        public Criteria andIsjobsearchGreaterThan(String value) {
            addCriterion("isjobsearch >", value, "isjobsearch");
            return (Criteria) this;
        }

        public Criteria andIsjobsearchGreaterThanOrEqualTo(String value) {
            addCriterion("isjobsearch >=", value, "isjobsearch");
            return (Criteria) this;
        }

        public Criteria andIsjobsearchLessThan(String value) {
            addCriterion("isjobsearch <", value, "isjobsearch");
            return (Criteria) this;
        }

        public Criteria andIsjobsearchLessThanOrEqualTo(String value) {
            addCriterion("isjobsearch <=", value, "isjobsearch");
            return (Criteria) this;
        }

        public Criteria andIsjobsearchLike(String value) {
            addCriterion("isjobsearch like", value, "isjobsearch");
            return (Criteria) this;
        }

        public Criteria andIsjobsearchNotLike(String value) {
            addCriterion("isjobsearch not like", value, "isjobsearch");
            return (Criteria) this;
        }

        public Criteria andIsjobsearchIn(List<String> values) {
            addCriterion("isjobsearch in", values, "isjobsearch");
            return (Criteria) this;
        }

        public Criteria andIsjobsearchNotIn(List<String> values) {
            addCriterion("isjobsearch not in", values, "isjobsearch");
            return (Criteria) this;
        }

        public Criteria andIsjobsearchBetween(String value1, String value2) {
            addCriterion("isjobsearch between", value1, value2, "isjobsearch");
            return (Criteria) this;
        }

        public Criteria andIsjobsearchNotBetween(String value1, String value2) {
            addCriterion("isjobsearch not between", value1, value2, "isjobsearch");
            return (Criteria) this;
        }

        public Criteria andOverseasworkIsNull() {
            addCriterion("overseaswork is null");
            return (Criteria) this;
        }

        public Criteria andOverseasworkIsNotNull() {
            addCriterion("overseaswork is not null");
            return (Criteria) this;
        }

        public Criteria andOverseasworkEqualTo(String value) {
            addCriterion("overseaswork =", value, "overseaswork");
            return (Criteria) this;
        }

        public Criteria andOverseasworkNotEqualTo(String value) {
            addCriterion("overseaswork <>", value, "overseaswork");
            return (Criteria) this;
        }

        public Criteria andOverseasworkGreaterThan(String value) {
            addCriterion("overseaswork >", value, "overseaswork");
            return (Criteria) this;
        }

        public Criteria andOverseasworkGreaterThanOrEqualTo(String value) {
            addCriterion("overseaswork >=", value, "overseaswork");
            return (Criteria) this;
        }

        public Criteria andOverseasworkLessThan(String value) {
            addCriterion("overseaswork <", value, "overseaswork");
            return (Criteria) this;
        }

        public Criteria andOverseasworkLessThanOrEqualTo(String value) {
            addCriterion("overseaswork <=", value, "overseaswork");
            return (Criteria) this;
        }

        public Criteria andOverseasworkLike(String value) {
            addCriterion("overseaswork like", value, "overseaswork");
            return (Criteria) this;
        }

        public Criteria andOverseasworkNotLike(String value) {
            addCriterion("overseaswork not like", value, "overseaswork");
            return (Criteria) this;
        }

        public Criteria andOverseasworkIn(List<String> values) {
            addCriterion("overseaswork in", values, "overseaswork");
            return (Criteria) this;
        }

        public Criteria andOverseasworkNotIn(List<String> values) {
            addCriterion("overseaswork not in", values, "overseaswork");
            return (Criteria) this;
        }

        public Criteria andOverseasworkBetween(String value1, String value2) {
            addCriterion("overseaswork between", value1, value2, "overseaswork");
            return (Criteria) this;
        }

        public Criteria andOverseasworkNotBetween(String value1, String value2) {
            addCriterion("overseaswork not between", value1, value2, "overseaswork");
            return (Criteria) this;
        }

        public Criteria andJobhoppingfrequencyIsNull() {
            addCriterion("jobhoppingfrequency is null");
            return (Criteria) this;
        }

        public Criteria andJobhoppingfrequencyIsNotNull() {
            addCriterion("jobhoppingfrequency is not null");
            return (Criteria) this;
        }

        public Criteria andJobhoppingfrequencyEqualTo(String value) {
            addCriterion("jobhoppingfrequency =", value, "jobhoppingfrequency");
            return (Criteria) this;
        }

        public Criteria andJobhoppingfrequencyNotEqualTo(String value) {
            addCriterion("jobhoppingfrequency <>", value, "jobhoppingfrequency");
            return (Criteria) this;
        }

        public Criteria andJobhoppingfrequencyGreaterThan(String value) {
            addCriterion("jobhoppingfrequency >", value, "jobhoppingfrequency");
            return (Criteria) this;
        }

        public Criteria andJobhoppingfrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("jobhoppingfrequency >=", value, "jobhoppingfrequency");
            return (Criteria) this;
        }

        public Criteria andJobhoppingfrequencyLessThan(String value) {
            addCriterion("jobhoppingfrequency <", value, "jobhoppingfrequency");
            return (Criteria) this;
        }

        public Criteria andJobhoppingfrequencyLessThanOrEqualTo(String value) {
            addCriterion("jobhoppingfrequency <=", value, "jobhoppingfrequency");
            return (Criteria) this;
        }

        public Criteria andJobhoppingfrequencyLike(String value) {
            addCriterion("jobhoppingfrequency like", value, "jobhoppingfrequency");
            return (Criteria) this;
        }

        public Criteria andJobhoppingfrequencyNotLike(String value) {
            addCriterion("jobhoppingfrequency not like", value, "jobhoppingfrequency");
            return (Criteria) this;
        }

        public Criteria andJobhoppingfrequencyIn(List<String> values) {
            addCriterion("jobhoppingfrequency in", values, "jobhoppingfrequency");
            return (Criteria) this;
        }

        public Criteria andJobhoppingfrequencyNotIn(List<String> values) {
            addCriterion("jobhoppingfrequency not in", values, "jobhoppingfrequency");
            return (Criteria) this;
        }

        public Criteria andJobhoppingfrequencyBetween(String value1, String value2) {
            addCriterion("jobhoppingfrequency between", value1, value2, "jobhoppingfrequency");
            return (Criteria) this;
        }

        public Criteria andJobhoppingfrequencyNotBetween(String value1, String value2) {
            addCriterion("jobhoppingfrequency not between", value1, value2, "jobhoppingfrequency");
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

        public Criteria andWebchatIsNull() {
            addCriterion("webchat is null");
            return (Criteria) this;
        }

        public Criteria andWebchatIsNotNull() {
            addCriterion("webchat is not null");
            return (Criteria) this;
        }

        public Criteria andWebchatEqualTo(String value) {
            addCriterion("webchat =", value, "webchat");
            return (Criteria) this;
        }

        public Criteria andWebchatNotEqualTo(String value) {
            addCriterion("webchat <>", value, "webchat");
            return (Criteria) this;
        }

        public Criteria andWebchatGreaterThan(String value) {
            addCriterion("webchat >", value, "webchat");
            return (Criteria) this;
        }

        public Criteria andWebchatGreaterThanOrEqualTo(String value) {
            addCriterion("webchat >=", value, "webchat");
            return (Criteria) this;
        }

        public Criteria andWebchatLessThan(String value) {
            addCriterion("webchat <", value, "webchat");
            return (Criteria) this;
        }

        public Criteria andWebchatLessThanOrEqualTo(String value) {
            addCriterion("webchat <=", value, "webchat");
            return (Criteria) this;
        }

        public Criteria andWebchatLike(String value) {
            addCriterion("webchat like", value, "webchat");
            return (Criteria) this;
        }

        public Criteria andWebchatNotLike(String value) {
            addCriterion("webchat not like", value, "webchat");
            return (Criteria) this;
        }

        public Criteria andWebchatIn(List<String> values) {
            addCriterion("webchat in", values, "webchat");
            return (Criteria) this;
        }

        public Criteria andWebchatNotIn(List<String> values) {
            addCriterion("webchat not in", values, "webchat");
            return (Criteria) this;
        }

        public Criteria andWebchatBetween(String value1, String value2) {
            addCriterion("webchat between", value1, value2, "webchat");
            return (Criteria) this;
        }

        public Criteria andWebchatNotBetween(String value1, String value2) {
            addCriterion("webchat not between", value1, value2, "webchat");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsIsNull() {
            addCriterion("personalInterests is null");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsIsNotNull() {
            addCriterion("personalInterests is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsEqualTo(String value) {
            addCriterion("personalInterests =", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsNotEqualTo(String value) {
            addCriterion("personalInterests <>", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsGreaterThan(String value) {
            addCriterion("personalInterests >", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsGreaterThanOrEqualTo(String value) {
            addCriterion("personalInterests >=", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsLessThan(String value) {
            addCriterion("personalInterests <", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsLessThanOrEqualTo(String value) {
            addCriterion("personalInterests <=", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsLike(String value) {
            addCriterion("personalInterests like", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsNotLike(String value) {
            addCriterion("personalInterests not like", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsIn(List<String> values) {
            addCriterion("personalInterests in", values, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsNotIn(List<String> values) {
            addCriterion("personalInterests not in", values, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsBetween(String value1, String value2) {
            addCriterion("personalInterests between", value1, value2, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsNotBetween(String value1, String value2) {
            addCriterion("personalInterests not between", value1, value2, "personalinterests");
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