package com.lodenrogue.pokeapiv2.model.moves;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Description;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Methods by which pokemon can learn moves.
 * 
 * @author Miguel Hernandez
 *
 */
public class MoveLearnMethod {
	private int id;
	private String name;
	private List<Description> descriptions;
	private List<Name> names;
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

	public List<NamedAPIResource> getVersionGroups() {
		return versionGroups;
	}

	public void setVersionGroups(List<NamedAPIResource> versionGroups) {
		this.versionGroups = versionGroups;
	}

}
