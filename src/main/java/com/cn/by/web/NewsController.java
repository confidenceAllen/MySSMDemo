package com.cn.by.web;

import com.cn.by.common.AjaxData;
import com.cn.by.common.shrio.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Confidence
 */
@RequestMapping("/page/news")
@Controller
public class NewsController extends BaseController {

    @RequestMapping("/newsList")
    public String newsList(){
        return "news/newsList";
    }

    @RequestMapping("/newsAdd")
    public String newsAdd(){
        return "news/newsAdd";
    }

    @RequestMapping("/getBaiduNewsList")
    public AjaxData getBaiduNewsList(){
        AjaxData ajaxData = new AjaxData();
        return ajaxData;
    }
}
