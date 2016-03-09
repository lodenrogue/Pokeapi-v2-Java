package com.lodenrogue.pokeapiv2.model.games;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * A generation is a grouping of the Pokémon games that separates them based on
 * the Pokémon they include. In each generation, a new set of Pokémon, Moves,
 * Abilities and Types that did not exist in the previous generation are
 * released.
 * 
 * @author Miguel Hernandez
 *
 */
public class Generation {
	private int id;
	private String name;
	private List<NamedAPIResource> abilities;
	private List<Name> names;
	private NamedAPIResource mainRegion;
	private List<NamedAPIResource> moves;
	private List<NamedAPIResource> pokemonSpecies;
	private List<NamedAPIResource> types;
	private List<NamedAPIResource> versionGroups;

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

	public List<NamedAPIResource> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<NamedAPIResource> abilities) {
		this.abilities = abilities;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public NamedAPIResource getMainRegion() {
		return mainRegion;
	}

	public void setMainRegion(NamedAPIResource mainRegion) {
		this.mainRegion = mainRegion;
	}

	public List<NamedAPIResource> getMoves() {
		return moves;
	}

	public void setMoves(List<NamedAPIResource> moves) {
		this.moves = moves;
	}

	public List<NamedAPIResource> getPokemonSpecies() {
		return pokemonSpecies;
	}

	public void setPokemonSpecies(List<NamedAPIResource> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

	public List<NamedAPIResource> getTypes() {
		return types;
	}

	public void setTypes(List<NamedAPIResource> types) {
		this.types = types;
	}

	public List<NamedAPIResource> getVersionGroups() {
		return versionGroups;
	}

	public void setVersionGroups(List<NamedAPIResource> versionGroups) {
		this.versionGroups = versionGroups;
	}

}