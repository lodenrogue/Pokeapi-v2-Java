package com.lodenrogue.pokeapiv2.model.moves;

import java.util.List;

public class ContestComboSets {
	private List<ContestComboDetail> normalMoves;
	private List<ContestComboDetail> superMoves;

	public List<ContestComboDetail> getNormalMoves() {
		return normalMoves;
	}

	public void setNormalMoves(List<ContestComboDetail> normalMoves) {
		this.normalMoves = normalMoves;
	}

	public List<ContestComboDetail> getSuperMoves() {
		return superMoves;
	}

	public void setSuperMoves(List<ContestComboDetail> superMoves) {
		this.superMoves = superMoves;
	}

}
