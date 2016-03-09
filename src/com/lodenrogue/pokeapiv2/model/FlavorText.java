package com.lodenrogue.pokeapiv2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlavorText {
	@JsonProperty("flavor_text")
	private String flavorText;
	private NamedAPIResource language;

	public String getFlavorText() {
		return flavorText;
	}

	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}

	public NamedAPIResource getLanguage() {
		return language;
	}

	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}
}