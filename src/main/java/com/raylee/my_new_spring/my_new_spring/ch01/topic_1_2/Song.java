package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_2;

public class Song {

	private String name;

	public Song(String name) {
		this.name = name;
	}

	public Song() {
	}

	@Override
	public String toString() {
		return "the song:" + name;
	}
}
