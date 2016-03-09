package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class Nature {
	private int id;
	private String name;

	@JsonProperty("decreased_stat")
	private NamedAPIResource decreasedStat;

	@JsonProperty("increased_stat")
	private NamedAPIResource increasedStat;

	@JsonProperty("hates_flavor")
	private NamedAPIResource hatesFlavor;

	@JsonProperty("likes_flavor")
	private NamedAPIResource likesFlavor;

	@JsonProperty("pokeathlon_stat_changes")
	private List<NatureStatChange> pokeathalonStatChanges;

	@JsonProperty("move_battle_style_preferences")
	private List<MoveBattleStylePreference> moveBattleStylePreference;

	private List<Name> names;

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

	public NamedAPIResource getDecreasedStat() {
		return decreasedStat;
	}

	public void setDecreasedStat(NamedAPIResource decreasedStat) {
		this.decreasedStat = decreasedStat;
	}

	public NamedAPIResource getIncreasedStat() {
		return increasedStat;
	}

	public void setIncreasedStat(NamedAPIResource increasedStat) {
		this.increasedStat = increasedStat;
	}

	public NamedAPIResource getHatesFlavor() {
		return hatesFlavor;
	}

	public void setHatesFlavor(NamedAPIResource hatesFlavor) {
		this.hatesFlavor = hatesFlavor;
	}

	public NamedAPIResource getLikesFlavor() {
		return likesFlavor;
	}

	public void setLikesFlavor(NamedAPIResource likesFlavor) {
		this.likesFlavor = likesFlavor;
	}

	public List<NatureStatChange> getPokeathalonStatChanges() {
		return pokeathalonStatChanges;
	}

	public void setPokeathalonStatChanges(List<NatureStatChange> pokeathalonStatChanges) {
		this.pokeathalonStatChanges = pokeathalonStatChanges;
	}

	public List<MoveBattleStylePreference> getMoveBattleStylePreference() {
		return moveBattleStylePreference;
	}

	public void setMoveBattleStylePreference(List<MoveBattleStylePreference> moveBattleStylePreference) {
		this.moveBattleStylePreference = moveBattleStylePreference;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

}
