package com.amdocs.monopoly.production;

public class Dice {

	public Dice() {

	}

	public int randomNumberGenerator() {
		return (int) (Math.random() * 6 + 1);
	}
	
}
