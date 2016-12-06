package com.demo.projo;

import javax.validation.constraints.Min;

/**
 * 订单pojo
 * @author huanhuan.jin
 *
 */
public class Order {
    /**
     * 订单编号
     */
	@Min(value=10,message="orderId>=10")
	private Integer orderId;
	/**
	 * 用户名
	 */
	private String user;
	/**
	 * 订单金额
	 */
	private Double money;
	/**
	 * 订单类型：到付/即付
	 */
	private String orderType;
	/**
	 * 订单收货地址
	 */
	private String orderAddr;
	/**
	 * 订单状态：未审核/已审核
	 */
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
		return "Order [orderId=" + orderId + ", user=" + user + ", money="
				+ money + ", orderType=" + orderType + ", orderAddr="
				+ orderAddr + ", state=" + state + "]";
	}

}
