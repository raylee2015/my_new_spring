package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_14;

public class Cake {

	private int id = 0;

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

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "cake id:" + id + " name:" + name + " size:" + size;
	}

}
