package com.raylee.my_new_spring.my_new_spring.ch02.topic_1_21;

import org.springframework.beans.factory.annotation.Value;

public class Chief implements Person {

	@Value("jack")
	private String name = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
