package com.giobertox.model;

public class GoalReport {

	private int goalMinutes;
	private int exerciseMinutes;
	private String exerciseType;

	public GoalReport(int goalMinutes, int exerciseMinutes, String exerciseType) {
		super();
		this.goalMinutes = goalMinutes;
		this.exerciseMinutes = exerciseMinutes;
		this.exerciseType = exerciseType;
	}

	public String getExerciseActivity() {
		return exerciseType;
	}

	public int getExerciseMinutes() {
		return exerciseMinutes;
	}

	public int getGoalMinutes() {
		return goalMinutes;
	}

	public void setExerciseActivity(String exerciseType) {
		this.exerciseType = exerciseType;
	}

	public void setExerciseMinutes(int exerciseMinutes) {
		this.exerciseMinutes = exerciseMinutes;
	}

	public void setGoalMinutes(int goalMinutes) {
		this.goalMinutes = goalMinutes;
	}

}
