package com.lodenrogue.pokeapiv2.model.items;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Name;

/**
 * Pockets within the players bag used for storing items by category.
 * 
 * @author Miguel Hernandez
 *
 */
public class ItemPocket {
	private int id;
	private String name;
	private List<ItemCategory> categories;
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

	public List<ItemCategory> getCategories() {
		return categories;
	}

	public void setCategories(List<ItemCategory> categories) {
		this.categories = categories;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

}
