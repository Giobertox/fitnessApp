package com.giobertox.repository;

import org.springframework.stereotype.Repository;

import com.giobertox.model.Goal;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	// @PersistenceContext
	// private EntityManager transactionManager;

	@Override
	public Goal save(Goal goal) {
		// transactionManager.persist(goal);
		return goal;
	};
}
