package com.hrbc.business.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InvoicesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public InvoicesExample() {
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

        public Criteria andInvoicetypeIsNull() {
            addCriterion("invoicetype is null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIsNotNull() {
            addCriterion("invoicetype is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeEqualTo(String value) {
            addCriterion("invoicetype =", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotEqualTo(String value) {
            addCriterion("invoicetype <>", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThan(String value) {
            addCriterion("invoicetype >", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("invoicetype >=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThan(String value) {
            addCriterion("invoicetype <", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLessThanOrEqualTo(String value) {
            addCriterion("invoicetype <=", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeLike(String value) {
            addCriterion("invoicetype like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotLike(String value) {
            addCriterion("invoicetype not like", value, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeIn(List<String> values) {
            addCriterion("invoicetype in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotIn(List<String> values) {
            addCriterion("invoicetype not in", values, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeBetween(String value1, String value2) {
            addCriterion("invoicetype between", value1, value2, "invoicetype");
            return (Criteria) this;
        }

        public Criteria andInvoicetypeNotBetween(String value1, String value2) {
            addCriterion("invoicetype not between", value1, value2, "invoicetype");
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

        public Criteria andTaxnumIsNull() {
            addCriterion("taxnum is null");
            return (Criteria) this;
        }

        public Criteria andTaxnumIsNotNull() {
            addCriterion("taxnum is not null");
            return (Criteria) this;
        }

        public Criteria andTaxnumEqualTo(String value) {
            addCriterion("taxnum =", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumNotEqualTo(String value) {
            addCriterion("taxnum <>", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumGreaterThan(String value) {
            addCriterion("taxnum >", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumGreaterThanOrEqualTo(String value) {
            addCriterion("taxnum >=", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumLessThan(String value) {
            addCriterion("taxnum <", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumLessThanOrEqualTo(String value) {
            addCriterion("taxnum <=", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumLike(String value) {
            addCriterion("taxnum like", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumNotLike(String value) {
            addCriterion("taxnum not like", value, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumIn(List<String> values) {
            addCriterion("taxnum in", values, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumNotIn(List<String> values) {
            addCriterion("taxnum not in", values, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumBetween(String value1, String value2) {
            addCriterion("taxnum between", value1, value2, "taxnum");
            return (Criteria) this;
        }

        public Criteria andTaxnumNotBetween(String value1, String value2) {
            addCriterion("taxnum not between", value1, value2, "taxnum");
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andDepositbankIsNull() {
            addCriterion("depositbank is null");
            return (Criteria) this;
        }

        public Criteria andDepositbankIsNotNull() {
            addCriterion("depositbank is not null");
            return (Criteria) this;
        }

        public Criteria andDepositbankEqualTo(String value) {
            addCriterion("depositbank =", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotEqualTo(String value) {
            addCriterion("depositbank <>", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankGreaterThan(String value) {
            addCriterion("depositbank >", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankGreaterThanOrEqualTo(String value) {
            addCriterion("depositbank >=", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankLessThan(String value) {
            addCriterion("depositbank <", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankLessThanOrEqualTo(String value) {
            addCriterion("depositbank <=", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankLike(String value) {
            addCriterion("depositbank like", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotLike(String value) {
            addCriterion("depositbank not like", value, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankIn(List<String> values) {
            addCriterion("depositbank in", values, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotIn(List<String> values) {
            addCriterion("depositbank not in", values, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankBetween(String value1, String value2) {
            addCriterion("depositbank between", value1, value2, "depositbank");
            return (Criteria) this;
        }

        public Criteria andDepositbankNotBetween(String value1, String value2) {
            addCriterion("depositbank not between", value1, value2, "depositbank");
            return (Criteria) this;
        }

        public Criteria andBanknumberIsNull() {
            addCriterion("banknumber is null");
            return (Criteria) this;
        }

        public Criteria andBanknumberIsNotNull() {
            addCriterion("banknumber is not null");
            return (Criteria) this;
        }

        public Criteria andBanknumberEqualTo(String value) {
            addCriterion("banknumber =", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotEqualTo(String value) {
            addCriterion("banknumber <>", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberGreaterThan(String value) {
            addCriterion("banknumber >", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberGreaterThanOrEqualTo(String value) {
            addCriterion("banknumber >=", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLessThan(String value) {
            addCriterion("banknumber <", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLessThanOrEqualTo(String value) {
            addCriterion("banknumber <=", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLike(String value) {
            addCriterion("banknumber like", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotLike(String value) {
            addCriterion("banknumber not like", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberIn(List<String> values) {
            addCriterion("banknumber in", values, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotIn(List<String> values) {
            addCriterion("banknumber not in", values, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberBetween(String value1, String value2) {
            addCriterion("banknumber between", value1, value2, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotBetween(String value1, String value2) {
            addCriterion("banknumber not between", value1, value2, "banknumber");
            return (Criteria) this;
        }

        public Criteria andDepositmoneyIsNull() {
            addCriterion("depositmoney is null");
            return (Criteria) this;
        }

        public Criteria andDepositmoneyIsNotNull() {
            addCriterion("depositmoney is not null");
            return (Criteria) this;
        }

        public Criteria andDepositmoneyEqualTo(Double value) {
            addCriterion("depositmoney =", value, "depositmoney");
            return (Criteria) this;
        }

        public Criteria andDepositmoneyNotEqualTo(Double value) {
            addCriterion("depositmoney <>", value, "depositmoney");
            return (Criteria) this;
        }

        public Criteria andDepositmoneyGreaterThan(Double value) {
            addCriterion("depositmoney >", value, "depositmoney");
            return (Criteria) this;
        }

        public Criteria andDepositmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("depositmoney >=", value, "depositmoney");
            return (Criteria) this;
        }

        public Criteria andDepositmoneyLessThan(Double value) {
            addCriterion("depositmoney <", value, "depositmoney");
            return (Criteria) this;
        }

        public Criteria andDepositmoneyLessThanOrEqualTo(Double value) {
            addCriterion("depositmoney <=", value, "depositmoney");
            return (Criteria) this;
        }

        public Criteria andDepositmoneyIn(List<Double> values) {
            addCriterion("depositmoney in", values, "depositmoney");
            return (Criteria) this;
        }

        public Criteria andDepositmoneyNotIn(List<Double> values) {
            addCriterion("depositmoney not in", values, "depositmoney");
            return (Criteria) this;
        }

        public Criteria andDepositmoneyBetween(Double value1, Double value2) {
            addCriterion("depositmoney between", value1, value2, "depositmoney");
            return (Criteria) this;
        }

        public Criteria andDepositmoneyNotBetween(Double value1, Double value2) {
            addCriterion("depositmoney not between", value1, value2, "depositmoney");
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

        public Criteria andDeposittimeIsNull() {
            addCriterion("deposittime is null");
            return (Criteria) this;
        }

        public Criteria andDeposittimeIsNotNull() {
            addCriterion("deposittime is not null");
            return (Criteria) this;
        }

        public Criteria andDeposittimeEqualTo(Date value) {
            addCriterionForJDBCDate("deposittime =", value, "deposittime");
            return (Criteria) this;
        }

        public Criteria andDeposittimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("deposittime <>", value, "deposittime");
            return (Criteria) this;
        }

        public Criteria andDeposittimeGreaterThan(Date value) {
            addCriterionForJDBCDate("deposittime >", value, "deposittime");
            return (Criteria) this;
        }

        public Criteria andDeposittimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deposittime >=", value, "deposittime");
            return (Criteria) this;
        }

        public Criteria andDeposittimeLessThan(Date value) {
            addCriterionForJDBCDate("deposittime <", value, "deposittime");
            return (Criteria) this;
        }

        public Criteria andDeposittimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deposittime <=", value, "deposittime");
            return (Criteria) this;
        }

        public Criteria andDeposittimeIn(List<Date> values) {
            addCriterionForJDBCDate("deposittime in", values, "deposittime");
            return (Criteria) this;
        }

        public Criteria andDeposittimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("deposittime not in", values, "deposittime");
            return (Criteria) this;
        }

        public Criteria andDeposittimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deposittime between", value1, value2, "deposittime");
            return (Criteria) this;
        }

        public Criteria andDeposittimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deposittime not between", value1, value2, "deposittime");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusIsNull() {
            addCriterion("invoicestatus is null");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusIsNotNull() {
            addCriterion("invoicestatus is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusEqualTo(String value) {
            addCriterion("invoicestatus =", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusNotEqualTo(String value) {
            addCriterion("invoicestatus <>", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusGreaterThan(String value) {
            addCriterion("invoicestatus >", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusGreaterThanOrEqualTo(String value) {
            addCriterion("invoicestatus >=", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusLessThan(String value) {
            addCriterion("invoicestatus <", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusLessThanOrEqualTo(String value) {
            addCriterion("invoicestatus <=", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusLike(String value) {
            addCriterion("invoicestatus like", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusNotLike(String value) {
            addCriterion("invoicestatus not like", value, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusIn(List<String> values) {
            addCriterion("invoicestatus in", values, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusNotIn(List<String> values) {
            addCriterion("invoicestatus not in", values, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusBetween(String value1, String value2) {
            addCriterion("invoicestatus between", value1, value2, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andInvoicestatusNotBetween(String value1, String value2) {
            addCriterion("invoicestatus not between", value1, value2, "invoicestatus");
            return (Criteria) this;
        }

        public Criteria andProposerIsNull() {
            addCriterion("proposer is null");
            return (Criteria) this;
        }

        public Criteria andProposerIsNotNull() {
            addCriterion("proposer is not null");
            return (Criteria) this;
        }

        public Criteria andProposerEqualTo(String value) {
            addCriterion("proposer =", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotEqualTo(String value) {
            addCriterion("proposer <>", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThan(String value) {
            addCriterion("proposer >", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerGreaterThanOrEqualTo(String value) {
            addCriterion("proposer >=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThan(String value) {
            addCriterion("proposer <", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLessThanOrEqualTo(String value) {
            addCriterion("proposer <=", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerLike(String value) {
            addCriterion("proposer like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotLike(String value) {
            addCriterion("proposer not like", value, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerIn(List<String> values) {
            addCriterion("proposer in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotIn(List<String> values) {
            addCriterion("proposer not in", values, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerBetween(String value1, String value2) {
            addCriterion("proposer between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposerNotBetween(String value1, String value2) {
            addCriterion("proposer not between", value1, value2, "proposer");
            return (Criteria) this;
        }

        public Criteria andProposernameIsNull() {
            addCriterion("proposername is null");
            return (Criteria) this;
        }

        public Criteria andProposernameIsNotNull() {
            addCriterion("proposername is not null");
            return (Criteria) this;
        }

        public Criteria andProposernameEqualTo(String value) {
            addCriterion("proposername =", value, "proposername");
            return (Criteria) this;
        }

        public Criteria andProposernameNotEqualTo(String value) {
            addCriterion("proposername <>", value, "proposername");
            return (Criteria) this;
        }

        public Criteria andProposernameGreaterThan(String value) {
            addCriterion("proposername >", value, "proposername");
            return (Criteria) this;
        }

        public Criteria andProposernameGreaterThanOrEqualTo(String value) {
            addCriterion("proposername >=", value, "proposername");
            return (Criteria) this;
        }

        public Criteria andProposernameLessThan(String value) {
            addCriterion("proposername <", value, "proposername");
            return (Criteria) this;
        }

        public Criteria andProposernameLessThanOrEqualTo(String value) {
            addCriterion("proposername <=", value, "proposername");
            return (Criteria) this;
        }

        public Criteria andProposernameLike(String value) {
            addCriterion("proposername like", value, "proposername");
            return (Criteria) this;
        }

        public Criteria andProposernameNotLike(String value) {
            addCriterion("proposername not like", value, "proposername");
            return (Criteria) this;
        }

        public Criteria andProposernameIn(List<String> values) {
            addCriterion("proposername in", values, "proposername");
            return (Criteria) this;
        }

        public Criteria andProposernameNotIn(List<String> values) {
            addCriterion("proposername not in", values, "proposername");
            return (Criteria) this;
        }

        public Criteria andProposernameBetween(String value1, String value2) {
            addCriterion("proposername between", value1, value2, "proposername");
            return (Criteria) this;
        }

        public Criteria andProposernameNotBetween(String value1, String value2) {
            addCriterion("proposername not between", value1, value2, "proposername");
            return (Criteria) this;
        }

        public Criteria andDrawerIsNull() {
            addCriterion("drawer is null");
            return (Criteria) this;
        }

        public Criteria andDrawerIsNotNull() {
            addCriterion("drawer is not null");
            return (Criteria) this;
        }

        public Criteria andDrawerEqualTo(String value) {
            addCriterion("drawer =", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerNotEqualTo(String value) {
            addCriterion("drawer <>", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerGreaterThan(String value) {
            addCriterion("drawer >", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerGreaterThanOrEqualTo(String value) {
            addCriterion("drawer >=", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerLessThan(String value) {
            addCriterion("drawer <", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerLessThanOrEqualTo(String value) {
            addCriterion("drawer <=", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerLike(String value) {
            addCriterion("drawer like", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerNotLike(String value) {
            addCriterion("drawer not like", value, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerIn(List<String> values) {
            addCriterion("drawer in", values, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerNotIn(List<String> values) {
            addCriterion("drawer not in", values, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerBetween(String value1, String value2) {
            addCriterion("drawer between", value1, value2, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawerNotBetween(String value1, String value2) {
            addCriterion("drawer not between", value1, value2, "drawer");
            return (Criteria) this;
        }

        public Criteria andDrawernameIsNull() {
            addCriterion("drawername is null");
            return (Criteria) this;
        }

        public Criteria andDrawernameIsNotNull() {
            addCriterion("drawername is not null");
            return (Criteria) this;
        }

        public Criteria andDrawernameEqualTo(String value) {
            addCriterion("drawername =", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameNotEqualTo(String value) {
            addCriterion("drawername <>", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameGreaterThan(String value) {
            addCriterion("drawername >", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameGreaterThanOrEqualTo(String value) {
            addCriterion("drawername >=", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameLessThan(String value) {
            addCriterion("drawername <", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameLessThanOrEqualTo(String value) {
            addCriterion("drawername <=", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameLike(String value) {
            addCriterion("drawername like", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameNotLike(String value) {
            addCriterion("drawername not like", value, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameIn(List<String> values) {
            addCriterion("drawername in", values, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameNotIn(List<String> values) {
            addCriterion("drawername not in", values, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameBetween(String value1, String value2) {
            addCriterion("drawername between", value1, value2, "drawername");
            return (Criteria) this;
        }

        public Criteria andDrawernameNotBetween(String value1, String value2) {
            addCriterion("drawername not between", value1, value2, "drawername");
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

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
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