package com.cn.by.common.shrio.filter;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.cn.by.common.shrio.token.manager.TokenManager;
import com.cn.by.entity.SysUser;
import com.cn.by.service.SysPermissionService;
import com.cn.by.util.LoggerUtils;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.springframework.beans.factory.annotation.Autowired;


/**
* @ClassName: LoginFilter
* @Description: 登录拦截器
* @author zby
* @date 2017年9月29日 
* 
*/

public class LoginFilter  extends AccessControlFilter {

	@Autowired
	private SysPermissionService sysPermissionService;
	
	final static Class<LoginFilter> CLASS = LoginFilter.class;
	@Override
	protected boolean isAccessAllowed(ServletRequest request,
			ServletResponse response, Object mappedValue) throws Exception {
		
		SysUser token = TokenManager.getToken();
		
		if(null != token || isLoginRequest(request, response)){// && isEnabled()

            return Boolean.TRUE;
        } 
		if (ShiroFilterUtils.isAjax(request)) {// ajax请求
			Map<String,String> resultMap = new HashMap<String, String>();
			LoggerUtils.debug(getClass(), "当前用户没有登录，并且是Ajax请求！");
			resultMap.put("login_status", "300");
			resultMap.put("message", "\u5F53\u524D\u7528\u6237\u6CA1\u6709\u767B\u5F55\uFF01");//当前用户没有登录！
			ShiroFilterUtils.out(response, resultMap);
		}
		return Boolean.FALSE ;
            
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response)
			throws Exception {
		//保存Request和Response 到登录后的链接
		saveRequestAndRedirectToLogin(request, response);
		return Boolean.FALSE ;
	}
	

}
