package com.demo.projo;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.demo.validation.CheckUser;
import com.demo.validation.Group1;
import com.demo.validation.Group2;
import com.demo.validation.Group3;

/**
 * 订单pojo
 * 
 * @author huanhuan.jin
 * 
 */
public class Order {
	/**
	 * 订单编号
	 */
	private Integer orderId;
	/**
	 * 用户名
	 */
	@NotBlank(groups=Group1.class,message = "用户名不能为空")
	@Pattern(groups=Group2.class,regexp = "^[a-zA-z][a-zA-Z0-9_]{3,9}$", message = "4-10位的字母下划线和数字组成,不能以数字或下划线开头。")
	@CheckUser(groups=Group3.class)
	private String user;
	/**
	 * 订单金额
	 */
	@NotNull(groups=Group3.class,message = "金额不能为空")
	private Double money;
	/**
	 * 订单类型：到付/即付
	 */
	@NotBlank(groups=Group3.class,message = "订单类型不能为空")
	private String orderType;
	/**
	 * 订单收货地址
	 */
	@NotBlank(groups=Group3.class,message = "收货地址不能为空")
	private String orderAddr;
	/**
	 * 下单时间
	 */
	private Date orderTime;

	/**
	 * 订单状态：未审核/已审核/已作废
	 */
	@NotBlank(groups=Group3.class,message = "订单状态不能为空")
	private String state;


	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
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
				+ orderAddr + ", orderTime=" + orderTime + ", state=" + state
				+ "]";
	}

}
