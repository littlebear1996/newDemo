<%@ page language="java" import="java.util.*" pageEncoding="utf-8"
	errorPage="error.jsp"%>
<%@ page import="com.demo.projo.Order"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<style>
.error {
	color: #ff0000;
	font-weight: bold;
	font-size: 12px;
}
</style>
<body>
	<h1 align="center">编辑订单</h1>
	<form:form method="POST" modelAttribute="order" action="updateOrder">
		<table align="center">
			<tr>
				<td><input type="hidden" name="orderId"
					value="${order.orderId}"></td>
			</tr>
			<tr>
				<td>用户</td>
				<td><input type="text" name="user" value="${order.user}"></td>
				<td><form:errors path="user" cssClass="error" /></td>
			</tr>
			<tr>
				<td>订单金额</td>
				<td><input type="text" name="money" value="${order.money}"></td>
				<td><form:errors path="money" cssClass="error" /></td>
			</tr>
			<tr>
				<td>订单类型</td>
				<td>
					<%
						Order order = (Order) request.getAttribute("order");
							if (order.getOrderType().equals("到付")) {
					%> <input type="radio"
					name="orderType" value="到付" checked="checked">到付 <input
					type="radio" name="orderType" value="即付">即付 <%
 	} else {
 %> <input
					type="radio" name="orderType" value="到付">到付 <input
					type="radio" name="orderType" value="即付" checked="checked">即付
					<%
 	}
 %>
				</td>
			</tr>
			<tr>
				<td>收货地址</td>
				<td><input type="text" name="orderAddr"
					value="${order.orderAddr}"></td>
				<td><form:errors path="orderAddr" cssClass="error" /></td>
			</tr>
			<tr>
				<td>订单状态</td>
				<td><select name="state">
						<%
							if (order.getState().equals("待审核")) {
						%>
						<option value="待审核" selected>待审核</option>
						<option value="已审核">已审核</option>
						<option value="已作废">已作废</option>
						<%
							} else if (order.getState().equals("已审核")) {
						%>
						<option value="待审核">待审核</option>
						<option value="已审核" selected>已审核</option>
						<option value="已作废">已作废</option>
						<%
							} else {
						%>
						<option value="待审核">待审核</option>
						<option value="已审核">已审核</option>
						<option value="已作废" selected>已作废</option>
						<%
							}
						%>
				</select>
				<td>
			</tr>
			<tr>
				<td><input type="submit" value="确认修改"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
