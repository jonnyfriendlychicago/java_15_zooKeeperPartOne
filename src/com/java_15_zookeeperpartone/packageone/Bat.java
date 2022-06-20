package com.java_15_zookeeperpartone.packageone;

public class Bat extends Mammal {
	
	
	public String animalName; 
	
	
	
	public Bat (String animalName) {
		this.animalName = animalName; 
		System.out.println("New Bat created.  Name: " + animalName + "."); 
		assignInitialEnergyValue(); 
		displayEnergyLevel() ; 
	}
	
	public void assignInitialEnergyValue() {
		energyLevel = 300; 
	}

	public void fly() {
		System.out.println("Gonna FLY NOW..."); 
		energyLevel -= 50; 
		displayEnergyLevel() ;
	}
	
	public void eatHuman(int humansConsumed) {
		System.out.println(humansConsumed + " person(s) eaten");
		energyLevel += (humansConsumed * 25);
		displayEnergyLevel() ;
	}
	
	public void attackTown() {
		System.out.println("smash this town to the ground");
		energyLevel -= 100; 
		displayEnergyLevel() ;
		
	}
	
	// end of methods
}
