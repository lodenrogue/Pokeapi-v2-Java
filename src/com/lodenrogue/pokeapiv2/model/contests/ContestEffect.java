package com.lodenrogue.pokeapiv2.model.contests;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.Effect;
import com.lodenrogue.pokeapiv2.model.FlavorText;

/**
 * Contest effects refer to the effects of moves when used in contests.
 * 
 * @author Miguel Hernandez
 *
 */
public class ContestEffect {
	private int id;
	private String appeal;
	private int jam;

	@JsonProperty("effect_entries")
	private List<Effect> effectEntries;

	@JsonProperty("flavor_text_entries")
	private List<FlavorText> flavorTextEntries;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAppeal() {
		return appeal;
	}

	public void setAppeal(String appeal) {
		this.appeal = appeal;
	}

	public int getJam() {
		return jam;
	}

	public void setJam(int jam) {
		this.jam = jam;
	}

	public List<Effect> getEffectEntries() {
		return effectEntries;
	}

	public void setEffectEntries(List<Effect> effectEntries) {
		this.effectEntries = effectEntries;
	}

	public List<FlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}

	public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}

}
