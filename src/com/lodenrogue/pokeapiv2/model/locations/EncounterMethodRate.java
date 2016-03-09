package com.lodenrogue.pokeapiv2.model.locations;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.encounters.EncounterMethod;

public class EncounterMethodRate {
	@JsonProperty("encounter_method")
	private EncounterMethod encounterMethod;

	@JsonProperty("version_details")
	private List<EncounterVersionDetails> versionDetails;

	public EncounterMethod getEncounterMethod() {
		return encounterMethod;
	}

	public void setEncounterMethod(EncounterMethod encounterMethod) {
		this.encounterMethod = encounterMethod;
	}

	public List<EncounterVersionDetails> getVersionDetails() {
		return versionDetails;
	}

	public void setVersionDetails(List<EncounterVersionDetails> versionDetails) {
		this.versionDetails = versionDetails;
	}

}
