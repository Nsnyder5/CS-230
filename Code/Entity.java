package com.gamingroom;

public class Entity {
	private long id;
	private String name;
	
	/**
	 * Hide the default constructor.
	 */
	private Entity() {
	}
	
	/**
	 * Custom constructor with an identifier and name
	 */
	public Entity(long id, String name) {
		this();
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + "]";
	}
}
