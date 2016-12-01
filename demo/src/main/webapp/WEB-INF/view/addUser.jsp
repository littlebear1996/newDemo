<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加用户</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	  function addUser() {
		var form = document.forms[0];
		form.action = "<%=basePath%>addUser";
		form.method = "post";
		form.submit();
	}
	</script>

  </head>
  
  <body>
    <h1><%=path %>添加用户<%=basePath %></h1>
    <form action="" name="userForm">
             用户ID：<input type="text" name="userId"><br>
             用户名：<input type="text" name="userName"><br>
             邮    箱：<input type="text" name="userMail"><br>
             密    码：<input type="password" name="password"><br>
               <input type="button" value="确认添加" onclick="addUser()">
    </form>
  </body>
</html>
