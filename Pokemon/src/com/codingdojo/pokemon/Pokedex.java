package com.codingdojo.pokemon;

public class Pokedex extends PokemoneAbstract {
	
	public String pokemonInfo(Pokemon pokemon) {
		return "Name: " + pokemon.getName()+"\n"+
			   "Health: " + pokemon.getHealth()+"\n"+
			   "Type: " + pokemon.getType()+"\n";
	}
}

