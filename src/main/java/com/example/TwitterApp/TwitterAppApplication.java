package com.example.TwitterApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TwitterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterAppApplication.class, args);
		System.out.println("ok");

	}

	@GetMapping("/hello")
	public String hello(){
		return "Hello world";
	}

}
