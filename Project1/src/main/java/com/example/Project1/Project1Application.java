package com.example.Project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
		System.out.println("hello");
		System.out.println("Made changes in master");
		System.out.println("Pull");
		System.out.println("Pull in feature branch");
	}

}
