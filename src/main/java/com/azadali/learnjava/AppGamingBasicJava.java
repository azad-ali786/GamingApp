package com.azadali.learnjava;

import com.azadali.learnjava.game.GameRunner;
import com.azadali.learnjava.game.MarioGame;
import com.azadali.learnjava.game.SuperContra;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var superContra = new SuperContra();
        var gameRunner = new GameRunner(superContra);
        gameRunner.run();
	}

}
