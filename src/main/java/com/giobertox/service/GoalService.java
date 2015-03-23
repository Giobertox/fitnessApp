package com.giobertox.service;

import java.util.List;

import com.giobertox.model.Goal;

public interface GoalService {

	Goal save(Goal goal);

	List<Goal> findAllGoals();

}
