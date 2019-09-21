package com.duanxin.zqls.ucenter.model;

import java.io.Serializable;
import java.util.Date;
import org.joda.money.Money;

/**
 * 用户充值表
 * ums_user_account_recharge
 * @author duanxin
 * @date 2019-09-21
 */
public class UmsUserAccountRecharge implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户充值id
     * id
     */
    private Integer id;

    /**
     * 充值时间
     * time
     */
    private Date time;

    /**
     * 充值方式：0支付宝支付，1微信支付，2银行卡支付
     * style
     */
    private String style;

    /**
     * 充值金额
     * amount
     */
    private Money amount;

    public Integer getId() {
        return id;
    }

    public UmsUserAccountRecharge withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public UmsUserAccountRecharge withTime(Date time) {
        this.setTime(time);
        return this;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStyle() {
        return style;
    }

    public UmsUserAccountRecharge withStyle(String style) {
        this.setStyle(style);
        return this;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public Money getAmount() {
        return amount;
    }

    public UmsUserAccountRecharge withAmount(Money amount) {
        this.setAmount(amount);
        return this;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", time=").append(time);
        sb.append(", style=").append(style);
        sb.append(", amount=").append(amount);
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
        UmsUserAccountRecharge other = (UmsUserAccountRecharge) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getStyle() == null ? other.getStyle() == null : this.getStyle().equals(other.getStyle()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getStyle() == null) ? 0 : getStyle().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        return result;
    }
}