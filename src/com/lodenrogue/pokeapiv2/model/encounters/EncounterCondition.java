package com.lodenrogue.pokeapiv2.model.encounters;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Conditions which affect what pokemon might appear in the wild, e.g., day or
 * night.
 * 
 * @author Miguel Hernandez
 *
 */
public class EncounterCondition {
	private int id;
	private String name;
	private List<Name> names;
	private List<NamedAPIResource> values;

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

	public List<NamedAPIResource> getValues() {
		return values;
	}

	public void setValues(List<NamedAPIResource> values) {
		this.values = values;
	}

}
