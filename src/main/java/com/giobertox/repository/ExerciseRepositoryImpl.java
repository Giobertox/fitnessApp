package com.giobertox.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.giobertox.model.Exercise;

@Repository("exerciseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void save(Exercise exercise) {
		entityManager.persist(exercise);
		entityManager.flush();
	}

}
