package com.giobertox.repository;

import java.util.List;

import com.giobertox.model.Activity;

public interface ActivitiesRepository {

	List<Activity> findAllActivities();

	Activity getActivity(Long activityId);

}
