package com.sharma.springbasic.springApp;

import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {}
record Address(String address, String postalCode) {}

@Configuration
public class BeanConfig {
	
	

}
