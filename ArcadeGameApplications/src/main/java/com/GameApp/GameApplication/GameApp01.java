package com.GameApp.GameApplication;

import com.GameApp.GameApplication.game.GameRunner;
import com.GameApp.GameApplication.game.MarioGame;
import com.GameApp.GameApplication.game.PacManGame;

public class GameApp01 {

	public static void main(String[] args) {

//	var game = new MarioGame();
//	var game = new MarioGame();
	var game = new PacManGame();
	var gameRunner = new GameRunner (game);
	gameRunner.run();

	}

}
