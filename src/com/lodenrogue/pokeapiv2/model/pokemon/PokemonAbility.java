package com.lodenrogue.pokeapiv2.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class PokemonAbility {
	@JsonProperty("is_hidden")
	private int isHidden;
	private int slot;
	private NamedAPIResource ability;

	public int getIsHidden() {
		return isHidden;
	}

	public void setIsHidden(int isHidden) {
		this.isHidden = isHidden;
	}

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public NamedAPIResource getAbility() {
		return ability;
	}

	public void setAbility(NamedAPIResource ability) {
		this.ability = ability;
	}

}
