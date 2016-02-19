package com.raylee.my_new_spring.my_new_spring.ch02.topic_1_22;

import org.springframework.beans.factory.annotation.Value;

public class Chief {

	private final int id = index++;

	private static int index = 0;

	public int getId() {
		return id;
	}

	@Value("jack")
	private String name = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
