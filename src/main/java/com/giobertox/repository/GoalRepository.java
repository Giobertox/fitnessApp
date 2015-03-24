package com.giobertox.repository;

import java.util.List;

import com.giobertox.model.Goal;
import com.giobertox.model.GoalReport;

public interface GoalRepository {

	Goal save(Goal goal);

	List<Goal> loadAll();

	List<GoalReport> findAllGoalReports();

}
