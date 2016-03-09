package com.lodenrogue.pokeapiv2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestClass {
	@JsonProperty("possible_values")
	private int[] possibleValues;

	public int[] getPossibleValues() {
		return possibleValues;
	}

	public void setPossibleValues(int[] possibleValues) {
		this.possibleValues = possibleValues;
	}
	
	

}
