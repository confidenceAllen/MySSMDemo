package com.cn.by.service.impl;

import com.cn.by.entity.SysPermission;
import com.cn.by.mapper.SysPermissionDao;
import com.cn.by.service.SysPermissionService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author by
 * @since 2018-01-24
 */
@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionDao, SysPermission> implements SysPermissionService {

    @Resource
    private SysPermissionDao sysPermissionDao;

    @Override
    public Set<String> findPermissionByUserId(Integer userId) {
        return sysPermissionDao.findPermissionByUserId(userId);
    }
}
