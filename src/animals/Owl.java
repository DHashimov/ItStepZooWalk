package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Owl extends Animal {
	
	static Owl self;
	
	public static Owl getInstance(){
		if(self == null){
			self = new Owl("Wol", Type.BIRD, facts, Place.OPEN_SPACE);
		}
		return self;
	}

	private Owl(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
	
	private static String facts = "Owls are one of the most widely distributed birds found everywhere " +
			"around the world apart from the polar and desert regions. Although this is the case, the owl " +
			"population is more predominant in the Southern Hemisphere due to better climate conditions.\n" +
			"Owls tend to measure between 25 and 40cm tall and adult owls can have a wingspan of up to 110cm " +
			"long. The wing span of the owl is however dependent on the species of owl so some owls may be " +
			"smaller, where other species of owl may be much bigger.\nSurprisingly, these common owls do not " +
			"make the hoot sound that can often be heard at night. Instead the owls produce a high-pitched " +
			"scream and can also hiss in a similar way to a cat or snake if the owl feels threatened.\n" +
			"Owls can be most commonly seen in the open countryside and along river banks, fields and even " +
			"the verges on the side of the road. Owls are nocturnal animals meaning that typically owls rest " +
			"during the light day time hours and emerge at dusk to begin a night of hunting.\nOwls most " +
			"commonly hunt small mammals such as mice, voles and rats but owls also hunt fish close to the " +
			"surface of the water and smaller birds in the tree tops and even in the air. Owls swallow their " +
			"prey whole and then bring back up (regurgitate) the indigestible parts such as bones in the form " +
			"of a small pellet.\nOwls are well suited to their nocturnal lifestyle. The large eyes of the owl " +
			"enable the owl to have fantastic eyesight even in the darkness of night, but owls also have " +
			"incredibly accurate hearing. The ears of the owl are set with one higher than the other giving " +
			"the owl better hearing in general but it also means that when the owl is hunting for prey, it " +
			"can use one ear to detect noise on the ground below and the other ear is used to detect noise " +
			"from the air and trees above.";
	
}

