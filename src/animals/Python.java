
package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Python extends Animal {
static Python self;
	
	public static Python getInstance(){
		if(self == null){
			self = new Python("Deo", Type.REPTILE, "Some Description", Place.COLSED_SPACE);
		}
		return self;
	}

	private Python(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
}