package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_19;

public class Chief {

	private String name = "";

	private Oven oven;

	public void checkOven() {
		if (getOven().isBigOrNot()) {
			System.out.println(getOven());
			System.out.println("oven is big");
		} else {
			System.out.println(getOven());
			System.out.println("oven is not big");
		}
	}

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
}
