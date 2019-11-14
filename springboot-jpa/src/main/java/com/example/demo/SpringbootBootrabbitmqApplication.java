package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.test.JpaTestDemo;

@SpringBootApplication
public class SpringbootBootrabbitmqApplication {
	
	Log log = LogFactory.getLog(SpringbootBootrabbitmqApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootBootrabbitmqApplication.class, args);
	
	}

}
