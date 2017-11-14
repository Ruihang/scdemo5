package com.ruix.scdemo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Scdemo5Application {
	public static void main(String[] args) {
		SpringApplication.run(Scdemo5Application.class, args);
	}
}
