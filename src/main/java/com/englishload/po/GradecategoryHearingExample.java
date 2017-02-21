package com.englishload.po;

import java.util.ArrayList;
import java.util.List;

public class GradecategoryHearingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradecategoryHearingExample() {
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

        public Criteria andGradecategoryHearingIdIsNull() {
            addCriterion("gradecategory_hearing_id is null");
            return (Criteria) this;
        }

        public Criteria andGradecategoryHearingIdIsNotNull() {
            addCriterion("gradecategory_hearing_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradecategoryHearingIdEqualTo(Integer value) {
            addCriterion("gradecategory_hearing_id =", value, "gradecategoryHearingId");
            return (Criteria) this;
        }

        public Criteria andGradecategoryHearingIdNotEqualTo(Integer value) {
            addCriterion("gradecategory_hearing_id <>", value, "gradecategoryHearingId");
            return (Criteria) this;
        }

        public Criteria andGradecategoryHearingIdGreaterThan(Integer value) {
            addCriterion("gradecategory_hearing_id >", value, "gradecategoryHearingId");
            return (Criteria) this;
        }

        public Criteria andGradecategoryHearingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gradecategory_hearing_id >=", value, "gradecategoryHearingId");
            return (Criteria) this;
        }

        public Criteria andGradecategoryHearingIdLessThan(Integer value) {
            addCriterion("gradecategory_hearing_id <", value, "gradecategoryHearingId");
            return (Criteria) this;
        }

        public Criteria andGradecategoryHearingIdLessThanOrEqualTo(Integer value) {
            addCriterion("gradecategory_hearing_id <=", value, "gradecategoryHearingId");
            return (Criteria) this;
        }

        public Criteria andGradecategoryHearingIdIn(List<Integer> values) {
            addCriterion("gradecategory_hearing_id in", values, "gradecategoryHearingId");
            return (Criteria) this;
        }

        public Criteria andGradecategoryHearingIdNotIn(List<Integer> values) {
            addCriterion("gradecategory_hearing_id not in", values, "gradecategoryHearingId");
            return (Criteria) this;
        }

        public Criteria andGradecategoryHearingIdBetween(Integer value1, Integer value2) {
            addCriterion("gradecategory_hearing_id between", value1, value2, "gradecategoryHearingId");
            return (Criteria) this;
        }

        public Criteria andGradecategoryHearingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gradecategory_hearing_id not between", value1, value2, "gradecategoryHearingId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andHearingIdIsNull() {
            addCriterion("hearing_id is null");
            return (Criteria) this;
        }

        public Criteria andHearingIdIsNotNull() {
            addCriterion("hearing_id is not null");
            return (Criteria) this;
        }

        public Criteria andHearingIdEqualTo(Integer value) {
            addCriterion("hearing_id =", value, "hearingId");
            return (Criteria) this;
        }

        public Criteria andHearingIdNotEqualTo(Integer value) {
            addCriterion("hearing_id <>", value, "hearingId");
            return (Criteria) this;
        }

        public Criteria andHearingIdGreaterThan(Integer value) {
            addCriterion("hearing_id >", value, "hearingId");
            return (Criteria) this;
        }

        public Criteria andHearingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hearing_id >=", value, "hearingId");
            return (Criteria) this;
        }

        public Criteria andHearingIdLessThan(Integer value) {
            addCriterion("hearing_id <", value, "hearingId");
            return (Criteria) this;
        }

        public Criteria andHearingIdLessThanOrEqualTo(Integer value) {
            addCriterion("hearing_id <=", value, "hearingId");
            return (Criteria) this;
        }

        public Criteria andHearingIdIn(List<Integer> values) {
            addCriterion("hearing_id in", values, "hearingId");
            return (Criteria) this;
        }

        public Criteria andHearingIdNotIn(List<Integer> values) {
            addCriterion("hearing_id not in", values, "hearingId");
            return (Criteria) this;
        }

        public Criteria andHearingIdBetween(Integer value1, Integer value2) {
            addCriterion("hearing_id between", value1, value2, "hearingId");
            return (Criteria) this;
        }

        public Criteria andHearingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hearing_id not between", value1, value2, "hearingId");
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