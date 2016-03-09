package com.lodenrogue.pokeapiv2.service.encounter;

import com.lodenrogue.pokeapiv2.model.encounters.EncounterMethod;
import com.lodenrogue.pokeapiv2.service.AbstractFacade;
import com.lodenrogue.pokeapiv2.service.ResourceAddress;

public class EncounterMethodFacade extends AbstractFacade<EncounterMethod> {

	public EncounterMethodFacade() {
		super(EncounterMethod.class);
	}

	@Override
	protected String getAddress() {
		return ResourceAddress.ENCOUNTER_METHOD_URL;
	}

}
