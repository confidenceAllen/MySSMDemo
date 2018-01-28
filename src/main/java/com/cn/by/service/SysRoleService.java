package com.cn.by.service;

import com.cn.by.common.LayPage;
import com.cn.by.entity.SysRole;
import com.baomidou.mybatisplus.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author by
 * @since 2018-01-24
 */
public interface SysRoleService extends IService<SysRole> {

    Set<String> findRoleTypeByUserId(Integer userId);

    LayPage<SysRole> pageList(HttpServletRequest request);
}
