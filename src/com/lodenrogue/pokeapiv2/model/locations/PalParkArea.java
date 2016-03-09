package com.lodenrogue.pokeapiv2.model.locations;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.Name;

/**
 * Areas used for grouping pokemon encounters in Pal Park. They're like habitats
 * that are specific to Pal Park.
 * 
 * @author Miguel Hernandez
 *
 */
public class PalParkArea {
	private int id;
	private String name;
	private List<Name> names;

	@JsonProperty("pokemon_encounters")
	private List<PalParkEncounterSpecies> pokemonEncounters;

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

	public List<PalParkEncounterSpecies> getPokemonEncounters() {
		return pokemonEncounters;
	}

	public void setPokemonEncounters(List<PalParkEncounterSpecies> pokemonEncounters) {
		this.pokemonEncounters = pokemonEncounters;
	}

}
