package com.raylee.my_new_spring.my_new_spring.ch02.topic_1_6;

import org.springframework.beans.factory.annotation.Autowired;

public class Chief {
	@Autowired
	private Cake cake = null;

	private String name = "";

	public String getName() {
		return name;
	}

	public Cake makeOneCake() {
		System.out.println(getName() + " make " + cake.getName());
		return cake;
	}

	public void setName(String name) {
		this.name = name;
	}

}
