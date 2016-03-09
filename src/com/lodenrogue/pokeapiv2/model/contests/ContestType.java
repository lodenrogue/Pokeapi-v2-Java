package com.lodenrogue.pokeapiv2.model.contests;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Contest types are categories judges used to weigh a pokemons condition in
 * pokemon contests.
 * 
 * @author Miguel Hernandez
 *
 */
public class ContestType {
	private int id;
	private String name;

	@JsonProperty("berry_flavor")
	private NamedAPIResource berryFlavor;
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

	public NamedAPIResource getBerryFlavor() {
		return berryFlavor;
	}

	public void setBerryFlavor(NamedAPIResource berryFlavor) {
		this.berryFlavor = berryFlavor;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

}
