package com.giobertox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.giobertox.model.Goal;
import com.giobertox.service.GoalService;

@RestController
@RequestMapping("/rest/")
public class GoalRestController {

	// @TODO It does not work !!

	@Autowired
	GoalService goalService;

	@RequestMapping(value = "goals/", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Goal> getGoals() {
		List<Goal> goals = goalService.findAllGoals();
		return goals;
	}

}
