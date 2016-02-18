package com.raylee.my_new_spring.my_new_spring.ch02.topic_1_20;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"/com/raylee/my_new_spring/my_new_spring/ch02/topic_1_20/ApplicationContext-test.xml" })
public class ChiefTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testChief() {
		Chief jack = applicationContext.getBean(Chief.class);
		System.out.println(jack.getName());
		Fighter mike = applicationContext.getBean(Fighter.class);
		System.out.println(mike.getName());
	}
}
