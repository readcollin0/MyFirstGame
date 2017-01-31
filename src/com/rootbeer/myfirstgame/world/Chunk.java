package com.rootbeer.myfirstgame.world;

public class Chunk {
	
	private WorldLocationType[][] locations;
	
	public Chunk() {
		locations = new WorldLocationType[16][16];
		generateLocations();
	}
	
	private void generateLocations() {
		for (int x=0; x<16; x++) {
			for (int y=0; y<16; y++) {
				locations[x][y] = WorldLocationType.getNewWorldLocation();
			}
		}
	}
	
	public WorldLocationType getLocation(byte x, byte y) {
		return locations[x][y];
	}
	
	public void setLocation(byte x, byte y, WorldLocationType newLoc) {
		locations[x][y] = newLoc;
	}
	
}
