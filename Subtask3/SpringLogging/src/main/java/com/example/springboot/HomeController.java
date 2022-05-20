package com.example.springboot;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/hello")
	public String hello() {
		
		logger.trace("FATAL ERROR");
		return "Hello Daily Code Buffer!!";
	}
}
