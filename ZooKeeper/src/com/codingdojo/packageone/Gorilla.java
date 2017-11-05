package com.codingdojo.packageone;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("The Gorilla has thrown something");
		this.energyLevel = energyLevel - 5;
	}

	public void eatBananas() {
		System.out.println("The Gorilla is satisfied!");
		this.energyLevel = energyLevel + 10;
	}

	public void climb() {
		System.out.println("The Gorilla is climbing the tree!");
		this.energyLevel = energyLevel - 10;
	}
}
