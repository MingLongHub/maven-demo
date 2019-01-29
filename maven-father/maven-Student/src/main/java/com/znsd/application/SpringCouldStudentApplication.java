package com.znsd.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class SpringCouldStudentApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCouldStudentApplication.class, args);
	}

}
