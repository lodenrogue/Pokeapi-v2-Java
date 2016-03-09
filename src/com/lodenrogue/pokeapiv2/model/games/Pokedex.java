package com.lodenrogue.pokeapiv2.model.games;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Description;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * A Pokédex is a handheld electronic encyclopedia device; one which is capable
 * of recording and retaining information of the various Pokémon in a given
 * region with the exception of the national dex and some smaller dexes related
 * to portions of a region.
 * 
 * @author Miguel Hernandez
 *
 */
public class Pokedex {
	private int id;
	private String name;
	private boolean isMainSeries;
	private List<Description> descriptions;
	private List<Name> names;
	private List<PokemonEntry> pokemonEntries;
	private NamedAPIResource region;
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

	public boolean isMainSeries() {
		return isMainSeries;
	}

	public void setMainSeries(boolean isMainSeries) {
		this.isMainSeries = isMainSeries;
	}

	public List<Description> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public List<PokemonEntry> getPokemonEntries() {
		return pokemonEntries;
	}

	public void setPokemonEntries(List<PokemonEntry> pokemonEntries) {
		this.pokemonEntries = pokemonEntries;
	}

	public NamedAPIResource getRegion() {
		return region;
	}

	public void setRegion(NamedAPIResource region) {
		this.region = region;
	}

	public List<NamedAPIResource> getVersionGroups() {
		return versionGroups;
	}

	public void setVersionGroups(List<NamedAPIResource> versionGroups) {
		this.versionGroups = versionGroups;
	}
}