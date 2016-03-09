package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

public class NatureStatAffectSets {
	private List<NatureStatAffect> increase;
	private List<NatureStatAffect> decrease;

	public List<NatureStatAffect> getIncrease() {
		return increase;
	}

	public void setIncrease(List<NatureStatAffect> increase) {
		this.increase = increase;
	}

	public List<NatureStatAffect> getDecrease() {
		return decrease;
	}

	public void setDecrease(List<NatureStatAffect> decrease) {
		this.decrease = decrease;
	}

}
