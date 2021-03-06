package com.giobertox.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.giobertox.model.Goal;
import com.giobertox.model.GoalReport;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Goal save(Goal goal) {
		em.persist(goal);
		em.flush();
		return goal;
	}

	@Override
	public List<Goal> loadAll() {
		// Query query = em.createQuery("Select g from Goal g");
		TypedQuery<Goal> query = em.createNamedQuery(Goal.FIND_ALL_GOALS, Goal.class);
		return query.getResultList();
	}

	@Override
	public List<GoalReport> findAllGoalReports() {
		// Query query = em
		// .createQuery("Select new com.giobertox.model.GoalReport(g.minutes, e.minutes, e.type) "
		// + "from Goal g, Exercise e where g.id = e.goal.id");
		TypedQuery<GoalReport> query = em
				.createNamedQuery(Goal.FIND_GOAL_REPORTS, GoalReport.class);
		return query.getResultList();
	}
}