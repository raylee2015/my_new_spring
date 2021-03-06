package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"/com/raylee/my_new_spring/my_new_spring/ch01/topic_1_5/ApplicationContext-test.xml" })
public class ChiefTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testChief() {
		for (int i = 0; i < 3; i++) {
			Chief chief = applicationContext.getBean(Chief.class);
			System.out.println("chief id:" + chief.getId());
		}
	}
}
