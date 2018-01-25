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
@TableName("sys_role")
public class SysRole extends Model<SysRole> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
	@TableId(value="role_id", type= IdType.AUTO)
	private Integer roleId;
    /**
     * 角色名称
     */
	@TableField("role_name")
	private String roleName;
    /**
     * 角色类型
     */
	@TableField("role_type")
	private String roleType;
    /**
     * 角色排序
     */
	private Integer sort;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;


	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.roleId;
	}

	@Override
	public String toString() {
		return "SysRole{" +
			", roleId=" + roleId +
			", roleName=" + roleName +
			", roleType=" + roleType +
			", sort=" + sort +
			", createTime=" + createTime +
			"}";
	}
}
