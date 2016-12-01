package com.demo.dao;

import java.util.List;

import com.demo.projo.Order;

public interface OrderDao {
	/**
	 * 添加订单
	 * @param order
	 */
    public void insertOrder(Order order);
    /**
	 * 根据ID删除订单
	 * @param orderId
	 */
    public Boolean deleteOrderById(int orderId);
    /**
	 * 修改订单
	 * @param order
	 */
    public Boolean updateOrder(Order order);
    /**
	 * 通过用户Id查找订单
	 * @param orderId
	 * @return
	 */
    public Order selectOrderById(int orderId);
    /**
	 * 查询所有订单
	 */
    public List<Order> selectAllOrder();
}
