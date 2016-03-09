package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Genders were introduced in Generation II for the purposes of breeding pokemon
 * but can also result in visual differences or even different evolutionary
 * lines.
 * 
 * @author Miguel Hernandez
 *
 */
public class Gender {
	private int id;
	private String name;

	@JsonProperty("pokemon_species_details")
	private List<PokemonSpeciesGender> pokemonSpeciesDetails;

	@JsonProperty("required_for_evolution")
	private List<NamedAPIResource> requiredForEvolution;

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

	public List<PokemonSpeciesGender> getPokemonSpeciesDetails() {
		return pokemonSpeciesDetails;
	}

	public void setPokemonSpeciesDetails(List<PokemonSpeciesGender> pokemonSpeciesDetails) {
		this.pokemonSpeciesDetails = pokemonSpeciesDetails;
	}

	public List<NamedAPIResource> getRequiredForEvolution() {
		return requiredForEvolution;
	}

	public void setRequiredForEvolution(List<NamedAPIResource> requiredForEvolution) {
		this.requiredForEvolution = requiredForEvolution;
	}

}
