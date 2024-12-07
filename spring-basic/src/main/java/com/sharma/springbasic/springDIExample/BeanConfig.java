package com.sharma.springbasic.springDIExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	public int integerVal()
	{
		return 4;
	}
	
	@Bean
	public String getName()
	{
		return "Shu Sharma";
	}
	
	@Bean
	public ContraGame getContra()
	{
		return new ContraGame();
	}
	
	@Bean
	public MarioGame getMario()
	{
		return new MarioGame();
	}
	
	@Bean
	public GammingConsole game()
	{
		return new MarioGame();
		
	}
	
	@Bean
	public GameRunner getGameRunner(GammingConsole gm)
	{
		return new GameRunner(gm);
		
	}
	

}
