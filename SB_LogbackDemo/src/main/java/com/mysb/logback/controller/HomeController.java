package com.mysb.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/home")
	String home(){
		
		for(int i=0; i<=10; i++){
			System.out.println(i);
			logger.info("for loop :: home :: "+i);
		}
		return "hello";
	}
}
