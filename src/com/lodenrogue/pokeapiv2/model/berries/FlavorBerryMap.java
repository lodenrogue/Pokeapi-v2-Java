package com.lodenrogue.pokeapiv2.model.berries;

import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class FlavorBerryMap {
	private int potency;
	private NamedAPIResource berry;

	public int getPotency() {
		return potency;
	}

	public void setPotency(int potency) {
		this.potency = potency;
	}

	public NamedAPIResource getBerry() {
		return berry;
	}

	public void setBerry(NamedAPIResource berry) {
		this.berry = berry;
	}

}
