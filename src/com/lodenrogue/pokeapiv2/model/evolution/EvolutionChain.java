package com.lodenrogue.pokeapiv2.model.evolution;

import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Evolution chains are essentially family trees. They start with the lowest
 * stage within a family and detail evolution conditions for each as well as
 * pokemon they can evolve into up through the hierarchy.
 * 
 * @author Miguel Hernandez
 *
 */
public class EvolutionChain {
	private int id;
	private NamedAPIResource babyTriggerItem;
	private ChainLink chain;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public NamedAPIResource getBabyTriggerItem() {
		return babyTriggerItem;
	}

	public void setBabyTriggerItem(NamedAPIResource babyTriggerItem) {
		this.babyTriggerItem = babyTriggerItem;
	}

	public ChainLink getChain() {
		return chain;
	}

	public void setChain(ChainLink chain) {
		this.chain = chain;
	}

}
