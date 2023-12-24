package com.azadali.learnjava;

import com.azadali.learnjava.game.GameRunner;
import com.azadali.learnjava.game.MarioGame;
import com.azadali.learnjava.game.PacMan;
import com.azadali.learnjava.game.SuperContra;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var marioGameRunner = new GameRunner(marioGame);
		marioGameRunner.run();
		var superContra = new SuperContra();
		var superContraRunner = new GameRunner(superContra);
		superContraRunner.run();
		var pacMan = new PacMan();
        var pacManRunner = new GameRunner(pacMan);
        pacManRunner.run();
	}

}
