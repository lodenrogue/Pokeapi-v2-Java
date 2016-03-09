package com.lodenrogue.pokeapiv2.service.contests;

import com.lodenrogue.pokeapiv2.model.contests.ContestEffect;
import com.lodenrogue.pokeapiv2.service.AbstractFacade;
import com.lodenrogue.pokeapiv2.service.ResourceAddress;

public class ContestEffectFacade extends AbstractFacade<ContestEffect> {

	public ContestEffectFacade() {
		super(ContestEffect.class);
	}

	@Override
	protected String getAddress() {
		return ResourceAddress.CONTEST_EFFECT_URL;
	}

}
