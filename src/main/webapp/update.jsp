<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP 模板</title>
    <h1>修改</h1>
    <form action="${pageContext.request.contextPath}/user/update1" method="post">
        <input type="hidden" name="id" value="${user.id}">
        用户名：
        <input type="text" name="username" value="${user.username}">
        年龄：
        <input type="text" name="age" value="${user.age}">
        性别：
        <input type="text" name="sex" value="${user.sex}">
        <input type="submit" value="修改">
    </form>

</head>
<body>
</body>
</html>