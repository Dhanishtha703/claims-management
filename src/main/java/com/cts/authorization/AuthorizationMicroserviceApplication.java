package com.cts.authorization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthorizationMicroserviceApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthorizationMicroserviceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationMicroserviceApplication.class, args);
		
		LOGGER.info("starting the authorization microservice");
	}

}
