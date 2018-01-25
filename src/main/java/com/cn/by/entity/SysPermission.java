package com.cn.by.entity;

import java.io.Serializable;

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
@TableName("sys_permission")
public class SysPermission extends Model<SysPermission> {

    private static final long serialVersionUID = 1L;

    /**
     * 权限ID
     */
    @TableId("permission_id")
	private Integer permissionId;
    /**
     * 权限名称
     */
	@TableField("permission_name")
	private String permissionName;
    /**
     * 权限类型
     */
	@TableField("permission_type")
	private String permissionType;
    /**
     * 权限地址
     */
	@TableField("permission_url")
	private String permissionUrl;
    /**
     * 父ID
     */
	@TableField("parent_id")
	private Integer parentId;
    /**
     * 排序
     */
	@TableField("SORT")
	private Integer sort;
    /**
     * 权限描述
     */
	@TableField("NOTE")
	private String note;


	public Integer getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getPermissionType() {
		return permissionType;
	}

	public void setPermissionType(String permissionType) {
		this.permissionType = permissionType;
	}

	public String getPermissionUrl() {
		return permissionUrl;
	}

	public void setPermissionUrl(String permissionUrl) {
		this.permissionUrl = permissionUrl;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	protected Serializable pkVal() {
		return this.permissionId;
	}

	@Override
	public String toString() {
		return "SysPermission{" +
			", permissionId=" + permissionId +
			", permissionName=" + permissionName +
			", permissionType=" + permissionType +
			", permissionUrl=" + permissionUrl +
			", parentId=" + parentId +
			", sort=" + sort +
			", note=" + note +
			"}";
	}
}
