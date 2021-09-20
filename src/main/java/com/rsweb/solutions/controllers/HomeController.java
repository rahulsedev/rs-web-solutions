package com.rsweb.solutions.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("message", "Welcome to Home !");
		return "home";
	}
	
	@GetMapping("/category")
	public String category(Model model) {
		model.addAttribute("message", "Welcome to Category !");
		return "category";
	}
	
	@GetMapping("/listing")
	public String listing(Model model) {
		model.addAttribute("message", "Welcome to Listing !");
		return "listing";
	}
	
	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("message", "Welcome to Contact !");
		return "contact";
	}
}
