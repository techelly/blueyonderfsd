package com.blueyonder.helloworldservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greet")
public class HelloWorldController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
}
