package com.giobertox.model;

public class Activity {

	private final Long id;

	private final String description;

	public Activity(Long id, String description) {
		this.id = id;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

}
