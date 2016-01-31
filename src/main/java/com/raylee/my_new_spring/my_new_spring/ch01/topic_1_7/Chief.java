package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_7;

public class Chief {

	private Cake cake = null;

	public Cake getCake() {
		return cake;
	}

	private String name = "";

	public Chief(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCake(Cake cake) {
		this.cake = cake;
	}

	private final int id = index++;

	public int getId() {
		return id;
	}

	private static int index = 0;

	public Cake makeOneCake() {
		return cake;
	}

}
