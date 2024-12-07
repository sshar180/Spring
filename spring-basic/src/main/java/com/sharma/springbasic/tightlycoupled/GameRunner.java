package com.sharma.springbasic.tightlycoupled;

public class GameRunner {
	
	/*
	 * Tightly Coupled to Mario game
	 * */
	
//	MarioGame mario;
//	
//	public GameRunner(MarioGame marioGame) {
//		
//		this.mario = marioGame;
//	
//	}
	
/*
 * Tightly Coupled to Contra game  
 * */
	
	ContraGame contra;
	public GameRunner(ContraGame cg)
	{
		this.contra = cg;
	}
	
	public void run()
	{
		contra.up();
	}
	
}
