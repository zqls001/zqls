package com.duanxin.zqls.data.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户基本信息表
 * ums_user_info
 * @author duanxin
 * @date 2019-09-15
 */
public class UmsUserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户基本表id
     * id
     */
    private Integer id;

    /**
     * 用户帐号
     * aid
     */
    private String aid;

    /**
     * 用户工号
     * job_number
     */
    private String jobNumber;

    /**
     * 用户名：姓名
     * user_name
     */
    private String userName;

    /**
     * 用户密码
     * password
     */
    private String password;

    /**
     * 性别：0男，1女
     * gender
     */
    private String gender;

    /**
     * 用户头像
     * head_pic
     */
    private String headPic;

    /**
     * 用户电话号码
     * phone
     */
    private String phone;

    /**
     * 用户邮箱
     * email
     */
    private String email;

    /**
     * 用户备注
     * remark
     */
    private String remark;

    /**
     * 状态：0正常，1异常
     * status
     */
    private Byte status;

    /**
     * 类型：0学生，1职工
     * type
     */
    private String type;

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

    public UmsUserInfo withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAid() {
        return aid;
    }

    public UmsUserInfo withAid(String aid) {
        this.setAid(aid);
        return this;
    }

    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public UmsUserInfo withJobNumber(String jobNumber) {
        this.setJobNumber(jobNumber);
        return this;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber == null ? null : jobNumber.trim();
    }

    public String getUserName() {
        return userName;
    }

    public UmsUserInfo withUserName(String userName) {
        this.setUserName(userName);
        return this;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public UmsUserInfo withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getGender() {
        return gender;
    }

    public UmsUserInfo withGender(String gender) {
        this.setGender(gender);
        return this;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getHeadPic() {
        return headPic;
    }

    public UmsUserInfo withHeadPic(String headPic) {
        this.setHeadPic(headPic);
        return this;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic == null ? null : headPic.trim();
    }

    public String getPhone() {
        return phone;
    }

    public UmsUserInfo withPhone(String phone) {
        this.setPhone(phone);
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public UmsUserInfo withEmail(String email) {
        this.setEmail(email);
        return this;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRemark() {
        return remark;
    }

    public UmsUserInfo withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public UmsUserInfo withStatus(Byte status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public UmsUserInfo withType(String type) {
        this.setType(type);
        return this;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UmsUserInfo withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public UmsUserInfo withOperateTime(Date operateTime) {
        this.setOperateTime(operateTime);
        return this;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateIp() {
        return operateIp;
    }

    public UmsUserInfo withOperateIp(String operateIp) {
        this.setOperateIp(operateIp);
        return this;
    }

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }

    public String getOperator() {
        return operator;
    }

    public UmsUserInfo withOperator(String operator) {
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
        sb.append(", aid=").append(aid);
        sb.append(", jobNumber=").append(jobNumber);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", gender=").append(gender);
        sb.append(", headPic=").append(headPic);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", operateIp=").append(operateIp);
        sb.append(", operator=").append(operator);
        sb.append("]");
        return sb.toString();
    }
}