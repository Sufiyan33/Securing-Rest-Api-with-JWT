package com.sufiyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SwiggyServiceResgisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiggyServiceResgisteryApplication.class, args);
	}

}
