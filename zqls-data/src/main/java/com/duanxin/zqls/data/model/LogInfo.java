package com.duanxin.zqls.data.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 日志表
 * log_info
 * @author duanxin
 * @date 2019-09-15
 */
public class LogInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 日志表id
     * id
     */
    private Integer id;

    /**
     * 类型：0用户基本表，1角色表，2权限表，3用户角色表，4权限角色表，5食物表，6系统表
     * type
     */
    private Byte type;

    /**
     * 目标表id
     * target_id
     */
    private Integer targetId;

    /**
     * 状态：0为还原，1已还原
     * status
     */
    private Integer status;

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

    public LogInfo withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getType() {
        return type;
    }

    public LogInfo withType(Byte type) {
        this.setType(type);
        return this;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public LogInfo withTargetId(Integer targetId) {
        this.setTargetId(targetId);
        return this;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Integer getStatus() {
        return status;
    }

    public LogInfo withStatus(Integer status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public LogInfo withOperateTime(Date operateTime) {
        this.setOperateTime(operateTime);
        return this;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateIp() {
        return operateIp;
    }

    public LogInfo withOperateIp(String operateIp) {
        this.setOperateIp(operateIp);
        return this;
    }

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }

    public String getOperator() {
        return operator;
    }

    public LogInfo withOperator(String operator) {
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
        sb.append(", type=").append(type);
        sb.append(", targetId=").append(targetId);
        sb.append(", status=").append(status);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", operateIp=").append(operateIp);
        sb.append(", operator=").append(operator);
        sb.append("]");
        return sb.toString();
    }
}