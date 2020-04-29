package com.amdocs.monopoly.production;

import java.util.ArrayList;
import java.util.List;

public class Board {


	List<ISquare> boardPositions;
	
	
	public int getCurrentPosition(ISquare square) {
		return 0;
	}
	
	public void setupBoardPositions() {
		boardPositions = new ArrayList<ISquare>();
		
		boardPositions.add(new GoSquare());
		for(int i = 1; i < 40; ++i) {
			boardPositions.add(new Property(i*100, i*150, "Blue", "They're all blue"));
		}
	}
	
	/* Getters & Setters */
	public List<ISquare> getBoardPositions() {
		return boardPositions;
	}
	
	public ISquare getBoardPosition(int position) {
		return boardPositions.get(position);
	}

	public void setBoardPositions(List<ISquare> boardPositions) {
		this.boardPositions = boardPositions;
	}
	
	
}
