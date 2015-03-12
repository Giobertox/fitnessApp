package com.giobertox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giobertox.model.Goal;
import com.giobertox.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;

	@Override
	public Goal saveGoal(Goal goal) {
		return goalRepository.save(goal);
	}

}
