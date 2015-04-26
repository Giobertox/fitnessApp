package com.giobertox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.giobertox.model.Activity;
import com.giobertox.service.ActivityService;

@RestController
@RequestMapping("/rest/")
public class ActivityController {

	@Autowired
	ActivityService activityService;

	@RequestMapping(value = "activities/", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Activity> findAllActivities() {
		List<Activity> activities = activityService.findAllActivities();
		return activities;
	}

}
