package com.duanxin.zqls.data.model;

import java.io.Serializable;
import java.util.Date;
import org.joda.money.Money;

/**
 * 用户充值表
 * ums_user_account_recharge
 * @author duanxin
 * @date 2019-09-15
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
}