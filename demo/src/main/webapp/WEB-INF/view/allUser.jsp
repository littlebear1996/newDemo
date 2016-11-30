<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	  function del(id){
	    $.get("<%=basePath%>delUser?id="+id,function(data){
	      if("success"==data.result){
	        alert("删除成功！");
	        window.location.reload();
	      }else{
	        alert("删除失败！");
	      }
	    });
	  }
	</script>

  </head>
  
  <body>
    <h6><a href="<%=basePath%>toAddUser">添加用户</a></h6>
    <table border="1">
      <tbody>
        <tr>
          <th>用户ID</th>
          <th>用户名</th>
          <th>邮箱</th>
          <th>操作</th>
        </tr>
        <c:if test="${!empyt userList}">
          <c:forEach items="${userlist}" var="user">
            <tr>
              <td>${user.userId}</td>
              <td>${user.userName}</td>
              <td>${user.userMail}</td>
              <td><a href="<%=basePath%>getUser?id=${user.userId}">编辑</a></td>
              <td><a href="javascript:del('${user.userId}')">删除</a></td>
            </tr>
          </c:forEach>
        </c:if>
      </tbody>
    </table>
  </body>
</html>
