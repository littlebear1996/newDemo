<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

<title>添加订单</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
<style>
.error {
	color: #ff0000;
	font-weight: bold;
	font-size: 12px;
}
</style>
<body>
	<h1 align="center">添加订单</h1>
	<form:form method="POST" modelAttribute="order" action="addOrder">
		<table align="center">
			<tr>
				<td>用户名</td>
				<td><form:input path="user" /></td>
				<td><form:errors path="user" cssClass="error" /></td>
			</tr>
			<tr>
				<td>订单金额</td>
				<td><form:input path="money" /></td>
				<td><form:errors path="money" cssClass="error" /></td>
			</tr>
			<tr>
				<td>订单类型</td>
				<td><input type="radio" name="orderType" value="到付">到付
					<input type="radio" name="orderType" value="即付">即付</td>
				<td><form:errors path="orderType" cssClass="error" /></td>
			</tr>
			<tr>
				<td>收货地址</td>
				<td><form:input path="orderAddr" /></td>
				<td><form:errors path="orderAddr" cssClass="error" /></td>
			</tr>
			<tr>
				<td>订单状态</td>
				<td><select name="state">
						<option value="">-请选择-</option>
						<option value="待审核">待审核</option>
						<option value="已审核">已审核</option>
						<option value="已作废">已作废</option>
				</select></td>
				<td><form:errors path="state" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="确认添加"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
