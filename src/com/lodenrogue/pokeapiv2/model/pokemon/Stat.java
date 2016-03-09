package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.APIResource;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class Stat {
	private int id;
	private String name;

	@JsonProperty("game_index")
	private int gameIndex;

	@JsonProperty("is_battle_only")
	private boolean isBattleOnly;

	@JsonProperty("affecting_moves")
	private MoveStatAffectSets affectingMoves;

	@JsonProperty("affecting_natures")
	private NatureStatAffectSets affectingNatures;

	private List<APIResource<Characteristic>> characteristics;

	@JsonProperty("move_damage_class")
	private NamedAPIResource moveDamageClass;

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

	public int getGameIndex() {
		return gameIndex;
	}

	public void setGameIndex(int gameIndex) {
		this.gameIndex = gameIndex;
	}

	public boolean isBattleOnly() {
		return isBattleOnly;
	}

	public void setBattleOnly(boolean isBattleOnly) {
		this.isBattleOnly = isBattleOnly;
	}

	public MoveStatAffectSets getAffectingMoves() {
		return affectingMoves;
	}

	public void setAffectingMoves(MoveStatAffectSets affectingMoves) {
		this.affectingMoves = affectingMoves;
	}

	public NatureStatAffectSets getAffectingNatures() {
		return affectingNatures;
	}

	public void setAffectingNatures(NatureStatAffectSets affectingNatures) {
		this.affectingNatures = affectingNatures;
	}

	public List<APIResource<Characteristic>> getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(List<APIResource<Characteristic>> characteristics) {
		this.characteristics = characteristics;
	}

	public NamedAPIResource getMoveDamageClass() {
		return moveDamageClass;
	}

	public void setMoveDamageClass(NamedAPIResource moveDamageClass) {
		this.moveDamageClass = moveDamageClass;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

}
