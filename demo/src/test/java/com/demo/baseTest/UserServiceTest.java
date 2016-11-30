package com.demo.baseTest;


import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.projo.User;
import com.demo.service.UserService;

public class UserServiceTest extends SpringTestCase{

	@Autowired
	private UserService userService;
	Logger logger = Logger.getLogger(UserServiceTest.class);
	
	@Test
	public void listAllTest(){
		List<User> list = userService.listAll();
		for(User user:list){
			System.out.println(user);
		}
	}
}
