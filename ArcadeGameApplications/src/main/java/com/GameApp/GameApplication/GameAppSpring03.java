package com.GameApp.GameApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.GameApp.GameApplication.game.GameRunner;

public class GameAppSpring03 {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GameAppSpringConfig.class)){
			
			context.getBean(GameRunner.class).run();
		}
	}

}
