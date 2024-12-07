package com.sharma.springbasic.springApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
	
	ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
	

}
