package com.example.amdocs2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Amdocs2Application {
	
	@GetMapping("/msg")
	public String show() {
		return "This is vishal";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Amdocs2Application.class, args);
	}

}
