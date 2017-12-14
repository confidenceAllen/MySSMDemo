
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
    <a href="user/addbook.do">添加书本</a>
   
  </body>  
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.min.js"></script>
  <script type="text/javascript">
  	
  	var clazz = $('#clazz').value;
  	console.log(clazz);
  </script>
</html>  