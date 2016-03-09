package com.lodenrogue.pokeapiv2.model.pokemon;

import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class TypePokemon {
	private int slot;
	private NamedAPIResource pokemon;

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public NamedAPIResource getPokemon() {
		return pokemon;
	}

	public void setPokemon(NamedAPIResource pokemon) {
		this.pokemon = pokemon;
	}

}
