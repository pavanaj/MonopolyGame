package com.amdocs.monopoly.production;

public class GoSquare extends ISquare {

	private String squareType = "GO";
	private String squareName = "GO";
	
	public String getSquareName() {
		return squareName;
	}

	public String getType() {
		return this.squareType;
	}
	
	public GoSquare() {
		super();
	}

}
