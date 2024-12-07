package com.sharma.springbasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBasicApplication implements CommandLineRunner {
	
	@Autowired
	ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception
	{
		
		System.out.println(context.getBean("TestBean"));
	}
	
	@Bean
	TestBean getTestBean()
	{
		return new TestBean("Shubham", "SDE at Copart");
	}


}
