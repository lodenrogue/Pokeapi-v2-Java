package com.lodenrogue.pokeapiv2.model;

public class Description {
	private String description;
	private NamedAPIResource language;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public NamedAPIResource getLanguage() {
		return language;
	}

	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}
}