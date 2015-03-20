package com.giobertox.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

public class Exercise {

	@NotNull
	@NumberFormat
	@Min(1)
	@Max(160)
	private int minutes;

	@NotNull
	@Size(min = 2, max = 30)
	private String type;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
