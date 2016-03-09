package com.lodenrogue.pokeapiv2.service.contests;

import com.lodenrogue.pokeapiv2.model.contests.SuperContestEffect;
import com.lodenrogue.pokeapiv2.service.AbstractFacade;
import com.lodenrogue.pokeapiv2.service.ResourceAddress;

public class SuperContestEffectFacade extends AbstractFacade<SuperContestEffect> {

	public SuperContestEffectFacade() {
		super(SuperContestEffect.class);
	}

	@Override
	protected String getAddress() {
		return ResourceAddress.SUPER_CONTEST_EFFECT_URL;
	}

}
