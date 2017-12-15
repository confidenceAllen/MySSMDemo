
package com.cn.hnust.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.cn.hnust.pojo.Book;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.BookService;
import com.cn.hnust.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
    @RequestMapping("/user")  
    public class UserController {  
        @Autowired
        private UserService userService;

        @Autowired
        BookService bookService;
          
        @RequestMapping("/showUser")  
        public String toIndex(HttpServletRequest request,Model model){  
            int userId = Integer.parseInt(request.getParameter("id"));  
            User user = userService.getUserById(userId);
            model.addAttribute("user", user);  
            return "showUser";  
        }

        @RequestMapping("/addbook")
        public String addbook(HttpServletRequest request,Model model){

            return "addBook";
        }

        @RequestMapping("/saveBook")
        public String saveBook(HttpServletRequest request, Model model, Book book){
            System.out.println(book);
            bookService.insert(book);
            return "showUser";
        }

        @RequestMapping("/showBook")
        public String showBook(HttpServletRequest request, Model model, Book book){

            EntityWrapper<Book> ew = new EntityWrapper<Book>();
            System.out.print(request.getParameter("name"));
            ew.like("name",request.getParameter("name"))
                    ;
            System.out.println(ew.getSqlSegment());
            List<Book> list = bookService.selectList(ew);
            request.setAttribute("books",bookService.selectList(ew));
           /* System.out.println(list.get(0).getName());*/
            return "showBook";
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
