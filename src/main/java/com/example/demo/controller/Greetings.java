package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

	@GetMapping("/hello")
	public String greeting() {
		return "hello";
	}
}
