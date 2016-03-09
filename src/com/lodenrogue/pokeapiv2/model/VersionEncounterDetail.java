package com.lodenrogue.pokeapiv2.model;

import java.util.List;

public class VersionEncounterDetail {
	private NamedAPIResource version;
	private int maxChance;
	private List<Encounter> encounterDetails;

	public NamedAPIResource getVersion() {
		return version;
	}

	public void setVersion(NamedAPIResource version) {
		this.version = version;
	}

	public int getMaxChance() {
		return maxChance;
	}

	public void setMaxChance(int maxChance) {
		this.maxChance = maxChance;
	}

	public List<Encounter> getEncounterDetails() {
		return encounterDetails;
	}

	public void setEncounterDetails(List<Encounter> encounterDetails) {
		this.encounterDetails = encounterDetails;
	}

}
