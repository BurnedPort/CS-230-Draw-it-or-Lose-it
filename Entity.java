package com.gamingroom;

/**
 * Base class to hold common attributes and behavior
 * for all entities in the game application.
 *
 * Created by CB~
 */
public class Entity {

    // Unique identifier for the entity
    private long id;

    // Name of the entity
    private String name;

    /**
     * Constructor to initialize Entity with an id and name.
     *
     * @param id   Unique identifier
     * @param name Name of the entity
     */
    public Entity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Get the entity's id.
     *
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     * Get the entity's name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Return a string representation of the entity.
     *
     * @return formatted string
     */
    @Override
    public String toString() {
        return String.format("%s [id=%d, name=%s]", this.getClass().getSimpleName(), id, name);
    }
}
