package com.lodenrogue.pokeapiv2.model;

public class VerboseEffect {
	private String effect;
	private String shortEffect;
	private NamedAPIResource language;

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getShortEffect() {
		return shortEffect;
	}

	public void setShortEffect(String shortEffect) {
		this.shortEffect = shortEffect;
	}

	public NamedAPIResource getLanguage() {
		return language;
	}

	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}
}