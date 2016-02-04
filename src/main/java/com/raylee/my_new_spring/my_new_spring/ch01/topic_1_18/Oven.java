package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_18;

public class Oven {
	private String name = "";

	private double size = 0;

	private boolean bigOrNot = false;

	public boolean isBigOrNot() {
		return bigOrNot;
	}

	public void setBigOrNot(boolean bigOrNot) {
		this.bigOrNot = bigOrNot;
	}

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
