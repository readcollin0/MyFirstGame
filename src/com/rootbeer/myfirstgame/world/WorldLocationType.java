package com.rootbeer.myfirstgame.world;

import java.util.ArrayList;

import com.rootbeer.myfirstgame.entities.Player;

public interface WorldLocationType {
	
	public abstract void enter(Player player);
	public abstract void exit(Player player);
	public abstract WorldLocationType getNewLocation();
	
	public static final ArrayList<WorldLocationType> locationTypes = new ArrayList<WorldLocationType>();
	
	public static WorldLocationType getNewWorldLocation() {
		return locationTypes.get((int) Math.floor(Math.random() * locationTypes.size())).getNewLocation();
	}
	
	public static void addLocation(WorldLocationType locationType) {
		locationTypes.add(locationType);
	}
	
}
