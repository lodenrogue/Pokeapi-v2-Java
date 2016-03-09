package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;
import com.lodenrogue.pokeapiv2.model.VersionGameIndex;

/**
 * Pokemon are the creatures that inhabit the world of the pokemon games. They
 * can be caught using pokeball's and trained by battling with other pokemon.
 * 
 * @author Miguel Hernandez
 *
 */
public class Pokemon {
	private int id;
	private String name;

	@JsonProperty("base_experience")
	private int baseExperience;

	private int height;

	@JsonProperty("is_default")
	private boolean isDefault;

	private int order;
	private int weight;
	private List<PokemonAbility> abilities;
	private List<NamedAPIResource> forms;

	@JsonProperty("game_indices")
	private List<VersionGameIndex> gameIndices;

	@JsonProperty("held_items")
	private List<NamedAPIResource> heldItems;

	@JsonProperty("location_area_encounters")
	private List<LocationAreaEncounter> locationAreaEncounters;

	private List<NamedAPIResource> moves;
	private List<NamedAPIResource> species;
	private List<NamedAPIResource> stats;
	private List<PokemonType> types;

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

	public int getBaseExperience() {
		return baseExperience;
	}

	public void setBaseExperience(int baseExperience) {
		this.baseExperience = baseExperience;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public List<PokemonAbility> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<PokemonAbility> abilities) {
		this.abilities = abilities;
	}

	public List<NamedAPIResource> getForms() {
		return forms;
	}

	public void setForms(List<NamedAPIResource> forms) {
		this.forms = forms;
	}

	public List<VersionGameIndex> getGameIndices() {
		return gameIndices;
	}

	public void setGameIndices(List<VersionGameIndex> gameIndices) {
		this.gameIndices = gameIndices;
	}

	public List<NamedAPIResource> getHeldItems() {
		return heldItems;
	}

	public void setHeldItems(List<NamedAPIResource> heldItems) {
		this.heldItems = heldItems;
	}

	public List<LocationAreaEncounter> getLocationAreaEncounters() {
		return locationAreaEncounters;
	}

	public void setLocationAreaEncounters(List<LocationAreaEncounter> locationAreaEncounters) {
		this.locationAreaEncounters = locationAreaEncounters;
	}

	public List<NamedAPIResource> getMoves() {
		return moves;
	}

	public void setMoves(List<NamedAPIResource> moves) {
		this.moves = moves;
	}

	public List<NamedAPIResource> getSpecies() {
		return species;
	}

	public void setSpecies(List<NamedAPIResource> species) {
		this.species = species;
	}

	public List<NamedAPIResource> getStats() {
		return stats;
	}

	public void setStats(List<NamedAPIResource> stats) {
		this.stats = stats;
	}

	public List<PokemonType> getTypes() {
		return types;
	}

	public void setTypes(List<PokemonType> types) {
		this.types = types;
	}

}
