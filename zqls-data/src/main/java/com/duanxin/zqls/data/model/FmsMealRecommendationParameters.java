package com.duanxin.zqls.data.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 膳食推荐参数表（待定）
 * fms_meal_recommendation_parameters
 * @author duanxin
 * @date 2019-09-15
 */
public class FmsMealRecommendationParameters implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 膳食推荐参数表id
     * id
     */
    private Integer id;

    /**
     * 用户id
     * uid
     */
    private Integer uid;

    /**
     * 创建时间
     * create_time
     */
    private Date createTime;

    /**
     * 更新时间
     * renew_time
     */
    private Date renewTime;

    public Integer getId() {
        return id;
    }

    public FmsMealRecommendationParameters withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public FmsMealRecommendationParameters withUid(Integer uid) {
        this.setUid(uid);
        return this;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public FmsMealRecommendationParameters withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getRenewTime() {
        return renewTime;
    }

    public FmsMealRecommendationParameters withRenewTime(Date renewTime) {
        this.setRenewTime(renewTime);
        return this;
    }

    public void setRenewTime(Date renewTime) {
        this.renewTime = renewTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", createTime=").append(createTime);
        sb.append(", renewTime=").append(renewTime);
        sb.append("]");
        return sb.toString();
    }
}