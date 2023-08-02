package com.GameApp.GameApplication;

import org.springframework.context.annotation.Bean;

import com.GameApp.GameApplication.game.GameRunner;
import com.GameApp.GameApplication.game.GamingConsole;
import com.GameApp.GameApplication.game.MarioGame;
import com.GameApp.GameApplication.game.PacManGame;
import com.GameApp.GameApplication.game.SuperContraGame;

public class GameAppSpringConfig {

	@Bean
	public GamingConsole game() {
		return mario();
	}

	@Bean
	public GameRunner runner(GamingConsole game) {
		return new GameRunner(game);
	}
	@Bean
	public MarioGame mario() {
		return new MarioGame();
	}
	@Bean
	public SuperContraGame supercontra() {
		return new SuperContraGame();
	}
	@Bean
	public PacManGame pacman() {
		return new PacManGame();
	}
}
