package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.Description;

/**
 * Characteristics indicate which stat contains a Pokémon's highest IV. A
 * Pokémon's Characteristic is determined by the remainder of its highest IV
 * divided by 5 (geneModulo).
 * 
 * @author Miguel Hernandez
 *
 */
public class Characteristic {
	@JsonProperty("gene_modulo")
	private int geneModulo;

	@JsonProperty("possible_values")
	private int[] possibleValues;

	private int id;
	private List<Description> descriptions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGeneModulo() {
		return geneModulo;
	}

	public void setGeneModulo(int geneModulo) {
		this.geneModulo = geneModulo;
	}

	public int[] getPossibleValues() {
		return possibleValues;
	}

	public void setPossibleValues(int[] possibleValues) {
		this.possibleValues = possibleValues;
	}

	public List<Description> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}

}
