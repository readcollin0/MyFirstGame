package com.rootbeer.myfirstgame.world;

import java.util.HashMap;

import com.rootbeer.myfirstgame.util.Location;

public class GameWorld {
	
	private HashMap<Location,Chunk> chunks;
	
	public GameWorld() {
		chunks.put(new Location(0,0), new Chunk());
	}
	
	public WorldLocationType getGameWorldLocation(long x, long y) {
		long chunkX = Math.floorDiv(x, 16);
		long chunkY = Math.floorDiv(y, 16);
		
		long locX = Math.floorMod(x, 16);
		long locY = Math.floorMod(y, 16);
		
		Location chunkLoc = new Location(chunkX, chunkY);
		if (!chunks.containsKey(chunkLoc)) chunks.put(chunkLoc, new Chunk()); // Generates a new chunk if the chunk does not exist
		
		return chunks.get(chunkLoc).getLocation((byte) locX, (byte) locY);
	}
}
