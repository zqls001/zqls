package com.duanxin.zqls.data.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 食物生产量推荐参数表
 * fms_food_production_recommendation_parameters
 * @author duanxin
 * @date 2019-09-15
 */
public class FmsFoodProductionRecommendationParameters implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 食物生产量推荐参数表id
     * id
     */
    private Integer id;

    /**
     * 食物消耗id
     * cid
     */
    private Integer cid;

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

    public FmsFoodProductionRecommendationParameters withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public FmsFoodProductionRecommendationParameters withCid(Integer cid) {
        this.setCid(cid);
        return this;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public FmsFoodProductionRecommendationParameters withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getRenewTime() {
        return renewTime;
    }

    public FmsFoodProductionRecommendationParameters withRenewTime(Date renewTime) {
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
        sb.append(", cid=").append(cid);
        sb.append(", createTime=").append(createTime);
        sb.append(", renewTime=").append(renewTime);
        sb.append("]");
        return sb.toString();
    }
}