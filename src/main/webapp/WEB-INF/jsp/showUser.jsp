
<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <title>测试</title>  
  </head>  
    
  <body>  
<%--   	<c:forEach var="data" items="${user.studentList }" varStatus="status">
  			<div id="clazz"></div>${data.studentname }
	</c:forEach> --%>
	
	<h1>${user.name }</h1>
    <a href="${ctx}/user/addbook.shtml">添加书本</a>
   
  </body>  
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.min.js"></script>
  <script type="text/javascript">
  	
  	var clazz = $('#clazz').value;
  	console.log(clazz);
  </script>
</html>  