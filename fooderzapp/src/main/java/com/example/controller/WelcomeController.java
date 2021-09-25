package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/welcome")
	public String welcome() {
		return " hi welcome to the fooderz app where you can order any food item with"
				+ " low cost and we can assure you good quality assurance as well ";
	}
	
}
