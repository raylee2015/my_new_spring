package com.raylee.my_new_spring.my_new_spring.ch02.topic_1_7;

import org.springframework.beans.factory.annotation.Autowired;

public class Chief {
	private Cake cake = null;

	public Cake getCake() {
		return cake;
	}

	// @Autowired
	// public void setCake(Cake cake) {
	// this.cake = cake;
	// }

	@Autowired
	public void injectCake(Cake cake) {
		this.cake = cake;
	}

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
