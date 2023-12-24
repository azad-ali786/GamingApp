package com.azadali.learnjava.game;

public class GameRunner {
	MarioGame game;
	SuperContra scGame;

	public GameRunner(MarioGame game) {
		this.game = game;
	}
	
	public GameRunner(SuperContra scGame) {
		this.scGame = scGame;
	}
	
	public void run() {
		System.out.println("Running game: " + scGame);
		scGame.up();
		scGame.down();
		scGame.left();
		scGame.right();
	}

}
