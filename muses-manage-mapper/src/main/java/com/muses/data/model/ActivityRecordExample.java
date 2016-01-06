package com.muses.data.model;

import java.util.ArrayList;
import java.util.List;

public class ActivityRecordExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
    public ActivityRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
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

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIsNull() {
            addCriterion("activity_title is null");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIsNotNull() {
            addCriterion("activity_title is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTitleEqualTo(String value) {
            addCriterion("activity_title =", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotEqualTo(String value) {
            addCriterion("activity_title <>", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleGreaterThan(String value) {
            addCriterion("activity_title >", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleGreaterThanOrEqualTo(String value) {
            addCriterion("activity_title >=", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLessThan(String value) {
            addCriterion("activity_title <", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLessThanOrEqualTo(String value) {
            addCriterion("activity_title <=", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLike(String value) {
            addCriterion("activity_title like", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotLike(String value) {
            addCriterion("activity_title not like", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIn(List<String> values) {
            addCriterion("activity_title in", values, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotIn(List<String> values) {
            addCriterion("activity_title not in", values, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleBetween(String value1, String value2) {
            addCriterion("activity_title between", value1, value2, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotBetween(String value1, String value2) {
            addCriterion("activity_title not between", value1, value2, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNull() {
            addCriterion("activity_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("activity_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(String value) {
            addCriterion("activity_type =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(String value) {
            addCriterion("activity_type <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(String value) {
            addCriterion("activity_type >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_type >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(String value) {
            addCriterion("activity_type <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(String value) {
            addCriterion("activity_type <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLike(String value) {
            addCriterion("activity_type like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotLike(String value) {
            addCriterion("activity_type not like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<String> values) {
            addCriterion("activity_type in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<String> values) {
            addCriterion("activity_type not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(String value1, String value2) {
            addCriterion("activity_type between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(String value1, String value2) {
            addCriterion("activity_type not between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityBannerIsNull() {
            addCriterion("activity_banner is null");
            return (Criteria) this;
        }

        public Criteria andActivityBannerIsNotNull() {
            addCriterion("activity_banner is not null");
            return (Criteria) this;
        }

        public Criteria andActivityBannerEqualTo(String value) {
            addCriterion("activity_banner =", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerNotEqualTo(String value) {
            addCriterion("activity_banner <>", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerGreaterThan(String value) {
            addCriterion("activity_banner >", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerGreaterThanOrEqualTo(String value) {
            addCriterion("activity_banner >=", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerLessThan(String value) {
            addCriterion("activity_banner <", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerLessThanOrEqualTo(String value) {
            addCriterion("activity_banner <=", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerLike(String value) {
            addCriterion("activity_banner like", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerNotLike(String value) {
            addCriterion("activity_banner not like", value, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerIn(List<String> values) {
            addCriterion("activity_banner in", values, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerNotIn(List<String> values) {
            addCriterion("activity_banner not in", values, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerBetween(String value1, String value2) {
            addCriterion("activity_banner between", value1, value2, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityBannerNotBetween(String value1, String value2) {
            addCriterion("activity_banner not between", value1, value2, "activityBanner");
            return (Criteria) this;
        }

        public Criteria andActivityStyleIsNull() {
            addCriterion("activity_style is null");
            return (Criteria) this;
        }

        public Criteria andActivityStyleIsNotNull() {
            addCriterion("activity_style is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStyleEqualTo(String value) {
            addCriterion("activity_style =", value, "activityStyle");
            return (Criteria) this;
        }

        public Criteria andActivityStyleNotEqualTo(String value) {
            addCriterion("activity_style <>", value, "activityStyle");
            return (Criteria) this;
        }

        public Criteria andActivityStyleGreaterThan(String value) {
            addCriterion("activity_style >", value, "activityStyle");
            return (Criteria) this;
        }

        public Criteria andActivityStyleGreaterThanOrEqualTo(String value) {
            addCriterion("activity_style >=", value, "activityStyle");
            return (Criteria) this;
        }

        public Criteria andActivityStyleLessThan(String value) {
            addCriterion("activity_style <", value, "activityStyle");
            return (Criteria) this;
        }

        public Criteria andActivityStyleLessThanOrEqualTo(String value) {
            addCriterion("activity_style <=", value, "activityStyle");
            return (Criteria) this;
        }

        public Criteria andActivityStyleLike(String value) {
            addCriterion("activity_style like", value, "activityStyle");
            return (Criteria) this;
        }

        public Criteria andActivityStyleNotLike(String value) {
            addCriterion("activity_style not like", value, "activityStyle");
            return (Criteria) this;
        }

        public Criteria andActivityStyleIn(List<String> values) {
            addCriterion("activity_style in", values, "activityStyle");
            return (Criteria) this;
        }

        public Criteria andActivityStyleNotIn(List<String> values) {
            addCriterion("activity_style not in", values, "activityStyle");
            return (Criteria) this;
        }

        public Criteria andActivityStyleBetween(String value1, String value2) {
            addCriterion("activity_style between", value1, value2, "activityStyle");
            return (Criteria) this;
        }

        public Criteria andActivityStyleNotBetween(String value1, String value2) {
            addCriterion("activity_style not between", value1, value2, "activityStyle");
            return (Criteria) this;
        }

        public Criteria andActivityDescIsNull() {
            addCriterion("activity_desc is null");
            return (Criteria) this;
        }

        public Criteria andActivityDescIsNotNull() {
            addCriterion("activity_desc is not null");
            return (Criteria) this;
        }

        public Criteria andActivityDescEqualTo(String value) {
            addCriterion("activity_desc =", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescNotEqualTo(String value) {
            addCriterion("activity_desc <>", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescGreaterThan(String value) {
            addCriterion("activity_desc >", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescGreaterThanOrEqualTo(String value) {
            addCriterion("activity_desc >=", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescLessThan(String value) {
            addCriterion("activity_desc <", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescLessThanOrEqualTo(String value) {
            addCriterion("activity_desc <=", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescLike(String value) {
            addCriterion("activity_desc like", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescNotLike(String value) {
            addCriterion("activity_desc not like", value, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescIn(List<String> values) {
            addCriterion("activity_desc in", values, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescNotIn(List<String> values) {
            addCriterion("activity_desc not in", values, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescBetween(String value1, String value2) {
            addCriterion("activity_desc between", value1, value2, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityDescNotBetween(String value1, String value2) {
            addCriterion("activity_desc not between", value1, value2, "activityDesc");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateIsNull() {
            addCriterion("activity_start_date is null");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateIsNotNull() {
            addCriterion("activity_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateEqualTo(Integer value) {
            addCriterion("activity_start_date =", value, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateNotEqualTo(Integer value) {
            addCriterion("activity_start_date <>", value, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateGreaterThan(Integer value) {
            addCriterion("activity_start_date >", value, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_start_date >=", value, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateLessThan(Integer value) {
            addCriterion("activity_start_date <", value, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateLessThanOrEqualTo(Integer value) {
            addCriterion("activity_start_date <=", value, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateIn(List<Integer> values) {
            addCriterion("activity_start_date in", values, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateNotIn(List<Integer> values) {
            addCriterion("activity_start_date not in", values, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateBetween(Integer value1, Integer value2) {
            addCriterion("activity_start_date between", value1, value2, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityStartDateNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_start_date not between", value1, value2, "activityStartDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateIsNull() {
            addCriterion("activity_end_date is null");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateIsNotNull() {
            addCriterion("activity_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateEqualTo(Integer value) {
            addCriterion("activity_end_date =", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateNotEqualTo(Integer value) {
            addCriterion("activity_end_date <>", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateGreaterThan(Integer value) {
            addCriterion("activity_end_date >", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_end_date >=", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateLessThan(Integer value) {
            addCriterion("activity_end_date <", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateLessThanOrEqualTo(Integer value) {
            addCriterion("activity_end_date <=", value, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateIn(List<Integer> values) {
            addCriterion("activity_end_date in", values, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateNotIn(List<Integer> values) {
            addCriterion("activity_end_date not in", values, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateBetween(Integer value1, Integer value2) {
            addCriterion("activity_end_date between", value1, value2, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityEndDateNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_end_date not between", value1, value2, "activityEndDate");
            return (Criteria) this;
        }

        public Criteria andActivitySortIsNull() {
            addCriterion("activity_sort is null");
            return (Criteria) this;
        }

        public Criteria andActivitySortIsNotNull() {
            addCriterion("activity_sort is not null");
            return (Criteria) this;
        }

        public Criteria andActivitySortEqualTo(Boolean value) {
            addCriterion("activity_sort =", value, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortNotEqualTo(Boolean value) {
            addCriterion("activity_sort <>", value, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortGreaterThan(Boolean value) {
            addCriterion("activity_sort >", value, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortGreaterThanOrEqualTo(Boolean value) {
            addCriterion("activity_sort >=", value, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortLessThan(Boolean value) {
            addCriterion("activity_sort <", value, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortLessThanOrEqualTo(Boolean value) {
            addCriterion("activity_sort <=", value, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortIn(List<Boolean> values) {
            addCriterion("activity_sort in", values, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortNotIn(List<Boolean> values) {
            addCriterion("activity_sort not in", values, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortBetween(Boolean value1, Boolean value2) {
            addCriterion("activity_sort between", value1, value2, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivitySortNotBetween(Boolean value1, Boolean value2) {
            addCriterion("activity_sort not between", value1, value2, "activitySort");
            return (Criteria) this;
        }

        public Criteria andActivityStateIsNull() {
            addCriterion("activity_state is null");
            return (Criteria) this;
        }

        public Criteria andActivityStateIsNotNull() {
            addCriterion("activity_state is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStateEqualTo(Boolean value) {
            addCriterion("activity_state =", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotEqualTo(Boolean value) {
            addCriterion("activity_state <>", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateGreaterThan(Boolean value) {
            addCriterion("activity_state >", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("activity_state >=", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateLessThan(Boolean value) {
            addCriterion("activity_state <", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateLessThanOrEqualTo(Boolean value) {
            addCriterion("activity_state <=", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateIn(List<Boolean> values) {
            addCriterion("activity_state in", values, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotIn(List<Boolean> values) {
            addCriterion("activity_state not in", values, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateBetween(Boolean value1, Boolean value2) {
            addCriterion("activity_state between", value1, value2, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("activity_state not between", value1, value2, "activityState");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table suood_activity
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table suood_activity
     *
     * @mbggenerated
     */
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