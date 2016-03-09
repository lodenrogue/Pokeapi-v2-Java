package com.lodenrogue.pokeapiv2.model.items;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Item categories determine where items will be placed in the players bag.
 * 
 * @author Miguel Hernandez
 *
 */
public class ItemCategory {
	private int id;
	private String name;
	private List<Item> items;
	private List<Name> names;
	private NamedAPIResource pocket;

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

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public NamedAPIResource getPocket() {
		return pocket;
	}

	public void setPocket(NamedAPIResource pocket) {
		this.pocket = pocket;
	}
}