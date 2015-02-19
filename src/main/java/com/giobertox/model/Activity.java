package com.giobertox.model;

public class Activity {

	private final long id;

	private final String name;

	public Activity(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
