package com.rootbeer.myfirstgame.world;

public class Chunk {
	
	private WorldLocation[][] locations;
	
	public Chunk() {
		locations = new WorldLocation[16][16];
		generateLocations();
	}
	
	private void generateLocations() {
		for (int x=0; x<16; x++) {
			for (int y=0; y<16; y++) {
				locations[x][y] = new WorldLocation();
			}
		}
	}
	
	public WorldLocation getLocation(byte x, byte y) throws Exception {
		return locations[x][y];
	}
	
	public void setLocation(byte x, byte y, WorldLocation newLoc) {
		locations[x][y] = newLoc;
	}
	
}
