package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity {
	
	// A list of the active players
	private List<Player> players = new ArrayList<Player>();
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		super(id, name);
	}

	/**
	 * Add a new player using the Iterator pattern
	 * @param name the unique name of the player
	 * @return the player instance (new or existing)
	 */
	public Player addPlayer(String name) {
		Player player = null;

		// Use iterator to look for existing player with same name
		Iterator<Player> playersIterator = players.iterator();
		while (playersIterator.hasNext()) {
			Player existingPlayer = playersIterator.next();
			if (existingPlayer.getName().equalsIgnoreCase(name)) {
				return existingPlayer; // Return existing if found
			}
		}

		// If not found, make a new player instance and add to list
		if (player == null) {
			player = new Player(GameService.getInstance().getNextPlayerId(), name);
			players.add(player);
		}
		return player;
	}

	@Override
	public String toString() {
		return "Team [id=" + getId() + ", name=" + getName() + "]";
	}
}