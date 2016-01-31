package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"/com/raylee/my_new_spring/my_new_spring/ch01/topic_1_8/ApplicationContext-test.xml" })
public class LoginTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testLogin() {
		LoginServiceImpl loginServiceImpl = applicationContext.getBean(LoginServiceImpl.class);
		User user = applicationContext.getBean(User.class);
		loginServiceImpl.login(user);
	}
}
