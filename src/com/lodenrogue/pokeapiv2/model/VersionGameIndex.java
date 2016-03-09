package com.lodenrogue.pokeapiv2.model;

public class VersionGameIndex {
	private int gameIndex;
	private NamedAPIResource version;

	public int getGameIndex() {
		return gameIndex;
	}

	public void setGameIndex(int gameIndex) {
		this.gameIndex = gameIndex;
	}

	public NamedAPIResource getVersion() {
		return version;
	}

	public void setVersion(NamedAPIResource version) {
		this.version = version;
	}

}
