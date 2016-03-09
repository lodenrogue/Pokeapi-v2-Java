package com.lodenrogue.pokeapiv2.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class MoveBattleStylePreference {
	@JsonProperty("low_hp_preference")
	private int lowHPPreference;

	@JsonProperty("high_hp_preference")
	private int highHPPreference;

	@JsonProperty("move_battle_style")
	private NamedAPIResource moveBattleStyle;

	public int getLowHPPreference() {
		return lowHPPreference;
	}

	public void setLowHPPreference(int lowHPPreference) {
		this.lowHPPreference = lowHPPreference;
	}

	public int getHighHPPreference() {
		return highHPPreference;
	}

	public void setHighHPPreference(int highHPPreference) {
		this.highHPPreference = highHPPreference;
	}

	public NamedAPIResource getMoveBattleStyle() {
		return moveBattleStyle;
	}

	public void setMoveBattleStyle(NamedAPIResource moveBattleStyle) {
		this.moveBattleStyle = moveBattleStyle;
	}

}
