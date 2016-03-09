package com.lodenrogue.pokeapiv2.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class PokemonSpeciesDexEntry {
	@JsonProperty("entry_number")
	private int entryNumber;
	private NamedAPIResource name;

	public int getEntryNumber() {
		return entryNumber;
	}

	public void setEntryNumber(int entryNumber) {
		this.entryNumber = entryNumber;
	}

	public NamedAPIResource getName() {
		return name;
	}

	public void setName(NamedAPIResource name) {
		this.name = name;
	}

}
