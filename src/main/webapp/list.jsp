<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP 模板</title>
    <h1>用户展示</h1>
    <a href="${pageContext.request.contextPath}/user/toadd">添加</a>
    <table border="1">
        <tr>
            <td>id</td>
            <td>用户名</td>
            <td>年龄</td>
            <td>性别</td>
            <td>操作</td>
        </tr>
        <c:forEach var="user" items="${uList}">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.age}</td>
                <td>${user.sex}</td>
                <td>

                    <a href="${pageContext.request.contextPath}/user/del?id=${user.id}">删除</a>
                    <a href="${pageContext.request.contextPath}/user/findById?id=${user.id}">修改</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</head>
<body>
</body>
</html>