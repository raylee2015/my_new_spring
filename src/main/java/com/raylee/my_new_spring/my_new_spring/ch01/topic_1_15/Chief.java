package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_15;

public class Chief {

	private String name = "";

	private Oven oven;

	public String getName() {
		return name;
	}

	public Oven getOven() {
		return oven;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOven(Oven oven) {
		this.oven = oven;
	}

	public void userOven() {
		System.out.println(name + " use " + oven);
	}

}
