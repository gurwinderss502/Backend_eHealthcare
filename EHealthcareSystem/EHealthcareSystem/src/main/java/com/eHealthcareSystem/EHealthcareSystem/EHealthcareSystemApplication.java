package com.eHealthcareSystem.EHealthcareSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude=SecurityAutoConfiguration.class)
public class EHealthcareSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EHealthcareSystemApplication.class, args);
	}

}
