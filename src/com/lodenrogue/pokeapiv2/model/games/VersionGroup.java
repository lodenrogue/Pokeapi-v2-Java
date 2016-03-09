package com.lodenrogue.pokeapiv2.model.games;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Version groups categorize highly similar versions of the games.
 * 
 * @author Miguel Hernandez
 *
 */
public class VersionGroup {
	private int id;
	private String name;
	private int order;
	private NamedAPIResource generation;
	private List<NamedAPIResource> moveLearnMethods;
	private List<Name> names;
	private List<NamedAPIResource> pokedexes;
	private List<NamedAPIResource> regions;
	private List<NamedAPIResource> versions;

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

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public NamedAPIResource getGeneration() {
		return generation;
	}

	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
	}

	public List<NamedAPIResource> getMoveLearnMethods() {
		return moveLearnMethods;
	}

	public void setMoveLearnMethods(List<NamedAPIResource> moveLearnMethods) {
		this.moveLearnMethods = moveLearnMethods;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public List<NamedAPIResource> getPokedexes() {
		return pokedexes;
	}

	public void setPokedexes(List<NamedAPIResource> pokedexes) {
		this.pokedexes = pokedexes;
	}

	public List<NamedAPIResource> getRegions() {
		return regions;
	}

	public void setRegions(List<NamedAPIResource> regions) {
		this.regions = regions;
	}

	public List<NamedAPIResource> getVersions() {
		return versions;
	}

	public void setVersions(List<NamedAPIResource> versions) {
		this.versions = versions;
	}
}