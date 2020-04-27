<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP 模板</title>
    <h1>添加</h1>
    <form action="${pageContext.request.contextPath}/user/add" method="post">
        用户名：
            <input type="text" name="username">
        年龄：
            <input type="text" name="age">
        性别：
            <input type="text" name="sex">
            <input type="submit" value="保存">
    </form>

</head>
<body>
</body>
</html>