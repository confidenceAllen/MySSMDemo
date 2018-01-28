package com.cn.by.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.cn.by.common.AjaxData;
import com.cn.by.common.LayPage;
import com.cn.by.entity.SysRole;
import com.cn.by.entity.SysUser;
import com.cn.by.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author By
* @date 2018/1/26 16:37
* @description
* @return
*/
@Controller
@RequestMapping("system/sysRole")
public class SysRoleController {

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping
    public String index(){
        return "system/role/roleList";
    }

    @RequestMapping("/roleList")
    @ResponseBody
    public LayPage<SysRole> roleList(HttpServletRequest request){

        LayPage<SysRole> page = sysRoleService.pageList(request);
        SysRole sysRole = new SysRole();
        sysRole.setCreateTime(new Date());
        sysRole.setRoleId(4);
        sysRole.setRoleType("HELLO");
        sysRoleService.updateById(sysRole);
        return page;
    }
}
