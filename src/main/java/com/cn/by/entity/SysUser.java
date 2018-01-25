package com.cn.by.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author by
 * @since 2018-01-24
 */
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

	//0:禁止登录
	public static final Long _0 = new Long(0);
	//1:有效
	public static final Long _1 = new Long(1);

    /**
     * 用户主键ID
     */
	@TableId(value="user_id", type= IdType.AUTO)
	private Integer userId;
    /**
     * 用户名称
     */
	@TableField("user_name")
	private String userName;
    /**
     * 用户邮箱
     */
	private String email;
    /**
     * 用户账号
     */
	private String account;
    /**
     * 用户密码
     */
	private String password;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 更新时间
     */
	@TableField("update_time")
	private Date updateTime;
    /**
     * 最后登录时间
     */
	@TableField("last_login_time")
	private Date lastLoginTime;
    /**
     * 用户状态
     */
	private Integer status;

	public SysUser(SysUser sysUser) {
		this.userId = sysUser.getUserId();
		this.userName = sysUser.getUserName();
		this.email = sysUser.getEmail();
		this.account = sysUser.getAccount();
		this.password = sysUser.getPassword();
		this.createTime = sysUser.getCreateTime();
		this.updateTime = sysUser.getUpdateTime();
		this.lastLoginTime = sysUser.getLastLoginTime();;
		this.status = sysUser.getStatus();
	}

	public SysUser() {

    }


    public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	protected Serializable pkVal() {
		return this.userId;
	}

	@Override
	public String toString() {
		return "SysUser{" +
			", userId=" + userId +
			", userName=" + userName +
			", email=" + email +
			", account=" + account +
			", password=" + password +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			", lastLoginTime=" + lastLoginTime +
			", status=" + status +
			"}";
	}
}
