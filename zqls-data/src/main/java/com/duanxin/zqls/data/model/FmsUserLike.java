package com.duanxin.zqls.data.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户喜好表
 * fms_user_like
 * @author duanxin
 * @date 2019-09-15
 */
public class FmsUserLike implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户喜好表id
     * id
     */
    private Integer id;

    /**
     * 用户id
     * uid
     */
    private Integer uid;

    /**
     * 民族：0汉族，1其他
     * nation
     */
    private Byte nation;

    /**
     * 地区：待定
     * area
     */
    private Byte area;

    /**
     * 口味：0酸，1甜，2苦，3辣
     * taste_type
     */
    private Byte tasteType;

    /**
     * 忌口：0葱，1蒜，2姜，3香菜
     * diet
     */
    private Byte diet;

    /**
     * 喜好菜类：0鲁菜，1川菜，2粤菜，3闽菜，4苏菜，5浙菜，6湘菜，7徽菜
     * favorite_dishes
     */
    private Byte favoriteDishes;

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

    public FmsUserLike withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public FmsUserLike withUid(Integer uid) {
        this.setUid(uid);
        return this;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Byte getNation() {
        return nation;
    }

    public FmsUserLike withNation(Byte nation) {
        this.setNation(nation);
        return this;
    }

    public void setNation(Byte nation) {
        this.nation = nation;
    }

    public Byte getArea() {
        return area;
    }

    public FmsUserLike withArea(Byte area) {
        this.setArea(area);
        return this;
    }

    public void setArea(Byte area) {
        this.area = area;
    }

    public Byte getTasteType() {
        return tasteType;
    }

    public FmsUserLike withTasteType(Byte tasteType) {
        this.setTasteType(tasteType);
        return this;
    }

    public void setTasteType(Byte tasteType) {
        this.tasteType = tasteType;
    }

    public Byte getDiet() {
        return diet;
    }

    public FmsUserLike withDiet(Byte diet) {
        this.setDiet(diet);
        return this;
    }

    public void setDiet(Byte diet) {
        this.diet = diet;
    }

    public Byte getFavoriteDishes() {
        return favoriteDishes;
    }

    public FmsUserLike withFavoriteDishes(Byte favoriteDishes) {
        this.setFavoriteDishes(favoriteDishes);
        return this;
    }

    public void setFavoriteDishes(Byte favoriteDishes) {
        this.favoriteDishes = favoriteDishes;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public FmsUserLike withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getRenewTime() {
        return renewTime;
    }

    public FmsUserLike withRenewTime(Date renewTime) {
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
        sb.append(", nation=").append(nation);
        sb.append(", area=").append(area);
        sb.append(", tasteType=").append(tasteType);
        sb.append(", diet=").append(diet);
        sb.append(", favoriteDishes=").append(favoriteDishes);
        sb.append(", createTime=").append(createTime);
        sb.append(", renewTime=").append(renewTime);
        sb.append("]");
        return sb.toString();
    }
}