package com.lodenrogue.pokeapiv2.model.encounters;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Name;

/**
 * Methods by which the player might can encounter pokemon in the wild, e.g.,
 * walking in tall grass.
 * 
 * @author Miguel Hernandez
 *
 */
public class EncounterMethod {
	private int id;
	private String name;
	private int order;
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

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

}
