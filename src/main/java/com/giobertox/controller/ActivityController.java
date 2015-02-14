package com.giobertox.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.giobertox.model.Activity;

@RestController
public class ActivityController {

	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	// , produces = "application/json")
	public @ResponseBody List<Activity> findAllActivities() {
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
