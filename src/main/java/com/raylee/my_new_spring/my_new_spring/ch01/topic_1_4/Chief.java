package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_4;

public class Chief {
	private Cake cake = null;

	private Oven oven = null;

	public Chief(Cake cake) {
		this.cake = cake;
	}

	public Chief(Cake cake, Oven oven) {
		this.cake = cake;
		this.oven = oven;
	}

	public void makeOneCake() {
		System.out.println(oven.toString() + cake.toString());
	}
}
