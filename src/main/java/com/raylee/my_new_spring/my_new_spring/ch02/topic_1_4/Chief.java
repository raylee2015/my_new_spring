package com.raylee.my_new_spring.my_new_spring.ch02.topic_1_4;

public class Chief {
	private Cake cake = null;

	private String name = "";

	public Chief(Cake cake) {
		this.cake = cake;
	}

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
