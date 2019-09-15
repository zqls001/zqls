package com.duanxin.zqls.data.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 食物生产量推荐表
 * fms_food_production_recommendation
 * @author duanxin
 * @date 2019-09-15
 */
public class FmsFoodProductionRecommendation implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 食物生产量推荐表id
     * id
     */
    private Integer id;

    /**
     * 食物id
     * fid
     */
    private Integer fid;

    /**
     * 生产量
     * production
     */
    private BigDecimal production;

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

    public FmsFoodProductionRecommendation withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFid() {
        return fid;
    }

    public FmsFoodProductionRecommendation withFid(Integer fid) {
        this.setFid(fid);
        return this;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public BigDecimal getProduction() {
        return production;
    }

    public FmsFoodProductionRecommendation withProduction(BigDecimal production) {
        this.setProduction(production);
        return this;
    }

    public void setProduction(BigDecimal production) {
        this.production = production;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public FmsFoodProductionRecommendation withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getRenewTime() {
        return renewTime;
    }

    public FmsFoodProductionRecommendation withRenewTime(Date renewTime) {
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
        sb.append(", fid=").append(fid);
        sb.append(", production=").append(production);
        sb.append(", createTime=").append(createTime);
        sb.append(", renewTime=").append(renewTime);
        sb.append("]");
        return sb.toString();
    }
}