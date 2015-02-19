package com.giobertox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.giobertox.model.Activity;
import com.giobertox.service.ActivityService;

@RestController
@RequestMapping("/rest/activities/")
public class ActivityController {

	@Autowired
	ActivityService activityService;

	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
	// (value = "/rest/activities/")
	// public List<Activity> findAllActivities(@RequestParam(value="name",
	// defaultValue="World") String name)
	public List<Activity> findAllActivities() {
		List<Activity> activities = activityService.findAllActivities();

		return activities;
	}

}
