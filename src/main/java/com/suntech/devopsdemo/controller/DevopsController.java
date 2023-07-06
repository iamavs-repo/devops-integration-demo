package com.suntech.devopsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
		return "Are You Enjoying Devops tools?";
	}

	@GetMapping("/newTestingMethod")
	public String cicd() {
		return "CI/CD Working Properly";
	}

	@GetMapping("/testingDevops")
	public String devopsTesting() {
		return "Second Push Successful";
	}

}
