package com.giobertox.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.giobertox.model.Exercise;
import com.giobertox.model.Goal;
import com.giobertox.service.ExerciseService;

@Controller
// @SessionAttributes("exercise")
public class MinutesController {

	@Autowired
	private ExerciseService exerciseService;

	@RequestMapping(value = "/addMinutes", method = RequestMethod.GET)
	public String addMinutes(Model model) { // @ModelAttribute("exercise")
		// Exercise exercise) {
		Exercise exercise = new Exercise();
		model.addAttribute("exercise", exercise);
		return "addMinutes";
	}

	@RequestMapping(value = "/addMinutes", method = RequestMethod.POST)
	public String addMinutes(Model model, @Valid @ModelAttribute("exercise") Exercise exercise,
			BindingResult result, HttpSession session) {
		System.out.println("result.hasErrors(): " + result.hasErrors());
		if (!result.hasErrors()) {
			System.out.println("exercise min: " + exercise.getMinutes());
			System.out.println("exercise type: " + exercise.getType());
			Goal goal = (Goal) session.getAttribute("goal");
			// Goal goal = (Goal) model.asMap().get("goal");
			exercise.setGoal(goal);
			exerciseService.save(exercise);
			// int remainingMins = (goal.getMinutes() - exercise.getMinutes());
			// goal.setMinutes(remainingMins);
			// model.addAttribute("remainingMinutes",
			// exerciseService.getRemainigMinutes(goal));
		}
		return "addMinutes";
	}
}
