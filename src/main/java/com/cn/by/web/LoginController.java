package com.cn.by.web;

import com.cn.by.common.shrio.controller.BaseController;
import com.cn.by.common.shrio.token.manager.TokenManager;
import com.cn.by.entity.SysUser;
import com.cn.by.util.LoggerUtils;
import com.cn.by.util.StringUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RequestMapping("login")
@Controller
public class LoginController extends BaseController {

    @RequestMapping("")
    public String login(){
        return "login/login";
    }

    @RequestMapping("logIn")
    @ResponseBody
    public Map<String, Object> submitLogin(SysUser entity, HttpServletRequest request){
        String url = null ;
        String rememberMe = request.getParameter("rememberMe");
        boolean flag =true;
        if(rememberMe==null||"false".equals(rememberMe)){
            flag = false;
        }
        try {
            entity = TokenManager.login(entity,flag);
            request.getSession().setAttribute("user", entity);
            resultMap.put("status", 200);
            resultMap.put("message", "登录成功");
            /**
             * shiro 获取登录之前的地址
             */
            SavedRequest savedRequest = WebUtils.getSavedRequest(request);

            if(null != savedRequest){
                url = savedRequest.getRequestUrl();
            }
            /**
             * 我们平常用的获取上一个请求的方式，在Session不一致的情况下是获取不到的
             * String url = (String) request.getAttribute(WebUtils.FORWARD_REQUEST_URI_ATTRIBUTE);
             */
            LoggerUtils.fmtDebug(getClass(), "获取登录之前的URL:[%s]",url);
            //如果登录之前没有地址，那么就跳转到首页。
            if(StringUtils.isBlank(url)){
                url = request.getContextPath() + "/Home/Index.shtml";
            }
            //跳转地址
            resultMap.put("back_url", url);
            /**
             * 这里其实可以直接catch Exception，然后抛出 message即可，但是最好还是各种明细catch 好点。。
             */
        } catch (DisabledAccountException e) {
            resultMap.put("status", 500);
            resultMap.put("message", "帐号已经禁用。");
        } catch (Exception e) {
            resultMap.put("status", 500);
            resultMap.put("message", "帐号或密码错误");
        }

        return resultMap;
    }

}
