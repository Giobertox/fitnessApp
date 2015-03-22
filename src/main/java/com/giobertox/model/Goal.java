package com.giobertox.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
// @Table(name = "goals")
public class Goal {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@Range(min = 1, max = 180)
	@Column(name = "minutes")
	private int minutes;

	@OneToMany(mappedBy = "goal", cascade = CascadeType.ALL)
	private List<Exercise> exercises = new ArrayList<Exercise>();

	public Long getId() {
		return id;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public List<Exercise> getExercises() {
		return exercises;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

}
