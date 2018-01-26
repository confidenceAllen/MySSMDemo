package com.cn.by.mapper;

import com.cn.by.entity.SysPermission;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.Set;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author by
 * @since 2018-01-24
 */
public interface SysPermissionDao extends BaseMapper<SysPermission> {


    /**
     * 根据用户Id查询Url权限集合
     * @param userId
     * @return 权限的set集合
     */
    Set<String> findPermissionByUserId(Integer userId);

}
