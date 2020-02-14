package com.soonj.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping(value = "user")
public class UserController {
	
	@Value(value = "foo")
	private String foo;
	
	@GetMapping(value = "greeting")
	public String greeting() {
		return foo;
	}
}
