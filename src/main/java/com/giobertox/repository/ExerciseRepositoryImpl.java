package com.giobertox.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.giobertox.model.Exercise;

@Repository("exeriseRepository")
public class ExerciseRepositoryImpl implements ExerciseRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Exercise exercise) {
		em.persist(exercise);
		em.flush();
	}

}
