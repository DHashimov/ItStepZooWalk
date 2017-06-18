package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Eagle extends Animal {
	
	static Eagle self;
	
	public static Eagle getInstance(){
		if(self == null){
			self = new Eagle("Jonathan", Type.BIRD, facts, Place.OPEN_SPACE);
		}
		return self;
	}

	private Eagle(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
	
	private static String facts = "The eagle is a (generally) large sized bird of prey meaning that the " +
			"eagle is one of the most dominant predators in the sky. Eagles are most commonly found in the " +
			"Northern Hemisphere including Europe, Asia and North America. Eagles are also found on the " +
			"African continent.\nThere are more than 60 different species of eagle in the world with only 2 " +
			"of these eagle species being found in the USA and Canada. However, one of these eagle species " +
			"is one of the most common species of eagle, the bald eagle. Despite it's name the bald eagle " +
			"has a full head of feathers but their bright white colour makes the bald eagle very distinguishable. " +
			"The golden eagle is the only other species of eagle found on the American continent.\nThe size of " +
			"an eagle is dependent on the species of eagle. Eagles can range in size from 40cm to over 1m in " +
			"height. The wing span of an eagle tends to be at least double the length of the eagle's body. " +
			"Eagles have feathers on the ends of their wings which the eagles move up and down to help them " +
			"when flying.\nEagles are dominant predators and are known as birds of prey. Eagles feed off " +
			"smaller birds and bats in the sky and small mammals and fish on the ground. The eagle is well " +
			"known for it's incredible eyesight. An eagle's eyesight is so good that an eagle can apparently " +
			"see a mouse on the ground when the eagle is still high in the sky.\nThe eagle is used as a symbol " +
			"in many national flags and emblems all around the world, as an eagle is believed to resemble power " +
			"or good fortune. Eagles are dominant and ruthless predators in their environment and eagles " +
			"therefore have very few natural predators themselves. Eagles are most likely to be hunted by " +
			"smaller animals when they are chicks or still young and inexperienced so they are fairly vulnerable.\n" +
			"Female eagles build their nests in tall tree tops or on high cliffs where they are at their safest. " +
			"The mother eagle tends to lay two eggs, which hatch after about a month. In many eagle species " +
			"however, one of the eagle chicks is naturally slightly stronger than the other chick, with the " +
			"stronger chick generally killing it's weaker sibling.\nEagles have adapted well to their dominant " +
			"predatory lifestyle. Not only do eagles have exceptional eyesight and are about to soar remarkably " +
			"quickly through the air for such a large bird, but eagles also have pointed beaks and agile feet " +
			"known as talons. The beak of the eagle is perfectly designed for ripping flesh away from bone, and " +
			"the talons of the eagle are so strong that the eagle is able to carry it's prey in it's feet until " +
			"it reaches a safe place to eat it.";
	
}

