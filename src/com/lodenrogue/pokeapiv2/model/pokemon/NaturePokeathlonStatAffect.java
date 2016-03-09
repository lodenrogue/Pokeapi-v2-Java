package com.lodenrogue.pokeapiv2.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class NaturePokeathlonStatAffect {
	@JsonProperty("max_change")
	private int maxChange;
	private NamedAPIResource nature;

	public int getMaxChange() {
		return maxChange;
	}

	public void setMaxChange(int maxChange) {
		this.maxChange = maxChange;
	}

	public NamedAPIResource getNature() {
		return nature;
	}

	public void setNature(NamedAPIResource nature) {
		this.nature = nature;
	}

}
