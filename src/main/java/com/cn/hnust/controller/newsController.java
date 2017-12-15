package com.cn.hnust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/page/news")
@Controller
public class newsController {

    @RequestMapping("/newsList")
    public String newsList(){
        return "news/newsList";
    }

    @RequestMapping("/newsAdd")
    public String newsAdd(){
        return "news/newsAdd";
    }
}
