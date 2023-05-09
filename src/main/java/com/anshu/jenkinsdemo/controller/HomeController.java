package com.anshu.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home1")
	public String getName1()
	{
		return "PRIYANSHU";
	}
	@GetMapping("/home2")
	public String getName2()
	{
		return "PRIYANSHU ANAND";
	}
}
