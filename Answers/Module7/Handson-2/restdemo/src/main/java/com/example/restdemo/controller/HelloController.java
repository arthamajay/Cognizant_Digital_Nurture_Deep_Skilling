package com.example.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restdemo.services.HelloService;

@RestController
public class HelloController {

	private final HelloService service;

	HelloController(HelloService service) {
		this.service = service;
	}

	@GetMapping("/hello")
	public String getHello() {
		return service.get();
	}
}
