package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_15;

public class Oven {
	private String name = "";

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
