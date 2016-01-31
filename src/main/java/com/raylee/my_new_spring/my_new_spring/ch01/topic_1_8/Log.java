package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_8;

import org.aspectj.lang.JoinPoint;

public class Log {

	public void before() {
		System.out.println("before login");
	}

	public void after(JoinPoint joinpoint) {
		Object[] objects = joinpoint.getArgs();
		for (int i = 0; i < objects.length; i++) {
			User user = (User) objects[i];
			System.out.println("save login log:" + user.getName() + " login");
		}
	}
}
