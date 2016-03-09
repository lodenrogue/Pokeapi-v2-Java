package com.lodenrogue.pokeapiv2.service.contests;

import com.lodenrogue.pokeapiv2.model.contests.ContestType;
import com.lodenrogue.pokeapiv2.service.AbstractFacade;
import com.lodenrogue.pokeapiv2.service.ResourceAddress;

public class ContestTypeFacade extends AbstractFacade<ContestType> {

	public ContestTypeFacade() {
		super(ContestType.class);
	}

	@Override
	protected String getAddress() {
		return ResourceAddress.CONTEST_TYPE_URL;
	}

}
