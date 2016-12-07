<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
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
  </head>
  
  <body>
    <center>  
        <h1>注册新用户</h1>  
        <form:form action="addUser" method="post" modelAttribute="user">  
			<tr>
				<td><form:label path="userName">用户名：</form:label></td>
				<td><form:input path="userName" value="${user.userName}"/></td>
				<br />
				<td><form:errors path="userName" cssStyle="color:red"/></td>
				<br />
			</tr>
			<br />
			<tr>
				<td><form:label path="password">密 码: </form:label></td>
				<td><form:password path="password" value="${user.password}"/></td>
				<br />
				<td><form:errors path="password" cssStyle="color:red"/></td>
				<br />
			</tr>
			<br />
			<tr>
				<td><form:label path="userMail">邮 箱: </form:label></td>
				<td><form:input path="userMail" value="${user.userMail}"/></td>
				<br />
				<td><form:errors path="userMail" cssStyle="color:red"/></td>
				<br />
			</tr>
			<br />
			<tr>  
                <td colspan="3"><input type="submit" value="注册"></td>  
                <td colspan="3"><input type="reset" value="重置"></td>  
            </tr>
        </form:form>  
    </center>
  </body>
</html>
