package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.GenerationGameIndex;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;

/**
 * Types are properties for Pokémon and their moves. Each type has three
 * properties: which types of Pokémon it is super effective against, which types
 * of Pokémon it is not very effective against, and which types of Pokémon it is
 * completely ineffective against.
 * 
 * @author Miguel Hernandez
 *
 */
public class Type {
	private int id;
	private String name;

	@JsonProperty("damage_relations")
	private TypeRelations damageRelations;

	@JsonProperty("game_indices")
	private List<GenerationGameIndex> gameIndices;

	private NamedAPIResource generation;

	@JsonProperty("move_damage_class")
	private NamedAPIResource moveDamageClass;

	private List<Name> names;
	private TypePokemon pokemon;
	private List<NamedAPIResource> moves;

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

	public TypeRelations getDamageRelations() {
		return damageRelations;
	}

	public void setDamageRelations(TypeRelations damageRelations) {
		this.damageRelations = damageRelations;
	}

	public List<GenerationGameIndex> getGameIndices() {
		return gameIndices;
	}

	public void setGameIndices(List<GenerationGameIndex> gameIndices) {
		this.gameIndices = gameIndices;
	}

	public NamedAPIResource getGeneration() {
		return generation;
	}

	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
	}

	public NamedAPIResource getMoveDamageClass() {
		return moveDamageClass;
	}

	public void setMoveDamageClass(NamedAPIResource moveDamageClass) {
		this.moveDamageClass = moveDamageClass;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public TypePokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(TypePokemon pokemon) {
		this.pokemon = pokemon;
	}

	public List<NamedAPIResource> getMoves() {
		return moves;
	}

	public void setMoves(List<NamedAPIResource> moves) {
		this.moves = moves;
	}

}
