package com.raylee.my_new_spring.my_new_spring.ch03.topic_1_4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeans {
	@Bean
	public Chief jack() {
		Chief chief = new Chief();
		chief.setName("jack");
		chief.setOven(oven());
		chief.setCake(cake());
		return chief;
	}

	@Bean
	public Oven oven() {
		Oven oven = new Oven();
		oven.setName("big oven");
		return oven;
	}

	@Bean
	public Cake cake() {
		Cake cake = new Cake();
		cake.setName("blueberryCheeseCake");
		return cake;
	}

	@Bean
	public Log log() {
		return new Log();
	}

}
