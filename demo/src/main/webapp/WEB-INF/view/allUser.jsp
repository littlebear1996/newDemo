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
	<script  type="text/javascript"  src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
	<script type="text/javascript">
	  function del(userId){
	    $.get("<%=basePath%>delUser?userId="+userId,function(data){
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
          <c:forEach items="${userList}" var="user">
            <tr>
              <td>${user.userId}</td>
              <td>${user.userName}</td>
              <td>${user.userMail}</td>
              <td><a href="<%=basePath%>getUser?userId=${user.userId}">编辑</a></td>
              <td><a href="javascript:del('${user.userId}')">删除</a></td>
            </tr>
          </c:forEach>
      </tbody>
    </table>
  </body>
</html>
