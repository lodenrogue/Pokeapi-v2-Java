package com.lodenrogue.pokeapiv2.model.berries;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Flavors determine whether a pokemon will benefit or suffer from eating a
 * berry based on their nature.
 * 
 * @author Miguel Hernandez
 *
 */
public class BerryFlavor {
	private int id;
	private String name;
	private List<FlavorBerryMap> berries;

	@JsonProperty("contest_type")
	private NamedAPIResource contestType;
	private List<Name> names;

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

	public List<FlavorBerryMap> getBerries() {
		return berries;
	}

	public void setBerries(List<FlavorBerryMap> berries) {
		this.berries = berries;
	}

	public NamedAPIResource getContestType() {
		return contestType;
	}

	public void setContestType(NamedAPIResource contestType) {
		this.contestType = contestType;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

}
