package com.lodenrogue.pokeapiv2.model.encounters;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Encounter condition values are the various states that an encounter condition
 * can have, i.e., Time of day can be either day or night.
 * 
 * @author Miguel Hernandez
 *
 */
public class EncounterConditionValue {
	private int id;
	private String name;
	private NamedAPIResource condition;
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

	public NamedAPIResource getCondition() {
		return condition;
	}

	public void setCondition(NamedAPIResource condition) {
		this.condition = condition;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

}
