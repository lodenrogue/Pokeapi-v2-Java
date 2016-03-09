package com.lodenrogue.pokeapiv2.model.evolution;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Evolution triggers are the events and conditions that cause a pokemon to
 * evolve.
 * 
 * @author Miguel Hernandez
 *
 */
public class EvolutionTrigger {
	private int id;
	private String name;
	private List<Name> names;
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