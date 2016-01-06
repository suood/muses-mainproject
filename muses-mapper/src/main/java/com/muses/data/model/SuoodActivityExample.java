package com.muses.data.model;

import java.util.ArrayList;
import java.util.List;

public class SuoodActivityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table suood_activity
     *
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table suood_activity
     *
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table suood_activity
     *
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
     */
    public SuoodActivityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
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
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
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
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table suood_activity
     *
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
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
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
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

        public Criteria andActivity_idIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivity_idIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivity_idEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idLessThan(Integer value) {
            addCriterion("activity_id <", value, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_idNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activity_id");
            return (Criteria) this;
        }

        public Criteria andActivity_titleIsNull() {
            addCriterion("activity_title is null");
            return (Criteria) this;
        }

        public Criteria andActivity_titleIsNotNull() {
            addCriterion("activity_title is not null");
            return (Criteria) this;
        }

        public Criteria andActivity_titleEqualTo(String value) {
            addCriterion("activity_title =", value, "activity_title");
            return (Criteria) this;
        }

        public Criteria andActivity_titleNotEqualTo(String value) {
            addCriterion("activity_title <>", value, "activity_title");
            return (Criteria) this;
        }

        public Criteria andActivity_titleGreaterThan(String value) {
            addCriterion("activity_title >", value, "activity_title");
            return (Criteria) this;
        }

        public Criteria andActivity_titleGreaterThanOrEqualTo(String value) {
            addCriterion("activity_title >=", value, "activity_title");
            return (Criteria) this;
        }

        public Criteria andActivity_titleLessThan(String value) {
            addCriterion("activity_title <", value, "activity_title");
            return (Criteria) this;
        }

        public Criteria andActivity_titleLessThanOrEqualTo(String value) {
            addCriterion("activity_title <=", value, "activity_title");
            return (Criteria) this;
        }

        public Criteria andActivity_titleLike(String value) {
            addCriterion("activity_title like", value, "activity_title");
            return (Criteria) this;
        }

        public Criteria andActivity_titleNotLike(String value) {
            addCriterion("activity_title not like", value, "activity_title");
            return (Criteria) this;
        }

        public Criteria andActivity_titleIn(List<String> values) {
            addCriterion("activity_title in", values, "activity_title");
            return (Criteria) this;
        }

        public Criteria andActivity_titleNotIn(List<String> values) {
            addCriterion("activity_title not in", values, "activity_title");
            return (Criteria) this;
        }

        public Criteria andActivity_titleBetween(String value1, String value2) {
            addCriterion("activity_title between", value1, value2, "activity_title");
            return (Criteria) this;
        }

        public Criteria andActivity_titleNotBetween(String value1, String value2) {
            addCriterion("activity_title not between", value1, value2, "activity_title");
            return (Criteria) this;
        }

        public Criteria andActivity_typeIsNull() {
            addCriterion("activity_type is null");
            return (Criteria) this;
        }

        public Criteria andActivity_typeIsNotNull() {
            addCriterion("activity_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivity_typeEqualTo(String value) {
            addCriterion("activity_type =", value, "activity_type");
            return (Criteria) this;
        }

        public Criteria andActivity_typeNotEqualTo(String value) {
            addCriterion("activity_type <>", value, "activity_type");
            return (Criteria) this;
        }

        public Criteria andActivity_typeGreaterThan(String value) {
            addCriterion("activity_type >", value, "activity_type");
            return (Criteria) this;
        }

        public Criteria andActivity_typeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_type >=", value, "activity_type");
            return (Criteria) this;
        }

        public Criteria andActivity_typeLessThan(String value) {
            addCriterion("activity_type <", value, "activity_type");
            return (Criteria) this;
        }

        public Criteria andActivity_typeLessThanOrEqualTo(String value) {
            addCriterion("activity_type <=", value, "activity_type");
            return (Criteria) this;
        }

        public Criteria andActivity_typeLike(String value) {
            addCriterion("activity_type like", value, "activity_type");
            return (Criteria) this;
        }

        public Criteria andActivity_typeNotLike(String value) {
            addCriterion("activity_type not like", value, "activity_type");
            return (Criteria) this;
        }

        public Criteria andActivity_typeIn(List<String> values) {
            addCriterion("activity_type in", values, "activity_type");
            return (Criteria) this;
        }

        public Criteria andActivity_typeNotIn(List<String> values) {
            addCriterion("activity_type not in", values, "activity_type");
            return (Criteria) this;
        }

        public Criteria andActivity_typeBetween(String value1, String value2) {
            addCriterion("activity_type between", value1, value2, "activity_type");
            return (Criteria) this;
        }

        public Criteria andActivity_typeNotBetween(String value1, String value2) {
            addCriterion("activity_type not between", value1, value2, "activity_type");
            return (Criteria) this;
        }

        public Criteria andActivity_bannerIsNull() {
            addCriterion("activity_banner is null");
            return (Criteria) this;
        }

        public Criteria andActivity_bannerIsNotNull() {
            addCriterion("activity_banner is not null");
            return (Criteria) this;
        }

        public Criteria andActivity_bannerEqualTo(String value) {
            addCriterion("activity_banner =", value, "activity_banner");
            return (Criteria) this;
        }

        public Criteria andActivity_bannerNotEqualTo(String value) {
            addCriterion("activity_banner <>", value, "activity_banner");
            return (Criteria) this;
        }

        public Criteria andActivity_bannerGreaterThan(String value) {
            addCriterion("activity_banner >", value, "activity_banner");
            return (Criteria) this;
        }

        public Criteria andActivity_bannerGreaterThanOrEqualTo(String value) {
            addCriterion("activity_banner >=", value, "activity_banner");
            return (Criteria) this;
        }

        public Criteria andActivity_bannerLessThan(String value) {
            addCriterion("activity_banner <", value, "activity_banner");
            return (Criteria) this;
        }

        public Criteria andActivity_bannerLessThanOrEqualTo(String value) {
            addCriterion("activity_banner <=", value, "activity_banner");
            return (Criteria) this;
        }

        public Criteria andActivity_bannerLike(String value) {
            addCriterion("activity_banner like", value, "activity_banner");
            return (Criteria) this;
        }

        public Criteria andActivity_bannerNotLike(String value) {
            addCriterion("activity_banner not like", value, "activity_banner");
            return (Criteria) this;
        }

        public Criteria andActivity_bannerIn(List<String> values) {
            addCriterion("activity_banner in", values, "activity_banner");
            return (Criteria) this;
        }

        public Criteria andActivity_bannerNotIn(List<String> values) {
            addCriterion("activity_banner not in", values, "activity_banner");
            return (Criteria) this;
        }

        public Criteria andActivity_bannerBetween(String value1, String value2) {
            addCriterion("activity_banner between", value1, value2, "activity_banner");
            return (Criteria) this;
        }

        public Criteria andActivity_bannerNotBetween(String value1, String value2) {
            addCriterion("activity_banner not between", value1, value2, "activity_banner");
            return (Criteria) this;
        }

        public Criteria andActivity_styleIsNull() {
            addCriterion("activity_style is null");
            return (Criteria) this;
        }

        public Criteria andActivity_styleIsNotNull() {
            addCriterion("activity_style is not null");
            return (Criteria) this;
        }

        public Criteria andActivity_styleEqualTo(String value) {
            addCriterion("activity_style =", value, "activity_style");
            return (Criteria) this;
        }

        public Criteria andActivity_styleNotEqualTo(String value) {
            addCriterion("activity_style <>", value, "activity_style");
            return (Criteria) this;
        }

        public Criteria andActivity_styleGreaterThan(String value) {
            addCriterion("activity_style >", value, "activity_style");
            return (Criteria) this;
        }

        public Criteria andActivity_styleGreaterThanOrEqualTo(String value) {
            addCriterion("activity_style >=", value, "activity_style");
            return (Criteria) this;
        }

        public Criteria andActivity_styleLessThan(String value) {
            addCriterion("activity_style <", value, "activity_style");
            return (Criteria) this;
        }

        public Criteria andActivity_styleLessThanOrEqualTo(String value) {
            addCriterion("activity_style <=", value, "activity_style");
            return (Criteria) this;
        }

        public Criteria andActivity_styleLike(String value) {
            addCriterion("activity_style like", value, "activity_style");
            return (Criteria) this;
        }

        public Criteria andActivity_styleNotLike(String value) {
            addCriterion("activity_style not like", value, "activity_style");
            return (Criteria) this;
        }

        public Criteria andActivity_styleIn(List<String> values) {
            addCriterion("activity_style in", values, "activity_style");
            return (Criteria) this;
        }

        public Criteria andActivity_styleNotIn(List<String> values) {
            addCriterion("activity_style not in", values, "activity_style");
            return (Criteria) this;
        }

        public Criteria andActivity_styleBetween(String value1, String value2) {
            addCriterion("activity_style between", value1, value2, "activity_style");
            return (Criteria) this;
        }

        public Criteria andActivity_styleNotBetween(String value1, String value2) {
            addCriterion("activity_style not between", value1, value2, "activity_style");
            return (Criteria) this;
        }

        public Criteria andActivity_descIsNull() {
            addCriterion("activity_desc is null");
            return (Criteria) this;
        }

        public Criteria andActivity_descIsNotNull() {
            addCriterion("activity_desc is not null");
            return (Criteria) this;
        }

        public Criteria andActivity_descEqualTo(String value) {
            addCriterion("activity_desc =", value, "activity_desc");
            return (Criteria) this;
        }

        public Criteria andActivity_descNotEqualTo(String value) {
            addCriterion("activity_desc <>", value, "activity_desc");
            return (Criteria) this;
        }

        public Criteria andActivity_descGreaterThan(String value) {
            addCriterion("activity_desc >", value, "activity_desc");
            return (Criteria) this;
        }

        public Criteria andActivity_descGreaterThanOrEqualTo(String value) {
            addCriterion("activity_desc >=", value, "activity_desc");
            return (Criteria) this;
        }

        public Criteria andActivity_descLessThan(String value) {
            addCriterion("activity_desc <", value, "activity_desc");
            return (Criteria) this;
        }

        public Criteria andActivity_descLessThanOrEqualTo(String value) {
            addCriterion("activity_desc <=", value, "activity_desc");
            return (Criteria) this;
        }

        public Criteria andActivity_descLike(String value) {
            addCriterion("activity_desc like", value, "activity_desc");
            return (Criteria) this;
        }

        public Criteria andActivity_descNotLike(String value) {
            addCriterion("activity_desc not like", value, "activity_desc");
            return (Criteria) this;
        }

        public Criteria andActivity_descIn(List<String> values) {
            addCriterion("activity_desc in", values, "activity_desc");
            return (Criteria) this;
        }

        public Criteria andActivity_descNotIn(List<String> values) {
            addCriterion("activity_desc not in", values, "activity_desc");
            return (Criteria) this;
        }

        public Criteria andActivity_descBetween(String value1, String value2) {
            addCriterion("activity_desc between", value1, value2, "activity_desc");
            return (Criteria) this;
        }

        public Criteria andActivity_descNotBetween(String value1, String value2) {
            addCriterion("activity_desc not between", value1, value2, "activity_desc");
            return (Criteria) this;
        }

        public Criteria andActivity_start_dateIsNull() {
            addCriterion("activity_start_date is null");
            return (Criteria) this;
        }

        public Criteria andActivity_start_dateIsNotNull() {
            addCriterion("activity_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andActivity_start_dateEqualTo(Integer value) {
            addCriterion("activity_start_date =", value, "activity_start_date");
            return (Criteria) this;
        }

        public Criteria andActivity_start_dateNotEqualTo(Integer value) {
            addCriterion("activity_start_date <>", value, "activity_start_date");
            return (Criteria) this;
        }

        public Criteria andActivity_start_dateGreaterThan(Integer value) {
            addCriterion("activity_start_date >", value, "activity_start_date");
            return (Criteria) this;
        }

        public Criteria andActivity_start_dateGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_start_date >=", value, "activity_start_date");
            return (Criteria) this;
        }

        public Criteria andActivity_start_dateLessThan(Integer value) {
            addCriterion("activity_start_date <", value, "activity_start_date");
            return (Criteria) this;
        }

        public Criteria andActivity_start_dateLessThanOrEqualTo(Integer value) {
            addCriterion("activity_start_date <=", value, "activity_start_date");
            return (Criteria) this;
        }

        public Criteria andActivity_start_dateIn(List<Integer> values) {
            addCriterion("activity_start_date in", values, "activity_start_date");
            return (Criteria) this;
        }

        public Criteria andActivity_start_dateNotIn(List<Integer> values) {
            addCriterion("activity_start_date not in", values, "activity_start_date");
            return (Criteria) this;
        }

        public Criteria andActivity_start_dateBetween(Integer value1, Integer value2) {
            addCriterion("activity_start_date between", value1, value2, "activity_start_date");
            return (Criteria) this;
        }

        public Criteria andActivity_start_dateNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_start_date not between", value1, value2, "activity_start_date");
            return (Criteria) this;
        }

        public Criteria andActivity_end_dateIsNull() {
            addCriterion("activity_end_date is null");
            return (Criteria) this;
        }

        public Criteria andActivity_end_dateIsNotNull() {
            addCriterion("activity_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andActivity_end_dateEqualTo(Integer value) {
            addCriterion("activity_end_date =", value, "activity_end_date");
            return (Criteria) this;
        }

        public Criteria andActivity_end_dateNotEqualTo(Integer value) {
            addCriterion("activity_end_date <>", value, "activity_end_date");
            return (Criteria) this;
        }

        public Criteria andActivity_end_dateGreaterThan(Integer value) {
            addCriterion("activity_end_date >", value, "activity_end_date");
            return (Criteria) this;
        }

        public Criteria andActivity_end_dateGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_end_date >=", value, "activity_end_date");
            return (Criteria) this;
        }

        public Criteria andActivity_end_dateLessThan(Integer value) {
            addCriterion("activity_end_date <", value, "activity_end_date");
            return (Criteria) this;
        }

        public Criteria andActivity_end_dateLessThanOrEqualTo(Integer value) {
            addCriterion("activity_end_date <=", value, "activity_end_date");
            return (Criteria) this;
        }

        public Criteria andActivity_end_dateIn(List<Integer> values) {
            addCriterion("activity_end_date in", values, "activity_end_date");
            return (Criteria) this;
        }

        public Criteria andActivity_end_dateNotIn(List<Integer> values) {
            addCriterion("activity_end_date not in", values, "activity_end_date");
            return (Criteria) this;
        }

        public Criteria andActivity_end_dateBetween(Integer value1, Integer value2) {
            addCriterion("activity_end_date between", value1, value2, "activity_end_date");
            return (Criteria) this;
        }

        public Criteria andActivity_end_dateNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_end_date not between", value1, value2, "activity_end_date");
            return (Criteria) this;
        }

        public Criteria andActivity_sortIsNull() {
            addCriterion("activity_sort is null");
            return (Criteria) this;
        }

        public Criteria andActivity_sortIsNotNull() {
            addCriterion("activity_sort is not null");
            return (Criteria) this;
        }

        public Criteria andActivity_sortEqualTo(Boolean value) {
            addCriterion("activity_sort =", value, "activity_sort");
            return (Criteria) this;
        }

        public Criteria andActivity_sortNotEqualTo(Boolean value) {
            addCriterion("activity_sort <>", value, "activity_sort");
            return (Criteria) this;
        }

        public Criteria andActivity_sortGreaterThan(Boolean value) {
            addCriterion("activity_sort >", value, "activity_sort");
            return (Criteria) this;
        }

        public Criteria andActivity_sortGreaterThanOrEqualTo(Boolean value) {
            addCriterion("activity_sort >=", value, "activity_sort");
            return (Criteria) this;
        }

        public Criteria andActivity_sortLessThan(Boolean value) {
            addCriterion("activity_sort <", value, "activity_sort");
            return (Criteria) this;
        }

        public Criteria andActivity_sortLessThanOrEqualTo(Boolean value) {
            addCriterion("activity_sort <=", value, "activity_sort");
            return (Criteria) this;
        }

        public Criteria andActivity_sortIn(List<Boolean> values) {
            addCriterion("activity_sort in", values, "activity_sort");
            return (Criteria) this;
        }

        public Criteria andActivity_sortNotIn(List<Boolean> values) {
            addCriterion("activity_sort not in", values, "activity_sort");
            return (Criteria) this;
        }

        public Criteria andActivity_sortBetween(Boolean value1, Boolean value2) {
            addCriterion("activity_sort between", value1, value2, "activity_sort");
            return (Criteria) this;
        }

        public Criteria andActivity_sortNotBetween(Boolean value1, Boolean value2) {
            addCriterion("activity_sort not between", value1, value2, "activity_sort");
            return (Criteria) this;
        }

        public Criteria andActivity_stateIsNull() {
            addCriterion("activity_state is null");
            return (Criteria) this;
        }

        public Criteria andActivity_stateIsNotNull() {
            addCriterion("activity_state is not null");
            return (Criteria) this;
        }

        public Criteria andActivity_stateEqualTo(Boolean value) {
            addCriterion("activity_state =", value, "activity_state");
            return (Criteria) this;
        }

        public Criteria andActivity_stateNotEqualTo(Boolean value) {
            addCriterion("activity_state <>", value, "activity_state");
            return (Criteria) this;
        }

        public Criteria andActivity_stateGreaterThan(Boolean value) {
            addCriterion("activity_state >", value, "activity_state");
            return (Criteria) this;
        }

        public Criteria andActivity_stateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("activity_state >=", value, "activity_state");
            return (Criteria) this;
        }

        public Criteria andActivity_stateLessThan(Boolean value) {
            addCriterion("activity_state <", value, "activity_state");
            return (Criteria) this;
        }

        public Criteria andActivity_stateLessThanOrEqualTo(Boolean value) {
            addCriterion("activity_state <=", value, "activity_state");
            return (Criteria) this;
        }

        public Criteria andActivity_stateIn(List<Boolean> values) {
            addCriterion("activity_state in", values, "activity_state");
            return (Criteria) this;
        }

        public Criteria andActivity_stateNotIn(List<Boolean> values) {
            addCriterion("activity_state not in", values, "activity_state");
            return (Criteria) this;
        }

        public Criteria andActivity_stateBetween(Boolean value1, Boolean value2) {
            addCriterion("activity_state between", value1, value2, "activity_state");
            return (Criteria) this;
        }

        public Criteria andActivity_stateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("activity_state not between", value1, value2, "activity_state");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table suood_activity
     *
     * @mbggenerated do_not_delete_during_merge Thu Dec 31 02:00:32 CST 2015
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
     * @mbggenerated Thu Dec 31 02:00:32 CST 2015
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