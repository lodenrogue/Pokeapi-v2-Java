package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.Description;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Growth rates are the speed with which pokemon gain levels through experience.
 * 
 * @author Miguel Hernandez
 *
 */
public class GrowthRate {
	private int id;
	private String name;
	private String formula;
	private List<Description> descriptions;
	private List<GrowthRateExperienceLevel> levels;

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

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public List<Description> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	public List<GrowthRateExperienceLevel> getLevels() {
		return levels;
	}

	public void setLevels(List<GrowthRateExperienceLevel> levels) {
		this.levels = levels;
	}

	public List<NamedAPIResource> getPokemonSpecies() {
		return pokemonSpecies;
	}

	public void setPokemonSpecies(List<NamedAPIResource> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

}
