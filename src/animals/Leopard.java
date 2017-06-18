package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Leopard extends Animal {
static Leopard self;
	
	public static Leopard getInstance(){
		if(self == null){
			self = new Leopard("Seo", Type.PREDATOR, "a solitary burrowing rodent", Place.OPEN_SPACE);
		}
		return self;
	}

	private Leopard(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
}