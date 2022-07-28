package com.lou.pojo;

import java.util.ArrayList;
import java.util.List;

public class SpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andDanjiaIsNull() {
            addCriterion("danjia is null");
            return (Criteria) this;
        }

        public Criteria andDanjiaIsNotNull() {
            addCriterion("danjia is not null");
            return (Criteria) this;
        }

        public Criteria andDanjiaEqualTo(String value) {
            addCriterion("danjia =", value, "danjia");
            return (Criteria) this;
        }

        public Criteria andDanjiaNotEqualTo(String value) {
            addCriterion("danjia <>", value, "danjia");
            return (Criteria) this;
        }

        public Criteria andDanjiaGreaterThan(String value) {
            addCriterion("danjia >", value, "danjia");
            return (Criteria) this;
        }

        public Criteria andDanjiaGreaterThanOrEqualTo(String value) {
            addCriterion("danjia >=", value, "danjia");
            return (Criteria) this;
        }

        public Criteria andDanjiaLessThan(String value) {
            addCriterion("danjia <", value, "danjia");
            return (Criteria) this;
        }

        public Criteria andDanjiaLessThanOrEqualTo(String value) {
            addCriterion("danjia <=", value, "danjia");
            return (Criteria) this;
        }

        public Criteria andDanjiaLike(String value) {
            addCriterion("danjia like", value, "danjia");
            return (Criteria) this;
        }

        public Criteria andDanjiaNotLike(String value) {
            addCriterion("danjia not like", value, "danjia");
            return (Criteria) this;
        }

        public Criteria andDanjiaIn(List<String> values) {
            addCriterion("danjia in", values, "danjia");
            return (Criteria) this;
        }

        public Criteria andDanjiaNotIn(List<String> values) {
            addCriterion("danjia not in", values, "danjia");
            return (Criteria) this;
        }

        public Criteria andDanjiaBetween(String value1, String value2) {
            addCriterion("danjia between", value1, value2, "danjia");
            return (Criteria) this;
        }

        public Criteria andDanjiaNotBetween(String value1, String value2) {
            addCriterion("danjia not between", value1, value2, "danjia");
            return (Criteria) this;
        }

        public Criteria andTiaomaIsNull() {
            addCriterion("tiaoma is null");
            return (Criteria) this;
        }

        public Criteria andTiaomaIsNotNull() {
            addCriterion("tiaoma is not null");
            return (Criteria) this;
        }

        public Criteria andTiaomaEqualTo(String value) {
            addCriterion("tiaoma =", value, "tiaoma");
            return (Criteria) this;
        }

        public Criteria andTiaomaNotEqualTo(String value) {
            addCriterion("tiaoma <>", value, "tiaoma");
            return (Criteria) this;
        }

        public Criteria andTiaomaGreaterThan(String value) {
            addCriterion("tiaoma >", value, "tiaoma");
            return (Criteria) this;
        }

        public Criteria andTiaomaGreaterThanOrEqualTo(String value) {
            addCriterion("tiaoma >=", value, "tiaoma");
            return (Criteria) this;
        }

        public Criteria andTiaomaLessThan(String value) {
            addCriterion("tiaoma <", value, "tiaoma");
            return (Criteria) this;
        }

        public Criteria andTiaomaLessThanOrEqualTo(String value) {
            addCriterion("tiaoma <=", value, "tiaoma");
            return (Criteria) this;
        }

        public Criteria andTiaomaLike(String value) {
            addCriterion("tiaoma like", value, "tiaoma");
            return (Criteria) this;
        }

        public Criteria andTiaomaNotLike(String value) {
            addCriterion("tiaoma not like", value, "tiaoma");
            return (Criteria) this;
        }

        public Criteria andTiaomaIn(List<String> values) {
            addCriterion("tiaoma in", values, "tiaoma");
            return (Criteria) this;
        }

        public Criteria andTiaomaNotIn(List<String> values) {
            addCriterion("tiaoma not in", values, "tiaoma");
            return (Criteria) this;
        }

        public Criteria andTiaomaBetween(String value1, String value2) {
            addCriterion("tiaoma between", value1, value2, "tiaoma");
            return (Criteria) this;
        }

        public Criteria andTiaomaNotBetween(String value1, String value2) {
            addCriterion("tiaoma not between", value1, value2, "tiaoma");
            return (Criteria) this;
        }

        public Criteria andDanweiIsNull() {
            addCriterion("danwei is null");
            return (Criteria) this;
        }

        public Criteria andDanweiIsNotNull() {
            addCriterion("danwei is not null");
            return (Criteria) this;
        }

        public Criteria andDanweiEqualTo(String value) {
            addCriterion("danwei =", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotEqualTo(String value) {
            addCriterion("danwei <>", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThan(String value) {
            addCriterion("danwei >", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThanOrEqualTo(String value) {
            addCriterion("danwei >=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThan(String value) {
            addCriterion("danwei <", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThanOrEqualTo(String value) {
            addCriterion("danwei <=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLike(String value) {
            addCriterion("danwei like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotLike(String value) {
            addCriterion("danwei not like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiIn(List<String> values) {
            addCriterion("danwei in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotIn(List<String> values) {
            addCriterion("danwei not in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiBetween(String value1, String value2) {
            addCriterion("danwei between", value1, value2, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotBetween(String value1, String value2) {
            addCriterion("danwei not between", value1, value2, "danwei");
            return (Criteria) this;
        }

        public Criteria andZhekouIsNull() {
            addCriterion("zhekou is null");
            return (Criteria) this;
        }

        public Criteria andZhekouIsNotNull() {
            addCriterion("zhekou is not null");
            return (Criteria) this;
        }

        public Criteria andZhekouEqualTo(String value) {
            addCriterion("zhekou =", value, "zhekou");
            return (Criteria) this;
        }

        public Criteria andZhekouNotEqualTo(String value) {
            addCriterion("zhekou <>", value, "zhekou");
            return (Criteria) this;
        }

        public Criteria andZhekouGreaterThan(String value) {
            addCriterion("zhekou >", value, "zhekou");
            return (Criteria) this;
        }

        public Criteria andZhekouGreaterThanOrEqualTo(String value) {
            addCriterion("zhekou >=", value, "zhekou");
            return (Criteria) this;
        }

        public Criteria andZhekouLessThan(String value) {
            addCriterion("zhekou <", value, "zhekou");
            return (Criteria) this;
        }

        public Criteria andZhekouLessThanOrEqualTo(String value) {
            addCriterion("zhekou <=", value, "zhekou");
            return (Criteria) this;
        }

        public Criteria andZhekouLike(String value) {
            addCriterion("zhekou like", value, "zhekou");
            return (Criteria) this;
        }

        public Criteria andZhekouNotLike(String value) {
            addCriterion("zhekou not like", value, "zhekou");
            return (Criteria) this;
        }

        public Criteria andZhekouIn(List<String> values) {
            addCriterion("zhekou in", values, "zhekou");
            return (Criteria) this;
        }

        public Criteria andZhekouNotIn(List<String> values) {
            addCriterion("zhekou not in", values, "zhekou");
            return (Criteria) this;
        }

        public Criteria andZhekouBetween(String value1, String value2) {
            addCriterion("zhekou between", value1, value2, "zhekou");
            return (Criteria) this;
        }

        public Criteria andZhekouNotBetween(String value1, String value2) {
            addCriterion("zhekou not between", value1, value2, "zhekou");
            return (Criteria) this;
        }

        public Criteria andHuiyuanjiaIsNull() {
            addCriterion("huiyuanjia is null");
            return (Criteria) this;
        }

        public Criteria andHuiyuanjiaIsNotNull() {
            addCriterion("huiyuanjia is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyuanjiaEqualTo(String value) {
            addCriterion("huiyuanjia =", value, "huiyuanjia");
            return (Criteria) this;
        }

        public Criteria andHuiyuanjiaNotEqualTo(String value) {
            addCriterion("huiyuanjia <>", value, "huiyuanjia");
            return (Criteria) this;
        }

        public Criteria andHuiyuanjiaGreaterThan(String value) {
            addCriterion("huiyuanjia >", value, "huiyuanjia");
            return (Criteria) this;
        }

        public Criteria andHuiyuanjiaGreaterThanOrEqualTo(String value) {
            addCriterion("huiyuanjia >=", value, "huiyuanjia");
            return (Criteria) this;
        }

        public Criteria andHuiyuanjiaLessThan(String value) {
            addCriterion("huiyuanjia <", value, "huiyuanjia");
            return (Criteria) this;
        }

        public Criteria andHuiyuanjiaLessThanOrEqualTo(String value) {
            addCriterion("huiyuanjia <=", value, "huiyuanjia");
            return (Criteria) this;
        }

        public Criteria andHuiyuanjiaLike(String value) {
            addCriterion("huiyuanjia like", value, "huiyuanjia");
            return (Criteria) this;
        }

        public Criteria andHuiyuanjiaNotLike(String value) {
            addCriterion("huiyuanjia not like", value, "huiyuanjia");
            return (Criteria) this;
        }

        public Criteria andHuiyuanjiaIn(List<String> values) {
            addCriterion("huiyuanjia in", values, "huiyuanjia");
            return (Criteria) this;
        }

        public Criteria andHuiyuanjiaNotIn(List<String> values) {
            addCriterion("huiyuanjia not in", values, "huiyuanjia");
            return (Criteria) this;
        }

        public Criteria andHuiyuanjiaBetween(String value1, String value2) {
            addCriterion("huiyuanjia between", value1, value2, "huiyuanjia");
            return (Criteria) this;
        }

        public Criteria andHuiyuanjiaNotBetween(String value1, String value2) {
            addCriterion("huiyuanjia not between", value1, value2, "huiyuanjia");
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