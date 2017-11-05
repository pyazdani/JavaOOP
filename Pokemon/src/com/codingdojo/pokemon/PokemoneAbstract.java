package com.codingdojo.pokemon;

public abstract class PokemoneAbstract implements PokemonInterface {
	
	public Pokemon createPokemon(String name, int health, String type) {
		return new Pokemon(name,health,type);
	}
	
	public void attackPokemon(Pokemon pokemon) {
		int currentHealth = pokemon.getHealth() - 10;
		pokemon.setHealth(currentHealth);
	}
}
