package com.lodenrogue.pokeapiv2.model.berries;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * 
 * @author Miguel Hernandez
 *
 */
public class BerryFirmness {
	private int id;
	private String name;
	private List<NamedAPIResource> berries;
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

	public List<NamedAPIResource> getBerries() {
		return berries;
	}

	public void setBerries(List<NamedAPIResource> berries) {
		this.berries = berries;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

}
