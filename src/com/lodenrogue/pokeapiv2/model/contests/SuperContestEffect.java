package com.lodenrogue.pokeapiv2.model.contests;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.FlavorText;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Super contest effects refer to the effects of moves when used in super
 * contests.
 * 
 * @author Miguel Hernandez
 *
 */
public class SuperContestEffect {
	private int id;
	private String appeal;

	@JsonProperty("flavor_text_entries")
	private List<FlavorText> flavorTextEntries;
	private List<NamedAPIResource> moves;

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

	public List<FlavorText> getFlavorTextEntries() {
		return flavorTextEntries;
	}

	public void setFlavorTextEntries(List<FlavorText> flavorTextEntries) {
		this.flavorTextEntries = flavorTextEntries;
	}

	public List<NamedAPIResource> getMoves() {
		return moves;
	}

	public void setMoves(List<NamedAPIResource> moves) {
		this.moves = moves;
	}

}
