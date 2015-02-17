package com.giobertox.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class Goal {
	@NotNull
	@Range(min = 1, max = 180)
	private int minutes;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

}
