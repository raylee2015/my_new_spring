package com.raylee.my_new_spring.my_new_spring.ch02.topic_1_22;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"/com/raylee/my_new_spring/my_new_spring/ch02/topic_1_22/ApplicationContext-test.xml" })
public class ChiefTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testChief() {
		Chief jack1 = (Chief) applicationContext.getBean(Chief.class);
		System.out.println(jack1.getId());
		Chief jack2 = (Chief) applicationContext.getBean("jack");
		System.out.println(jack2.getId());
	}
}
