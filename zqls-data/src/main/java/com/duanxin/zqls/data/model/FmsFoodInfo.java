package com.duanxin.zqls.data.model;

import java.io.Serializable;
import java.util.Date;
import org.joda.money.Money;

/**
 * 食物基本信息表
 * fms_food_info
 * @author duanxin
 * @date 2019-09-15
 */
public class FmsFoodInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 食物基本表id
     * id
     */
    private Integer id;

    /**
     * 食物名称
     * name
     */
    private String name;

    /**
     * 食物价格
     * price
     */
    private Money price;

    /**
     * 食物备注
     * remark
     */
    private String remark;

    /**
     * 口味类型：0酸，1甜，2苦，3辣
     * taste_type
     */
    private Byte tasteType;

    /**
     * 基本特征：0葱，1蒜，2姜，3香菜
     * basic_features
     */
    private Byte basicFeatures;

    /**
     * 状态：0正常，1冻结
     * status
     */
    private Byte status;

    /**
     * 图片地址
     * pic_url
     */
    private String picUrl;

    /**
     * 所在地点
     * place
     */
    private String place;

    /**
     * 类型：0鲁菜，1川菜，2粤菜，3闽菜，4苏菜，5浙菜，6湘菜，7徽菜
     * type
     */
    private Byte type;

    /**
     * 创建时间
     * create_time
     */
    private Date createTime;

    /**
     * 最后一次操作时间
     * operate_time
     */
    private Date operateTime;

    /**
     * 操作者ip
     * operate_ip
     */
    private String operateIp;

    /**
     * 操作者
     * operator
     */
    private String operator;

    public Integer getId() {
        return id;
    }

    public FmsFoodInfo withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public FmsFoodInfo withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Money getPrice() {
        return price;
    }

    public FmsFoodInfo withPrice(Money price) {
        this.setPrice(price);
        return this;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public FmsFoodInfo withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getTasteType() {
        return tasteType;
    }

    public FmsFoodInfo withTasteType(Byte tasteType) {
        this.setTasteType(tasteType);
        return this;
    }

    public void setTasteType(Byte tasteType) {
        this.tasteType = tasteType;
    }

    public Byte getBasicFeatures() {
        return basicFeatures;
    }

    public FmsFoodInfo withBasicFeatures(Byte basicFeatures) {
        this.setBasicFeatures(basicFeatures);
        return this;
    }

    public void setBasicFeatures(Byte basicFeatures) {
        this.basicFeatures = basicFeatures;
    }

    public Byte getStatus() {
        return status;
    }

    public FmsFoodInfo withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public FmsFoodInfo withPicUrl(String picUrl) {
        this.setPicUrl(picUrl);
        return this;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getPlace() {
        return place;
    }

    public FmsFoodInfo withPlace(String place) {
        this.setPlace(place);
        return this;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public Byte getType() {
        return type;
    }

    public FmsFoodInfo withType(Byte type) {
        this.setType(type);
        return this;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public FmsFoodInfo withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public FmsFoodInfo withOperateTime(Date operateTime) {
        this.setOperateTime(operateTime);
        return this;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateIp() {
        return operateIp;
    }

    public FmsFoodInfo withOperateIp(String operateIp) {
        this.setOperateIp(operateIp);
        return this;
    }

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }

    public String getOperator() {
        return operator;
    }

    public FmsFoodInfo withOperator(String operator) {
        this.setOperator(operator);
        return this;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", remark=").append(remark);
        sb.append(", tasteType=").append(tasteType);
        sb.append(", basicFeatures=").append(basicFeatures);
        sb.append(", status=").append(status);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", place=").append(place);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", operateIp=").append(operateIp);
        sb.append(", operator=").append(operator);
        sb.append("]");
        return sb.toString();
    }
}