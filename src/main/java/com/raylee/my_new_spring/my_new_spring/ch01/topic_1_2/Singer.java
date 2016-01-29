package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_2;

public class Singer {
	private Song song = null;

	public Singer(Song song) {
		this.song = song;
	}

	public void singTheSong() {
		System.out.println(song.toString());
	}
}
