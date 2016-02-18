package com.raylee.my_new_spring.my_new_spring.ch02.topic_1_19;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

@Component
// @Component("jack")
// @Repository
// @Service
// @Controller
public class Chief {

	@Value("jack")
	private String name = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
