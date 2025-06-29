package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * GameService manages the creation and retrieval of Game instances.
 * Implements Singleton and Iterator design patterns.
 *
 * Refactored and documented by CB~
 */
public class GameService {

    // List of all active game instances
    private static List<Game> games = new ArrayList<>();

    // Tracks the next game ID to assign
    private static long nextGameId = 1;

    // Singleton instance
    private static GameService instance = null;

    /**
     * Private constructor to enforce Singleton pattern.
     */
    private GameService() {}

    /**
     * Provides global access to the single GameService instance.
     *
     * @return the singleton instance
     */
    public static GameService getInstance() {
        if (instance == null) {
            instance = new GameService();
        }
        return instance;
    }

    /**
     * Adds a new Game if no duplicate name exists.
     * Uses the Iterator pattern to check for name uniqueness.
     *
     * @param name the desired game name
     * @return the new or existing Game instance
     */
    public Game addGame(String name) {
        for (Game existingGame : games) {
            if (existingGame.getName().equalsIgnoreCase(name)) {
                return existingGame;
            }
        }

        Game game = new Game(nextGameId++, name);
        games.add(game);
        return game;
    }

    /**
     * Returns a Game by index (package-local for testing).
     *
     * @param index position in list
     * @return Game instance at index
     */
    Game getGame(int index) {
        return games.get(index);
    }

    /**
     * Returns a Game by ID using the Iterator pattern.
     *
     * @param id game ID
     * @return matching Game or null
     */
    public Game getGame(long id) {
        for (Game existingGame : games) {
            if (existingGame.getId() == id) {
                return existingGame;
            }
        }
        return null;
    }

    /**
     * Returns a Game by name using the Iterator pattern.
     *
     * @param name game name
     * @return matching Game or null
     */
    public Game getGame(String name) {
        for (Game existingGame : games) {
            if (existingGame.getName().equalsIgnoreCase(name)) {
                return existingGame;
            }
        }
        return null;
    }

    /**
     * Returns the total number of active games.
     *
     * @return game count
     */
    public int getGameCount() {
        return games.size();
    }
}
