package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_4;

public class Oven {

	private Oven() {
	}

	public static Oven getInstance() {
		return new Oven();
	}

	@Override
	public String toString() {
		return "use old oven";
	}

}
