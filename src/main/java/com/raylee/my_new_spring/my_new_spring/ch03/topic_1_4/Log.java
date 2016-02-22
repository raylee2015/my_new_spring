package com.raylee.my_new_spring.my_new_spring.ch03.topic_1_4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Log {

	public void washOven() {
		System.out.println("washOven,logging.....");
	}

	public void checkOrder(JoinPoint joinpoint) {
		for (Object item : joinpoint.getArgs()) {
			if (item instanceof Cake) {
				Cake cake = (Cake) item;
				System.out.println(cake.getName());
			}
		}
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
