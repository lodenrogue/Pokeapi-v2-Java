package com.lodenrogue.pokeapiv2.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class AwesomeName {
	@JsonProperty("awesome_name")
	private String awesomeName;
	private NamedAPIResource language;

	public String getAwesomeName() {
		return awesomeName;
	}

	public void setAwesomeName(String awesomeName) {
		this.awesomeName = awesomeName;
	}

	public NamedAPIResource getLanguage() {
		return language;
	}

	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}

}
