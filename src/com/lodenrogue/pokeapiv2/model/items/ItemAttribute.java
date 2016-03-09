package com.lodenrogue.pokeapiv2.model.items;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Description;
import com.lodenrogue.pokeapiv2.model.Name;

/**
 * Item attributes define particular aspects of items, e.g. "usable in battle"
 * or "consumable".
 * 
 * @author Miguel Hernandez
 *
 */
public class ItemAttribute {
	private int id;
	private String name;
	private List<Item> items;
	private List<Name> names;
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

	public List<Description> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

}
