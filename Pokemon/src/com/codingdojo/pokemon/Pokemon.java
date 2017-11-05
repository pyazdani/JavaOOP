package com.codingdojo.pokemon;

public class Pokemon {
	String name;
	int health = 100;
	String type;
	private static int numPokemon = 0;
	
	
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		numPokemon ++;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public static void setNumPokemon(int numPokemon) {
		Pokemon.numPokemon = numPokemon;
	}

	public static int getNumPokemon() {
		return numPokemon;
	}
}
