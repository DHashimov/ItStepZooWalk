package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Leopard extends Animal {
static Leopard self;
	
	public static Leopard getInstance(){
		if(self == null){
			self = new Leopard("Seo", Type.MAMMAL, "The leopard (Panthera pardus) is one of the five \"big cats\" in the genus Panthera. It is a member of the family Felidae with a wide range in sub-Saharan Africa and parts of Asia.[2] Fossil records suggest that in the Late Pleistocene it occurred in Europe and Japan.Compared to other members of Felidae, the leopard has relatively short legs and a long body with a large skull.", Place.COLSED_SPACE);
		}
		return self;
	}

	private Leopard(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
}