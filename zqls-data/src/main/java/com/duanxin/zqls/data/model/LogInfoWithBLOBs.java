package com.duanxin.zqls.data.model;

import java.io.Serializable;

/**
 * 日志表
 * log_info
 * @author duanxin
 * @date 2019-09-15
 */
public class LogInfoWithBLOBs extends LogInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 目标表之前的值
     * old_value
     */
    private String oldValue;

    /**
     * 目标表的新值
     * new_value
     */
    private String newValue;

    public String getOldValue() {
        return oldValue;
    }

    public LogInfoWithBLOBs withOldValue(String oldValue) {
        this.setOldValue(oldValue);
        return this;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue == null ? null : oldValue.trim();
    }

    public String getNewValue() {
        return newValue;
    }

    public LogInfoWithBLOBs withNewValue(String newValue) {
        this.setNewValue(newValue);
        return this;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue == null ? null : newValue.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", oldValue=").append(oldValue);
        sb.append(", newValue=").append(newValue);
        sb.append("]");
        return sb.toString();
    }
}