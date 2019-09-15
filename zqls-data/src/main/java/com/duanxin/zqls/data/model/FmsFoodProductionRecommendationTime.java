package com.duanxin.zqls.data.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 食物生产量推荐时间表
 * fms_food_production_recommendation_time
 * @author duanxin
 * @date 2019-09-15
 */
public class FmsFoodProductionRecommendationTime implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 时间表id
     * id
     */
    private Integer id;

    /**
     * 日期
     * date
     */
    private Date date;

    /**
     * 星期：1周一。。0周日
     * week
     */
    private Byte week;

    /**
     * 类型：0周末，1节假日
     * type
     */
    private Byte type;

    /**
     * 描述
     * remark
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public FmsFoodProductionRecommendationTime withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public FmsFoodProductionRecommendationTime withDate(Date date) {
        this.setDate(date);
        return this;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Byte getWeek() {
        return week;
    }

    public FmsFoodProductionRecommendationTime withWeek(Byte week) {
        this.setWeek(week);
        return this;
    }

    public void setWeek(Byte week) {
        this.week = week;
    }

    public Byte getType() {
        return type;
    }

    public FmsFoodProductionRecommendationTime withType(Byte type) {
        this.setType(type);
        return this;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public FmsFoodProductionRecommendationTime withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", week=").append(week);
        sb.append(", type=").append(type);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}