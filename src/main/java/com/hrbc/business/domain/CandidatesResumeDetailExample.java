package com.hrbc.business.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CandidatesResumeDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CandidatesResumeDetailExample() {
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

        public Criteria andCandidatesidIsNull() {
            addCriterion("candidatesid is null");
            return (Criteria) this;
        }

        public Criteria andCandidatesidIsNotNull() {
            addCriterion("candidatesid is not null");
            return (Criteria) this;
        }

        public Criteria andCandidatesidEqualTo(Integer value) {
            addCriterion("candidatesid =", value, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidNotEqualTo(Integer value) {
            addCriterion("candidatesid <>", value, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidGreaterThan(Integer value) {
            addCriterion("candidatesid >", value, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("candidatesid >=", value, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidLessThan(Integer value) {
            addCriterion("candidatesid <", value, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidLessThanOrEqualTo(Integer value) {
            addCriterion("candidatesid <=", value, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidIn(List<Integer> values) {
            addCriterion("candidatesid in", values, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidNotIn(List<Integer> values) {
            addCriterion("candidatesid not in", values, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidBetween(Integer value1, Integer value2) {
            addCriterion("candidatesid between", value1, value2, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andCandidatesidNotBetween(Integer value1, Integer value2) {
            addCriterion("candidatesid not between", value1, value2, "candidatesid");
            return (Criteria) this;
        }

        public Criteria andResumetypeIsNull() {
            addCriterion("resumetype is null");
            return (Criteria) this;
        }

        public Criteria andResumetypeIsNotNull() {
            addCriterion("resumetype is not null");
            return (Criteria) this;
        }

        public Criteria andResumetypeEqualTo(String value) {
            addCriterion("resumetype =", value, "resumetype");
            return (Criteria) this;
        }

        public Criteria andResumetypeNotEqualTo(String value) {
            addCriterion("resumetype <>", value, "resumetype");
            return (Criteria) this;
        }

        public Criteria andResumetypeGreaterThan(String value) {
            addCriterion("resumetype >", value, "resumetype");
            return (Criteria) this;
        }

        public Criteria andResumetypeGreaterThanOrEqualTo(String value) {
            addCriterion("resumetype >=", value, "resumetype");
            return (Criteria) this;
        }

        public Criteria andResumetypeLessThan(String value) {
            addCriterion("resumetype <", value, "resumetype");
            return (Criteria) this;
        }

        public Criteria andResumetypeLessThanOrEqualTo(String value) {
            addCriterion("resumetype <=", value, "resumetype");
            return (Criteria) this;
        }

        public Criteria andResumetypeLike(String value) {
            addCriterion("resumetype like", value, "resumetype");
            return (Criteria) this;
        }

        public Criteria andResumetypeNotLike(String value) {
            addCriterion("resumetype not like", value, "resumetype");
            return (Criteria) this;
        }

        public Criteria andResumetypeIn(List<String> values) {
            addCriterion("resumetype in", values, "resumetype");
            return (Criteria) this;
        }

        public Criteria andResumetypeNotIn(List<String> values) {
            addCriterion("resumetype not in", values, "resumetype");
            return (Criteria) this;
        }

        public Criteria andResumetypeBetween(String value1, String value2) {
            addCriterion("resumetype between", value1, value2, "resumetype");
            return (Criteria) this;
        }

        public Criteria andResumetypeNotBetween(String value1, String value2) {
            addCriterion("resumetype not between", value1, value2, "resumetype");
            return (Criteria) this;
        }

        public Criteria andResumegradeIsNull() {
            addCriterion("resumegrade is null");
            return (Criteria) this;
        }

        public Criteria andResumegradeIsNotNull() {
            addCriterion("resumegrade is not null");
            return (Criteria) this;
        }

        public Criteria andResumegradeEqualTo(String value) {
            addCriterion("resumegrade =", value, "resumegrade");
            return (Criteria) this;
        }

        public Criteria andResumegradeNotEqualTo(String value) {
            addCriterion("resumegrade <>", value, "resumegrade");
            return (Criteria) this;
        }

        public Criteria andResumegradeGreaterThan(String value) {
            addCriterion("resumegrade >", value, "resumegrade");
            return (Criteria) this;
        }

        public Criteria andResumegradeGreaterThanOrEqualTo(String value) {
            addCriterion("resumegrade >=", value, "resumegrade");
            return (Criteria) this;
        }

        public Criteria andResumegradeLessThan(String value) {
            addCriterion("resumegrade <", value, "resumegrade");
            return (Criteria) this;
        }

        public Criteria andResumegradeLessThanOrEqualTo(String value) {
            addCriterion("resumegrade <=", value, "resumegrade");
            return (Criteria) this;
        }

        public Criteria andResumegradeLike(String value) {
            addCriterion("resumegrade like", value, "resumegrade");
            return (Criteria) this;
        }

        public Criteria andResumegradeNotLike(String value) {
            addCriterion("resumegrade not like", value, "resumegrade");
            return (Criteria) this;
        }

        public Criteria andResumegradeIn(List<String> values) {
            addCriterion("resumegrade in", values, "resumegrade");
            return (Criteria) this;
        }

        public Criteria andResumegradeNotIn(List<String> values) {
            addCriterion("resumegrade not in", values, "resumegrade");
            return (Criteria) this;
        }

        public Criteria andResumegradeBetween(String value1, String value2) {
            addCriterion("resumegrade between", value1, value2, "resumegrade");
            return (Criteria) this;
        }

        public Criteria andResumegradeNotBetween(String value1, String value2) {
            addCriterion("resumegrade not between", value1, value2, "resumegrade");
            return (Criteria) this;
        }

        public Criteria andMarryiedIsNull() {
            addCriterion("marryied is null");
            return (Criteria) this;
        }

        public Criteria andMarryiedIsNotNull() {
            addCriterion("marryied is not null");
            return (Criteria) this;
        }

        public Criteria andMarryiedEqualTo(String value) {
            addCriterion("marryied =", value, "marryied");
            return (Criteria) this;
        }

        public Criteria andMarryiedNotEqualTo(String value) {
            addCriterion("marryied <>", value, "marryied");
            return (Criteria) this;
        }

        public Criteria andMarryiedGreaterThan(String value) {
            addCriterion("marryied >", value, "marryied");
            return (Criteria) this;
        }

        public Criteria andMarryiedGreaterThanOrEqualTo(String value) {
            addCriterion("marryied >=", value, "marryied");
            return (Criteria) this;
        }

        public Criteria andMarryiedLessThan(String value) {
            addCriterion("marryied <", value, "marryied");
            return (Criteria) this;
        }

        public Criteria andMarryiedLessThanOrEqualTo(String value) {
            addCriterion("marryied <=", value, "marryied");
            return (Criteria) this;
        }

        public Criteria andMarryiedLike(String value) {
            addCriterion("marryied like", value, "marryied");
            return (Criteria) this;
        }

        public Criteria andMarryiedNotLike(String value) {
            addCriterion("marryied not like", value, "marryied");
            return (Criteria) this;
        }

        public Criteria andMarryiedIn(List<String> values) {
            addCriterion("marryied in", values, "marryied");
            return (Criteria) this;
        }

        public Criteria andMarryiedNotIn(List<String> values) {
            addCriterion("marryied not in", values, "marryied");
            return (Criteria) this;
        }

        public Criteria andMarryiedBetween(String value1, String value2) {
            addCriterion("marryied between", value1, value2, "marryied");
            return (Criteria) this;
        }

        public Criteria andMarryiedNotBetween(String value1, String value2) {
            addCriterion("marryied not between", value1, value2, "marryied");
            return (Criteria) this;
        }

        public Criteria andFromwebsiteIsNull() {
            addCriterion("fromwebsite is null");
            return (Criteria) this;
        }

        public Criteria andFromwebsiteIsNotNull() {
            addCriterion("fromwebsite is not null");
            return (Criteria) this;
        }

        public Criteria andFromwebsiteEqualTo(String value) {
            addCriterion("fromwebsite =", value, "fromwebsite");
            return (Criteria) this;
        }

        public Criteria andFromwebsiteNotEqualTo(String value) {
            addCriterion("fromwebsite <>", value, "fromwebsite");
            return (Criteria) this;
        }

        public Criteria andFromwebsiteGreaterThan(String value) {
            addCriterion("fromwebsite >", value, "fromwebsite");
            return (Criteria) this;
        }

        public Criteria andFromwebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("fromwebsite >=", value, "fromwebsite");
            return (Criteria) this;
        }

        public Criteria andFromwebsiteLessThan(String value) {
            addCriterion("fromwebsite <", value, "fromwebsite");
            return (Criteria) this;
        }

        public Criteria andFromwebsiteLessThanOrEqualTo(String value) {
            addCriterion("fromwebsite <=", value, "fromwebsite");
            return (Criteria) this;
        }

        public Criteria andFromwebsiteLike(String value) {
            addCriterion("fromwebsite like", value, "fromwebsite");
            return (Criteria) this;
        }

        public Criteria andFromwebsiteNotLike(String value) {
            addCriterion("fromwebsite not like", value, "fromwebsite");
            return (Criteria) this;
        }

        public Criteria andFromwebsiteIn(List<String> values) {
            addCriterion("fromwebsite in", values, "fromwebsite");
            return (Criteria) this;
        }

        public Criteria andFromwebsiteNotIn(List<String> values) {
            addCriterion("fromwebsite not in", values, "fromwebsite");
            return (Criteria) this;
        }

        public Criteria andFromwebsiteBetween(String value1, String value2) {
            addCriterion("fromwebsite between", value1, value2, "fromwebsite");
            return (Criteria) this;
        }

        public Criteria andFromwebsiteNotBetween(String value1, String value2) {
            addCriterion("fromwebsite not between", value1, value2, "fromwebsite");
            return (Criteria) this;
        }

        public Criteria andWebsiteresumeidIsNull() {
            addCriterion("websiteresumeid is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteresumeidIsNotNull() {
            addCriterion("websiteresumeid is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteresumeidEqualTo(Integer value) {
            addCriterion("websiteresumeid =", value, "websiteresumeid");
            return (Criteria) this;
        }

        public Criteria andWebsiteresumeidNotEqualTo(Integer value) {
            addCriterion("websiteresumeid <>", value, "websiteresumeid");
            return (Criteria) this;
        }

        public Criteria andWebsiteresumeidGreaterThan(Integer value) {
            addCriterion("websiteresumeid >", value, "websiteresumeid");
            return (Criteria) this;
        }

        public Criteria andWebsiteresumeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("websiteresumeid >=", value, "websiteresumeid");
            return (Criteria) this;
        }

        public Criteria andWebsiteresumeidLessThan(Integer value) {
            addCriterion("websiteresumeid <", value, "websiteresumeid");
            return (Criteria) this;
        }

        public Criteria andWebsiteresumeidLessThanOrEqualTo(Integer value) {
            addCriterion("websiteresumeid <=", value, "websiteresumeid");
            return (Criteria) this;
        }

        public Criteria andWebsiteresumeidIn(List<Integer> values) {
            addCriterion("websiteresumeid in", values, "websiteresumeid");
            return (Criteria) this;
        }

        public Criteria andWebsiteresumeidNotIn(List<Integer> values) {
            addCriterion("websiteresumeid not in", values, "websiteresumeid");
            return (Criteria) this;
        }

        public Criteria andWebsiteresumeidBetween(Integer value1, Integer value2) {
            addCriterion("websiteresumeid between", value1, value2, "websiteresumeid");
            return (Criteria) this;
        }

        public Criteria andWebsiteresumeidNotBetween(Integer value1, Integer value2) {
            addCriterion("websiteresumeid not between", value1, value2, "websiteresumeid");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNull() {
            addCriterion("idno is null");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNotNull() {
            addCriterion("idno is not null");
            return (Criteria) this;
        }

        public Criteria andIdnoEqualTo(String value) {
            addCriterion("idno =", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotEqualTo(String value) {
            addCriterion("idno <>", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThan(String value) {
            addCriterion("idno >", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("idno >=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThan(String value) {
            addCriterion("idno <", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThanOrEqualTo(String value) {
            addCriterion("idno <=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLike(String value) {
            addCriterion("idno like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotLike(String value) {
            addCriterion("idno not like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoIn(List<String> values) {
            addCriterion("idno in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotIn(List<String> values) {
            addCriterion("idno not in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoBetween(String value1, String value2) {
            addCriterion("idno between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotBetween(String value1, String value2) {
            addCriterion("idno not between", value1, value2, "idno");
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

        public Criteria andTeamIsNull() {
            addCriterion("team is null");
            return (Criteria) this;
        }

        public Criteria andTeamIsNotNull() {
            addCriterion("team is not null");
            return (Criteria) this;
        }

        public Criteria andTeamEqualTo(String value) {
            addCriterion("team =", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotEqualTo(String value) {
            addCriterion("team <>", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThan(String value) {
            addCriterion("team >", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThanOrEqualTo(String value) {
            addCriterion("team >=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThan(String value) {
            addCriterion("team <", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThanOrEqualTo(String value) {
            addCriterion("team <=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLike(String value) {
            addCriterion("team like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotLike(String value) {
            addCriterion("team not like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamIn(List<String> values) {
            addCriterion("team in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotIn(List<String> values) {
            addCriterion("team not in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamBetween(String value1, String value2) {
            addCriterion("team between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotBetween(String value1, String value2) {
            addCriterion("team not between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andVolunteerIsNull() {
            addCriterion("volunteer is null");
            return (Criteria) this;
        }

        public Criteria andVolunteerIsNotNull() {
            addCriterion("volunteer is not null");
            return (Criteria) this;
        }

        public Criteria andVolunteerEqualTo(String value) {
            addCriterion("volunteer =", value, "volunteer");
            return (Criteria) this;
        }

        public Criteria andVolunteerNotEqualTo(String value) {
            addCriterion("volunteer <>", value, "volunteer");
            return (Criteria) this;
        }

        public Criteria andVolunteerGreaterThan(String value) {
            addCriterion("volunteer >", value, "volunteer");
            return (Criteria) this;
        }

        public Criteria andVolunteerGreaterThanOrEqualTo(String value) {
            addCriterion("volunteer >=", value, "volunteer");
            return (Criteria) this;
        }

        public Criteria andVolunteerLessThan(String value) {
            addCriterion("volunteer <", value, "volunteer");
            return (Criteria) this;
        }

        public Criteria andVolunteerLessThanOrEqualTo(String value) {
            addCriterion("volunteer <=", value, "volunteer");
            return (Criteria) this;
        }

        public Criteria andVolunteerLike(String value) {
            addCriterion("volunteer like", value, "volunteer");
            return (Criteria) this;
        }

        public Criteria andVolunteerNotLike(String value) {
            addCriterion("volunteer not like", value, "volunteer");
            return (Criteria) this;
        }

        public Criteria andVolunteerIn(List<String> values) {
            addCriterion("volunteer in", values, "volunteer");
            return (Criteria) this;
        }

        public Criteria andVolunteerNotIn(List<String> values) {
            addCriterion("volunteer not in", values, "volunteer");
            return (Criteria) this;
        }

        public Criteria andVolunteerBetween(String value1, String value2) {
            addCriterion("volunteer between", value1, value2, "volunteer");
            return (Criteria) this;
        }

        public Criteria andVolunteerNotBetween(String value1, String value2) {
            addCriterion("volunteer not between", value1, value2, "volunteer");
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

        public Criteria andLastupdateIsNull() {
            addCriterion("lastupdate is null");
            return (Criteria) this;
        }

        public Criteria andLastupdateIsNotNull() {
            addCriterion("lastupdate is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdateEqualTo(String value) {
            addCriterion("lastupdate =", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateNotEqualTo(String value) {
            addCriterion("lastupdate <>", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateGreaterThan(String value) {
            addCriterion("lastupdate >", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateGreaterThanOrEqualTo(String value) {
            addCriterion("lastupdate >=", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateLessThan(String value) {
            addCriterion("lastupdate <", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateLessThanOrEqualTo(String value) {
            addCriterion("lastupdate <=", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateLike(String value) {
            addCriterion("lastupdate like", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateNotLike(String value) {
            addCriterion("lastupdate not like", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateIn(List<String> values) {
            addCriterion("lastupdate in", values, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateNotIn(List<String> values) {
            addCriterion("lastupdate not in", values, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateBetween(String value1, String value2) {
            addCriterion("lastupdate between", value1, value2, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateNotBetween(String value1, String value2) {
            addCriterion("lastupdate not between", value1, value2, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdate2IsNull() {
            addCriterion("lastupdate2 is null");
            return (Criteria) this;
        }

        public Criteria andLastupdate2IsNotNull() {
            addCriterion("lastupdate2 is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdate2EqualTo(String value) {
            addCriterion("lastupdate2 =", value, "lastupdate2");
            return (Criteria) this;
        }

        public Criteria andLastupdate2NotEqualTo(String value) {
            addCriterion("lastupdate2 <>", value, "lastupdate2");
            return (Criteria) this;
        }

        public Criteria andLastupdate2GreaterThan(String value) {
            addCriterion("lastupdate2 >", value, "lastupdate2");
            return (Criteria) this;
        }

        public Criteria andLastupdate2GreaterThanOrEqualTo(String value) {
            addCriterion("lastupdate2 >=", value, "lastupdate2");
            return (Criteria) this;
        }

        public Criteria andLastupdate2LessThan(String value) {
            addCriterion("lastupdate2 <", value, "lastupdate2");
            return (Criteria) this;
        }

        public Criteria andLastupdate2LessThanOrEqualTo(String value) {
            addCriterion("lastupdate2 <=", value, "lastupdate2");
            return (Criteria) this;
        }

        public Criteria andLastupdate2Like(String value) {
            addCriterion("lastupdate2 like", value, "lastupdate2");
            return (Criteria) this;
        }

        public Criteria andLastupdate2NotLike(String value) {
            addCriterion("lastupdate2 not like", value, "lastupdate2");
            return (Criteria) this;
        }

        public Criteria andLastupdate2In(List<String> values) {
            addCriterion("lastupdate2 in", values, "lastupdate2");
            return (Criteria) this;
        }

        public Criteria andLastupdate2NotIn(List<String> values) {
            addCriterion("lastupdate2 not in", values, "lastupdate2");
            return (Criteria) this;
        }

        public Criteria andLastupdate2Between(String value1, String value2) {
            addCriterion("lastupdate2 between", value1, value2, "lastupdate2");
            return (Criteria) this;
        }

        public Criteria andLastupdate2NotBetween(String value1, String value2) {
            addCriterion("lastupdate2 not between", value1, value2, "lastupdate2");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNull() {
            addCriterion("certificate is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNotNull() {
            addCriterion("certificate is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEqualTo(String value) {
            addCriterion("certificate =", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotEqualTo(String value) {
            addCriterion("certificate <>", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThan(String value) {
            addCriterion("certificate >", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("certificate >=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThan(String value) {
            addCriterion("certificate <", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThanOrEqualTo(String value) {
            addCriterion("certificate <=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLike(String value) {
            addCriterion("certificate like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotLike(String value) {
            addCriterion("certificate not like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateIn(List<String> values) {
            addCriterion("certificate in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotIn(List<String> values) {
            addCriterion("certificate not in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateBetween(String value1, String value2) {
            addCriterion("certificate between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotBetween(String value1, String value2) {
            addCriterion("certificate not between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andPersonalIsNull() {
            addCriterion("personal is null");
            return (Criteria) this;
        }

        public Criteria andPersonalIsNotNull() {
            addCriterion("personal is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalEqualTo(String value) {
            addCriterion("personal =", value, "personal");
            return (Criteria) this;
        }

        public Criteria andPersonalNotEqualTo(String value) {
            addCriterion("personal <>", value, "personal");
            return (Criteria) this;
        }

        public Criteria andPersonalGreaterThan(String value) {
            addCriterion("personal >", value, "personal");
            return (Criteria) this;
        }

        public Criteria andPersonalGreaterThanOrEqualTo(String value) {
            addCriterion("personal >=", value, "personal");
            return (Criteria) this;
        }

        public Criteria andPersonalLessThan(String value) {
            addCriterion("personal <", value, "personal");
            return (Criteria) this;
        }

        public Criteria andPersonalLessThanOrEqualTo(String value) {
            addCriterion("personal <=", value, "personal");
            return (Criteria) this;
        }

        public Criteria andPersonalLike(String value) {
            addCriterion("personal like", value, "personal");
            return (Criteria) this;
        }

        public Criteria andPersonalNotLike(String value) {
            addCriterion("personal not like", value, "personal");
            return (Criteria) this;
        }

        public Criteria andPersonalIn(List<String> values) {
            addCriterion("personal in", values, "personal");
            return (Criteria) this;
        }

        public Criteria andPersonalNotIn(List<String> values) {
            addCriterion("personal not in", values, "personal");
            return (Criteria) this;
        }

        public Criteria andPersonalBetween(String value1, String value2) {
            addCriterion("personal between", value1, value2, "personal");
            return (Criteria) this;
        }

        public Criteria andPersonalNotBetween(String value1, String value2) {
            addCriterion("personal not between", value1, value2, "personal");
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
            addCriterion("english is null");
            return (Criteria) this;
        }

        public Criteria andEnglishIsNotNull() {
            addCriterion("english is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishEqualTo(String value) {
            addCriterion("english =", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotEqualTo(String value) {
            addCriterion("english <>", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishGreaterThan(String value) {
            addCriterion("english >", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishGreaterThanOrEqualTo(String value) {
            addCriterion("english >=", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLessThan(String value) {
            addCriterion("english <", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLessThanOrEqualTo(String value) {
            addCriterion("english <=", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishLike(String value) {
            addCriterion("english like", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotLike(String value) {
            addCriterion("english not like", value, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishIn(List<String> values) {
            addCriterion("english in", values, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotIn(List<String> values) {
            addCriterion("english not in", values, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishBetween(String value1, String value2) {
            addCriterion("english between", value1, value2, "english");
            return (Criteria) this;
        }

        public Criteria andEnglishNotBetween(String value1, String value2) {
            addCriterion("english not between", value1, value2, "english");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
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

        public Criteria andNationalIsNull() {
            addCriterion("national is null");
            return (Criteria) this;
        }

        public Criteria andNationalIsNotNull() {
            addCriterion("national is not null");
            return (Criteria) this;
        }

        public Criteria andNationalEqualTo(String value) {
            addCriterion("national =", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotEqualTo(String value) {
            addCriterion("national <>", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThan(String value) {
            addCriterion("national >", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalGreaterThanOrEqualTo(String value) {
            addCriterion("national >=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThan(String value) {
            addCriterion("national <", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLessThanOrEqualTo(String value) {
            addCriterion("national <=", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalLike(String value) {
            addCriterion("national like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotLike(String value) {
            addCriterion("national not like", value, "national");
            return (Criteria) this;
        }

        public Criteria andNationalIn(List<String> values) {
            addCriterion("national in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotIn(List<String> values) {
            addCriterion("national not in", values, "national");
            return (Criteria) this;
        }

        public Criteria andNationalBetween(String value1, String value2) {
            addCriterion("national between", value1, value2, "national");
            return (Criteria) this;
        }

        public Criteria andNationalNotBetween(String value1, String value2) {
            addCriterion("national not between", value1, value2, "national");
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

        public Criteria andBirthIsNull() {
            addCriterion("birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterionForJDBCDate("birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterionForJDBCDate("birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterionForJDBCDate("birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFamilynameIsNull() {
            addCriterion("familyname is null");
            return (Criteria) this;
        }

        public Criteria andFamilynameIsNotNull() {
            addCriterion("familyname is not null");
            return (Criteria) this;
        }

        public Criteria andFamilynameEqualTo(String value) {
            addCriterion("familyname =", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotEqualTo(String value) {
            addCriterion("familyname <>", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameGreaterThan(String value) {
            addCriterion("familyname >", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameGreaterThanOrEqualTo(String value) {
            addCriterion("familyname >=", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameLessThan(String value) {
            addCriterion("familyname <", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameLessThanOrEqualTo(String value) {
            addCriterion("familyname <=", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameLike(String value) {
            addCriterion("familyname like", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotLike(String value) {
            addCriterion("familyname not like", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameIn(List<String> values) {
            addCriterion("familyname in", values, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotIn(List<String> values) {
            addCriterion("familyname not in", values, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameBetween(String value1, String value2) {
            addCriterion("familyname between", value1, value2, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotBetween(String value1, String value2) {
            addCriterion("familyname not between", value1, value2, "familyname");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitle2IsNull() {
            addCriterion("title2 is null");
            return (Criteria) this;
        }

        public Criteria andTitle2IsNotNull() {
            addCriterion("title2 is not null");
            return (Criteria) this;
        }

        public Criteria andTitle2EqualTo(String value) {
            addCriterion("title2 =", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2NotEqualTo(String value) {
            addCriterion("title2 <>", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2GreaterThan(String value) {
            addCriterion("title2 >", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2GreaterThanOrEqualTo(String value) {
            addCriterion("title2 >=", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2LessThan(String value) {
            addCriterion("title2 <", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2LessThanOrEqualTo(String value) {
            addCriterion("title2 <=", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2Like(String value) {
            addCriterion("title2 like", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2NotLike(String value) {
            addCriterion("title2 not like", value, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2In(List<String> values) {
            addCriterion("title2 in", values, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2NotIn(List<String> values) {
            addCriterion("title2 not in", values, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2Between(String value1, String value2) {
            addCriterion("title2 between", value1, value2, "title2");
            return (Criteria) this;
        }

        public Criteria andTitle2NotBetween(String value1, String value2) {
            addCriterion("title2 not between", value1, value2, "title2");
            return (Criteria) this;
        }

        public Criteria andTitlestandardIsNull() {
            addCriterion("titlestandard is null");
            return (Criteria) this;
        }

        public Criteria andTitlestandardIsNotNull() {
            addCriterion("titlestandard is not null");
            return (Criteria) this;
        }

        public Criteria andTitlestandardEqualTo(String value) {
            addCriterion("titlestandard =", value, "titlestandard");
            return (Criteria) this;
        }

        public Criteria andTitlestandardNotEqualTo(String value) {
            addCriterion("titlestandard <>", value, "titlestandard");
            return (Criteria) this;
        }

        public Criteria andTitlestandardGreaterThan(String value) {
            addCriterion("titlestandard >", value, "titlestandard");
            return (Criteria) this;
        }

        public Criteria andTitlestandardGreaterThanOrEqualTo(String value) {
            addCriterion("titlestandard >=", value, "titlestandard");
            return (Criteria) this;
        }

        public Criteria andTitlestandardLessThan(String value) {
            addCriterion("titlestandard <", value, "titlestandard");
            return (Criteria) this;
        }

        public Criteria andTitlestandardLessThanOrEqualTo(String value) {
            addCriterion("titlestandard <=", value, "titlestandard");
            return (Criteria) this;
        }

        public Criteria andTitlestandardLike(String value) {
            addCriterion("titlestandard like", value, "titlestandard");
            return (Criteria) this;
        }

        public Criteria andTitlestandardNotLike(String value) {
            addCriterion("titlestandard not like", value, "titlestandard");
            return (Criteria) this;
        }

        public Criteria andTitlestandardIn(List<String> values) {
            addCriterion("titlestandard in", values, "titlestandard");
            return (Criteria) this;
        }

        public Criteria andTitlestandardNotIn(List<String> values) {
            addCriterion("titlestandard not in", values, "titlestandard");
            return (Criteria) this;
        }

        public Criteria andTitlestandardBetween(String value1, String value2) {
            addCriterion("titlestandard between", value1, value2, "titlestandard");
            return (Criteria) this;
        }

        public Criteria andTitlestandardNotBetween(String value1, String value2) {
            addCriterion("titlestandard not between", value1, value2, "titlestandard");
            return (Criteria) this;
        }

        public Criteria andAmiinstitutionIsNull() {
            addCriterion("amiinstitution is null");
            return (Criteria) this;
        }

        public Criteria andAmiinstitutionIsNotNull() {
            addCriterion("amiinstitution is not null");
            return (Criteria) this;
        }

        public Criteria andAmiinstitutionEqualTo(String value) {
            addCriterion("amiinstitution =", value, "amiinstitution");
            return (Criteria) this;
        }

        public Criteria andAmiinstitutionNotEqualTo(String value) {
            addCriterion("amiinstitution <>", value, "amiinstitution");
            return (Criteria) this;
        }

        public Criteria andAmiinstitutionGreaterThan(String value) {
            addCriterion("amiinstitution >", value, "amiinstitution");
            return (Criteria) this;
        }

        public Criteria andAmiinstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("amiinstitution >=", value, "amiinstitution");
            return (Criteria) this;
        }

        public Criteria andAmiinstitutionLessThan(String value) {
            addCriterion("amiinstitution <", value, "amiinstitution");
            return (Criteria) this;
        }

        public Criteria andAmiinstitutionLessThanOrEqualTo(String value) {
            addCriterion("amiinstitution <=", value, "amiinstitution");
            return (Criteria) this;
        }

        public Criteria andAmiinstitutionLike(String value) {
            addCriterion("amiinstitution like", value, "amiinstitution");
            return (Criteria) this;
        }

        public Criteria andAmiinstitutionNotLike(String value) {
            addCriterion("amiinstitution not like", value, "amiinstitution");
            return (Criteria) this;
        }

        public Criteria andAmiinstitutionIn(List<String> values) {
            addCriterion("amiinstitution in", values, "amiinstitution");
            return (Criteria) this;
        }

        public Criteria andAmiinstitutionNotIn(List<String> values) {
            addCriterion("amiinstitution not in", values, "amiinstitution");
            return (Criteria) this;
        }

        public Criteria andAmiinstitutionBetween(String value1, String value2) {
            addCriterion("amiinstitution between", value1, value2, "amiinstitution");
            return (Criteria) this;
        }

        public Criteria andAmiinstitutionNotBetween(String value1, String value2) {
            addCriterion("amiinstitution not between", value1, value2, "amiinstitution");
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

        public Criteria andAgeEqualTo(Byte value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Byte value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Byte value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Byte value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Byte value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Byte> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Byte> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Byte value1, Byte value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andHighrIsNull() {
            addCriterion("highr is null");
            return (Criteria) this;
        }

        public Criteria andHighrIsNotNull() {
            addCriterion("highr is not null");
            return (Criteria) this;
        }

        public Criteria andHighrEqualTo(String value) {
            addCriterion("highr =", value, "highr");
            return (Criteria) this;
        }

        public Criteria andHighrNotEqualTo(String value) {
            addCriterion("highr <>", value, "highr");
            return (Criteria) this;
        }

        public Criteria andHighrGreaterThan(String value) {
            addCriterion("highr >", value, "highr");
            return (Criteria) this;
        }

        public Criteria andHighrGreaterThanOrEqualTo(String value) {
            addCriterion("highr >=", value, "highr");
            return (Criteria) this;
        }

        public Criteria andHighrLessThan(String value) {
            addCriterion("highr <", value, "highr");
            return (Criteria) this;
        }

        public Criteria andHighrLessThanOrEqualTo(String value) {
            addCriterion("highr <=", value, "highr");
            return (Criteria) this;
        }

        public Criteria andHighrLike(String value) {
            addCriterion("highr like", value, "highr");
            return (Criteria) this;
        }

        public Criteria andHighrNotLike(String value) {
            addCriterion("highr not like", value, "highr");
            return (Criteria) this;
        }

        public Criteria andHighrIn(List<String> values) {
            addCriterion("highr in", values, "highr");
            return (Criteria) this;
        }

        public Criteria andHighrNotIn(List<String> values) {
            addCriterion("highr not in", values, "highr");
            return (Criteria) this;
        }

        public Criteria andHighrBetween(String value1, String value2) {
            addCriterion("highr between", value1, value2, "highr");
            return (Criteria) this;
        }

        public Criteria andHighrNotBetween(String value1, String value2) {
            addCriterion("highr not between", value1, value2, "highr");
            return (Criteria) this;
        }

        public Criteria andWeightrIsNull() {
            addCriterion("weightr is null");
            return (Criteria) this;
        }

        public Criteria andWeightrIsNotNull() {
            addCriterion("weightr is not null");
            return (Criteria) this;
        }

        public Criteria andWeightrEqualTo(String value) {
            addCriterion("weightr =", value, "weightr");
            return (Criteria) this;
        }

        public Criteria andWeightrNotEqualTo(String value) {
            addCriterion("weightr <>", value, "weightr");
            return (Criteria) this;
        }

        public Criteria andWeightrGreaterThan(String value) {
            addCriterion("weightr >", value, "weightr");
            return (Criteria) this;
        }

        public Criteria andWeightrGreaterThanOrEqualTo(String value) {
            addCriterion("weightr >=", value, "weightr");
            return (Criteria) this;
        }

        public Criteria andWeightrLessThan(String value) {
            addCriterion("weightr <", value, "weightr");
            return (Criteria) this;
        }

        public Criteria andWeightrLessThanOrEqualTo(String value) {
            addCriterion("weightr <=", value, "weightr");
            return (Criteria) this;
        }

        public Criteria andWeightrLike(String value) {
            addCriterion("weightr like", value, "weightr");
            return (Criteria) this;
        }

        public Criteria andWeightrNotLike(String value) {
            addCriterion("weightr not like", value, "weightr");
            return (Criteria) this;
        }

        public Criteria andWeightrIn(List<String> values) {
            addCriterion("weightr in", values, "weightr");
            return (Criteria) this;
        }

        public Criteria andWeightrNotIn(List<String> values) {
            addCriterion("weightr not in", values, "weightr");
            return (Criteria) this;
        }

        public Criteria andWeightrBetween(String value1, String value2) {
            addCriterion("weightr between", value1, value2, "weightr");
            return (Criteria) this;
        }

        public Criteria andWeightrNotBetween(String value1, String value2) {
            addCriterion("weightr not between", value1, value2, "weightr");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
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

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
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

        public Criteria andNowlocationIsNull() {
            addCriterion("nowlocation is null");
            return (Criteria) this;
        }

        public Criteria andNowlocationIsNotNull() {
            addCriterion("nowlocation is not null");
            return (Criteria) this;
        }

        public Criteria andNowlocationEqualTo(String value) {
            addCriterion("nowlocation =", value, "nowlocation");
            return (Criteria) this;
        }

        public Criteria andNowlocationNotEqualTo(String value) {
            addCriterion("nowlocation <>", value, "nowlocation");
            return (Criteria) this;
        }

        public Criteria andNowlocationGreaterThan(String value) {
            addCriterion("nowlocation >", value, "nowlocation");
            return (Criteria) this;
        }

        public Criteria andNowlocationGreaterThanOrEqualTo(String value) {
            addCriterion("nowlocation >=", value, "nowlocation");
            return (Criteria) this;
        }

        public Criteria andNowlocationLessThan(String value) {
            addCriterion("nowlocation <", value, "nowlocation");
            return (Criteria) this;
        }

        public Criteria andNowlocationLessThanOrEqualTo(String value) {
            addCriterion("nowlocation <=", value, "nowlocation");
            return (Criteria) this;
        }

        public Criteria andNowlocationLike(String value) {
            addCriterion("nowlocation like", value, "nowlocation");
            return (Criteria) this;
        }

        public Criteria andNowlocationNotLike(String value) {
            addCriterion("nowlocation not like", value, "nowlocation");
            return (Criteria) this;
        }

        public Criteria andNowlocationIn(List<String> values) {
            addCriterion("nowlocation in", values, "nowlocation");
            return (Criteria) this;
        }

        public Criteria andNowlocationNotIn(List<String> values) {
            addCriterion("nowlocation not in", values, "nowlocation");
            return (Criteria) this;
        }

        public Criteria andNowlocationBetween(String value1, String value2) {
            addCriterion("nowlocation between", value1, value2, "nowlocation");
            return (Criteria) this;
        }

        public Criteria andNowlocationNotBetween(String value1, String value2) {
            addCriterion("nowlocation not between", value1, value2, "nowlocation");
            return (Criteria) this;
        }

        public Criteria andForwardlocationIsNull() {
            addCriterion("forwardlocation is null");
            return (Criteria) this;
        }

        public Criteria andForwardlocationIsNotNull() {
            addCriterion("forwardlocation is not null");
            return (Criteria) this;
        }

        public Criteria andForwardlocationEqualTo(String value) {
            addCriterion("forwardlocation =", value, "forwardlocation");
            return (Criteria) this;
        }

        public Criteria andForwardlocationNotEqualTo(String value) {
            addCriterion("forwardlocation <>", value, "forwardlocation");
            return (Criteria) this;
        }

        public Criteria andForwardlocationGreaterThan(String value) {
            addCriterion("forwardlocation >", value, "forwardlocation");
            return (Criteria) this;
        }

        public Criteria andForwardlocationGreaterThanOrEqualTo(String value) {
            addCriterion("forwardlocation >=", value, "forwardlocation");
            return (Criteria) this;
        }

        public Criteria andForwardlocationLessThan(String value) {
            addCriterion("forwardlocation <", value, "forwardlocation");
            return (Criteria) this;
        }

        public Criteria andForwardlocationLessThanOrEqualTo(String value) {
            addCriterion("forwardlocation <=", value, "forwardlocation");
            return (Criteria) this;
        }

        public Criteria andForwardlocationLike(String value) {
            addCriterion("forwardlocation like", value, "forwardlocation");
            return (Criteria) this;
        }

        public Criteria andForwardlocationNotLike(String value) {
            addCriterion("forwardlocation not like", value, "forwardlocation");
            return (Criteria) this;
        }

        public Criteria andForwardlocationIn(List<String> values) {
            addCriterion("forwardlocation in", values, "forwardlocation");
            return (Criteria) this;
        }

        public Criteria andForwardlocationNotIn(List<String> values) {
            addCriterion("forwardlocation not in", values, "forwardlocation");
            return (Criteria) this;
        }

        public Criteria andForwardlocationBetween(String value1, String value2) {
            addCriterion("forwardlocation between", value1, value2, "forwardlocation");
            return (Criteria) this;
        }

        public Criteria andForwardlocationNotBetween(String value1, String value2) {
            addCriterion("forwardlocation not between", value1, value2, "forwardlocation");
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

        public Criteria andExperienceIsNull() {
            addCriterion("experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(String value) {
            addCriterion("experience =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(String value) {
            addCriterion("experience <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(String value) {
            addCriterion("experience >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("experience >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(String value) {
            addCriterion("experience <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(String value) {
            addCriterion("experience <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLike(String value) {
            addCriterion("experience like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotLike(String value) {
            addCriterion("experience not like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<String> values) {
            addCriterion("experience in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<String> values) {
            addCriterion("experience not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(String value1, String value2) {
            addCriterion("experience between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(String value1, String value2) {
            addCriterion("experience not between", value1, value2, "experience");
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

        public Criteria andForwardvocationIsNull() {
            addCriterion("forwardvocation is null");
            return (Criteria) this;
        }

        public Criteria andForwardvocationIsNotNull() {
            addCriterion("forwardvocation is not null");
            return (Criteria) this;
        }

        public Criteria andForwardvocationEqualTo(String value) {
            addCriterion("forwardvocation =", value, "forwardvocation");
            return (Criteria) this;
        }

        public Criteria andForwardvocationNotEqualTo(String value) {
            addCriterion("forwardvocation <>", value, "forwardvocation");
            return (Criteria) this;
        }

        public Criteria andForwardvocationGreaterThan(String value) {
            addCriterion("forwardvocation >", value, "forwardvocation");
            return (Criteria) this;
        }

        public Criteria andForwardvocationGreaterThanOrEqualTo(String value) {
            addCriterion("forwardvocation >=", value, "forwardvocation");
            return (Criteria) this;
        }

        public Criteria andForwardvocationLessThan(String value) {
            addCriterion("forwardvocation <", value, "forwardvocation");
            return (Criteria) this;
        }

        public Criteria andForwardvocationLessThanOrEqualTo(String value) {
            addCriterion("forwardvocation <=", value, "forwardvocation");
            return (Criteria) this;
        }

        public Criteria andForwardvocationLike(String value) {
            addCriterion("forwardvocation like", value, "forwardvocation");
            return (Criteria) this;
        }

        public Criteria andForwardvocationNotLike(String value) {
            addCriterion("forwardvocation not like", value, "forwardvocation");
            return (Criteria) this;
        }

        public Criteria andForwardvocationIn(List<String> values) {
            addCriterion("forwardvocation in", values, "forwardvocation");
            return (Criteria) this;
        }

        public Criteria andForwardvocationNotIn(List<String> values) {
            addCriterion("forwardvocation not in", values, "forwardvocation");
            return (Criteria) this;
        }

        public Criteria andForwardvocationBetween(String value1, String value2) {
            addCriterion("forwardvocation between", value1, value2, "forwardvocation");
            return (Criteria) this;
        }

        public Criteria andForwardvocationNotBetween(String value1, String value2) {
            addCriterion("forwardvocation not between", value1, value2, "forwardvocation");
            return (Criteria) this;
        }

        public Criteria andVocationstandardIsNull() {
            addCriterion("vocationstandard is null");
            return (Criteria) this;
        }

        public Criteria andVocationstandardIsNotNull() {
            addCriterion("vocationstandard is not null");
            return (Criteria) this;
        }

        public Criteria andVocationstandardEqualTo(String value) {
            addCriterion("vocationstandard =", value, "vocationstandard");
            return (Criteria) this;
        }

        public Criteria andVocationstandardNotEqualTo(String value) {
            addCriterion("vocationstandard <>", value, "vocationstandard");
            return (Criteria) this;
        }

        public Criteria andVocationstandardGreaterThan(String value) {
            addCriterion("vocationstandard >", value, "vocationstandard");
            return (Criteria) this;
        }

        public Criteria andVocationstandardGreaterThanOrEqualTo(String value) {
            addCriterion("vocationstandard >=", value, "vocationstandard");
            return (Criteria) this;
        }

        public Criteria andVocationstandardLessThan(String value) {
            addCriterion("vocationstandard <", value, "vocationstandard");
            return (Criteria) this;
        }

        public Criteria andVocationstandardLessThanOrEqualTo(String value) {
            addCriterion("vocationstandard <=", value, "vocationstandard");
            return (Criteria) this;
        }

        public Criteria andVocationstandardLike(String value) {
            addCriterion("vocationstandard like", value, "vocationstandard");
            return (Criteria) this;
        }

        public Criteria andVocationstandardNotLike(String value) {
            addCriterion("vocationstandard not like", value, "vocationstandard");
            return (Criteria) this;
        }

        public Criteria andVocationstandardIn(List<String> values) {
            addCriterion("vocationstandard in", values, "vocationstandard");
            return (Criteria) this;
        }

        public Criteria andVocationstandardNotIn(List<String> values) {
            addCriterion("vocationstandard not in", values, "vocationstandard");
            return (Criteria) this;
        }

        public Criteria andVocationstandardBetween(String value1, String value2) {
            addCriterion("vocationstandard between", value1, value2, "vocationstandard");
            return (Criteria) this;
        }

        public Criteria andVocationstandardNotBetween(String value1, String value2) {
            addCriterion("vocationstandard not between", value1, value2, "vocationstandard");
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

        public Criteria andSalaryEqualTo(String value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(String value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(String value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(String value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(String value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLike(String value) {
            addCriterion("salary like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotLike(String value) {
            addCriterion("salary not like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<String> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<String> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(String value1, String value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(String value1, String value2) {
            addCriterion("salary not between", value1, value2, "salary");
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

        public Criteria andIssuedateIsNull() {
            addCriterion("issuedate is null");
            return (Criteria) this;
        }

        public Criteria andIssuedateIsNotNull() {
            addCriterion("issuedate is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedateEqualTo(String value) {
            addCriterion("issuedate =", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotEqualTo(String value) {
            addCriterion("issuedate <>", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateGreaterThan(String value) {
            addCriterion("issuedate >", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateGreaterThanOrEqualTo(String value) {
            addCriterion("issuedate >=", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateLessThan(String value) {
            addCriterion("issuedate <", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateLessThanOrEqualTo(String value) {
            addCriterion("issuedate <=", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateLike(String value) {
            addCriterion("issuedate like", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotLike(String value) {
            addCriterion("issuedate not like", value, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateIn(List<String> values) {
            addCriterion("issuedate in", values, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotIn(List<String> values) {
            addCriterion("issuedate not in", values, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateBetween(String value1, String value2) {
            addCriterion("issuedate between", value1, value2, "issuedate");
            return (Criteria) this;
        }

        public Criteria andIssuedateNotBetween(String value1, String value2) {
            addCriterion("issuedate not between", value1, value2, "issuedate");
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

        public Criteria andPhotourlIsNull() {
            addCriterion("photourl is null");
            return (Criteria) this;
        }

        public Criteria andPhotourlIsNotNull() {
            addCriterion("photourl is not null");
            return (Criteria) this;
        }

        public Criteria andPhotourlEqualTo(String value) {
            addCriterion("photourl =", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotEqualTo(String value) {
            addCriterion("photourl <>", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlGreaterThan(String value) {
            addCriterion("photourl >", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlGreaterThanOrEqualTo(String value) {
            addCriterion("photourl >=", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLessThan(String value) {
            addCriterion("photourl <", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLessThanOrEqualTo(String value) {
            addCriterion("photourl <=", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlLike(String value) {
            addCriterion("photourl like", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotLike(String value) {
            addCriterion("photourl not like", value, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlIn(List<String> values) {
            addCriterion("photourl in", values, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotIn(List<String> values) {
            addCriterion("photourl not in", values, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlBetween(String value1, String value2) {
            addCriterion("photourl between", value1, value2, "photourl");
            return (Criteria) this;
        }

        public Criteria andPhotourlNotBetween(String value1, String value2) {
            addCriterion("photourl not between", value1, value2, "photourl");
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

        public Criteria andLasttitleIsNull() {
            addCriterion("lasttitle is null");
            return (Criteria) this;
        }

        public Criteria andLasttitleIsNotNull() {
            addCriterion("lasttitle is not null");
            return (Criteria) this;
        }

        public Criteria andLasttitleEqualTo(String value) {
            addCriterion("lasttitle =", value, "lasttitle");
            return (Criteria) this;
        }

        public Criteria andLasttitleNotEqualTo(String value) {
            addCriterion("lasttitle <>", value, "lasttitle");
            return (Criteria) this;
        }

        public Criteria andLasttitleGreaterThan(String value) {
            addCriterion("lasttitle >", value, "lasttitle");
            return (Criteria) this;
        }

        public Criteria andLasttitleGreaterThanOrEqualTo(String value) {
            addCriterion("lasttitle >=", value, "lasttitle");
            return (Criteria) this;
        }

        public Criteria andLasttitleLessThan(String value) {
            addCriterion("lasttitle <", value, "lasttitle");
            return (Criteria) this;
        }

        public Criteria andLasttitleLessThanOrEqualTo(String value) {
            addCriterion("lasttitle <=", value, "lasttitle");
            return (Criteria) this;
        }

        public Criteria andLasttitleLike(String value) {
            addCriterion("lasttitle like", value, "lasttitle");
            return (Criteria) this;
        }

        public Criteria andLasttitleNotLike(String value) {
            addCriterion("lasttitle not like", value, "lasttitle");
            return (Criteria) this;
        }

        public Criteria andLasttitleIn(List<String> values) {
            addCriterion("lasttitle in", values, "lasttitle");
            return (Criteria) this;
        }

        public Criteria andLasttitleNotIn(List<String> values) {
            addCriterion("lasttitle not in", values, "lasttitle");
            return (Criteria) this;
        }

        public Criteria andLasttitleBetween(String value1, String value2) {
            addCriterion("lasttitle between", value1, value2, "lasttitle");
            return (Criteria) this;
        }

        public Criteria andLasttitleNotBetween(String value1, String value2) {
            addCriterion("lasttitle not between", value1, value2, "lasttitle");
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

        public Criteria andIntegrityIsNull() {
            addCriterion("integrity is null");
            return (Criteria) this;
        }

        public Criteria andIntegrityIsNotNull() {
            addCriterion("integrity is not null");
            return (Criteria) this;
        }

        public Criteria andIntegrityEqualTo(String value) {
            addCriterion("integrity =", value, "integrity");
            return (Criteria) this;
        }

        public Criteria andIntegrityNotEqualTo(String value) {
            addCriterion("integrity <>", value, "integrity");
            return (Criteria) this;
        }

        public Criteria andIntegrityGreaterThan(String value) {
            addCriterion("integrity >", value, "integrity");
            return (Criteria) this;
        }

        public Criteria andIntegrityGreaterThanOrEqualTo(String value) {
            addCriterion("integrity >=", value, "integrity");
            return (Criteria) this;
        }

        public Criteria andIntegrityLessThan(String value) {
            addCriterion("integrity <", value, "integrity");
            return (Criteria) this;
        }

        public Criteria andIntegrityLessThanOrEqualTo(String value) {
            addCriterion("integrity <=", value, "integrity");
            return (Criteria) this;
        }

        public Criteria andIntegrityLike(String value) {
            addCriterion("integrity like", value, "integrity");
            return (Criteria) this;
        }

        public Criteria andIntegrityNotLike(String value) {
            addCriterion("integrity not like", value, "integrity");
            return (Criteria) this;
        }

        public Criteria andIntegrityIn(List<String> values) {
            addCriterion("integrity in", values, "integrity");
            return (Criteria) this;
        }

        public Criteria andIntegrityNotIn(List<String> values) {
            addCriterion("integrity not in", values, "integrity");
            return (Criteria) this;
        }

        public Criteria andIntegrityBetween(String value1, String value2) {
            addCriterion("integrity between", value1, value2, "integrity");
            return (Criteria) this;
        }

        public Criteria andIntegrityNotBetween(String value1, String value2) {
            addCriterion("integrity not between", value1, value2, "integrity");
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

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andMsnIsNull() {
            addCriterion("msn is null");
            return (Criteria) this;
        }

        public Criteria andMsnIsNotNull() {
            addCriterion("msn is not null");
            return (Criteria) this;
        }

        public Criteria andMsnEqualTo(String value) {
            addCriterion("msn =", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotEqualTo(String value) {
            addCriterion("msn <>", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThan(String value) {
            addCriterion("msn >", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThanOrEqualTo(String value) {
            addCriterion("msn >=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThan(String value) {
            addCriterion("msn <", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThanOrEqualTo(String value) {
            addCriterion("msn <=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLike(String value) {
            addCriterion("msn like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotLike(String value) {
            addCriterion("msn not like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnIn(List<String> values) {
            addCriterion("msn in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotIn(List<String> values) {
            addCriterion("msn not in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnBetween(String value1, String value2) {
            addCriterion("msn between", value1, value2, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotBetween(String value1, String value2) {
            addCriterion("msn not between", value1, value2, "msn");
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

        public Criteria andDonotrecommendIsNull() {
            addCriterion("donotrecommend is null");
            return (Criteria) this;
        }

        public Criteria andDonotrecommendIsNotNull() {
            addCriterion("donotrecommend is not null");
            return (Criteria) this;
        }

        public Criteria andDonotrecommendEqualTo(String value) {
            addCriterion("donotrecommend =", value, "donotrecommend");
            return (Criteria) this;
        }

        public Criteria andDonotrecommendNotEqualTo(String value) {
            addCriterion("donotrecommend <>", value, "donotrecommend");
            return (Criteria) this;
        }

        public Criteria andDonotrecommendGreaterThan(String value) {
            addCriterion("donotrecommend >", value, "donotrecommend");
            return (Criteria) this;
        }

        public Criteria andDonotrecommendGreaterThanOrEqualTo(String value) {
            addCriterion("donotrecommend >=", value, "donotrecommend");
            return (Criteria) this;
        }

        public Criteria andDonotrecommendLessThan(String value) {
            addCriterion("donotrecommend <", value, "donotrecommend");
            return (Criteria) this;
        }

        public Criteria andDonotrecommendLessThanOrEqualTo(String value) {
            addCriterion("donotrecommend <=", value, "donotrecommend");
            return (Criteria) this;
        }

        public Criteria andDonotrecommendLike(String value) {
            addCriterion("donotrecommend like", value, "donotrecommend");
            return (Criteria) this;
        }

        public Criteria andDonotrecommendNotLike(String value) {
            addCriterion("donotrecommend not like", value, "donotrecommend");
            return (Criteria) this;
        }

        public Criteria andDonotrecommendIn(List<String> values) {
            addCriterion("donotrecommend in", values, "donotrecommend");
            return (Criteria) this;
        }

        public Criteria andDonotrecommendNotIn(List<String> values) {
            addCriterion("donotrecommend not in", values, "donotrecommend");
            return (Criteria) this;
        }

        public Criteria andDonotrecommendBetween(String value1, String value2) {
            addCriterion("donotrecommend between", value1, value2, "donotrecommend");
            return (Criteria) this;
        }

        public Criteria andDonotrecommendNotBetween(String value1, String value2) {
            addCriterion("donotrecommend not between", value1, value2, "donotrecommend");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsIsNull() {
            addCriterion("personalinterests is null");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsIsNotNull() {
            addCriterion("personalinterests is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsEqualTo(String value) {
            addCriterion("personalinterests =", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsNotEqualTo(String value) {
            addCriterion("personalinterests <>", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsGreaterThan(String value) {
            addCriterion("personalinterests >", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsGreaterThanOrEqualTo(String value) {
            addCriterion("personalinterests >=", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsLessThan(String value) {
            addCriterion("personalinterests <", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsLessThanOrEqualTo(String value) {
            addCriterion("personalinterests <=", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsLike(String value) {
            addCriterion("personalinterests like", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsNotLike(String value) {
            addCriterion("personalinterests not like", value, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsIn(List<String> values) {
            addCriterion("personalinterests in", values, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsNotIn(List<String> values) {
            addCriterion("personalinterests not in", values, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsBetween(String value1, String value2) {
            addCriterion("personalinterests between", value1, value2, "personalinterests");
            return (Criteria) this;
        }

        public Criteria andPersonalinterestsNotBetween(String value1, String value2) {
            addCriterion("personalinterests not between", value1, value2, "personalinterests");
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