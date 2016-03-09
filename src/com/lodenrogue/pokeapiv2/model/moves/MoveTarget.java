package com.lodenrogue.pokeapiv2.model.moves;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Description;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Targets moves can be directed at during battle. Targets can be pokemon,
 * environments or even other moves.
 * 
 * @author Miguel Hernandez
 *
 */
public class MoveTarget {
	private int id;
	private String name;
	private List<Description> descriptions;
	private List<NamedAPIResource> moves;
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

	public List<Description> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

	public List<NamedAPIResource> getMoves() {
		return moves;
	}

	public void setMoves(List<NamedAPIResource> moves) {
		this.moves = moves;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

}
