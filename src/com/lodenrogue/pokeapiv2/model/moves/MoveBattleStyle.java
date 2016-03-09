package com.lodenrogue.pokeapiv2.model.moves;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Name;

/**
 * Styles of moves when used in the Battle Palace.
 * 
 * @author Miguel Hernandez
 *
 */
public class MoveBattleStyle {
	private int id;
	private String name;
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

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

}
