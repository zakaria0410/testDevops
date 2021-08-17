package com.application.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin("*")
public class TestDevopsApplication {
@GetMapping("/")
public String sayHello() {
	return "hello guys!"; 
}
	public static void main(String[] args) {
		SpringApplication.run(TestDevopsApplication.class, args);
	}

}
