package com.giobertox.repository;

import java.util.ArrayList;
import java.util.List;

import com.giobertox.model.Activity;

public class ActivitiesRepositoryImpl implements ActivitiesRepository {

	private List<Activity> activities = new ArrayList<Activity>();

	public ActivitiesRepositoryImpl() {
		super();
		Activity run = new Activity(1L, "run");
		activities.add(run);
		Activity bike = new Activity(2L, "bike");
		activities.add(bike);
		Activity swim = new Activity(3L, "swim");
		activities.add(swim);
	}

	@Override
	public List<Activity> findAllActivities() {
		return activities;
	}

	@Override
	public Activity getActivity(Long activityId) {
		for (Activity activity : activities) {
			if (activity.getId() == activityId) {
				return activity;
			}
		}
		return null;
	}
}
