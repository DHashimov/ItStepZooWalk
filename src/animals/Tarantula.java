package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Tarantula extends Animal {
static Tarantula self;
	
	public static Tarantula getInstance(){
		if(self == null){
			self = new Tarantula("Seo", Type.REPTILE, "a large hairy spider", Place.COLSED_SPACE);
		}
		return self;
	}

	private Tarantula(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
}