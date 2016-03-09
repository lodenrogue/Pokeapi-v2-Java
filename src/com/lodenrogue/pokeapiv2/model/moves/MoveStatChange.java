package com.lodenrogue.pokeapiv2.model.moves;

import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class MoveStatChange {
	private int change;
	private NamedAPIResource stat;

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}

	public NamedAPIResource getStat() {
		return stat;
	}

	public void setStat(NamedAPIResource stat) {
		this.stat = stat;
	}

}
