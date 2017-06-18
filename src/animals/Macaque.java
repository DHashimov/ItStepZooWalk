package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Macaque extends Animal {
	
	static Macaque self;
	
	public static Macaque getInstance(){
		if(self == null){
			self = new Macaque("Toshko", Type.MAMMAL, facts, Place.OPEN_SPACE);
		}
		return self;
	}

	private Macaque(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
	
	private static String facts = "The Macaque is a medium sized Monkey found in a variety of different " +
			"habitats. The Macaque is also known as the Snow Monkey as they are often found living in colder " +
			"regions where heavy snowfall is common during the winter. They are the world's most northern " +
			"living Monkey species and have adapted incredibly to their surroundings and changing seasons. " +
			"There are two different subspecies of Macaque. The two differ very slightly in size and appearance.";
	
}

