package com.codingdojo.packagetwo;

public class Dragon extends Mammal {
	public Dragon() {
		this.energyLevel = 300;
	}
	public void Fly() {
		System.out.println("Dragon is taking off!");
		this.energyLevel = energyLevel - 50;
	}
	
	public void eatHumans() {
		System.out.println("It's eating a human now!");
		this.energyLevel = energyLevel + 25;
	}
	
	public void attackTown() {
		System.out.println("It's attacking a town now!");
		this.energyLevel = energyLevel - 100;
	}

}
