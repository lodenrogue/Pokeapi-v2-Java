package com.lodenrogue.pokeapiv2.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class PalParkEncounterArea {
	@JsonProperty("base_score")
	private int baseScore;
	private int rate;
	private NamedAPIResource area;

	public int getBaseScore() {
		return baseScore;
	}

	public void setBaseScore(int baseScore) {
		this.baseScore = baseScore;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public NamedAPIResource getArea() {
		return area;
	}

	public void setArea(NamedAPIResource area) {
		this.area = area;
	}

}
