package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_16;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"/com/raylee/my_new_spring/my_new_spring/ch01/topic_1_16/ApplicationContext-test.xml" })
public class ChiefTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testChief() {
		Chief jack = (Chief) applicationContext.getBean("jack");
		jack.userOven();
		Chief mike = (Chief) applicationContext.getBean("mike");
		mike.userOven();
		Chief rose = (Chief) applicationContext.getBean("rose");
		rose.userOven();
	}
}
