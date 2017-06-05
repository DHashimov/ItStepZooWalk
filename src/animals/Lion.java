package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Lion extends Animal {
	
	static Lion self;
	
	public static Lion getInstance(){
		if(self == null){
			self = new Lion("Leo", Type.PREDATOR, "Some Description", Place.OPEN_SPACE);
		}
		return self;
	}

	private Lion(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}

}
