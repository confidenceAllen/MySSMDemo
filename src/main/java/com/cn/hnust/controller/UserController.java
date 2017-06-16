
    package com.cn.hnust.controller;  
      
    import javax.annotation.Resource;  
    import javax.servlet.http.HttpServletRequest;  
      
    import org.springframework.stereotype.Controller;  
    import org.springframework.ui.Model;  
    import org.springframework.web.bind.annotation.RequestMapping;  
      
    import com.cn.hnust.pojo.User;  
    import com.cn.hnust.service.UserService;  
      
    @Controller  
    @RequestMapping("/user")  
    public class UserController {  
        @Resource  
        private UserService userService;  
          
        @RequestMapping("/showUser")  
        public String toIndex(HttpServletRequest request,Model model){  
            int userId = Integer.parseInt(request.getParameter("id"));  
            User user = this.userService.getUserById(userId);  
            model.addAttribute("user", user);  
            return "showUser";  
        }  
        
        @RequestMapping("/formData")  
        public void formData(HttpServletRequest request,Model model){  
            String[] radio = request.getParameterValues("a");
            System.out.println(radio.toString());
        }  
        
        @RequestMapping("/activityTest")  
        public String activityTest(HttpServletRequest request,Model model){  
        	return "views/main";
        }  
    }  
