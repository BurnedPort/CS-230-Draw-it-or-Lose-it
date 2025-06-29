package com.gamingroom;

/**
 * Team class represents a team in the game.
 * Inherits id and name from the Entity superclass.
 *
 * Refactored by CB~
 */
public class Team extends Entity {

    /**
     * Constructs a Team with a unique ID and name.
     *
     * @param id    The unique identifier of the team
     * @param name  The name of the team
     */
    public Team(long id, String name) {
        super(id, name);
    }

    /**
     * Returns a string representation of the Team object.
     */
    @Override
    public String toString() {
        return "Team [id=" + getId() + ", name=" + getName() + "]";
    }
}

