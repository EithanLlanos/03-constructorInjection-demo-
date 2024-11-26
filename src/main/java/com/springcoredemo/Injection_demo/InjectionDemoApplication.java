package com.springcoredemo.Injection_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//	@SpringBootApplication(
//			scanBasePackages = {"com.springcoredemo.injection_demo",
//								"com.springcoredemo.util"})

	@SpringBootApplication
public class InjectionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InjectionDemoApplication.class, args);
	}


}
