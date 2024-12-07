package com.sharma.springbasic.looselycoupled;

/**
 * To make it loosely coupled we are taking the help of interface  Gamming Console which is implemented by both the Games -> mario and Contra 
 * 
 * And we made parent to hold reference to its child. 
 * */

public class GameRunner {
	
//	MarioGame mario;
//	
//	public GameRunner(MarioGame marioGame) {
//		
//		this.mario = marioGame;
//	
//	}
	
//	ContraGame contra;
//	public GameRunner(ContraGame cg)
//	{
//		this.contra = cg;
//	}
	
	GammingConsole game;
	
	GameRunner(GammingConsole g)
	{
		this.game = g;
		
	}
	
	public void run()
	{
		game.up();
		game.down();
		game.left();
		game.right();
		
	}
	
}
