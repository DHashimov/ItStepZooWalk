package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class BeardAgama extends Animal {
static BeardAgama self;
	
	public static BeardAgama getInstance(){
		if(self == null){
			self = new BeardAgama("Deo", Type.REPTILE, "Pogona vitticeps, the central (or inland) bearded dragon, is a species of agamid lizard occurring in a wide range of arid to semiarid regions of Australia. This species is very popularly kept as a pet and exhibited in zoos.", Place.CLOSED_SPACE);
		}
		return self;
	}

	private BeardAgama(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
}
