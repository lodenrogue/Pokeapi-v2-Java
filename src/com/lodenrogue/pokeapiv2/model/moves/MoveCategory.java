package com.lodenrogue.pokeapiv2.model.moves;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Description;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Very general categories that loosely group move effects.
 * 
 * @author Miguel Hernandez
 *
 */
public class MoveCategory {
	private int id;
	private String name;
	private List<NamedAPIResource> moves;
	private List<Description> descriptions;

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

	public List<NamedAPIResource> getMoves() {
		return moves;
	}

	public void setMoves(List<NamedAPIResource> moves) {
		this.moves = moves;
	}

	public List<Description> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

}
