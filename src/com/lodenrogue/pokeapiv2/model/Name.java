package com.lodenrogue.pokeapiv2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Name {
	@JsonProperty("name")
	private String name;

	@JsonProperty("language")
	private NamedAPIResource language;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NamedAPIResource getLanguage() {
		return language;
	}

	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}
}