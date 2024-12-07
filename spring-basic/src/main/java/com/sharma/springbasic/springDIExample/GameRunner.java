package com.sharma.springbasic.springDIExample;

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
