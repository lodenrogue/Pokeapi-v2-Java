package com.lodenrogue.pokeapiv2.model.locations;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.APIResource;
import com.lodenrogue.pokeapiv2.model.GenerationGameIndex;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Locations that can be visited within the games. Locations make up sizable
 * portions of regions, like cities or routes.
 * 
 * @author Miguel Hernandez
 *
 */
public class Location {
	private int id;
	private String name;
	private NamedAPIResource region;
	private List<Name> names;

	@JsonProperty("game_indices")
	private List<GenerationGameIndex> gameIndices;
	private List<APIResource<LocationArea>> areas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NamedAPIResource getRegion() {
		return region;
	}

	public void setRegion(NamedAPIResource region) {
		this.region = region;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public List<GenerationGameIndex> getGameIndices() {
		return gameIndices;
	}

	public void setGameIndices(List<GenerationGameIndex> gameIndices) {
		this.gameIndices = gameIndices;
	}

	public List<APIResource<LocationArea>> getAreas() {
		return areas;
	}

	public void setAreas(List<APIResource<LocationArea>> areas) {
		this.areas = areas;
	}

}
