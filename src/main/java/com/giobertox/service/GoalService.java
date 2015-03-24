package com.giobertox.service;

import java.util.List;

import com.giobertox.model.Goal;
import com.giobertox.model.GoalReport;

public interface GoalService {

	Goal save(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> findAllGoalReports();

}
