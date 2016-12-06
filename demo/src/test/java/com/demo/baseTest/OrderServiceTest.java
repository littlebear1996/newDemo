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
		// 下单逻辑
		
		//1.验证用户
		
		//2.check商品
		
		//3.参数合法性
		
		//4.下单
		
		//5.支付
		
		//6.结算
		
		//7....
		
		for(Order order:list){
			System.out.println(1/0);
			System.out.println(order);
		}
	}
}

