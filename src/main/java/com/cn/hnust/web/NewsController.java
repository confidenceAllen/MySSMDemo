package com.cn.hnust.web;

import com.cn.hnust.common.AjaxData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Confidence
 */
@RequestMapping("/page/news")
@Controller
public class NewsController extends BaseController{

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
        return ajaxData;
    }
}
