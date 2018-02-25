package com.example.cloudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.example.cloudDemo"})
public class FirstCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstCloudApplication.class, args);
	}
}
