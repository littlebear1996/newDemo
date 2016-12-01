<%@ page language="java" import="java.util.*" pageEncoding="utf-8" errorPage="error.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>编辑订单</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript">
	  function updateOrder() {
		var form = document.forms[0];
		form.action = "<%=basePath%>updateOrder";
		form.method="post";
		form.submit();
	}
	</script>

  </head>
  
  <body>
    <h1>编辑订单</h1>
    <form action="" name="orderForm">
          <input type="hidden" name="orderId" value="${order.orderId}"><br>
                 用户：<input type="text" name="user" value="${order.user}"><br>
                 订单金额：<input type="text" name="money" value="${order.money}"><br> 
                 订单类型：<input type="text" name="orderType" value="${order.orderType}"><br>
                 收货地址：<input type="text" name="orderAddr" value="${order.orderAddr}"><br>
                 订单状态：<input type="text" name="state" value="${order.state}"><br>
             <input type="button" value="确定修改" onclick="updateOrder()">   
    </form>
  </body>
</html>
