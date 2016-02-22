package com.raylee.my_new_spring.my_new_spring.ch03.topic_1_5;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Log {

	@Pointcut("execution(* com.raylee.my_new_spring.my_new_spring.ch03.topic_1_5.Chief.*(..))")
	public void makeOneCake() {
	}

	@Before("makeOneCake()")
	public void washOven() {
		System.out.println("washOven,logging.....");
	}

	@Before("makeOneCake()")
	public void prepare() {
		System.out.println("prepare,logging.....");
	}

	@After("makeOneCake()")
	public void after() {
		System.out.println("after someting to do,logging.....");
	}

}
