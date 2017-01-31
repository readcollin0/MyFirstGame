package com.rootbeer.myfirstgame.game;

import com.rootbeer.myfirstgame.entities.Player;
import com.rootbeer.myfirstgame.util.Location;
import com.rootbeer.myfirstgame.world.GameWorld;

public class Game {
	
	public Player player;
	public GameWorld world;
	
	public Game() {
		this.player = new Player(new Location(0, 0));
		this.world = new GameWorld();
	}
	
	public void startGame() {
		
	}
	
}
