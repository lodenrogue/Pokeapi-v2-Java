package com.lodenrogue.pokeapiv2.model.locations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class PalParkEncounterSpecies {
	@JsonProperty("base_score")
	private int baseScore;
	private int rate;

	@JsonProperty("pokemon_species")
	private NamedAPIResource pokemonSpecies;

	public int getBaseScore() {
		return baseScore;
	}

	public void setBaseScore(int baseScore) {
		this.baseScore = baseScore;
	}

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
