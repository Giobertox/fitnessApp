package com.giobertox.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.giobertox.model.Exercise;
import com.giobertox.model.Goal;

@Controller
@SessionAttributes("goal")
public class MinutesController {

	@RequestMapping(value = "/addMinutes", method = RequestMethod.GET)
	public String addMinutes(Model model) {
		Exercise exercise = new Exercise();
		model.addAttribute("exercise", exercise);
		return "addMinutes";
	}

	@RequestMapping(value = "/addMinutes", method = RequestMethod.POST)
	public String addMinutes(Model model,
			@Valid @ModelAttribute("exercise") Exercise exercise,
			BindingResult result) {
		System.out.println("exercise : " + exercise.getMinutes());
		if (!result.hasErrors()) {
			Goal goal = (Goal) model.asMap().get("goal");
			int remainingMins = (goal.getMinutes() - exercise.getMinutes());
			goal.setMinutes(remainingMins);
			model.addAttribute("goal", goal);
		}
		return "addMinutes";
	}

}
