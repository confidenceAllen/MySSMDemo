package com.cn.hnust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/page")
@Controller
public class MainController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/404")
    public String error_page(){
        return "404";
    }
}
