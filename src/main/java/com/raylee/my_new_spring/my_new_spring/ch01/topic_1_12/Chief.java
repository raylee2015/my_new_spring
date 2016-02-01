package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_12;

import java.util.HashMap;

public class Chief {

	private static int index = 0;

	private final int id = index++;

	private String name = "";

	private HashMap<String, Oven> ovens = null;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void userOvens() {
		for (String key : ovens.keySet()) {
			System.out.println("oven key:" + key);
			System.out.println(name + " use " + ovens.get(key));
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public HashMap<String, Oven> getOvens() {
		return ovens;
	}

	public void setOvens(HashMap<String, Oven> ovens) {
		this.ovens = ovens;
	}

}
