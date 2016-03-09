package com.lodenrogue.pokeapiv2.model.evolution;

import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * 
 * @author Miguel Hernandez
 *
 */
public class EvolutionDetail {
	private NamedAPIResource item;
	private NamedAPIResource trigger;
	private NamedAPIResource gender;
	private NamedAPIResource heldItem;
	private NamedAPIResource knownMove;
	private NamedAPIResource knownMoveType;
	private NamedAPIResource location;
	private int minLevel;
	private int minHappiness;
	private int minBeauty;
	private int minAffection;
	private boolean needsOverworldRain;
	private NamedAPIResource partySpecies;
	private NamedAPIResource partyType;
	private int relativePhysicalStats;
	private String timeOfDay;
	private NamedAPIResource tradeSpecies;
	private boolean turnUpsideDown;

	public NamedAPIResource getItem() {
		return item;
	}

	public void setItem(NamedAPIResource item) {
		this.item = item;
	}

	public NamedAPIResource getTrigger() {
		return trigger;
	}

	public void setTrigger(NamedAPIResource trigger) {
		this.trigger = trigger;
	}

	public NamedAPIResource getGender() {
		return gender;
	}

	public void setGender(NamedAPIResource gender) {
		this.gender = gender;
	}

	public NamedAPIResource getHeldItem() {
		return heldItem;
	}

	public void setHeldItem(NamedAPIResource heldItem) {
		this.heldItem = heldItem;
	}

	public NamedAPIResource getKnownMove() {
		return knownMove;
	}

	public void setKnownMove(NamedAPIResource knownMove) {
		this.knownMove = knownMove;
	}

	public NamedAPIResource getKnownMoveType() {
		return knownMoveType;
	}

	public void setKnownMoveType(NamedAPIResource knownMoveType) {
		this.knownMoveType = knownMoveType;
	}

	public NamedAPIResource getLocation() {
		return location;
	}

	public void setLocation(NamedAPIResource location) {
		this.location = location;
	}

	public int getMinLevel() {
		return minLevel;
	}

	public void setMinLevel(int minLevel) {
		this.minLevel = minLevel;
	}

	public int getMinHappiness() {
		return minHappiness;
	}

	public void setMinHappiness(int minHappiness) {
		this.minHappiness = minHappiness;
	}

	public int getMinBeauty() {
		return minBeauty;
	}

	public void setMinBeauty(int minBeauty) {
		this.minBeauty = minBeauty;
	}

	public int getMinAffection() {
		return minAffection;
	}

	public void setMinAffection(int minAffection) {
		this.minAffection = minAffection;
	}

	public boolean isNeedsOverworldRain() {
		return needsOverworldRain;
	}

	public void setNeedsOverworldRain(boolean needsOverworldRain) {
		this.needsOverworldRain = needsOverworldRain;
	}

	public NamedAPIResource getPartySpecies() {
		return partySpecies;
	}

	public void setPartySpecies(NamedAPIResource partySpecies) {
		this.partySpecies = partySpecies;
	}

	public NamedAPIResource getPartyType() {
		return partyType;
	}

	public void setPartyType(NamedAPIResource partyType) {
		this.partyType = partyType;
	}

	public int getRelativePhysicalStats() {
		return relativePhysicalStats;
	}

	public void setRelativePhysicalStats(int relativePhysicalStats) {
		this.relativePhysicalStats = relativePhysicalStats;
	}

	public String getTimeOfDay() {
		return timeOfDay;
	}

	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	public NamedAPIResource getTradeSpecies() {
		return tradeSpecies;
	}

	public void setTradeSpecies(NamedAPIResource tradeSpecies) {
		this.tradeSpecies = tradeSpecies;
	}

	public boolean isTurnUpsideDown() {
		return turnUpsideDown;
	}

	public void setTurnUpsideDown(boolean turnUpsideDown) {
		this.turnUpsideDown = turnUpsideDown;
	}

}
