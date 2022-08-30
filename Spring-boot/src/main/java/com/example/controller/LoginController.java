package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LoginController {
	@GetMapping("/")
	public String homePage() {
		return "login.html";
	}
	@GetMapping("/")
	public String createPage() {
		return "create.html";
	}
	@GetMapping("/")
	public String createPage1() {
		return "create1.html";
	}
}
