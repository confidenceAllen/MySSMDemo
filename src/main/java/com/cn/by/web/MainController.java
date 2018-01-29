package com.cn.by.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author By
* @date 2018/1/26 9:53
* @description
* @return
*/
@RequestMapping("/main")
@Controller
public class MainController {

    @RequestMapping()
    public String index(){
        return "index";
    }

    @RequestMapping("/home")
    public String main(){
        return "main";
    }


}
