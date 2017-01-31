package com.rootbeer.myfirstgame.main;

import com.rootbeer.myfirstgame.game.Game;

public class GameContainer {
	
	public static GameContainer gameContainer;
	
	public Constants constants;
	public Game game;
	
	public static void main(String[] args) {
		gameContainer = new GameContainer(args);
	}
	
	private GameContainer(String[] args) {
		parseArgs(args);
		this.constants = new Constants();
		constants.setDevMode(false);
		
		game = new Game();
		game.startGame();
	}
	
	private void parseArgs(String[] args) {
		for (int i=0; i<args.length; i++) {
			switch (args[i]) {
				case "-devmode":
					constants.setDevMode(true);
					break;
			}
		}
	}

}
