package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_6;

public class Chief {
	static {
		System.out.println("before chief create");
	}

	public Chief() {
		System.out.println("chief construtor");
	}

	private final int id = index++;

	public int getId() {
		return id;
	}

	public void create() {
		System.out.println("chief created");
	}

	public void destroy() {
		System.out.println("chief destroy");
	}

	private static int index = 0;

}
