package com.infinity.employeeapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employeeapp")
public class EmployeeController {

	@GetMapping("/home")
	public String home() {
		return "Welcome to Employee App";
	}
}
