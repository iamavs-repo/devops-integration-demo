package com.suntech.devopsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {
	
	@GetMapping("/checkIt")
	public String checking()
	{
		return "Devops Integration Project Is Working Fine";
	}
	
	@GetMapping("/testIt")
	public String testing()
	{
		return "Testing Is Fine";
	}

}
