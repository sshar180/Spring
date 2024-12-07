package com.sharma.springbasic.springDIExample;

public class ContraGame implements GammingConsole {
	
	ContraGame()
	{
		System.out.println("Running Contra Game");
		
	}
	
	public void up()
	{
		System.out.println(" ContraGame Up");
	}
	public void down()
	{
		System.out.println(" ContraGame Down");
	}
	public void right()
	{
		System.out.println(" ContraGame Right");
	}
	public void left()
	{
		System.out.println(" ContraGame Left");
	}

}
