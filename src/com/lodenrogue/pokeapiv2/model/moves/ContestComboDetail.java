package com.lodenrogue.pokeapiv2.model.moves;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

public class ContestComboDetail {
	private List<NamedAPIResource> useBefore;
	private List<NamedAPIResource> useAfter;

	public List<NamedAPIResource> getUseBefore() {
		return useBefore;
	}

	public void setUseBefore(List<NamedAPIResource> useBefore) {
		this.useBefore = useBefore;
	}

	public List<NamedAPIResource> getUseAfter() {
		return useAfter;
	}

	public void setUseAfter(List<NamedAPIResource> useAfter) {
		this.useAfter = useAfter;
	}

}
