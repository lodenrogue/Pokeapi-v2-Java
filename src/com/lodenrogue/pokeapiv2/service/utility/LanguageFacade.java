package com.lodenrogue.pokeapiv2.service.utility;

import com.lodenrogue.pokeapiv2.model.utility.Language;
import com.lodenrogue.pokeapiv2.service.AbstractFacade;
import com.lodenrogue.pokeapiv2.service.ResourceAddress;

public class LanguageFacade extends AbstractFacade<Language> {

	public LanguageFacade() {
		super(Language.class);
	}

	@Override
	protected String getAddress() {
		return ResourceAddress.LANGUAGE_URL;
	}

}
