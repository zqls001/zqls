package com.duanxin.zqls.ucenter.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色表
 * ums_role
 * @author duanxin
 * @date 2019-09-21
 */
public class UmsRole implements Serializable {

    private static final long serialVersionUID = -5682504848518763828L;
    /**
     * 角色表id
     * id
     */
    private Integer id;

    /**
     * 角色名称
     * name
     */
    private String name;

    /**
     * 类型：0管理员，1其他
     * type
     */
    private Byte type;

    /**
     * 状态：0正常，1冻结
     * status
     */
    private Byte status;

    /**
     * 角色备注
     * remark
     */
    private String remark;

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

    public UmsRole withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public UmsRole withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getType() {
        return type;
    }

    public UmsRole withType(Byte type) {
        this.setType(type);
        return this;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getStatus() {
        return status;
    }

    public UmsRole withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public UmsRole withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public UmsRole withOperateTime(Date operateTime) {
        this.setOperateTime(operateTime);
        return this;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateIp() {
        return operateIp;
    }

    public UmsRole withOperateIp(String operateIp) {
        this.setOperateIp(operateIp);
        return this;
    }

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }

    public String getOperator() {
        return operator;
    }

    public UmsRole withOperator(String operator) {
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
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", operateIp=").append(operateIp);
        sb.append(", operator=").append(operator);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UmsRole other = (UmsRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getOperateTime() == null ? other.getOperateTime() == null : this.getOperateTime().equals(other.getOperateTime()))
            && (this.getOperateIp() == null ? other.getOperateIp() == null : this.getOperateIp().equals(other.getOperateIp()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getOperateTime() == null) ? 0 : getOperateTime().hashCode());
        result = prime * result + ((getOperateIp() == null) ? 0 : getOperateIp().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return result;
    }
}