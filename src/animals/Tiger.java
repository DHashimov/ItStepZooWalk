package animals;

import enums.Place;
import enums.Type;
import main.Animal;

public class Tiger extends Animal {
	
	static Tiger self;
	
	public static Tiger getInstance(){
		if(self == null){
			self = new Tiger("Tigger", Type.MAMMAL, facts, Place.OPEN_SPACE);
		}
		return self;
	}

	private Tiger(String name, Type type, String description, Place place) {
		super(name, type, description, place);
	}
	
	private static String facts = "The tiger is the largest feline in the world, with the tiger " +
			"growing to around 2.5 metres in length. The tiger is the most powerful of all the big cats, " +
			"and is native to east and southern Asia. The tiger is feared by most human beings who " +
			"inhabit settlements within the tiger's territory.\nThere are six different subspecies " +
			"of tiger which are the Bengal tiger, the Indochinese tiger, the Malayan tiger, the Sumatran " +
			"tiger, the Siberian tiger and the South China Tiger. The white tiger is actually a Bengal " +
			"tiger and is therefore not a subspecies itself.\nThe average tiger weighs around 300kg and " +
			"a tiger can stretch its body (and tail) to roughly 4 metres. Tigers hunt snakes, boar, " +
			"buffalo, crocodiles, deer, leopards and camels and are extremely effective at catching their " +
			"prey due to their silent, stalking approach and their powerful bodies.\nThe tiger can reach " +
			"speeds of up to 90km an hour, making the tiger extremely fast. Tigers have even been known " +
			"to conflict with rhinos and elephants with the tiger generally winning.\nTigers are generally " +
			"orange with black stripes although it's common to get tigers with white and sandy coloured " +
			"markings. The white tiger is a rare type of tiger, with bright white fur and black stripes, " +
			"these tigers occur from a genetic mutation when in the mother tiger's womb. It is not certain " +
			"that these white tigers will produce white offspring, many white tigers have been known to " +
			"produce orange cubs.\nToday the tiger is a near endangered species with only a handful still " +
			"roaming the Asian jungles. The tiger is still a completely dominant predator in it's environment " +
			"particularly due to their extreme power, and ability to run, swim, jump and climb trees very " +
			"effectively.\nThe tiger is a highly adaptable animal with the tiger's territory ranging from " +
			"Siberia, to open grasslands and tropical mangrove swamps in central and south-east Asia. The " +
			"tiger is also an extremely territorial animal and the tiger is generally a solitary animal.\n" +
			"Due to the tiger's size and the tiger's want to be solitary, the tiger often requires large " +
			"areas of habitat that can support the tiger's prey demands. Because of the tiger's need for " +
			"a large territory mixed with the fact that the tiger is native to some of the more densely " +
			"populated places on earth, has meant that there have been significant conflicts between tigers " +
			"and humans.\nTigers usually mate from November to April and after a gestation period of just " +
			"over 3 months, the female tiger gives birth to 2 or 3 tiger cubs. When the tiger cubs are first " +
			"born they are blind and extremely vulnerable. By the time the tiger cubs is around 18 months " +
			"old, it is able to hunt for itself. Tiger cubs are known to grow rapidly and can put on 100 g " +
			"of weight every day. The tiger cubs usually stay with their mother until they are between 2 " +
			"and 3 years old and the tiger cubs are then big enough and strong enough to venture out into " +
			"the jungle to live a life of solitude.";
	
}

