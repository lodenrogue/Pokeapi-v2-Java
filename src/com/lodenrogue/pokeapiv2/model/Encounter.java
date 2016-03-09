package com.lodenrogue.pokeapiv2.model;

import java.util.List;

public class Encounter {
	private int minLevel;
	private int maxLevel;
	private List<NamedAPIResource> conditionValues;
	private int chance;
	private NamedAPIResource method;

	public int getMinLevel() {
		return minLevel;
	}

	public void setMinLevel(int minLevel) {
		this.minLevel = minLevel;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}

	public List<NamedAPIResource> getConditionValues() {
		return conditionValues;
	}

	public void setConditionValues(List<NamedAPIResource> conditionValues) {
		this.conditionValues = conditionValues;
	}

	public int getChance() {
		return chance;
	}

	public void setChance(int chance) {
		this.chance = chance;
	}

	public NamedAPIResource getMethod() {
		return method;
	}

	public void setMethod(NamedAPIResource method) {
		this.method = method;
	}
}