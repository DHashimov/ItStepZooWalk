
package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Python extends Animal {
static Python self;
	
	public static Python getInstance(){
		if(self == null){
			self = new Python("Deo", Type.REPTILE, "Python, from the Greek word , is a genus of nonvenomous pythons[2] found in Africa and Asia. Until recently, seven extant species were recognised;[2] however, three subspecies have been promoted and a new species recognised. A member of this genus, P. reticulatus, is among the longest snake species and extant reptiles in the world.", Place.CLOSED_SPACE);
		}
		return self;
	}

	private Python(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
}