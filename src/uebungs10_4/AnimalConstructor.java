package uebungs10_4;

public class AnimalConstructor {

	private String name;
	private String numberOfLegs;
	
	AnimalConstructor(){
		
	}
	
	AnimalConstructor(String name, String numberOfLegs){
		this.name = name;
		this.numberOfLegs = numberOfLegs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumberOfLegs(String numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	void discribe(){
		String legs = this.numberOfLegs;
		if(hasLegs()){
			legs = "keine";
		}
		System.out.println(this.name + " hat "  + legs + " Beine");
	}
	
	boolean hasLegs(){
		
		if(this.numberOfLegs.equals("0")){
			return true;
		}
		
		return false;
	}
	
}
