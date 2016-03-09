package com.lodenrogue.pokeapiv2.model.pokemon;

import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class Genus {
	private String genus;
	private NamedAPIResource language;

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public NamedAPIResource getLanguage() {
		return language;
	}

	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}

}
