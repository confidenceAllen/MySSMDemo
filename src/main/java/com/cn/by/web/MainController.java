package com.cn.by.web;

import com.cn.by.common.AjaxData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

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

    @RequestMapping("/uploadPic")
    @ResponseBody
    public AjaxData uploadPic(@RequestParam("file") MultipartFile file, HttpServletRequest request){
        AjaxData ajaxData = new AjaxData();
        if (file!=null) {
            String path = null;
            String type = null;
            String fileName = file.getOriginalFilename();
            type = fileName.indexOf(".")!=-1?
                    fileName.substring(fileName.lastIndexOf(".")+1,fileName.length()):null;
            if (type!=null){
                    // 项目在容器中实际发布运行的根路径
                    String realPath=request.getSession().getServletContext().getRealPath("/");
                    // 自定义的文件名称
                    String trueFileName=String.valueOf(System.currentTimeMillis())+fileName;
                    // 设置存放图片文件的路径
                    path=realPath+/*System.getProperty("file.separator")+*/trueFileName;
                    System.out.println("存放图片文件的路径:"+path);
                    // 转存文件到指定的路径
                    try {
                        file.transferTo(new File(path));
                        ajaxData.setMsg("我成功");
                    } catch (IllegalStateException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }

           return ajaxData;
        }

}
