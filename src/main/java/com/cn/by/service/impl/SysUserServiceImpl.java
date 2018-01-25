package com.cn.by.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.cn.by.entity.SysUser;
import com.cn.by.mapper.SysUserDao;
import com.cn.by.service.SysUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author by
 * @since 2018-01-24
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements SysUserService {

    @Override
    public SysUser login(String account, String pswd) {
        EntityWrapper<SysUser> entityWrapper = new EntityWrapper<SysUser>();
        SysUser sysUser = new SysUser();
        sysUser.setAccount(account);
        sysUser.setPassword(pswd);
        entityWrapper.where("account={0}",account).and("password={0}",pswd);
        return selectOne(entityWrapper);
    }
}
