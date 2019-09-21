package com.duanxin.zqls.ucenter.model;

import java.io.Serializable;
import java.util.Date;
import org.joda.money.Money;

/**
 * 用户消费表
 * ums_user_account_consume
 * @author duanxin
 * @date 2019-09-21
 */
public class UmsUserAccountConsume implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户消费id
     * id
     */
    private Integer id;

    /**
     * 消费时间
     * time
     */
    private Date time;

    /**
     * 消费地点
     * place
     */
    private String place;

    /**
     * 消费金额
     * price
     */
    private Money price;

    public Integer getId() {
        return id;
    }

    public UmsUserAccountConsume withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public UmsUserAccountConsume withTime(Date time) {
        this.setTime(time);
        return this;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public UmsUserAccountConsume withPlace(String place) {
        this.setPlace(place);
        return this;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public Money getPrice() {
        return price;
    }

    public UmsUserAccountConsume withPrice(Money price) {
        this.setPrice(price);
        return this;
    }

    public void setPrice(Money price) {
        this.price = price;
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
        sb.append(", place=").append(place);
        sb.append(", price=").append(price);
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
        UmsUserAccountConsume other = (UmsUserAccountConsume) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getPlace() == null ? other.getPlace() == null : this.getPlace().equals(other.getPlace()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getPlace() == null) ? 0 : getPlace().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }
}