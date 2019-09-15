package com.duanxin.zqls.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FmsUserLikeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FmsUserLikeExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(Byte value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(Byte value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(Byte value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(Byte value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(Byte value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(Byte value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<Byte> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<Byte> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(Byte value1, Byte value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(Byte value1, Byte value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Byte value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Byte value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Byte value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Byte value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Byte value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Byte value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Byte> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Byte> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Byte value1, Byte value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Byte value1, Byte value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andTasteTypeIsNull() {
            addCriterion("taste_type is null");
            return (Criteria) this;
        }

        public Criteria andTasteTypeIsNotNull() {
            addCriterion("taste_type is not null");
            return (Criteria) this;
        }

        public Criteria andTasteTypeEqualTo(Byte value) {
            addCriterion("taste_type =", value, "tasteType");
            return (Criteria) this;
        }

        public Criteria andTasteTypeNotEqualTo(Byte value) {
            addCriterion("taste_type <>", value, "tasteType");
            return (Criteria) this;
        }

        public Criteria andTasteTypeGreaterThan(Byte value) {
            addCriterion("taste_type >", value, "tasteType");
            return (Criteria) this;
        }

        public Criteria andTasteTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("taste_type >=", value, "tasteType");
            return (Criteria) this;
        }

        public Criteria andTasteTypeLessThan(Byte value) {
            addCriterion("taste_type <", value, "tasteType");
            return (Criteria) this;
        }

        public Criteria andTasteTypeLessThanOrEqualTo(Byte value) {
            addCriterion("taste_type <=", value, "tasteType");
            return (Criteria) this;
        }

        public Criteria andTasteTypeIn(List<Byte> values) {
            addCriterion("taste_type in", values, "tasteType");
            return (Criteria) this;
        }

        public Criteria andTasteTypeNotIn(List<Byte> values) {
            addCriterion("taste_type not in", values, "tasteType");
            return (Criteria) this;
        }

        public Criteria andTasteTypeBetween(Byte value1, Byte value2) {
            addCriterion("taste_type between", value1, value2, "tasteType");
            return (Criteria) this;
        }

        public Criteria andTasteTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("taste_type not between", value1, value2, "tasteType");
            return (Criteria) this;
        }

        public Criteria andDietIsNull() {
            addCriterion("diet is null");
            return (Criteria) this;
        }

        public Criteria andDietIsNotNull() {
            addCriterion("diet is not null");
            return (Criteria) this;
        }

        public Criteria andDietEqualTo(Byte value) {
            addCriterion("diet =", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietNotEqualTo(Byte value) {
            addCriterion("diet <>", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietGreaterThan(Byte value) {
            addCriterion("diet >", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietGreaterThanOrEqualTo(Byte value) {
            addCriterion("diet >=", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietLessThan(Byte value) {
            addCriterion("diet <", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietLessThanOrEqualTo(Byte value) {
            addCriterion("diet <=", value, "diet");
            return (Criteria) this;
        }

        public Criteria andDietIn(List<Byte> values) {
            addCriterion("diet in", values, "diet");
            return (Criteria) this;
        }

        public Criteria andDietNotIn(List<Byte> values) {
            addCriterion("diet not in", values, "diet");
            return (Criteria) this;
        }

        public Criteria andDietBetween(Byte value1, Byte value2) {
            addCriterion("diet between", value1, value2, "diet");
            return (Criteria) this;
        }

        public Criteria andDietNotBetween(Byte value1, Byte value2) {
            addCriterion("diet not between", value1, value2, "diet");
            return (Criteria) this;
        }

        public Criteria andFavoriteDishesIsNull() {
            addCriterion("favorite_dishes is null");
            return (Criteria) this;
        }

        public Criteria andFavoriteDishesIsNotNull() {
            addCriterion("favorite_dishes is not null");
            return (Criteria) this;
        }

        public Criteria andFavoriteDishesEqualTo(Byte value) {
            addCriterion("favorite_dishes =", value, "favoriteDishes");
            return (Criteria) this;
        }

        public Criteria andFavoriteDishesNotEqualTo(Byte value) {
            addCriterion("favorite_dishes <>", value, "favoriteDishes");
            return (Criteria) this;
        }

        public Criteria andFavoriteDishesGreaterThan(Byte value) {
            addCriterion("favorite_dishes >", value, "favoriteDishes");
            return (Criteria) this;
        }

        public Criteria andFavoriteDishesGreaterThanOrEqualTo(Byte value) {
            addCriterion("favorite_dishes >=", value, "favoriteDishes");
            return (Criteria) this;
        }

        public Criteria andFavoriteDishesLessThan(Byte value) {
            addCriterion("favorite_dishes <", value, "favoriteDishes");
            return (Criteria) this;
        }

        public Criteria andFavoriteDishesLessThanOrEqualTo(Byte value) {
            addCriterion("favorite_dishes <=", value, "favoriteDishes");
            return (Criteria) this;
        }

        public Criteria andFavoriteDishesIn(List<Byte> values) {
            addCriterion("favorite_dishes in", values, "favoriteDishes");
            return (Criteria) this;
        }

        public Criteria andFavoriteDishesNotIn(List<Byte> values) {
            addCriterion("favorite_dishes not in", values, "favoriteDishes");
            return (Criteria) this;
        }

        public Criteria andFavoriteDishesBetween(Byte value1, Byte value2) {
            addCriterion("favorite_dishes between", value1, value2, "favoriteDishes");
            return (Criteria) this;
        }

        public Criteria andFavoriteDishesNotBetween(Byte value1, Byte value2) {
            addCriterion("favorite_dishes not between", value1, value2, "favoriteDishes");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRenewTimeIsNull() {
            addCriterion("renew_time is null");
            return (Criteria) this;
        }

        public Criteria andRenewTimeIsNotNull() {
            addCriterion("renew_time is not null");
            return (Criteria) this;
        }

        public Criteria andRenewTimeEqualTo(Date value) {
            addCriterion("renew_time =", value, "renewTime");
            return (Criteria) this;
        }

        public Criteria andRenewTimeNotEqualTo(Date value) {
            addCriterion("renew_time <>", value, "renewTime");
            return (Criteria) this;
        }

        public Criteria andRenewTimeGreaterThan(Date value) {
            addCriterion("renew_time >", value, "renewTime");
            return (Criteria) this;
        }

        public Criteria andRenewTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("renew_time >=", value, "renewTime");
            return (Criteria) this;
        }

        public Criteria andRenewTimeLessThan(Date value) {
            addCriterion("renew_time <", value, "renewTime");
            return (Criteria) this;
        }

        public Criteria andRenewTimeLessThanOrEqualTo(Date value) {
            addCriterion("renew_time <=", value, "renewTime");
            return (Criteria) this;
        }

        public Criteria andRenewTimeIn(List<Date> values) {
            addCriterion("renew_time in", values, "renewTime");
            return (Criteria) this;
        }

        public Criteria andRenewTimeNotIn(List<Date> values) {
            addCriterion("renew_time not in", values, "renewTime");
            return (Criteria) this;
        }

        public Criteria andRenewTimeBetween(Date value1, Date value2) {
            addCriterion("renew_time between", value1, value2, "renewTime");
            return (Criteria) this;
        }

        public Criteria andRenewTimeNotBetween(Date value1, Date value2) {
            addCriterion("renew_time not between", value1, value2, "renewTime");
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