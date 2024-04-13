package com.element.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView Welcome() {
		String msg ="Hi Welcome to Aurangabad";
		ModelAndView mav = new ModelAndView();
		mav.addObject("WelcomeMsg", msg);
		mav.setViewName("index");
		
		
		
		return mav;
	}

	
	@GetMapping("/greet")
	public String greet(Model model) {
		String msg ="hi Good Night All";
		model.addAttribute("WelcomeMsg", msg);
		
		
		
		return ("index");
	}

}
