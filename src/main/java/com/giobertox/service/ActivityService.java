package com.giobertox.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.giobertox.model.Activity;

@Service
public class ActivityService {

	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();

		Activity run = new Activity(1, "run");
		activities.add(run);

		Activity bike = new Activity(2, "bike");
		activities.add(bike);

		Activity swim = new Activity(3, "swim");
		activities.add(swim);
		return activities;
	}
}
