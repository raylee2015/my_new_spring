package com.raylee.my_new_spring.my_new_spring.ch03.topic_1_3;

import org.aspectj.lang.ProceedingJoinPoint;

public class Log {

	public void washOven() {
		System.out.println("washOven,logging.....");
	}

	public void checkOrder(Cake cake) {
		System.out.println("is blueberryCheeseCake?" + cake.getName().equals("blueberryCheeseCake"));
	}

	public void prepare() {
		System.out.println("prepare,logging.....");
	}

	public void after() {
		System.out.println("after someting to do,logging.....");
	}

	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		washOven();
		prepare();
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println("use time:" + (endTime - startTime));
		after();
	}

}
