package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Tarantula extends Animal {
static Tarantula self;
	
	public static Tarantula getInstance(){
		if(self == null){
			self = new Tarantula("Seo", Type.REPTILE, "Tarantulas comprise a group of large and often hairy arachnids belonging to the Theraphosidae family of spiders, of which approximately 900 species have been identified. This article only describes members of Theraphosidae, although some other members of the same infraorder (Mygalomorphae) are commonly referred to as \"tarantulas\". Except in cases of anaphylaxis (severe allergic reaction), no species of tarantula are dangerous to humans, and some species have become popular in the exotic pet trade.", Place.COLSED_SPACE);
		}
		return self;
	}

	private Tarantula(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
}