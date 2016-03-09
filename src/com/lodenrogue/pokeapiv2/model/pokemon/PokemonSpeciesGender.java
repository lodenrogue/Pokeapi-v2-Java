package com.lodenrogue.pokeapiv2.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class PokemonSpeciesGender {
	private int rate;

	@JsonProperty("pokemon_species")
	private NamedAPIResource pokemonSpecies;

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public NamedAPIResource getPokemonSpecies() {
		return pokemonSpecies;
	}

	public void setPokemonSpecies(NamedAPIResource pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

}
