package com.java_15_zookeeperpartone.packageone;

class Gorilla extends Mammal {
	
	public String animalName; 
	
	public Gorilla (String animalName) {
		this.animalName = animalName; 
		System.out.println("New gorilla created.  Name: " + animalName + "."); 
		displayEnergyLevel() ; 
	}
	
	public void throwSomething(String thrownItem) {
		System.out.println(animalName + " threw a " + thrownItem + ".");
		
		energyLevel -= 5;  
		displayEnergyLevel() ; 
	}
	
	
	public void eatBanana(int bananaGulped ) {
		System.out.println(animalName + " ate " + bananaGulped + " banana(s).  Yum!  Felling better!"); 
		energyLevel += 10;
		displayEnergyLevel() ; 
	}
	
	public void climb() {
		System.out.println(animalName + " climbed."); 
		energyLevel -= 10; 
		displayEnergyLevel() ;
	}
	// end of methods
}

