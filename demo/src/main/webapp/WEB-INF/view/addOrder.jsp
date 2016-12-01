<%@ page language="java" import="java.util.*" pageEncoding="utf-8" errorPage="error.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>添加订单</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--

	-->
	<script type="text/javascript">
	  function addOrder() {
		var form = document.forms[0];
		form.action = "<%=basePath%>addOrder";
		form.method = "post";
		form.submit();
	}
	</script>

  </head>
  
  <body>
    <h1>添加订单</h1>
    <form action="" name="orderForm">
             订单编号:<input type="text" name="orderId"><br>
             用户:<input type="text" name="user"><br>
             订单金额:<input type="text" name="money"><br>
             订单类型:<input type="text" name="orderType"><br>
             收货地址:<input type="text" name="orderAddr"><br>
             订单状态:<input type="text" name="state"><br>
    <input type="button" value="确认添加" onclick="addOrder()">
    </form>
  </body>
</html>
