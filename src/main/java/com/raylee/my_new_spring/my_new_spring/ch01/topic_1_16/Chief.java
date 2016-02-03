package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_16;

public class Chief {

	private String name = "";

	private Oven oven;

	private Chief friend;

	public Chief getFriend() {
		return friend;
	}

	public void setFriend(Chief friend) {
		this.friend = friend;
	}

	public String getName() {
		return name;
	}

	public Oven getOven() {
		return oven;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOven(Oven oven) {
		this.oven = oven;
	}

	public void userOven() {
		System.out.println(name + " use " + oven);
	}

}
