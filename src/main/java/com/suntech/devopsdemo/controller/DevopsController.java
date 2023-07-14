package com.suntech.devopsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/service2")
public class DevopsController {

	@GetMapping("/checkIt")
	public String checking() {
		return "Devops Integration Project Is Working Fine";
	}

	@GetMapping("/testIt")
	public String testing() {
		return "Testing Is Fine";
	}

	@GetMapping("/message")
	public String devops() {
		return "Are You Enjoying Devops tools? everyone";
	}

	@GetMapping("/newTestingMethod")
	public String cicd() {
		return "CI/CD Working Properly";
	}

	@GetMapping("/testingDevops")
	public String devopsTesting() {
		return "Second Push Successful";
	}
	
	@GetMapping("/testingAgain")
	public String newTestMethod()
	{
		return "Successful Testing";
	}
	
	@GetMapping("/oneMore")
	public String oneMoreMethod()
	{
		return "Hello Testers";
	}

}
