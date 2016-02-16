package com.raylee.my_new_spring.my_new_spring.ch02.topic_1_16;

import javax.inject.Named;

@Named("myCake")
public class Cake {

	private String name = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
