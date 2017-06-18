package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Hamster extends Animal {
static Hamster self;
	
	public static Hamster getInstance(){
		if(self == null){
			self = new Hamster("Seo", Type.MAMMAL, "a solitary burrowing rodent", Place.COLSED_SPACE);
		}
		return self;
	}

	private Hamster(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
}