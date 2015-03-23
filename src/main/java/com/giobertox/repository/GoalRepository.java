package com.giobertox.repository;

import java.util.List;

import com.giobertox.model.Goal;

public interface GoalRepository {

	Goal save(Goal goal);

	List<Goal> loadAll();

}
