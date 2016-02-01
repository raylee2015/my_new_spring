package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Chief {

	private static int index = 0;

	private ArrayList<Cake> cakes = null;

	private final int id = index++;

	private String name = "";

	private HashSet<Oven> ovens = null;

	public ArrayList<Cake> getCakes() {
		return cakes;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashSet<Oven> getOvens() {
		return ovens;
	}

	public ArrayList<Cake> makeCakes() {
		for (Iterator<Cake> iterator = cakes.iterator(); iterator.hasNext();) {
			Cake cake = iterator.next();
			System.out.println(name + cake);
		}
		return getCakes();
	}

	public void userOvens() {
		for (Iterator<Oven> iterator = ovens.iterator(); iterator.hasNext();) {
			Oven oven = iterator.next();
			System.out.println("use " + oven);
		}
	}

	public void setCakes(ArrayList<Cake> cakes) {
		this.cakes = cakes;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOvens(HashSet<Oven> ovens) {
		this.ovens = ovens;
	}

}
