package com.lodenrogue.pokeapiv2.model.games;

import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * 
 * @author Miguel Hernandez
 *
 */
public class PokemonEntry {
	private int entryNumber;
	private NamedAPIResource pokemonSpecies;

	public int getEntryNumber() {
		return entryNumber;
	}

	public void setEntryNumber(int entryNumber) {
		this.entryNumber = entryNumber;
	}

	public NamedAPIResource getPokemonSpecies() {
		return pokemonSpecies;
	}

	public void setPokemonSpecies(NamedAPIResource pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}
}