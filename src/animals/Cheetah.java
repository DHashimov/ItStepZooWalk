package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Cheetah extends Animal {
	
	static Cheetah self;
	
	public static Cheetah getInstance(){
		if(self == null){
			self = new Cheetah("Teo", Type.MAMMAL, "The cheetah (Acinonyx jubatus) is a large felid of the subfamily Felinae that occurs mainly in eastern and southern Africa and a few parts of Iran. The only extant member of the genus Acinonyx, the cheetah was first described by Johann Christian Daniel von Schreber in 1775. The cheetah is characterised by a slender body, deep chest, spotted coat, a small rounded head, black tear-like streaks on the face, long thin legs and a long spotted tail. Its lightly built, slender form is in sharp contrast with the robust build of the big cats, making it more similar to the cougar. ", Place.CLOSED_SPACE);
		}
		return self;
	}

	private Cheetah(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
}
