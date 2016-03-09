package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class PokemonHabitat {
	private int id;
	private String name;
	private List<Name> names;

	@JsonProperty("pokemon_species")
	private List<NamedAPIResource> pokemonSpecies;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public List<NamedAPIResource> getPokemonSpecies() {
		return pokemonSpecies;
	}

	public void setPokemonSpecies(List<NamedAPIResource> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

}
