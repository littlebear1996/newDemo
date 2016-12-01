package com.demo.projo;

public class Order {
// 订单编号
   private Integer orderId;
// 用户，即下单人
   private String user;
// 订单金额
   private Double money;
// 订单类型：到付还是即付
   private String orderType;
// 收货地址
   private String orderAddr;
// 订单状态
   private String state;
public Integer getOrderId() {
	return orderId;
}
public void setOrderId(Integer orderId) {
	this.orderId = orderId;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public Double getMoney() {
	return money;
}
public void setMoney(Double money) {
	this.money = money;
}
public String getOrderType() {
	return orderType;
}
public void setOrderType(String orderType) {
	this.orderType = orderType;
}
public String getOrderAddr() {
	return orderAddr;
}
public void setOrderAddr(String orderAddr) {
	this.orderAddr = orderAddr;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Order [orderId=" + orderId + ", user=" + user + ", money=" + money
			+ ", orderType=" + orderType + ", orderAddr=" + orderAddr
			+ ", state=" + state + "]";
}
   
}
