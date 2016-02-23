package com.raylee.my_new_spring.my_new_spring.ch03.topic_1_6;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Log {

	@Pointcut("execution(* com.raylee.my_new_spring.my_new_spring.ch03.topic_1_6.Chief.*(..))")
	public void makeOneCake() {
	}

	public void washOven() {
		System.out.println("washOven,logging.....");
	}

	public void prepare() {
		System.out.println("prepare,logging.....");
	}

	public void after() {
		System.out.println("after someting to do,logging.....");
	}

	@Around(value = "makeOneCake()")
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
