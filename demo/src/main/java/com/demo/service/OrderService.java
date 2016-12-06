package com.demo.service;

import java.util.List;

import com.demo.projo.Order;


/**
 * 订单服务
 * @author huanhuan.jin
 *
 */
public interface OrderService {

	/**
	 * 通过Id查找订单
	 * @param orderId：订单编号
	 * @return Order：对应编号的订单对象
	 */
	public Order selectOrderById(int orderId);
	/**
	 * 添加订单
	 * @param order：订单对象
	 */
	public void insertOrder(Order order);
	/**
	 * 通过Id删除订单
	 * @param orderId：订单编号
	 */
	public boolean deleteOrderById(int orderId);
	/**
	 * 更新订单
	 * @param order：订单对象
	 */
	public Boolean updateOrder(Order order);
	/**
	 * 列出所有订单
	 * @return：List：Order列表
	 */
	public List<Order> selectAllOrder();
}
