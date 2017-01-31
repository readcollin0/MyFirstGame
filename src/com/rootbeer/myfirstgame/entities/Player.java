package com.rootbeer.myfirstgame.entities;

import com.rootbeer.myfirstgame.util.Location;

public class Player {
	
	private Location location;
	
	public Player(Location loc) {
		location = loc;
	}
	
	public Location getLocation() {
		return location;
	}
	
}
