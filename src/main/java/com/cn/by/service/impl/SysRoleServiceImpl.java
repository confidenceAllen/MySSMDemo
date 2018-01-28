package com.cn.by.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.cn.by.common.LayPage;
import com.cn.by.entity.SysRole;
import com.cn.by.entity.SysUser;
import com.cn.by.mapper.SysRoleDao;
import com.cn.by.service.SysRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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

    @Resource
    private SysRoleDao sysRoleDao;

    @Override
    public Set<String> findRoleTypeByUserId(Integer userId) {
        return sysRoleDao.findRoleTypeByUserId(userId);
    }

    @Override
    public LayPage<SysRole> pageList(HttpServletRequest request) {

        int page=Integer.parseInt(request.getParameter("page")==null?"0":request.getParameter("page").toString());
        int limit=Integer.parseInt(request.getParameter("limit")==null?"10":request.getParameter("limit").toString());

        LayPage<SysRole> layPage = new LayPage<SysRole>();

        Page<SysRole> pageParm = new Page<SysRole>(page,limit);

        Page<SysRole> sysRolePage = selectPage(pageParm);

        layPage.setCode(0);
        if(sysRolePage.getTotal()<=0){
            layPage.setMsg("没有查询到数据");
            return layPage;
        }

        layPage.setCount(sysRolePage.getTotal());
        layPage.setData(sysRolePage.getRecords());
        layPage.setMsg("succes");

        return layPage;
    }
}
