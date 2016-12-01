package com.demo.baseTest;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.projo.Order;
import com.demo.service.OrderService;


public class OrderServiceTest extends SpringTestCase{

	@Autowired
	private OrderService orderService;
	Logger logger = Logger.getLogger(OrderServiceTest.class);
	
	@Test
	public void listAllTest(){
		List<Order> list = orderService.selectAllOrder();
		for(Order order:list){
			System.out.println(order);
		}
	}
}

