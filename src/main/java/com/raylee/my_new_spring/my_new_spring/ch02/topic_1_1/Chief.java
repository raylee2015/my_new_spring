package com.raylee.my_new_spring.my_new_spring.ch02.topic_1_1;

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
		System.out.println(getName() + " make " + getCake().getName());
		return cake;
	}

	public void setCake(Cake cake) {
		this.cake = cake;
	}

	public void setName(String name) {
		this.name = name;
	}

}
