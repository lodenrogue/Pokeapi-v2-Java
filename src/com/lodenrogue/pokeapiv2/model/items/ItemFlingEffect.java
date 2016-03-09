package com.lodenrogue.pokeapiv2.model.items;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Effect;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * The various effects of the move "Fling" when used with different items.
 * 
 * @author Miguel Hernandez
 *
 */
public class ItemFlingEffect {
	private int id;
	private String name;
	private List<Effect> effects;
	private List<NamedAPIResource> items;

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

	public List<Effect> getEffects() {
		return effects;
	}

	public void setEffects(List<Effect> effects) {
		this.effects = effects;
	}

	public List<NamedAPIResource> getItems() {
		return items;
	}

	public void setItems(List<NamedAPIResource> items) {
		this.items = items;
	}

}