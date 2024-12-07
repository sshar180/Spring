package com.sharma.springbasic.looselycoupled;

public class MarioGame implements GammingConsole{
	
	MarioGame()
	{
		System.out.println("Running Mario Game");
		
	}
	
	public void up()
	{
		System.out.println(" MarioGame Up");
	}
	public void down()
	{
		System.out.println(" MarioGame Down");
	}
	public void right()
	{
		System.out.println(" MarioGame Right");
	}
	public void left()
	{
		System.out.println(" MarioGame Left");
	}

}
