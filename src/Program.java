//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import animals.Chimpanzee;
import animals.Dolphin;
import animals.Eagle;
import animals.Elephant;
import animals.GrizzlyBear;
import animals.Hippopotamus;
import animals.Lion;
import animals.Macaque;
import animals.Otter;
import animals.Owl;
import animals.Tiger;
import enums.Place;
import enums.Type;
import main.Animal;

public class Program {
	
	static int cage = 1;
	public static boolean printBird = true;
	public static boolean printFish = true;
	public static boolean printMammal = true;
	public static boolean printReptile = true;
	public static boolean firstOpenAnimal = true;
	public static boolean firstClosedAnimal = true;
	public static boolean firstWaterAnimal = true;

	public static void main(String[] args) throws InterruptedException {
		List<Animal> animalList	= new ArrayList<Animal>();
		animalList.add(Lion.getInstance());
		animalList.add(Elephant.getInstance());
		animalList.add(Tiger.getInstance());
		animalList.add(Owl.getInstance());
		animalList.add(Eagle.getInstance());
		animalList.add(Macaque.getInstance());
		animalList.add(Chimpanzee.getInstance());
		animalList.add(GrizzlyBear.getInstance());
		animalList.add(Hippopotamus.getInstance());
		animalList.add(Otter.getInstance());
		animalList.add(Dolphin.getInstance());
		

		for (Animal animal : animalList){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					if(animal.place == Place.OPEN_SPACE && firstOpenAnimal) {
						System.out.println("We're going into the open space of the zoo:");
						firstOpenAnimal = false;
					}
					if(animal.place == Place.CLOSED_SPACE && firstClosedAnimal){
						System.out.println("That's the end of the open space.");
						System.out.println("We're going into the closed space of the zoo:");
						cage = 1;
					}
					if(animal.place == Place.WATER_SPACE && firstWaterAnimal){
						System.out.println("That's the end of the closed space.");
						System.out.println("We're going into the water space of the zoo:");
						cage = 1;
					}
						
					System.out.println("Cage number " + cage + ":");
					cage++;
					System.out.println(animal.name);
					if(animal.type == Type.BIRD)
						printBird = false;
					if(animal.type == Type.FISH)
						printFish = false;
					if(animal.type == Type.MAMMAL)
						printMammal = false;
					if(animal.type == Type.REPTILE)
						printReptile = false;
					if(animal.type == Type.BIRD && printBird){
						System.out.println("Class Birds: " + Type.BIRD.getDescription());
					}
					System.out.println(animal.name + " is: " + animal.description);
					
				}
			});
			Thread.sleep(3000);
			
		}
		System.out.println("That's the end of the water space.");
		System.out.println("That's the end of the zoo.");
	}
	
//	try {
//		Class.forName("com.mysql.jdbc.Driver").newInstance();
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/it_step_zoo_walk", "root", "");
//
//		Statement st = con.createStatement();
//		String sql = ("SELECT * FROM animals;");
//		ResultSet rs = st.executeQuery(sql);
//		if (rs.next()) {
//			int id = rs.getInt("_id");
//			String name = rs.getString("name");
//			String type = rs.getString("type");
//			System.out.println("ID = " + id + " NAME = " + name + " TYPE = " + type);
//			con.close();
//		}
//
//	} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}

}
