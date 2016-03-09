package com.lodenrogue.pokeapiv2.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class AbilityFlavorText {
	@JsonProperty("flavor_text")
	private String flavorText;

	private NamedAPIResource language;

	@JsonProperty("version_group")
	private NamedAPIResource versionGroup;

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

	public NamedAPIResource getVersionGroup() {
		return versionGroup;
	}

	public void setVersionGroup(NamedAPIResource versionGroup) {
		this.versionGroup = versionGroup;
	}

}
