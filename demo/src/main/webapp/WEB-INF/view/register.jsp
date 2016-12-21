<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'register.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript">
	  function userRegister() {
		var form = document.forms[0];
		form.action = "<%=basePath%>register";
		form.method = "post";
		form.submit();
	}
</script>

</head>

<body>
	<center>
		<h1>欢迎登录</h1>
		<form action="" name="registerForm">
			<table>
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
					<td>密 码：</td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
			<div style="color: #F00">${loginError}</div>
			<br> <input type="button" value="登录" onclick="userRegister()">
			<input type="button" value="注册"
				onclick="window.location.href='toAddUser'"> <input
				type="button" value="管理员登录"
				onclick="window.location.href='adminRegister'">
		</form>
	</center>
</body>
</html>
