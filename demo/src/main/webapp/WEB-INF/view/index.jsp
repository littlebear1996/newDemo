<%@ page language="java" contentType="text/html" pageEncoding="utf-8" errorPage="error.jsp"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>首页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>

   <a href="<%=basePath%>/showOrder">进入订单管理页</a><br>
    
   <a href="<%=basePath%>/getAllUser">进入用户管理页</a><br>
   
   <a href="<%=basePath%>/register">用户登录</a>  
   
  </body>
</html>
