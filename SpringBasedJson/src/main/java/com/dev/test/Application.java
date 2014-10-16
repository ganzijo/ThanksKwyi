package com.dev.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @Configuration : tags the class as a source of bean definitions for the
// application context.
@ComponentScan(basePackages = { "com.dev.test" })
// @ComponentScan : tells Spring to look for other components, configurations,
// and services in the the hello package, allowing it to find the
// HelloController.
@EnableAutoConfiguration
// @EnableAutoConfiguration : tells Spring Boot to start adding beans based on
// classpath settings, other beans, and various property settings.
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
