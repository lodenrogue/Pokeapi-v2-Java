package com.lodenrogue.pokeapiv2.model.evolution;

import java.util.List;

import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * 
 * @author Miguel Hernandez
 *
 */
public class ChainLink {
	private boolean isBaby;
	private NamedAPIResource species;
	private EvolutionDetail evolutionDetails;
	private List<ChainLink> evolvesTo;

	public boolean isBaby() {
		return isBaby;
	}

	public void setBaby(boolean isBaby) {
		this.isBaby = isBaby;
	}

	public NamedAPIResource getSpecies() {
		return species;
	}

	public void setSpecies(NamedAPIResource species) {
		this.species = species;
	}

	public EvolutionDetail getEvolutionDetails() {
		return evolutionDetails;
	}

	public void setEvolutionDetails(EvolutionDetail evolutionDetails) {
		this.evolutionDetails = evolutionDetails;
	}

	public List<ChainLink> getEvolvesTo() {
		return evolvesTo;
	}

	public void setEvolvesTo(List<ChainLink> evolvesTo) {
		this.evolvesTo = evolvesTo;
	}

}
