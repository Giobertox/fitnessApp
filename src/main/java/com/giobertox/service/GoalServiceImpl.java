package com.giobertox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.giobertox.model.Goal;
import com.giobertox.model.GoalReport;
import com.giobertox.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;

	public GoalRepository getGoalRepository() {
		return goalRepository;
	}

	public void setGoalRepository(GoalRepository goalRepository) {
		this.goalRepository = goalRepository;
	}

	@Override
	@Transactional
	public Goal save(Goal goal) {
		return goalRepository.save(goal);
	}

	@Override
	@Transactional
	public List<Goal> findAllGoals() {
		return goalRepository.loadAll();
	}

	@Override
	public List<GoalReport> findAllGoalReports() {
		return goalRepository.findAllGoalReports();
	}

}