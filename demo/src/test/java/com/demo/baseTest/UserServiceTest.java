package com.demo.baseTest;



import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.service.UserAdminService;

public class UserServiceTest extends SpringTestCase{

	@Autowired
	private UserAdminService userAdminService;
	Logger logger = Logger.getLogger(UserServiceTest.class);
	
	@Test
	public void test(){
		System.out.println(userAdminService.getAdminPasswordByAdminName("admin"));
	}
}
