package com.lodenrogue.pokeapiv2.service.berries;

import com.lodenrogue.pokeapiv2.model.berries.Berry;
import com.lodenrogue.pokeapiv2.service.AbstractFacade;
import com.lodenrogue.pokeapiv2.service.ResourceAddress;

public class BerryFacade extends AbstractFacade<Berry> {

	public BerryFacade() {
		super(Berry.class);
	}

	@Override
	protected String getAddress() {
		return ResourceAddress.BERRY_URL;
	}

}
