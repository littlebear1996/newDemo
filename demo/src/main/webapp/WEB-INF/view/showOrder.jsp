<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>订单列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
          <th>订单编号</th>
          <th>用户</th>
          <th>订单金额</th>
          <th>订单类型</th>
          <th>收货地址</th>
          <th>订单状态</th>
          <th>Edit</th>
          <th>Delete</th>
        </tr>
          <c:forEach items="${orderList}" var="order">
            <tr>
              <td>${order.orderId}</td>
              <td>${order.user}</td>
              <td>${order.money}</td>
              <td>${order.orderType}</td>
              <td>${order.orderAddr}</td>
              <td>${order.state}</td>
              <td><a href="<%=basePath%>getOrder?orderId=${order.orderId}">Edit</a></td>
              <td><a href="<%=basePath%>delOrder?orderId=${order.orderId}">Delete</a></td>
            </tr>
          </c:forEach>
    </table>
    <a href="<%=basePath%>toAddOrder">添加订单</a>
  </body>
</html>