package com.demodocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/prac")
public class DemoDockerController {
	
	@GetMapping("/get")
	
	public String getPractice() {
		return "Hellow world";
		
	}
	

}
