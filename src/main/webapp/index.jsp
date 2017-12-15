<!DOCTYPE html>
<%@ page contentType ="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="utf-8">
    <title>自定义答卷</title>
    <link type="text/css" rel="stylesheet" href="css/wenjuan_ht.css">
    <script type="text/javascript" src="js/jquery-1.7.1.js"></script>
</head>
<form action="user/showUser.shtml" id="formid">
		输入Id:<input name="id">
</form>


<button onclick="formId();">submit</button>
<script type="text/javascript">
	function formId(){
		
		$("#formid").submit();
	}
	
</script>
</html>
