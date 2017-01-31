package com.rootbeer.myfirstgame.world.location_types;

import com.rootbeer.myfirstgame.entities.Player;
import com.rootbeer.myfirstgame.world.WorldLocationType;

public class StartingArea implements WorldLocationType {

	public StartingArea() {
		
	}
	
	@Override
	public void enter(Player player) {
		
	}

	@Override
	public void exit(Player player) {
		
	}

	@Override
	public WorldLocationType getNewLocation() {
		return new StartingArea();
	}
	
}
