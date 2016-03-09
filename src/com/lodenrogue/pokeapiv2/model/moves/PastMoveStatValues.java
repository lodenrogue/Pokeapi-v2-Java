package com.lodenrogue.pokeapiv2.model.moves;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.NamedAPIResource;
import com.lodenrogue.pokeapiv2.model.VerboseEffect;
import com.lodenrogue.pokeapiv2.model.pokemon.Type;

public class PastMoveStatValues {
	private int accuracy;
	private int effectChance;
	private int power;
	private int pp;
	private List<VerboseEffect> effectEntries;
	private Type type;
	private NamedAPIResource versionGroup;

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getEffectChance() {
		return effectChance;
	}

	public void setEffectChance(int effectChance) {
		this.effectChance = effectChance;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getPp() {
		return pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public List<VerboseEffect> getEffectEntries() {
		return effectEntries;
	}

	public void setEffectEntries(List<VerboseEffect> effectEntries) {
		this.effectEntries = effectEntries;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public NamedAPIResource getVersionGroup() {
		return versionGroup;
	}

	public void setVersionGroup(NamedAPIResource versionGroup) {
		this.versionGroup = versionGroup;
	}

}
