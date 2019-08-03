package com.hrbc.business.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OpLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public OpLogExample() {
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

        public Criteria andOpcontentIsNull() {
            addCriterion("opcontent is null");
            return (Criteria) this;
        }

        public Criteria andOpcontentIsNotNull() {
            addCriterion("opcontent is not null");
            return (Criteria) this;
        }

        public Criteria andOpcontentEqualTo(String value) {
            addCriterion("opcontent =", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentNotEqualTo(String value) {
            addCriterion("opcontent <>", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentGreaterThan(String value) {
            addCriterion("opcontent >", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentGreaterThanOrEqualTo(String value) {
            addCriterion("opcontent >=", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentLessThan(String value) {
            addCriterion("opcontent <", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentLessThanOrEqualTo(String value) {
            addCriterion("opcontent <=", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentLike(String value) {
            addCriterion("opcontent like", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentNotLike(String value) {
            addCriterion("opcontent not like", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentIn(List<String> values) {
            addCriterion("opcontent in", values, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentNotIn(List<String> values) {
            addCriterion("opcontent not in", values, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentBetween(String value1, String value2) {
            addCriterion("opcontent between", value1, value2, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentNotBetween(String value1, String value2) {
            addCriterion("opcontent not between", value1, value2, "opcontent");
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

        public Criteria andDataidIsNull() {
            addCriterion("dataid is null");
            return (Criteria) this;
        }

        public Criteria andDataidIsNotNull() {
            addCriterion("dataid is not null");
            return (Criteria) this;
        }

        public Criteria andDataidEqualTo(String value) {
            addCriterion("dataid =", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotEqualTo(String value) {
            addCriterion("dataid <>", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidGreaterThan(String value) {
            addCriterion("dataid >", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidGreaterThanOrEqualTo(String value) {
            addCriterion("dataid >=", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLessThan(String value) {
            addCriterion("dataid <", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLessThanOrEqualTo(String value) {
            addCriterion("dataid <=", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLike(String value) {
            addCriterion("dataid like", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotLike(String value) {
            addCriterion("dataid not like", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidIn(List<String> values) {
            addCriterion("dataid in", values, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotIn(List<String> values) {
            addCriterion("dataid not in", values, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidBetween(String value1, String value2) {
            addCriterion("dataid between", value1, value2, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotBetween(String value1, String value2) {
            addCriterion("dataid not between", value1, value2, "dataid");
            return (Criteria) this;
        }

        public Criteria andDatakey1IsNull() {
            addCriterion("datakey1 is null");
            return (Criteria) this;
        }

        public Criteria andDatakey1IsNotNull() {
            addCriterion("datakey1 is not null");
            return (Criteria) this;
        }

        public Criteria andDatakey1EqualTo(String value) {
            addCriterion("datakey1 =", value, "datakey1");
            return (Criteria) this;
        }

        public Criteria andDatakey1NotEqualTo(String value) {
            addCriterion("datakey1 <>", value, "datakey1");
            return (Criteria) this;
        }

        public Criteria andDatakey1GreaterThan(String value) {
            addCriterion("datakey1 >", value, "datakey1");
            return (Criteria) this;
        }

        public Criteria andDatakey1GreaterThanOrEqualTo(String value) {
            addCriterion("datakey1 >=", value, "datakey1");
            return (Criteria) this;
        }

        public Criteria andDatakey1LessThan(String value) {
            addCriterion("datakey1 <", value, "datakey1");
            return (Criteria) this;
        }

        public Criteria andDatakey1LessThanOrEqualTo(String value) {
            addCriterion("datakey1 <=", value, "datakey1");
            return (Criteria) this;
        }

        public Criteria andDatakey1Like(String value) {
            addCriterion("datakey1 like", value, "datakey1");
            return (Criteria) this;
        }

        public Criteria andDatakey1NotLike(String value) {
            addCriterion("datakey1 not like", value, "datakey1");
            return (Criteria) this;
        }

        public Criteria andDatakey1In(List<String> values) {
            addCriterion("datakey1 in", values, "datakey1");
            return (Criteria) this;
        }

        public Criteria andDatakey1NotIn(List<String> values) {
            addCriterion("datakey1 not in", values, "datakey1");
            return (Criteria) this;
        }

        public Criteria andDatakey1Between(String value1, String value2) {
            addCriterion("datakey1 between", value1, value2, "datakey1");
            return (Criteria) this;
        }

        public Criteria andDatakey1NotBetween(String value1, String value2) {
            addCriterion("datakey1 not between", value1, value2, "datakey1");
            return (Criteria) this;
        }

        public Criteria andDatakey2IsNull() {
            addCriterion("datakey2 is null");
            return (Criteria) this;
        }

        public Criteria andDatakey2IsNotNull() {
            addCriterion("datakey2 is not null");
            return (Criteria) this;
        }

        public Criteria andDatakey2EqualTo(String value) {
            addCriterion("datakey2 =", value, "datakey2");
            return (Criteria) this;
        }

        public Criteria andDatakey2NotEqualTo(String value) {
            addCriterion("datakey2 <>", value, "datakey2");
            return (Criteria) this;
        }

        public Criteria andDatakey2GreaterThan(String value) {
            addCriterion("datakey2 >", value, "datakey2");
            return (Criteria) this;
        }

        public Criteria andDatakey2GreaterThanOrEqualTo(String value) {
            addCriterion("datakey2 >=", value, "datakey2");
            return (Criteria) this;
        }

        public Criteria andDatakey2LessThan(String value) {
            addCriterion("datakey2 <", value, "datakey2");
            return (Criteria) this;
        }

        public Criteria andDatakey2LessThanOrEqualTo(String value) {
            addCriterion("datakey2 <=", value, "datakey2");
            return (Criteria) this;
        }

        public Criteria andDatakey2Like(String value) {
            addCriterion("datakey2 like", value, "datakey2");
            return (Criteria) this;
        }

        public Criteria andDatakey2NotLike(String value) {
            addCriterion("datakey2 not like", value, "datakey2");
            return (Criteria) this;
        }

        public Criteria andDatakey2In(List<String> values) {
            addCriterion("datakey2 in", values, "datakey2");
            return (Criteria) this;
        }

        public Criteria andDatakey2NotIn(List<String> values) {
            addCriterion("datakey2 not in", values, "datakey2");
            return (Criteria) this;
        }

        public Criteria andDatakey2Between(String value1, String value2) {
            addCriterion("datakey2 between", value1, value2, "datakey2");
            return (Criteria) this;
        }

        public Criteria andDatakey2NotBetween(String value1, String value2) {
            addCriterion("datakey2 not between", value1, value2, "datakey2");
            return (Criteria) this;
        }

        public Criteria andOpcontent1IsNull() {
            addCriterion("opcontent1 is null");
            return (Criteria) this;
        }

        public Criteria andOpcontent1IsNotNull() {
            addCriterion("opcontent1 is not null");
            return (Criteria) this;
        }

        public Criteria andOpcontent1EqualTo(String value) {
            addCriterion("opcontent1 =", value, "opcontent1");
            return (Criteria) this;
        }

        public Criteria andOpcontent1NotEqualTo(String value) {
            addCriterion("opcontent1 <>", value, "opcontent1");
            return (Criteria) this;
        }

        public Criteria andOpcontent1GreaterThan(String value) {
            addCriterion("opcontent1 >", value, "opcontent1");
            return (Criteria) this;
        }

        public Criteria andOpcontent1GreaterThanOrEqualTo(String value) {
            addCriterion("opcontent1 >=", value, "opcontent1");
            return (Criteria) this;
        }

        public Criteria andOpcontent1LessThan(String value) {
            addCriterion("opcontent1 <", value, "opcontent1");
            return (Criteria) this;
        }

        public Criteria andOpcontent1LessThanOrEqualTo(String value) {
            addCriterion("opcontent1 <=", value, "opcontent1");
            return (Criteria) this;
        }

        public Criteria andOpcontent1Like(String value) {
            addCriterion("opcontent1 like", value, "opcontent1");
            return (Criteria) this;
        }

        public Criteria andOpcontent1NotLike(String value) {
            addCriterion("opcontent1 not like", value, "opcontent1");
            return (Criteria) this;
        }

        public Criteria andOpcontent1In(List<String> values) {
            addCriterion("opcontent1 in", values, "opcontent1");
            return (Criteria) this;
        }

        public Criteria andOpcontent1NotIn(List<String> values) {
            addCriterion("opcontent1 not in", values, "opcontent1");
            return (Criteria) this;
        }

        public Criteria andOpcontent1Between(String value1, String value2) {
            addCriterion("opcontent1 between", value1, value2, "opcontent1");
            return (Criteria) this;
        }

        public Criteria andOpcontent1NotBetween(String value1, String value2) {
            addCriterion("opcontent1 not between", value1, value2, "opcontent1");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNull() {
            addCriterion("business is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNotNull() {
            addCriterion("business is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessEqualTo(String value) {
            addCriterion("business =", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotEqualTo(String value) {
            addCriterion("business <>", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThan(String value) {
            addCriterion("business >", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("business >=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThan(String value) {
            addCriterion("business <", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThanOrEqualTo(String value) {
            addCriterion("business <=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLike(String value) {
            addCriterion("business like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotLike(String value) {
            addCriterion("business not like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessIn(List<String> values) {
            addCriterion("business in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotIn(List<String> values) {
            addCriterion("business not in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessBetween(String value1, String value2) {
            addCriterion("business between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotBetween(String value1, String value2) {
            addCriterion("business not between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andFuncIsNull() {
            addCriterion("func is null");
            return (Criteria) this;
        }

        public Criteria andFuncIsNotNull() {
            addCriterion("func is not null");
            return (Criteria) this;
        }

        public Criteria andFuncEqualTo(String value) {
            addCriterion("func =", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncNotEqualTo(String value) {
            addCriterion("func <>", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncGreaterThan(String value) {
            addCriterion("func >", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncGreaterThanOrEqualTo(String value) {
            addCriterion("func >=", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncLessThan(String value) {
            addCriterion("func <", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncLessThanOrEqualTo(String value) {
            addCriterion("func <=", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncLike(String value) {
            addCriterion("func like", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncNotLike(String value) {
            addCriterion("func not like", value, "func");
            return (Criteria) this;
        }

        public Criteria andFuncIn(List<String> values) {
            addCriterion("func in", values, "func");
            return (Criteria) this;
        }

        public Criteria andFuncNotIn(List<String> values) {
            addCriterion("func not in", values, "func");
            return (Criteria) this;
        }

        public Criteria andFuncBetween(String value1, String value2) {
            addCriterion("func between", value1, value2, "func");
            return (Criteria) this;
        }

        public Criteria andFuncNotBetween(String value1, String value2) {
            addCriterion("func not between", value1, value2, "func");
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