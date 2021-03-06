package com.giobertox.service;

import java.util.List;

import com.giobertox.model.Activity;

public interface ActivityService {

	List<Activity> findAllActivities();

	Activity getActivity(Long activityId);

}
