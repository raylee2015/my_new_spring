package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_17;

public class Oven {
	private String name = "";

	private double size = 0;

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return name + " size:" + size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
