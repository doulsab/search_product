package com.dd.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SearchProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchProductApplication.class, args);
		System.out.println("Im in Main Method");
	}

}
