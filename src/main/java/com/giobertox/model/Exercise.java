package com.giobertox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

@Entity
public class Exercise {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@NumberFormat
	@Min(1)
	@Max(160)
	private int minutes;

	@NotNull
	@Size(min = 2, max = 30)
	private String type;

	@ManyToOne
	private Goal goal;

	public Goal getGoal() {
		return goal;
	}

	public Long getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	public String getType() {
		return type;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public void setType(String type) {
		this.type = type;
	}

}
