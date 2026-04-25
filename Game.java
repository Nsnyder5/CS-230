package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 * * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * * @author coce@snhu.edu
 *
 */
public class Game extends Entity {
	
	// A list of the active teams
	private List<Team> teams = new ArrayList<Team>();
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private Game() {
		super(0, "Default");
	}

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		super(id, name);
	}

	/**
	 * Add a new team using the Iterator pattern
	 * @param name the unique name of the team
	 * @return the team instance (new or existing)
	 */
	public Team addTeam(String name) {
		Team team = null;

		// Use iterator to look for existing team with same name
		Iterator<Team> teamsIterator = teams.iterator();
		while (teamsIterator.hasNext()) {
			Team existingTeam = teamsIterator.next();
			if (existingTeam.getName().equalsIgnoreCase(name)) {
				return existingTeam; // Return existing if found
			}
		}

		// If not found, make a new team instance and add to list
		if (team == null) {
			team = new Team(GameService.getInstance().getNextTeamId(), name);
			teams.add(team);
		}
		return team;
	}

	@Override
	public String toString() {
		return "Game [id=" + getId() + ", name=" + getName() + "]";
	}
}