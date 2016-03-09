package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

public class NaturePokeathlonStatAffectSets {
	private List<NaturePokeathlonStatAffect> increase;
	private List<NaturePokeathlonStatAffect> decrease;

	public List<NaturePokeathlonStatAffect> getIncrease() {
		return increase;
	}

	public void setIncrease(List<NaturePokeathlonStatAffect> increase) {
		this.increase = increase;
	}

	public List<NaturePokeathlonStatAffect> getDecrease() {
		return decrease;
	}

	public void setDecrease(List<NaturePokeathlonStatAffect> decrease) {
		this.decrease = decrease;
	}

}
