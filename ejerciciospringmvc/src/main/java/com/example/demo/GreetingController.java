package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController{
	@RequestMapping("/greeting") 
	public String greeting(Model model) {
		model.addAttribute("name", "World");
		return "greeting_template";
	}

}
