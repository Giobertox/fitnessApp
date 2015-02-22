package com.giobertox.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "goals")
public class Goal {

	// Long is good for PKs : It s big, it has hashcode, it has equals method
	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@Range(min = 1, max = 180)
	@Column(name = "MINUTES")
	private int minutes;

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

}
