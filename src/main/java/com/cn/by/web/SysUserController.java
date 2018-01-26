package com.cn.by.web;


import com.cn.by.common.shrio.token.manager.TokenManager;
import com.cn.by.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

/**
* @author By
* @date 2018/1/25 15:09
* @description 用户controller
*/
@Controller
@RequestMapping("/page/sysUser")
public class SysUserController {

    @RequestMapping("/userList")
    public String userList(){
        return "user/userList";
    }

    @RequestMapping("/addUser")
    public String addUser(){
        return "user/addUser";
    }

    @RequestMapping("/userInfo")
    public String userInfo(){
        return "user/userInfo";
    }
}
