package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Cheetah extends Animal {
	
	static Cheetah self;
	
	public static Cheetah getInstance(){
		if(self == null){
			self = new Cheetah("Teo", Type.MAMMAL, "a large spotted cat", Place.COLSED_SPACE);
		}
		return self;
	}

	private Cheetah(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
}
