package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.APIResource;
import com.lodenrogue.pokeapiv2.model.VersionEncounterDetail;
import com.lodenrogue.pokeapiv2.model.locations.LocationArea;

public class LocationAreaEncounter {
	@JsonProperty("location_area")
	private APIResource<LocationArea> locationArea;

	@JsonProperty("version_details")
	private List<VersionEncounterDetail> versionDetails;

	public APIResource<LocationArea> getLocationArea() {
		return locationArea;
	}

	public void setLocationArea(APIResource<LocationArea> locationArea) {
		this.locationArea = locationArea;
	}

	public List<VersionEncounterDetail> getVersionDetails() {
		return versionDetails;
	}

	public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
		this.versionDetails = versionDetails;
	}

}
