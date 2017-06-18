package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class BeardAgama extends Animal {
static BeardAgama self;
	
	public static BeardAgama getInstance(){
		if(self == null){
			self = new BeardAgama("Deo", Type.PREDATOR, "lizard with a large head and a long tail", Place.OPEN_SPACE);
		}
		return self;
	}

	private BeardAgama(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
}
