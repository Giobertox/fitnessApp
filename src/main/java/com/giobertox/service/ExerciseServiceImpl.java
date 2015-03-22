package com.giobertox.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giobertox.model.Exercise;
import com.giobertox.model.Goal;
import com.giobertox.repository.ExerciseRepository;

@Service
public class ExerciseServiceImpl implements ExerciseService {

	@Autowired
	private ExerciseRepository exerciseRepository;

	@Transactional
	@Override
	public void save(Exercise exercise) {
		exerciseRepository.save(exercise);
	}

	@Override
	public int getRemainigMinutes(Goal goal) {
		int totalMinutes = goal.getMinutes();
		for (Exercise exercise : goal.getExercises()) {
			totalMinutes = -exercise.getMinutes();
		}
		return totalMinutes;
	}
}
