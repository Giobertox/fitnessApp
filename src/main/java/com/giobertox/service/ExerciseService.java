package com.giobertox.service;

import com.giobertox.model.Exercise;
import com.giobertox.model.Goal;

public interface ExerciseService {

	void save(Exercise exercise);

	int getRemainigMinutes(Goal goal);

}
