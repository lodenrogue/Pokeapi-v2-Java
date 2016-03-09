package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.Effect;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class AbilityEffectChange {
	@JsonProperty("effect_entries")
	private List<Effect> effectEntries;

	@JsonProperty("version_group")
	private NamedAPIResource versionGroup;

	public List<Effect> getEffectEntries() {
		return effectEntries;
	}

	public void setEffectEntries(List<Effect> effectEntries) {
		this.effectEntries = effectEntries;
	}

	public NamedAPIResource getVersionGroup() {
		return versionGroup;
	}

	public void setVersionGroup(NamedAPIResource versionGroup) {
		this.versionGroup = versionGroup;
	}

}
