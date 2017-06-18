package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Hamster extends Animal {
static Hamster self;
	
	public static Hamster getInstance(){
		if(self == null){
			self = new Hamster("Seo", Type.MAMMAL, "Hamsters are rodents belonging to the subfamily Cricetinae. The subfamily contains about 25 species, classified in six or seven genera.[1] They have become established as popular small house pets,[2] and, partly because they are easy to breed in captivity, hamsters are often used as laboratory animals.In the wild, hamsters are crepuscular and remain underground during the day to avoid being caught by predators. They feed primarily on seeds, fruits, and vegetation, and will occasionally eat burrowing insects.[3] They have elongated cheek pouches extending to their shoulders in which they carry food back to their burrows.", Place.COLSED_SPACE);
		}
		return self;
	}

	private Hamster(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
}