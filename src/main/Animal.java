package main;

import enums.Place;
import enums.Type;

public abstract class Animal {
    
	public String name;
	public Type type;
	public String description;
	public Place place;
	
	public Animal(String name, Type type, String description, Place place) {
		super();
		this.name = name;
		this.type = type;
		this.description = description;
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	public Place getPlace() {
		return place;
	}
	
	public String getTypeDescription()
	{
		return type.getDescription();
	}

}
