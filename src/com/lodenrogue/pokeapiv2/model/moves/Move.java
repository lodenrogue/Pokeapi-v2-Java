package com.lodenrogue.pokeapiv2.model.moves;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;
import com.lodenrogue.pokeapiv2.model.VerboseEffect;
import com.lodenrogue.pokeapiv2.model.pokemon.AbilityEffectChange;
import com.lodenrogue.pokeapiv2.model.pokemon.Type;

/**
 * Moves are the skills of pokemon in battle. In battle, a Pokémon uses one move
 * each turn. Some moves (including those learned by Hidden Machine) can be used
 * outside of battle as well, usually for the purpose of removing obstacles or
 * exploring new areas.
 * 
 * @author Miguel Hernandez
 *
 */
public class Move {
	private int id;
	private String name;
	private int accuracy;
	private int effectChance;
	private int pp;
	private int priority;
	private int power;
	private List<ContestComboSets> contestCombos;
	private NamedAPIResource contestType;
	private NamedAPIResource contestEffect;
	private NamedAPIResource damageClass;
	private List<VerboseEffect> effectEntries;
	private List<AbilityEffectChange> effectChanges;
	private NamedAPIResource generation;
	private MoveMetaData meta;
	private List<Name> names;
	private List<PastMoveStatValues> pastValues;
	private List<MoveStatChange> statChanges;
	private NamedAPIResource superContestEffect;
	private MoveTarget target;
	private Type type;

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

	public int getPp() {
		return pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public List<ContestComboSets> getContestCombos() {
		return contestCombos;
	}

	public void setContestCombos(List<ContestComboSets> contestCombos) {
		this.contestCombos = contestCombos;
	}

	public NamedAPIResource getContestType() {
		return contestType;
	}

	public void setContestType(NamedAPIResource contestType) {
		this.contestType = contestType;
	}

	public NamedAPIResource getContestEffect() {
		return contestEffect;
	}

	public void setContestEffect(NamedAPIResource contestEffect) {
		this.contestEffect = contestEffect;
	}

	public NamedAPIResource getDamageClass() {
		return damageClass;
	}

	public void setDamageClass(NamedAPIResource damageClass) {
		this.damageClass = damageClass;
	}

	public List<VerboseEffect> getEffectEntries() {
		return effectEntries;
	}

	public void setEffectEntries(List<VerboseEffect> effectEntries) {
		this.effectEntries = effectEntries;
	}

	public List<AbilityEffectChange> getEffectChanges() {
		return effectChanges;
	}

	public void setEffectChanges(List<AbilityEffectChange> effectChanges) {
		this.effectChanges = effectChanges;
	}

	public NamedAPIResource getGeneration() {
		return generation;
	}

	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
	}

	public MoveMetaData getMeta() {
		return meta;
	}

	public void setMeta(MoveMetaData meta) {
		this.meta = meta;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public List<PastMoveStatValues> getPastValues() {
		return pastValues;
	}

	public void setPastValues(List<PastMoveStatValues> pastValues) {
		this.pastValues = pastValues;
	}

	public List<MoveStatChange> getStatChanges() {
		return statChanges;
	}

	public void setStatChanges(List<MoveStatChange> statChanges) {
		this.statChanges = statChanges;
	}

	public NamedAPIResource getSuperContestEffect() {
		return superContestEffect;
	}

	public void setSuperContestEffect(NamedAPIResource superContestEffect) {
		this.superContestEffect = superContestEffect;
	}

	public MoveTarget getTarget() {
		return target;
	}

	public void setTarget(MoveTarget target) {
		this.target = target;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}