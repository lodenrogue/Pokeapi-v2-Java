package com.lodenrogue.pokeapiv2.model.berries;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Berries are small fruits that can provide HP and status condition
 * restoration, stat enhancement, and even damage negation when eaten by
 * pokemon.
 * 
 * @author Miguel Hernandez
 *
 */
public class Berry {
	private int id;
	private String name;

	@JsonProperty("growth_time")
	private int growthTime;

	@JsonProperty("max_harvest")
	private int maxHarvest;

	@JsonProperty("natural_gift_power")
	private int naturalGiftPower;

	private int size;
	private int smoothness;

	@JsonProperty("soil_dryness")
	private int soilDryness;

	private NamedAPIResource firmness;
	private List<BerryFlavorMap> flavors;
	private NamedAPIResource item;

	@JsonProperty("natural_gift_type")
	private NamedAPIResource naturalGiftType;

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

	public int getGrowthTime() {
		return growthTime;
	}

	public void setGrowthTime(int growthTime) {
		this.growthTime = growthTime;
	}

	public int getMaxHarvest() {
		return maxHarvest;
	}

	public void setMaxHarvest(int maxHarvest) {
		this.maxHarvest = maxHarvest;
	}

	public int getNaturalGiftPower() {
		return naturalGiftPower;
	}

	public void setNaturalGiftPower(int naturalGiftPower) {
		this.naturalGiftPower = naturalGiftPower;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSmoothness() {
		return smoothness;
	}

	public void setSmoothness(int smoothness) {
		this.smoothness = smoothness;
	}

	public int getSoilDryness() {
		return soilDryness;
	}

	public void setSoilDryness(int soilDryness) {
		this.soilDryness = soilDryness;
	}

	public NamedAPIResource getFirmness() {
		return firmness;
	}

	public void setFirmness(NamedAPIResource firmness) {
		this.firmness = firmness;
	}

	public List<BerryFlavorMap> getFlavors() {
		return flavors;
	}

	public void setFlavors(List<BerryFlavorMap> flavors) {
		this.flavors = flavors;
	}

	public NamedAPIResource getItem() {
		return item;
	}

	public void setItem(NamedAPIResource item) {
		this.item = item;
	}

	public NamedAPIResource getNaturalGiftType() {
		return naturalGiftType;
	}

	public void setNaturalGiftType(NamedAPIResource naturalGiftType) {
		this.naturalGiftType = naturalGiftType;
	}

}
