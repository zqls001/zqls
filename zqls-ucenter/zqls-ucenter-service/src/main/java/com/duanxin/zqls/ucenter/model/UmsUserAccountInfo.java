package com.duanxin.zqls.ucenter.model;

import java.io.Serializable;
import org.joda.money.Money;

/**
 * 用户账户表
 * ums_user_account_info
 * @author duanxin
 * @date 2019-09-21
 */
public class UmsUserAccountInfo implements Serializable {

    private static final long serialVersionUID = -5865704025538221172L;
    /**
     * 用户账户id
     * id
     */
    private Integer id;

    /**
     * 用户帐号
     * aid
     */
    private String aid;

    /**
     * 账户余额
     * balance
     */
    private Money balance;

    /**
     * 流水类型：0消费流水，1充值流水
     * type
     */
    private String type;

    /**
     * 流水id：消费流水对应消费表id，充值流水对应充值表id
     * flow_id
     */
    private Integer flowId;

    public Integer getId() {
        return id;
    }

    public UmsUserAccountInfo withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAid() {
        return aid;
    }

    public UmsUserAccountInfo withAid(String aid) {
        this.setAid(aid);
        return this;
    }

    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    public Money getBalance() {
        return balance;
    }

    public UmsUserAccountInfo withBalance(Money balance) {
        this.setBalance(balance);
        return this;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public UmsUserAccountInfo withType(String type) {
        this.setType(type);
        return this;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getFlowId() {
        return flowId;
    }

    public UmsUserAccountInfo withFlowId(Integer flowId) {
        this.setFlowId(flowId);
        return this;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", aid=").append(aid);
        sb.append(", balance=").append(balance);
        sb.append(", type=").append(type);
        sb.append(", flowId=").append(flowId);
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
        UmsUserAccountInfo other = (UmsUserAccountInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAid() == null ? other.getAid() == null : this.getAid().equals(other.getAid()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getFlowId() == null ? other.getFlowId() == null : this.getFlowId().equals(other.getFlowId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAid() == null) ? 0 : getAid().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getFlowId() == null) ? 0 : getFlowId().hashCode());
        return result;
    }
}