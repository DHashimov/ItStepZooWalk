package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Hippopotamus extends Animal {
	
	static Hippopotamus self;	
	static final String HIPPOPOTAMUS_DESCRIPTION = "The hippopotamus is a large mostly herbivorous mammal.The name comes from the ancient Greek for \"river horse \".A clear membrane that covers their eyes allows hippos to see underwater. They can also close their nostrils and hold their breath underwater for as long as five minutes. ";
	
	public static Hippopotamus getInstance(){
		if(self == null){
			self = new Hippopotamus("Hippy",Type.MAMMAL,HIPPOPOTAMUS_DESCRIPTION,Place.WATER_SPACE);
		}
		
		return self;
		
	}
	
	private Hippopotamus(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}

		

}
