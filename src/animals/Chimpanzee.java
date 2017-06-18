package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Chimpanzee extends Animal {
	
	static Chimpanzee self;
	
	public static Chimpanzee getInstance(){
		if(self == null){
			self = new Chimpanzee("Lance Link", Type.MAMMAL, facts, Place.OPEN_SPACE);
		}
		return self;
	}

	private Chimpanzee(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
	
	private static String facts = "The Chimpanzee is a species of ape that is natively found in a variety " +
			"of different habitats in western and central Africa. Closely related to other great apes " +
			"including Orang-Utans and Gorillas, the Chimpanzee is also very closely related to Humans as we " +
			"share 98% of the same DNA. They are thought to be the most intelligent animals on the planet " +
			"after people and are not only known to show emotion but they are also great problem-solvers and " +
			"are even known to not just use, but also make tools to help them to survive more successfully in " +
			"their surroundings. There are two different species of Chimpanzee which are the Common Chimpanzee " +
			"and the smaller Bonobo (also known as the Pygmy Chimpanzee) which has a limited distribution south " +
			"of the Congo River. However, despite being highly adaptable and intelligent creatures, Chimpanzees " +
			"are severely threatened in their natural habitats today, mainly due to hunting for bushmeat and " +
			"deforestation.";
	
}

