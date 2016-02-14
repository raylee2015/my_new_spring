package com.raylee.my_new_spring.my_new_spring.ch02.topic_1_9;

import org.springframework.beans.factory.annotation.Autowired;

public class Chief {
	@Autowired(required = false)
	private Cake cake = null;

	private String name = "";

	public String getName() {
		return name;
	}

	public Cake makeOneCake() {
		if (cake != null) {
			System.out.println(getName() + " make " + cake.getName());
		} else {
			System.out.println(cake);
		}
		return cake;
	}

	public void setName(String name) {
		this.name = name;
	}

}
