package com.cn.hnust.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.service.ClassService;


@Controller  
@RequestMapping("/clazz") 
public class ClassController {
	 @Resource  
     private ClassService classService;  
       
     @RequestMapping("/showClazz")  
     public String toIndex(HttpServletRequest request,Model model){  
         int classid = Integer.parseInt(request.getParameter("id"));  
         com.cn.hnust.pojo.Class clazz = this.classService.getClazz(classid);  
         model.addAttribute("user", clazz);  
         return "showUser";  
     }  
}
