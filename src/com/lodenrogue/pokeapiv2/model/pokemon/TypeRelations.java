package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class TypeRelations {
	@JsonProperty("no_damage_to")
	private List<NamedAPIResource> noDamageTo;

	@JsonProperty("half_damage_to")
	private List<NamedAPIResource> halfDamageTo;

	@JsonProperty("double_damage_to")
	private List<NamedAPIResource> doubleDamageTo;

	@JsonProperty("no_damage_from")
	private List<NamedAPIResource> noDamageFrom;

	@JsonProperty("half_damage_from")
	private List<NamedAPIResource> halfDamageFrom;

	@JsonProperty("double_damage_from")
	private List<NamedAPIResource> doubleDamageFrom;

	public List<NamedAPIResource> getNoDamageTo() {
		return noDamageTo;
	}

	public void setNoDamageTo(List<NamedAPIResource> noDamageTo) {
		this.noDamageTo = noDamageTo;
	}

	public List<NamedAPIResource> getHalfDamageTo() {
		return halfDamageTo;
	}

	public void setHalfDamageTo(List<NamedAPIResource> halfDamageTo) {
		this.halfDamageTo = halfDamageTo;
	}

	public List<NamedAPIResource> getDoubleDamageTo() {
		return doubleDamageTo;
	}

	public void setDoubleDamageTo(List<NamedAPIResource> doubleDamageTo) {
		this.doubleDamageTo = doubleDamageTo;
	}

	public List<NamedAPIResource> getNoDamageFrom() {
		return noDamageFrom;
	}

	public void setNoDamageFrom(List<NamedAPIResource> noDamageFrom) {
		this.noDamageFrom = noDamageFrom;
	}

	public List<NamedAPIResource> getHalfDamageFrom() {
		return halfDamageFrom;
	}

	public void setHalfDamageFrom(List<NamedAPIResource> halfDamageFrom) {
		this.halfDamageFrom = halfDamageFrom;
	}

	public List<NamedAPIResource> getDoubleDamageFrom() {
		return doubleDamageFrom;
	}

	public void setDoubleDamageFrom(List<NamedAPIResource> doubleDamageFrom) {
		this.doubleDamageFrom = doubleDamageFrom;
	}

}
