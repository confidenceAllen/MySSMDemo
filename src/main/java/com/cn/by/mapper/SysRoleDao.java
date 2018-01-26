package com.cn.by.mapper;

import com.cn.by.entity.SysRole;
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
public interface SysRoleDao extends BaseMapper<SysRole> {

    /**
     * 返回用户查询的角色类型集合
     * @param userId 用户ID
     * @return 用户的角色类型
     */
    Set<String> findRoleTypeByUserId(Integer userId);
}
