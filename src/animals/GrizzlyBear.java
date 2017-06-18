package animals;

import enums.Place;
import main.Animal;
import enums.Type;

public class GrizzlyBear extends Animal {
		static GrizzlyBear self;
		static final String BEAR_DESCRIPTION = "Grizzly bear is a large subspecies of brown bear inhabiting North America.";
		
		public static GrizzlyBear getInstance(){
			if(self == null){
				self = new GrizzlyBear("Harvy",Type.MAMMAL,BEAR_DESCRIPTION,Place.WATER_SPACE);
			}
			
			return self;
			
		}
		
		private GrizzlyBear(String name,Type type,String description,Place place){
			super(name,type,description,place);
		}
		}

