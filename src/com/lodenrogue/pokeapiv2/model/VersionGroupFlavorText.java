package com.lodenrogue.pokeapiv2.model;

public class VersionGroupFlavorText {
	private String text;
	private NamedAPIResource language;
	private NamedAPIResource versionGroup;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public NamedAPIResource getLanguage() {
		return language;
	}

	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}

	public NamedAPIResource getVersionGroup() {
		return versionGroup;
	}

	public void setVersionGroup(NamedAPIResource versionGroup) {
		this.versionGroup = versionGroup;
	}
}