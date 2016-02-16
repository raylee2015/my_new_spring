package com.raylee.my_new_spring.my_new_spring.ch02.topic_1_18;

import org.springframework.beans.factory.annotation.Value;

public class Chief {

	@Value("jack")
	private String name = "";

	@Value("#{cake.name}")
	private String cakeName = "";

	@Value("#{oven.name}")
	private String ovenName = "";

	public void makeOneCake() {
		System.out.println(name + " use " + ovenName + " to make " + cakeName);
	}
}
