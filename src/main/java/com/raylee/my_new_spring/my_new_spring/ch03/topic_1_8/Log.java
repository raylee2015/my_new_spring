package com.raylee.my_new_spring.my_new_spring.ch03.topic_1_8;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Log {

	@Pointcut(value = "execution(* com.raylee.my_new_spring.my_new_spring.ch03.topic_1_8.Chief.*(..))")
	public void chiefPointCut() {
	}

	public void washOven() {
		System.out.println("washOven,logging.....");
	}

	@Before("chiefPointCut()")
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
