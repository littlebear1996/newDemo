<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
	errorPage="error.jsp"%>
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
<title>编辑订单</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>

<body>
	<h1 align="center">编辑订单</h1>
	<form action="updateOrder">
		<table align="center">
			<tr>
				<td><input type="hidden" name="orderId"
					value="${order.orderId}"></td>
			</tr>
			<tr>
				<td>用户</td>
				<td><input type="text" name="user" value="${order.user}"></td>
			</tr>
			<tr>
				<td>订单金额</td>
				<td><input type="text" name="money" value="${order.money}"></td>
			</tr>
			<tr>
				<td>订单类型</td>
				<td><input type="text" name="orderType"
					value="${order.orderType}"></td>
			</tr>
			<tr>
				<td>收货地址</td>
				<td><input type="text" name="orderAddr"
					value="${order.orderAddr}"></td>
			</tr>
			<tr>
				<td>订单状态</td>
				<td><input type="text" name="state" value="${order.state}">
				<td>
			</tr>
			<tr>
				<td><input type="submit" value="确认修改"></td>
			</tr>
		</table>
	</form>
</body>
</html>
