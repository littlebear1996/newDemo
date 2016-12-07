package com.demo.dao;

import java.util.List;

import com.demo.projo.Order;
/**
 * 订单数据访问方法类
 * @author huanhuan.jin
 *
 */
public interface OrderDao {
	/**
	 * 添加订单
	 * @param order：订单对象
	 */
    public void insertOrder(Order order);
    /**
	 * 根据ID删除订单
	 * @param orderId：订单编号
	 */
    public Boolean deleteOrderById(int orderId);
    /**
	 * 修改订单
	 * @param order：订单对象
	 * @return 是否成功的Boolean值
	 */
    public Boolean updateOrder(Order order);
    /**
	 * 通过Id查找订单
	 * @param orderId：订单编号
	 * @return Order：对应编号的订单对象
	 */
    public Order selectOrderById(int orderId);
    /**
	 * 查询所有订单
	 * @return List：Order列表
	 */
    public List<Order> selectAllOrder();
    /**
     * 查询所有用户名
     * @return List：用户名列表
     */
    public List<String> getAllUserName();
}
