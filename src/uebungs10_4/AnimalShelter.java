package uebungs10_4;

public class AnimalShelter {

	public static void main(String[] args){
		AnimalConstructor dog = new AnimalConstructor("Fiffi","4");
		AnimalConstructor fish = new AnimalConstructor("Blubb","0");
		AnimalConstructor unknownAnimal = new AnimalConstructor();
		
		unknownAnimal.setName("");
		unknownAnimal.setNumberOfLegs("3");
		dog.discribe();
		fish.discribe();
		unknownAnimal.discribe();
	}
	
}
