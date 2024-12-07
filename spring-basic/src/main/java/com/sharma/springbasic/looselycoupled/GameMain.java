package com.sharma.springbasic.looselycoupled;

public class GameMain {

	public static void main(String[] args) {
		
		
		GameRunner g1  = new GameRunner(new MarioGame()); // Object creating + Wiring of dependencies  	
		
		GameRunner g2  = new GameRunner(new ContraGame()); //Object creating + Wiring of dependencies  
		
		g1.run();
		g2.run();
		
	}

}
