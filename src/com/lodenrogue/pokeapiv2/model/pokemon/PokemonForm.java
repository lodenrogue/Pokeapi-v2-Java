package com.lodenrogue.pokeapiv2.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Some pokemon have the ability to take on different forms. At times, these
 * differences are purely cosmetic and have no bearing on the difference in the
 * Pokémon's stats from another; however, several Pokémon differ in stats (other
 * than HP), type, and Ability depending on their form.
 * 
 * @author Miguel Hernandez
 *
 */
public class PokemonForm {
	private int id;
	private String name;
	private int order;

	@JsonProperty("form_order")
	private int formOrder;

	@JsonProperty("is_default")
	private boolean isDefault;

	@JsonProperty("is_battle_only")
	private boolean isBattleOnly;

	@JsonProperty("is_mega")
	private boolean isMega;

	@JsonProperty("form_name")
	private String formName;

	private NamedAPIResource pokemon;

	@JsonProperty("version_group")
	private NamedAPIResource versionGroup;

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

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getFormOrder() {
		return formOrder;
	}

	public void setFormOrder(int formOrder) {
		this.formOrder = formOrder;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public boolean isBattleOnly() {
		return isBattleOnly;
	}

	public void setBattleOnly(boolean isBattleOnly) {
		this.isBattleOnly = isBattleOnly;
	}

	public boolean isMega() {
		return isMega;
	}

	public void setMega(boolean isMega) {
		this.isMega = isMega;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public NamedAPIResource getPokemon() {
		return pokemon;
	}

	public void setPokemon(NamedAPIResource pokemon) {
		this.pokemon = pokemon;
	}

	public NamedAPIResource getVersionGroup() {
		return versionGroup;
	}

	public void setVersionGroup(NamedAPIResource versionGroup) {
		this.versionGroup = versionGroup;
	}

}
