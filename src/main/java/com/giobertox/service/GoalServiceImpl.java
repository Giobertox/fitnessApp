package com.giobertox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.giobertox.model.Goal;
import com.giobertox.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;

	@Override
	@Transactional
	public Goal save(Goal goal) {
		return goalRepository.save(goal);
	}

	// public List<Goal> findAllGoals() {
	// return goalRepository.loadAll();
	// }

	// public List<GoalReport> findAllGoalReports() {
	// return goalRepository.findAllGoalReports();
	// }

}