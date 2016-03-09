package com.lodenrogue.pokeapiv2.model.locations;

import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class EncounterVersionDetails {
	private int rate;
	private NamedAPIResource version;

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public NamedAPIResource getVersion() {
		return version;
	}

	public void setVersion(NamedAPIResource version) {
		this.version = version;
	}

}
