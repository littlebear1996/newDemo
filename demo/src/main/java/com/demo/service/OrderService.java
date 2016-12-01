package com.demo.service;

import java.util.List;

import com.demo.projo.Order;

public interface OrderService {

	/**
	 * 通过Id查找订单
	 * @param orderId
	 * @return
	 */
	public Order selectOrderById(int orderId);
	/**
	 * 添加订单
	 * @param order
	 */
	public void insertOrder(Order order);
	/**
	 * 通过Id删除订单
	 * @param orderId
	 */
	public boolean deleteOrderById(int orderId);
	/**
	 * 更新订单
	 * @param order
	 */
	public Boolean updateOrder(Order order);
	/**
	 * 列出所有订单
	 * @return
	 */
	public List<Order> selectAllOrder();
}
