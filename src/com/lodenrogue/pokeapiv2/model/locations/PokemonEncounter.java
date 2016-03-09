package com.lodenrogue.pokeapiv2.model.locations;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;
import com.lodenrogue.pokeapiv2.model.VersionEncounterDetail;

public class PokemonEncounter {
	private NamedAPIResource pokemon;

	@JsonProperty("version_details")
	private List<VersionEncounterDetail> versionDetails;

	public NamedAPIResource getPokemon() {
		return pokemon;
	}

	public void setPokemon(NamedAPIResource pokemon) {
		this.pokemon = pokemon;
	}

	public List<VersionEncounterDetail> getVersionDetails() {
		return versionDetails;
	}

	public void setVersionDetails(List<VersionEncounterDetail> versionDetails) {
		this.versionDetails = versionDetails;
	}

}
