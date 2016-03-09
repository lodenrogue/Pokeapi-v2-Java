package com.lodenrogue.pokeapiv2.model.locations;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;
import com.lodenrogue.pokeapiv2.model.games.Generation;

/**
 * A region is an organized area of the pokemon world. Most often, the main
 * difference between regions is the species of pokemon that can be encountered
 * within them.
 * 
 * @author Miguel Hernandez
 *
 */
public class Region {
	private int id;
	private String name;
	private List<NamedAPIResource> locations;

	@JsonProperty("main_generation")
	private Generation mainGeneration;
	private List<Name> names;
	private NamedAPIResource pokedexes;

	@JsonProperty("version_groups")
	private NamedAPIResource versionGroups;

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

	public List<NamedAPIResource> getLocations() {
		return locations;
	}

	public void setLocations(List<NamedAPIResource> locations) {
		this.locations = locations;
	}

	public Generation getMainGeneration() {
		return mainGeneration;
	}

	public void setMainGeneration(Generation mainGeneration) {
		this.mainGeneration = mainGeneration;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public NamedAPIResource getPokedexes() {
		return pokedexes;
	}

	public void setPokedexes(NamedAPIResource pokedexes) {
		this.pokedexes = pokedexes;
	}

	public NamedAPIResource getVersionGroups() {
		return versionGroups;
	}

	public void setVersionGroups(NamedAPIResource versionGroups) {
		this.versionGroups = versionGroups;
	}
}