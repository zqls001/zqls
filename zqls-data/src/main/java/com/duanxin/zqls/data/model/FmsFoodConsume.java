package com.duanxin.zqls.data.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 食物消耗表
 * fms_food_consume
 * @author duanxin
 * @date 2019-09-15
 */
public class FmsFoodConsume implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 食物消耗表id
     * id
     */
    private Integer id;

    /**
     * 食物id
     * fid
     */
    private Integer fid;

    /**
     * 用户工号
     * uid
     */
    private String uid;

    /**
     * 食物质量
     * food_quality
     */
    private BigDecimal foodQuality;

    /**
     * 类型：0早，1中，2晚
     * type
     */
    private Byte type;

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

    public FmsFoodConsume withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFid() {
        return fid;
    }

    public FmsFoodConsume withFid(Integer fid) {
        this.setFid(fid);
        return this;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getUid() {
        return uid;
    }

    public FmsFoodConsume withUid(String uid) {
        this.setUid(uid);
        return this;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public BigDecimal getFoodQuality() {
        return foodQuality;
    }

    public FmsFoodConsume withFoodQuality(BigDecimal foodQuality) {
        this.setFoodQuality(foodQuality);
        return this;
    }

    public void setFoodQuality(BigDecimal foodQuality) {
        this.foodQuality = foodQuality;
    }

    public Byte getType() {
        return type;
    }

    public FmsFoodConsume withType(Byte type) {
        this.setType(type);
        return this;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public FmsFoodConsume withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getRenewTime() {
        return renewTime;
    }

    public FmsFoodConsume withRenewTime(Date renewTime) {
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
        sb.append(", uid=").append(uid);
        sb.append(", foodQuality=").append(foodQuality);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", renewTime=").append(renewTime);
        sb.append("]");
        return sb.toString();
    }
}