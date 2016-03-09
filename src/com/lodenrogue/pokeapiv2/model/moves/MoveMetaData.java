package com.lodenrogue.pokeapiv2.model.moves;

import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class MoveMetaData {
	private NamedAPIResource ailment;
	private NamedAPIResource category;
	private int minHits;
	private int maxHits;
	private int minTurns;
	private int maxTurns;
	private int drain;
	private int healing;
	private int critRate;
	private int ailmentChance;
	private int flinchChance;
	private int statChance;

	public NamedAPIResource getAilment() {
		return ailment;
	}

	public void setAilment(NamedAPIResource ailment) {
		this.ailment = ailment;
	}

	public NamedAPIResource getCategory() {
		return category;
	}

	public void setCategory(NamedAPIResource category) {
		this.category = category;
	}

	public int getMinHits() {
		return minHits;
	}

	public void setMinHits(int minHits) {
		this.minHits = minHits;
	}

	public int getMaxHits() {
		return maxHits;
	}

	public void setMaxHits(int maxHits) {
		this.maxHits = maxHits;
	}

	public int getMinTurns() {
		return minTurns;
	}

	public void setMinTurns(int minTurns) {
		this.minTurns = minTurns;
	}

	public int getMaxTurns() {
		return maxTurns;
	}

	public void setMaxTurns(int maxTurns) {
		this.maxTurns = maxTurns;
	}

	public int getDrain() {
		return drain;
	}

	public void setDrain(int drain) {
		this.drain = drain;
	}

	public int getHealing() {
		return healing;
	}

	public void setHealing(int healing) {
		this.healing = healing;
	}

	public int getCritRate() {
		return critRate;
	}

	public void setCritRate(int critRate) {
		this.critRate = critRate;
	}

	public int getAilmentChance() {
		return ailmentChance;
	}

	public void setAilmentChance(int ailmentChance) {
		this.ailmentChance = ailmentChance;
	}

	public int getFlinchChance() {
		return flinchChance;
	}

	public void setFlinchChance(int flinchChance) {
		this.flinchChance = flinchChance;
	}

	public int getStatChance() {
		return statChance;
	}

	public void setStatChance(int statChance) {
		this.statChance = statChance;
	}

}
