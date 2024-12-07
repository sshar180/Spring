package com.sharma.springbasic.springDIExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameMain {

	public static void main(String[] args) {
		
		// 1) Launch a spring context 
		// 2) Configure the things that we want spring to manage -@configuration 
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		
		
//		GameRunner g1  = new GameRunner(new MarioGame());
//		
//		GameRunner g2  = new GameRunner(new ContraGame());
//		
//		g1.run();
//		g2.run();
		
	}

}
