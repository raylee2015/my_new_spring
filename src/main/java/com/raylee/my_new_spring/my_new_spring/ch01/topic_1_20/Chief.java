package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_20;

public class Chief {
	private Cake cake = null;

	private String name = "";

	public Cake getCake() {
		return cake;
	}

	public String getName() {
		return name;
	}

	public Cake makeOneCake() {
		return cake;
	}

	public void setCake(Cake cake) {
		this.cake = cake;
	}

	public void setName(String name) {
		this.name = name;
	}

}
