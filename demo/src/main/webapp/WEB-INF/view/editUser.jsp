<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>编辑用户</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript">
	  function updateUser() {
		var form = document.forms[0];
		form.action = "<%=basePath%>updateUser";
		form.method="post";
		form.submit();
	}
	</script>

  </head>
  
  <body>
    <form action="" name="userForm">
                 用户Id：<input type="hidden" name="userId" value="${user.userId}"><br>
                 用户名：<input type="text" name="userName" value="${user.userName}"><br>
                 密    码：<input type="password" name="password" value="${user.userMail}"><br> 
                 邮    箱：<input type="text" name="userMail" value="${user.userMail}"><br>
                 <input type="button" value="确定" onclick="updateUser()">   
    </form>
  </body>
</html>
