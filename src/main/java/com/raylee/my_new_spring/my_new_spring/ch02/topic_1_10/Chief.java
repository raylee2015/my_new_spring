package com.raylee.my_new_spring.my_new_spring.ch02.topic_1_10;

import org.springframework.beans.factory.annotation.Autowired;

public class Chief {
	private Cake cake = null;

	private Oven oven = null;

	@Autowired(required = false)
	public Chief(Cake cake) {
		this.cake = cake;
	}

	@Autowired(required = false)
	public Chief(Cake cake, Oven oven) {
		this.cake = cake;
		this.oven = oven;
	}

	private String name = "";

	public String getName() {
		return name;
	}

	public Cake makeOneCake() {
		if (cake != null) {
			System.out.println(getName() + " use " + oven.getName() + " and make " + cake.getName());
		} else {
			System.out.println("null");
		}
		return cake;
	}

	public void setName(String name) {
		this.name = name;
	}

}
