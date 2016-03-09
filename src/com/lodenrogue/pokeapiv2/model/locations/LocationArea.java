package com.lodenrogue.pokeapiv2.model.locations;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Location areas are sections of areas, such as floors in a building or cave.
 * Each area has its own set of possible pokemon encounters.
 * 
 * @author Miguel Hernandez
 *
 */
public class LocationArea {
	private int id;
	private String name;

	@JsonProperty("game_index")
	private int gameIndex;

	private NamedAPIResource location;
	private List<Name> names;

	@JsonProperty("pokemon_encounters")
	private List<PokemonEncounter> pokemonEncounters;

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

	public int getGameIndex() {
		return gameIndex;
	}

	public void setGameIndex(int gameIndex) {
		this.gameIndex = gameIndex;
	}

	public NamedAPIResource getLocation() {
		return location;
	}

	public void setLocation(NamedAPIResource location) {
		this.location = location;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public List<PokemonEncounter> getPokemonEncounters() {
		return pokemonEncounters;
	}

	public void setPokemonEncounters(List<PokemonEncounter> pokemonEncounters) {
		this.pokemonEncounters = pokemonEncounters;
	}

}
