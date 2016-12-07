<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
    <h6><a href="<%=basePath%>addUser">添加用户</a></h6>
    <table border="1" cellpadding="10" cellspacing="0">
      <tbody>
        <tr>
          <th>用户ID</th>
          <th>用户名</th>
          <th>邮箱</th>
          <th colspan="2">操作</th>
        </tr>
          <c:forEach items="${userList}" var="user">
            <tr>
              <td>${user.userId}</td>
              <td>${user.userName}</td>
              <td>${user.userMail}</td>
              <td><a href="<%=basePath%>getUser?userId=${user.userId}">编辑</a></td>
              <td><a href="<%=basePath%>delUser?userId=${user.userId}">删除</a></td>
            </tr>
          </c:forEach>
      </tbody>
    </table>
  </body>
</html>
