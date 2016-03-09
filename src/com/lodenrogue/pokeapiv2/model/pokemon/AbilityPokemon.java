package com.lodenrogue.pokeapiv2.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class AbilityPokemon {
	@JsonProperty("is_hidden")
	private boolean isHidden;

	public boolean isHidden() {
		return isHidden;
	}

	public void setHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}

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

	private int slot;
	private NamedAPIResource pokemon;

}
