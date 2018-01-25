package com.cn.by.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/page/links")
@Controller
public class LinkController {

    @RequestMapping("/linksList")
    public String linksList(){
        return "links/linksList";
    }

    @RequestMapping("/linksAdd")
    public String linksAdd(){
        return "links/linksAdd";
    }
}
