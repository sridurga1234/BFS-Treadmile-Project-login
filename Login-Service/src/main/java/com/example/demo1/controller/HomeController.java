package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String homepage() {
		return "1sthomepage";
	}
	
	@GetMapping("/login")
	public String afterLogin() {
		return "dashboardPage";
	}
	}
