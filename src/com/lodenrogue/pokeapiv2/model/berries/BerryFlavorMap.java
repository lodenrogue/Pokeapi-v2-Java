package com.lodenrogue.pokeapiv2.model.berries;

import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class BerryFlavorMap {
	private int potency;
	private NamedAPIResource flavor;

	public int getPotency() {
		return potency;
	}

	public void setPotency(int potency) {
		this.potency = potency;
	}

	public NamedAPIResource getFlavor() {
		return flavor;
	}

	public void setFlavor(NamedAPIResource flavor) {
		this.flavor = flavor;
	}

}
