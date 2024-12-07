package com.sharma.springbasic.tightlycoupled;

public class GameMain {

	public static void main(String[] args) {
		
		
//		GameRunner game  = new GameRunner(new MarioGame());
		
		GameRunner game  = new GameRunner(new ContraGame());
		
		game.run();
	}

}
