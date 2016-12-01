package com.demo.dao;

import java.util.List;

import com.demo.projo.Order;

public interface OrderDao {
//	插入一条订单
    public void insertOrder(Order order);
//  根据订单编号删除一条订单
    public Boolean deleteOrderById(int orderId);
//  修改一条订单
    public Boolean updateOrder(Order order);
//  根据订单编号查询某条订单
    public Order selectOrderById(int orderId);
//  查询所有订单
    public List<Order> selectAllOrder();
}
