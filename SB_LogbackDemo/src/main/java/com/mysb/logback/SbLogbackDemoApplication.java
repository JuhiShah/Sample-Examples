package com.mysb.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbLogbackDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbLogbackDemoApplication.class, args);
		Logger logger = LoggerFactory.getLogger(SbLogbackDemoApplication.class);
		logger.info("log starts :: from main");
		
		for(int i=0; i<=10; i++){
			System.out.println(i);
			logger.info("for loop :: main :: "+i);
		}
		
	}
}
