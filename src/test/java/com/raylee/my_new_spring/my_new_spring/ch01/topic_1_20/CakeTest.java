package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_20;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"/com/raylee/my_new_spring/my_new_spring/ch01/topic_1_20/ApplicationContext-test.xml" })
public class CakeTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testChief() {
		@SuppressWarnings("unchecked")
		ArrayList<Cake> cakes = (ArrayList<Cake>) applicationContext.getBean("cakes");
		System.out.println(cakes.size());
		Chief jack=applicationContext.getBean(Chief.class);
		Cake cake =jack.getCake();
		System.out.println(cake.getName());
	}
}
