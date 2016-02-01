package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_13;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

public class Chief {

	private static int index = 0;

	private final int id = index++;

	private String name = "";

	private Properties ovens = null;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void userOvens() {
		Iterator<Entry<Object, Object>> it = ovens.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Object, Object> entry = it.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println("oven");
			System.out.println("key   :" + key);
			System.out.println("value :" + value);
			System.out.println("---------------");
		}
	}

	public Properties getOvens() {
		return ovens;
	}

	public void setOvens(Properties ovens) {
		this.ovens = ovens;
	}

	public void setName(String name) {
		this.name = name;
	}

}
