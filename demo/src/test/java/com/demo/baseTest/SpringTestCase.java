package com.demo.baseTest;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations={"classpath:application.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class SpringTestCase {
	protected Logger logger = LoggerFactory.getLogger(getClass()); 
}
