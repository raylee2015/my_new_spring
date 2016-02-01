package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_10;

public class Chief {

	private static int index = 0;

	private Cake cake = null;

	private final int id = index++;

	private String name = "";

	//配置文件使用p:属性符号，不能有下面的构造器
	// public Chief(String name, Cake cake) {
	// this.name = name;
	// this.cake = cake;
	// }

	public Cake getCake() {
		return cake;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Cake makeOneCake() {
		return cake;
	}

	public void setCake(Cake cake) {
		this.cake = cake;
	}

	public void setName(String name) {
		this.name = name;
	}

}
