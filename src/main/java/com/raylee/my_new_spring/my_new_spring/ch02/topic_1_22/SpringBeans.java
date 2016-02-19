package com.raylee.my_new_spring.my_new_spring.ch02.topic_1_22;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeans {
	@Bean
	public Chief jack() {
		Chief chief = new Chief();
		chief.setName("mike");
		return chief;
	}

}
