package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;
import com.lodenrogue.pokeapiv2.model.VerboseEffect;
import com.lodenrogue.pokeapiv2.model.VersionGroupFlavorText;

/**
 * Abilities provide passive effects for pokemon in battle or in the overworld.
 * Pokemon have mutiple possible abilities but can have only one ability at a
 * time.
 * 
 * @author Miguel Hernandez
 *
 */
public class Ability {
	private int id;
	private String name;

	@JsonProperty("is_main_series")
	private boolean isMainSeries;

	private NamedAPIResource generation;
	private List<Name> names;

	@JsonProperty("effect_entries")
	private List<VerboseEffect> effectEntries;

	@JsonProperty("effect_changes")
	private List<AbilityEffectChange> effectChanges;

	@JsonProperty("flavor_text_entries")
	private List<VersionGroupFlavorText> flavorTextEntries;

	private List<AbilityPokemon> pokemon;

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

	public boolean isMainSeries() {
		return isMainSeries;
	}

	public void setMainSeries(boolean isMainSeries) {
		this.isMainSeries = isMainSeries;
	}

	public NamedAPIResource getGeneration() {
		return generation;
	}

	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public List<VerboseEffect> getEffectEntries() {
		return effectEntries;
	}

	public void setEffectEntries(List<VerboseEffect> effectEntries) {
		this.effectEntries = effectEntries;
	}

	public List<AbilityEffectChange> getEffectChanges() {
		return effectChanges;
	}

	public void setEffectChanges(List<AbilityEffectChange> effectChanges) {
		this.effectChanges = effectChanges;
	}

	public List<VersionGroupFlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}

	public void setFlavorTextEntries(List<VersionGroupFlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}

	public List<AbilityPokemon> getPokemon() {
		return pokemon;
	}

	public void setPokemon(List<AbilityPokemon> pokemon) {
		this.pokemon = pokemon;
	}

}
