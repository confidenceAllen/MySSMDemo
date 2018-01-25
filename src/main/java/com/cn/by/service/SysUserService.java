package com.cn.by.service;

import com.cn.by.entity.SysUser;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author by
 * @since 2018-01-24
 */
public interface SysUserService extends IService<SysUser> {


    SysUser login(String account, String pswd);
}
