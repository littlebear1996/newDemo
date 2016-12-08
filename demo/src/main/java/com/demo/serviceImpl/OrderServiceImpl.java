package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.OrderDao;
import com.demo.projo.Order;
import com.demo.service.OrderService;


@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDao orderDao;
	
	@Override
	public Order selectOrderById(int orderId) {
		
		// TODO Auto-generated method stub
		return orderDao.selectOrderById(orderId);
	}

	@Override
	public void insertOrder(Order order) {
		
		// TODO Auto-generated method stub
		orderDao.insertOrder(order);
		this.updateOrder(null);
	}

	@Override
	public boolean deleteOrderById(int orderId) {
		// TODO Auto-generated method stub
		return orderDao.deleteOrderById(orderId);
	}

	@Override
	public Boolean updateOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.updateOrder(order);
	}

	@Override
	public List<Order> selectAllOrder() {
		// TODO Auto-generated method stub
		return orderDao.selectAllOrder();
	}

	@Override
	public List<Order> getOrderByUserName(String userName) {
		// TODO Auto-generated method stub
		return orderDao.getOrderByUserName(userName);
	}

}
