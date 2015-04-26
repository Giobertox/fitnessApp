package com.giobertox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giobertox.model.Activity;
import com.giobertox.repository.ActivitiesRepository;

@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	ActivitiesRepository activitiesRepository;

	public void setActivitiesRepository(ActivitiesRepository activitiesRepository) {
		this.activitiesRepository = activitiesRepository;
	}

	@Override
	public List<Activity> findAllActivities() {
		return activitiesRepository.findAllActivities();
	}

	@Override
	public Activity getActivity(Long activityId) {
		return activitiesRepository.getActivity(activityId);
	}

}
