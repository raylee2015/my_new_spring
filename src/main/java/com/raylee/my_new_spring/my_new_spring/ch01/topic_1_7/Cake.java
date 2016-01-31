package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_7;

public class Cake {

	private final int id = index++;

	private static int index = 0;

	private String name = "";

	private double size = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "create the cake,its id:" + id + ", size:" + size + " inch ,name:" + name;
	}
}
