package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Dolphin extends Animal{

	static Dolphin self;	
	static final String DOLPHIN_DESCRIPTION = "Dolphins are a widely distributed and diverse group of aquatic mammals.";
	
	public static Dolphin getInstance(){
		if(self == null){
			self = new Dolphin("Dolpho The Dolphin ",Type.MAMMAL,DOLPHIN_DESCRIPTION,Place.WATER_SPACE);
		}
		
		return self;
		
	}
	
	private Dolphin(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}

}
