package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Elephant extends Animal {
	
	static Elephant self;
	
	public static Elephant getInstance(){
		if(self == null){
			self = new Elephant("Nelly", Type.MAMMAL, facts, Place.OPEN_SPACE);
		}
		return self;
	}

	private Elephant(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
	
	private static String facts = "There are two primary species of elephant:\n\tAsian Elephant\n" +
			"\tAfrican Elephant\nThere are numerous subspecies of the Asian elephant, these are the " + 
			"Indian Elephant, Sri Lankan Elephant, Sumatran, Borneo Elephant.\nAfrican elephants are " +
			"larger than Asian elephants and have two subspecies which are the African Bush Elephant " +
			"and African Forest Elephant.\nThe elephant is the only known mammal that, despite having " +
			"knee joints, cannot jump! This is thought to be primarily due to the elephants sheer size " +
			"but also because of the way that the elephants legs are built, they are short and stocky " +
			"to support the elephants phenomenal weight.\nElephants are herbivores that spend around 22 " +
			"hours eating! The elephant searches for green leaves in the tree tops but it is not uncommon " +
			"for the elephant to tear down the tree to get the leaves.\nOne old elephant related myth is " +
			"that elephants are afraid of mice. There are a number of theories from where this arose such " +
			"as the size difference (elephants are one of the biggest land animals, mice are one of the " +
			"smallest), the fear from the elephant that a mouse could crawl into the elephants trunk and " +
			"nest, and the fact that mice have been known to crawl over elephants while they are sleeping " +
			"so they can get to any left over food, are also viable possibilities. Whether or not elephants " +
			"are actually scared of mice is unknown, however tests show that elephants are definitely not " +
			"as comfortable with mice around as you might expect.";
	
}
