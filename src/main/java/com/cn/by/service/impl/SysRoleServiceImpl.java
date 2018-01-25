package com.cn.by.service.impl;

import com.cn.by.entity.SysRole;
import com.cn.by.mapper.SysRoleDao;
import com.cn.by.service.SysRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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
public class SysRoleServiceImpl extends ServiceImpl<SysRoleDao, SysRole> implements SysRoleService {

    @Override
    public Set<String> findRoleTypeByUserId(Integer userId) {
        return null;
    }
}
