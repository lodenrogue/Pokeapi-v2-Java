package com.lodenrogue.pokeapiv2.model;

public class GenerationGameIndex {
	private int gameIndex;
	private NamedAPIResource generation;

	public int getGameIndex() {
		return gameIndex;
	}

	public void setGameIndex(int gameIndex) {
		this.gameIndex = gameIndex;
	}

	public NamedAPIResource getGeneration() {
		return generation;
	}

	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
	}

}
