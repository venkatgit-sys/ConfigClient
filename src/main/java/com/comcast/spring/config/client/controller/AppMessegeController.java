package com.comcast.spring.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
@RequestMapping("/app")
public class AppMessegeController {
	
	@Value("${message: default messege}")
	private String messge;
	
	@GetMapping("/messeage")
	public String message() {
		
		return messge;
	}
}
