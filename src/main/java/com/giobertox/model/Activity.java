package com.giobertox.model;

public class Activity {

	private final long id;

	private final String description;

	public Activity(long id, String description) {
		this.id = id;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

}
