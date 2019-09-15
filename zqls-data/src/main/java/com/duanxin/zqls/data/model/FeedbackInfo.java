package com.duanxin.zqls.data.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 反馈基本表
 * feedback_info
 * @author duanxin
 * @date 2019-09-15
 */
public class FeedbackInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 反馈表id
     * id
     */
    private Integer id;

    /**
     * 用户id
     * uid
     */
    private Integer uid;

    /**
     * 反馈类型：0食物，1食堂环境，2系统改进，3其他
     * type
     */
    private Byte type;

    /**
     * 反馈描述
     * remark
     */
    private String remark;

    /**
     * 状态：0未查看，1已查看，2已解决
     * status
     */
    private Byte status;

    /**
     * 是否有图片：0无，1有
     * is_pic
     */
    private Byte isPic;

    /**
     * 图片url地址
     * pic_url
     */
    private String picUrl;

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

    public FeedbackInfo withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public FeedbackInfo withUid(Integer uid) {
        this.setUid(uid);
        return this;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Byte getType() {
        return type;
    }

    public FeedbackInfo withType(Byte type) {
        this.setType(type);
        return this;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public FeedbackInfo withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public FeedbackInfo withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getIsPic() {
        return isPic;
    }

    public FeedbackInfo withIsPic(Byte isPic) {
        this.setIsPic(isPic);
        return this;
    }

    public void setIsPic(Byte isPic) {
        this.isPic = isPic;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public FeedbackInfo withPicUrl(String picUrl) {
        this.setPicUrl(picUrl);
        return this;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public FeedbackInfo withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getRenewTime() {
        return renewTime;
    }

    public FeedbackInfo withRenewTime(Date renewTime) {
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
        sb.append(", type=").append(type);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", isPic=").append(isPic);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", createTime=").append(createTime);
        sb.append(", renewTime=").append(renewTime);
        sb.append("]");
        return sb.toString();
    }
}