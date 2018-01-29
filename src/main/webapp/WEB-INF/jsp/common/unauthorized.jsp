<%@ page contentType ="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <meta charset="utf-8">
    <title>404--layui后台管理模板</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="${ctx}/js/common/layui/css/layui.css" media="all" />
</head>
<body class="childrenBody">
<div style="text-align: center; padding:11% 0;">
    <i class="layui-icon" style="line-height:20rem; font-size:20rem; color: #393D50;">&#xe64d;</i>
    <p style="font-size: 20px; font-weight: 300; color: #999;">您没有权限访问此页面，请联系管理员!</p>
</div>
</body>
</html>
