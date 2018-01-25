package com.cn.by.service;

import com.cn.by.entity.SysPermission;
import com.baomidou.mybatisplus.service.IService;

import java.util.Set;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author by
 * @since 2018-01-24
 */
public interface SysPermissionService extends IService<SysPermission> {

    Set<String> findPermissionByUserId(Integer userId);
}
