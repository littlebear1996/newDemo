<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

<title>My JSP 'adminRegister.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript">
	  function adminRegister() {
		var form = document.forms[0];
		form.action = "<%=basePath%>adminRegister";
		form.method = "post";
		form.submit();
	}
</script>

</head>

<body>
	<center>
		<h1>欢迎进入管理员登录页面登录</h1>
		<form action="" name="adminRegisterForm">
			<table>
				<tr>
					<td>管理员用户名：</td>
					<td><input type="text" name="adminName"></td>
				</tr>
				<tr>
					<td>管理员密码：</td>
					<td><input type="password" name="adminPassword"></td>
				</tr>
			</table>
			<input type="button" value="登录" onclick="adminRegister()">
		</form>
	</center>
</body>
</html>
