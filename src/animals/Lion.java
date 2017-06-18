package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Lion extends Animal {
	
	static Lion self;
	
	public static Lion getInstance(){
		if(self == null){
			self = new Lion("Leo", Type.PREDATOR, facts, Place.OPEN_SPACE);
		}
		return self;
	}

	private Lion(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
	
	private static String facts = "The Lion is one of the largest, strongest and powerful felines in the world " + 
			"second only in size to the Siberian Tiger. They are the largest cats on the African continent " + 
			"and are unique among felines in a number of ways but the biggest difference between Lions and " +
			"other cats is that they are incredibly sociable animals that live together in family groups " + 
			"known as prides. Lions are also part of the big cat family meaning that both males and females " + 
			"are able to roar. Despite having once roamed across much of Africa and even parts of Europe and " + 
			"Asia, the world's remaining Lion population now resides in sub-Saharan Africa. However, with Lion " +
			"numbers thought to have dropped by 30% over the past 20 years these enormous predators are sadly " + 
			"becoming more and more vulnerable in their decreasing natural environment.";

}
