package com.lodenrogue.pokeapiv2.model.items;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.APIResource;
import com.lodenrogue.pokeapiv2.model.GenerationGameIndex;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;
import com.lodenrogue.pokeapiv2.model.VerboseEffect;
import com.lodenrogue.pokeapiv2.model.VersionGroupFlavorText;
import com.lodenrogue.pokeapiv2.model.evolution.EvolutionChain;

/**
 * An item is an object in the games which the player can pick up, keep in their
 * bag, and use in some manner. They have various uses, including healing,
 * powering up, helping catch Pokémon, or to access a new area.
 * 
 * @author Miguel Hernandez
 *
 */
public class Item {
	private int id;
	private String name;
	private int cost;
	private int flingPower;
	private ItemFlingEffect flingEffect;
	private List<NamedAPIResource> attributes;
	private ItemCategory category;
	private List<VerboseEffect> effectEntries;
	private List<VersionGroupFlavorText> flavorTextEntries;
	private List<GenerationGameIndex> gameIndices;
	private List<Name> names;
	private List<NamedAPIResource> heldByPokemon;
	private List<APIResource<EvolutionChain>> babyTriggerFor;

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

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getFlingPower() {
		return flingPower;
	}

	public void setFlingPower(int flingPower) {
		this.flingPower = flingPower;
	}

	public ItemFlingEffect getFlingEffect() {
		return flingEffect;
	}

	public void setFlingEffect(ItemFlingEffect flingEffect) {
		this.flingEffect = flingEffect;
	}

	public List<NamedAPIResource> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<NamedAPIResource> attributes) {
		this.attributes = attributes;
	}

	public ItemCategory getCategory() {
		return category;
	}

	public void setCategory(ItemCategory category) {
		this.category = category;
	}

	public List<VerboseEffect> getEffectEntries() {
		return effectEntries;
	}

	public void setEffectEntries(List<VerboseEffect> effectEntries) {
		this.effectEntries = effectEntries;
	}

	public List<VersionGroupFlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}

	public void setFlavorTextEntries(List<VersionGroupFlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}

	public List<GenerationGameIndex> getGameIndices() {
		return gameIndices;
	}

	public void setGameIndices(List<GenerationGameIndex> gameIndices) {
		this.gameIndices = gameIndices;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public List<NamedAPIResource> getHeldByPokemon() {
		return heldByPokemon;
	}

	public void setHeldByPokemon(List<NamedAPIResource> heldByPokemon) {
		this.heldByPokemon = heldByPokemon;
	}

	public List<APIResource<EvolutionChain>> getBabyTriggerFor() {
		return babyTriggerFor;
	}

	public void setBabyTriggerFor(List<APIResource<EvolutionChain>> babyTriggerFor) {
		this.babyTriggerFor = babyTriggerFor;
	}
}