package com.ala.springdaikichipathvariables;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"controllers"})
public class DaikichiPathVariablesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiPathVariablesApplication.class, args);
	}

}
