package com.gamingroom;

/**
 * Player class represents a player in the game.
 * Inherits id and name from the Entity superclass.
 *
 * Refactored by CB~
 */
public class Player extends Entity {

    /**
     * Constructs a Player with a unique ID and name.
     *
     * @param id    The unique identifier of the player
     * @param name  The name of the player
     */
    public Player(long id, String name) {
        super(id, name);
    }

    /**
     * Returns a string representation of the Player object.
     */
    @Override
    public String toString() {
        return "Player [id=" + getId() + ", name=" + getName() + "]";
    }
}
