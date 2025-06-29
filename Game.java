package com.gamingroom;

/**
 * Game class represents a game entity with a unique ID and name.
 * Now extends the base Entity class for reusability and cleaner code.
 *
 * Refactored by CB~
 */
public class Game extends Entity {

    /**
     * Private constructor to prevent empty instance creation.
     */
    private Game() {
        super(0, null); // Placeholder; not used
    }

    /**
     * Constructs a Game with a unique ID and name.
     *
     * @param id    The unique identifier of the game
     * @param name  The name of the game
     */
    public Game(long id, String name) {
        super(id, name);
    }

    /**
     * Returns a string representation of the Game object.
     */
    @Override
    public String toString() {
        return "Game [id=" + getId() + ", name=" + getName() + "]";
    }
}

