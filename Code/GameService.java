package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A singleton service for the game engine
 * * PURPOSE OF SINGLETON PATTERN:
 * In the context of this application, the Singleton pattern ensures that only one 
 * instance of the GameService exists in memory at any time. This is critical for 
 * maintaining a single, centralized list of active games and ensuring that the 
 * 'nextGameId' counter remains consistent across the entire system. Without a 
 * singleton, multiple service instances could be created, leading to data 
 * synchronization issues and duplicate game IDs or names.
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next identifiers
	 */
	private static long nextGameId = 1;
	private static long nextPlayerId = 1;
	private static long nextTeamId = 1;

	// Private static instance of the class for the Singleton pattern
	private static GameService instance;

	// Private constructor to prevent direct instantiation from outside the class
	private GameService() {
	}

	/**
	 * Public static method to get the single instance of the class
	 * @return the single GameService instance
	 */
	public static GameService getInstance() {
		if (instance == null) {
			instance = new GameService();
		}
		return instance;
	}

	/**
	 * Construct a new game instance
	 * * PURPOSE OF ITERATOR PATTERN:
	 * The Iterator pattern is used here to safely and efficiently navigate the 
	 * 'games' list to check for existing game instances. By using an iterator 
	 * instead of a traditional for-loop, we abstract the traversal logic from 
	 * the underlying collection type. In this application, it allows us to 
	 * verify if a game name already exists before adding a new one, satisfying 
	 * the business requirement to prevent duplicate game entries.
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with same name
		Iterator<Game> gamesIterator = games.iterator();
		
		while (gamesIterator.hasNext()) {
			Game existingGame = gamesIterator.next();
			
			// if found, simply return the existing instance
			if (existingGame.getName().equalsIgnoreCase(name)) {
				return existingGame;
			}
		}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * <p>
	 * Scope is package/local for testing purposes.
	 * </p>
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}
	
	/**
	 * Returns the game instance with the specified id.
	 * * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with same id
		Iterator<Game> gamesIterator = games.iterator();
		
		while (gamesIterator.hasNext()) {
			Game existingGame = gamesIterator.next();
			
			// if found, simply assign that instance to the local variable
			if (existingGame.getId() == id) {
				game = existingGame;
				break;
			}
		}

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;

		// Use iterator to look for existing game with same name
		Iterator<Game> gamesIterator = games.iterator();
		
		while (gamesIterator.hasNext()) {
			Game existingGame = gamesIterator.next();
			
			// if found, simply assign that instance to the local variable
			if (existingGame.getName().equalsIgnoreCase(name)) {
				game = existingGame;
				break;
			}
		}

		return game;
	}

	/**
	 * Returns the number of games currently active
	 * * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}

	/**
	 * Returns the next player ID
	 * * @return the next player ID
	 */
	public long getNextPlayerId() {
		return nextPlayerId++;
	}

	/**
	 * Returns the next team ID
	 * * @return the next team ID
	 */
	public long getNextTeamId() {
		return nextTeamId++;
	}
}