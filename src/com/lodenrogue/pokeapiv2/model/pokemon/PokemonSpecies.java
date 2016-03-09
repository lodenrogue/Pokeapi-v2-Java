package com.lodenrogue.pokeapiv2.model.pokemon;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lodenrogue.pokeapiv2.model.APIResource;
import com.lodenrogue.pokeapiv2.model.Description;
import com.lodenrogue.pokeapiv2.model.Name;
import com.lodenrogue.pokeapiv2.model.NamedAPIResource;
import com.lodenrogue.pokeapiv2.model.evolution.EvolutionChain;

/**
 * A Pokemon Species forms the basis for at least one pokemon. Attributes of a
 * Pokemon species are shared across all varieties of pokemon within the
 * species. A good example is Wormadam; Wormadam is the species which can be
 * found in three different varieties, Wormadam-Trash, Wormadam-Sandy and
 * Wormadam-Plant.
 * 
 * @author Miguel Hernandez
 *
 */
public class PokemonSpecies {
	private int id;
	private String name;
	private int order;

	@JsonProperty("gender_rate")
	private int genderRate;

	@JsonProperty("capture_rate")
	private int captureRate;

	@JsonProperty("base_happiness")
	private int baseHappiness;

	@JsonProperty("is_baby")
	private boolean isBaby;

	@JsonProperty("hatch_counter")
	private int hatchCounter;

	@JsonProperty("has_gender_differences")
	private boolean hasGenderDifferences;

	@JsonProperty("forms_switchable")
	private boolean formsSwitchable;

	@JsonProperty("growth_rate")
	private NamedAPIResource growthRate;

	@JsonProperty("pokedex_numbers")
	private List<PokemonSpeciesDexEntry> pokedexNumbers;

	@JsonProperty("egg_groups")
	private List<NamedAPIResource> eggGroups;

	private PokemonColor color;
	private PokemonShape shape;

	@JsonProperty("evolves_from_species")
	private NamedAPIResource evolvesFromSpecies;

	@JsonProperty("evolution_chain")
	private APIResource<EvolutionChain> evolutionChain;

	private NamedAPIResource habitat;
	private NamedAPIResource generation;
	private List<Name> names;

	@JsonProperty("pal_park_encounters")
	private List<PalParkEncounterArea> palParkEncounters;

	@JsonProperty("form_descriptions")
	private List<Description> formDescriptions;

	private Genus genera;
	private List<NamedAPIResource> varieties;

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

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getGenderRate() {
		return genderRate;
	}

	public void setGenderRate(int genderRate) {
		this.genderRate = genderRate;
	}

	public int getCaptureRate() {
		return captureRate;
	}

	public void setCaptureRate(int captureRate) {
		this.captureRate = captureRate;
	}

	public int getBaseHappiness() {
		return baseHappiness;
	}

	public void setBaseHappiness(int baseHappiness) {
		this.baseHappiness = baseHappiness;
	}

	public boolean isBaby() {
		return isBaby;
	}

	public void setBaby(boolean isBaby) {
		this.isBaby = isBaby;
	}

	public int getHatchCounter() {
		return hatchCounter;
	}

	public void setHatchCounter(int hatchCounter) {
		this.hatchCounter = hatchCounter;
	}

	public boolean isHasGenderDifferences() {
		return hasGenderDifferences;
	}

	public void setHasGenderDifferences(boolean hasGenderDifferences) {
		this.hasGenderDifferences = hasGenderDifferences;
	}

	public boolean isFormsSwitchable() {
		return formsSwitchable;
	}

	public void setFormsSwitchable(boolean formsSwitchable) {
		this.formsSwitchable = formsSwitchable;
	}

	public NamedAPIResource getGrowthRate() {
		return growthRate;
	}

	public void setGrowthRate(NamedAPIResource growthRate) {
		this.growthRate = growthRate;
	}

	public List<PokemonSpeciesDexEntry> getPokedexNumbers() {
		return pokedexNumbers;
	}

	public void setPokedexNumbers(List<PokemonSpeciesDexEntry> pokedexNumbers) {
		this.pokedexNumbers = pokedexNumbers;
	}

	public List<NamedAPIResource> getEggGroups() {
		return eggGroups;
	}

	public void setEggGroups(List<NamedAPIResource> eggGroups) {
		this.eggGroups = eggGroups;
	}

	public PokemonColor getColor() {
		return color;
	}

	public void setColor(PokemonColor color) {
		this.color = color;
	}

	public PokemonShape getShape() {
		return shape;
	}

	public void setShape(PokemonShape shape) {
		this.shape = shape;
	}

	public NamedAPIResource getEvolvesFromSpecies() {
		return evolvesFromSpecies;
	}

	public void setEvolvesFromSpecies(NamedAPIResource evolvesFromSpecies) {
		this.evolvesFromSpecies = evolvesFromSpecies;
	}

	public APIResource<EvolutionChain> getEvolutionChain() {
		return evolutionChain;
	}

	public void setEvolutionChain(APIResource<EvolutionChain> evolutionChain) {
		this.evolutionChain = evolutionChain;
	}

	public NamedAPIResource getHabitat() {
		return habitat;
	}

	public void setHabitat(NamedAPIResource habitat) {
		this.habitat = habitat;
	}

	public NamedAPIResource getGeneration() {
		return generation;
	}

	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
	}

	public List<Name> getNames() {
		return names;
	}

	public void setNames(List<Name> names) {
		this.names = names;
	}

	public List<PalParkEncounterArea> getPalParkEncounters() {
		return palParkEncounters;
	}

	public void setPalParkEncounters(List<PalParkEncounterArea> palParkEncounters) {
		this.palParkEncounters = palParkEncounters;
	}

	public List<Description> getFormDescriptions() {
		return formDescriptions;
	}

	public void setFormDescriptions(List<Description> formDescriptions) {
		this.formDescriptions = formDescriptions;
	}

	public Genus getGenera() {
		return genera;
	}

	public void setGenera(Genus genera) {
		this.genera = genera;
	}

	public List<NamedAPIResource> getVarieties() {
		return varieties;
	}

	public void setVarieties(List<NamedAPIResource> varieties) {
		this.varieties = varieties;
	}

}
