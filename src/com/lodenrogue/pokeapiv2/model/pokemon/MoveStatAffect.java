package com.lodenrogue.pokeapiv2.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class MoveStatAffect {
	@JsonProperty("max_change")
	private int maxChange;
	private NamedAPIResource move;

	public int getMaxChange() {
		return maxChange;
	}

	public void setMaxChange(int maxChange) {
		this.maxChange = maxChange;
	}

	public NamedAPIResource getMove() {
		return move;
	}

	public void setMove(NamedAPIResource move) {
		this.move = move;
	}

}
