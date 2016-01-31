package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_8;

public class LoginServiceImpl {

	public void login(User user) {
		if (user != null) {
			System.out.println(user.getName() + " login");
		}
	}
}
