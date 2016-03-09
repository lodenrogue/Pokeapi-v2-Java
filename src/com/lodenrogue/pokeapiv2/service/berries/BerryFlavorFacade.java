package com.lodenrogue.pokeapiv2.service.berries;

import com.lodenrogue.pokeapiv2.model.berries.BerryFlavor;
import com.lodenrogue.pokeapiv2.service.AbstractFacade;
import com.lodenrogue.pokeapiv2.service.ResourceAddress;

public class BerryFlavorFacade extends AbstractFacade<BerryFlavor> {

	public BerryFlavorFacade() {
		super(BerryFlavor.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String getAddress() {
		return ResourceAddress.BERRY_FLAVOR_URL;
	}

}
