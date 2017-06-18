package enums;

import java.util.Dictionary;

public enum Type 
{
	REPTILE("Reptiles are tetrapod (four-limbed vertebrate) animals in the class Reptilia, comprising today's turtles, crocodilians, snakes, amphisbaenians, lizards, tuatara, and their extinct relatives. The study of these traditional reptile orders, historically combined with that of modern amphibians, is called herpetology."),
	MAMMAL("Mammals are any vertebrates within the class Mammalia , a clade of endothermic amniotes distinguished from reptiles (including birds) by the possession of a neocortex (a region of the brain), hair, three middle ear bones and mammary glands. Females of all mammal species nurse their young with milk, secreted from the mammary glands."),
	BIRD("Birds (Aves), a subgroup of reptiles, are the last living dinosaurs. They are a group of endothermic vertebrates, characterised by feathers, toothless beaked jaws, the laying of hard-shelled eggs, a high metabolic rate, a four-chambered heart, and a strong yet lightweight skeleton. Birds live worldwide and range in size from the 5 cm (2 in) bee hummingbird to the 2.75 m (9 ft) ostrich. They rank as the class of tetrapods with the most living species, at approximately ten thousand, with more than half of these being passerines, sometimes known as perching birds. Birds are the closest living relatives of crocodilians."),
	FISH("A fish is any member of a group of animals that consist of all gill-bearing aquatic craniate animals that lack limbs with digits. They form a sister group to the tunicates, together forming the olfactores. Included in this definition are the living hagfish, lampreys, and cartilaginous and bony fish as well as various extinct related groups. Tetrapods emerged within lobe-finned fishes, so cladistically they are fish as well. However, traditionally fish are rendered obsolete or paraphyletic by excluding the tetrapods (i.e., the amphibians, reptiles, birds and mammals which all descended from within the same ancestry). Because in this manner the term \"fish\" is defined negatively as a paraphyletic group, it is not considered a formal taxonomic grouping in systematic biology. The traditional term pisces (also ichthyes) is considered a typological, but not a phylogenetic classification.");
	
	String description;
	
	private Type(String description) 
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return description;
	}
}
