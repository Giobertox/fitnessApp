package com.giobertox.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.giobertox.model.Goal;
import com.giobertox.service.GoalService;

@Controller
@SessionAttributes("goal")
public class GoalController {

	@Autowired
	private GoalService goalService;

	@RequestMapping(value = "addGoal", method = RequestMethod.GET)
	public String addGoal(Model model) {
		model.addAttribute("goal", new Goal());
		return "addGoal";
	}

	@RequestMapping(value = "addGoal", method = RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result) {
		System.out.println("result has errors: " + result.hasErrors());
		if (result.hasErrors()) {
			return "addGoal";
		} else {
			System.out.println("Goal set to minutes:" + goal.getMinutes());
			goal = goalService.save(goal);
		}
		return "redirect:addMinutes.html";
	}
}
