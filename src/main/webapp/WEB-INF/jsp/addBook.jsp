<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${ctx}/user/saveBook.shtml">
    id:<input type="text" name="id">
    name:<input type="text" name="name" id="">
        <button type="submit">submit</button>
    </form>

    <a href="${ctx}/user/showBook.shtml?name=da">展示1的书本</a>
</body>
</html>
