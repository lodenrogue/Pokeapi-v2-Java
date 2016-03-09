package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.Name;

public class PokeathlonStat {
	private int id;
	private String name;
	private List<Name> names;

	@JsonProperty("affecting_natures")
	private NaturePokeathlonStatAffectSets affectingNatures;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public NaturePokeathlonStatAffectSets getAffectingNatures() {
		return affectingNatures;
	}

	public void setAffectingNatures(NaturePokeathlonStatAffectSets affectingNatures) {
		this.affectingNatures = affectingNatures;
	}

}
