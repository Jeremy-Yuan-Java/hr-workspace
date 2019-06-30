package com.hrbc.business.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CustomersExample() {
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

        public Criteria andOpsstaffnameIsNull() {
            addCriterion("opsstaffname is null");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnameIsNotNull() {
            addCriterion("opsstaffname is not null");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnameEqualTo(String value) {
            addCriterion("opsstaffname =", value, "opsstaffname");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnameNotEqualTo(String value) {
            addCriterion("opsstaffname <>", value, "opsstaffname");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnameGreaterThan(String value) {
            addCriterion("opsstaffname >", value, "opsstaffname");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnameGreaterThanOrEqualTo(String value) {
            addCriterion("opsstaffname >=", value, "opsstaffname");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnameLessThan(String value) {
            addCriterion("opsstaffname <", value, "opsstaffname");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnameLessThanOrEqualTo(String value) {
            addCriterion("opsstaffname <=", value, "opsstaffname");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnameLike(String value) {
            addCriterion("opsstaffname like", value, "opsstaffname");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnameNotLike(String value) {
            addCriterion("opsstaffname not like", value, "opsstaffname");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnameIn(List<String> values) {
            addCriterion("opsstaffname in", values, "opsstaffname");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnameNotIn(List<String> values) {
            addCriterion("opsstaffname not in", values, "opsstaffname");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnameBetween(String value1, String value2) {
            addCriterion("opsstaffname between", value1, value2, "opsstaffname");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnameNotBetween(String value1, String value2) {
            addCriterion("opsstaffname not between", value1, value2, "opsstaffname");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnoIsNull() {
            addCriterion("opsstaffno is null");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnoIsNotNull() {
            addCriterion("opsstaffno is not null");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnoEqualTo(String value) {
            addCriterion("opsstaffno =", value, "opsstaffno");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnoNotEqualTo(String value) {
            addCriterion("opsstaffno <>", value, "opsstaffno");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnoGreaterThan(String value) {
            addCriterion("opsstaffno >", value, "opsstaffno");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnoGreaterThanOrEqualTo(String value) {
            addCriterion("opsstaffno >=", value, "opsstaffno");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnoLessThan(String value) {
            addCriterion("opsstaffno <", value, "opsstaffno");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnoLessThanOrEqualTo(String value) {
            addCriterion("opsstaffno <=", value, "opsstaffno");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnoLike(String value) {
            addCriterion("opsstaffno like", value, "opsstaffno");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnoNotLike(String value) {
            addCriterion("opsstaffno not like", value, "opsstaffno");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnoIn(List<String> values) {
            addCriterion("opsstaffno in", values, "opsstaffno");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnoNotIn(List<String> values) {
            addCriterion("opsstaffno not in", values, "opsstaffno");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnoBetween(String value1, String value2) {
            addCriterion("opsstaffno between", value1, value2, "opsstaffno");
            return (Criteria) this;
        }

        public Criteria andOpsstaffnoNotBetween(String value1, String value2) {
            addCriterion("opsstaffno not between", value1, value2, "opsstaffno");
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

        public Criteria andWechatIsNull() {
            addCriterion("wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("wechat not between", value1, value2, "wechat");
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

        public Criteria andBusinessstateIsNull() {
            addCriterion("businessstate is null");
            return (Criteria) this;
        }

        public Criteria andBusinessstateIsNotNull() {
            addCriterion("businessstate is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessstateEqualTo(String value) {
            addCriterion("businessstate =", value, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateNotEqualTo(String value) {
            addCriterion("businessstate <>", value, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateGreaterThan(String value) {
            addCriterion("businessstate >", value, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateGreaterThanOrEqualTo(String value) {
            addCriterion("businessstate >=", value, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateLessThan(String value) {
            addCriterion("businessstate <", value, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateLessThanOrEqualTo(String value) {
            addCriterion("businessstate <=", value, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateLike(String value) {
            addCriterion("businessstate like", value, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateNotLike(String value) {
            addCriterion("businessstate not like", value, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateIn(List<String> values) {
            addCriterion("businessstate in", values, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateNotIn(List<String> values) {
            addCriterion("businessstate not in", values, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateBetween(String value1, String value2) {
            addCriterion("businessstate between", value1, value2, "businessstate");
            return (Criteria) this;
        }

        public Criteria andBusinessstateNotBetween(String value1, String value2) {
            addCriterion("businessstate not between", value1, value2, "businessstate");
            return (Criteria) this;
        }

        public Criteria andVerifyIsNull() {
            addCriterion("verify is null");
            return (Criteria) this;
        }

        public Criteria andVerifyIsNotNull() {
            addCriterion("verify is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyEqualTo(String value) {
            addCriterion("verify =", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyNotEqualTo(String value) {
            addCriterion("verify <>", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyGreaterThan(String value) {
            addCriterion("verify >", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyGreaterThanOrEqualTo(String value) {
            addCriterion("verify >=", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyLessThan(String value) {
            addCriterion("verify <", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyLessThanOrEqualTo(String value) {
            addCriterion("verify <=", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyLike(String value) {
            addCriterion("verify like", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyNotLike(String value) {
            addCriterion("verify not like", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyIn(List<String> values) {
            addCriterion("verify in", values, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyNotIn(List<String> values) {
            addCriterion("verify not in", values, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyBetween(String value1, String value2) {
            addCriterion("verify between", value1, value2, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyNotBetween(String value1, String value2) {
            addCriterion("verify not between", value1, value2, "verify");
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