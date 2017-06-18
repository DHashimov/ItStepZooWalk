package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Otter extends Animal {
	static Otter self;
	static final String OTTER_DESCRIPTION = "Otters spend much of their lives in the water and can dive up to 330 feet when foraging for food.Sea otters are a keystone species, meaning their role in their environment has a greater effect than other species.  ";
	
	public static Otter getInstance(){
		if(self == null){
			self = new Otter("Otto", Type.MAMMAL, OTTER_DESCRIPTION, Place.WATER_SPACE);
		}
		return self;
	}
	
private Otter(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}

}
