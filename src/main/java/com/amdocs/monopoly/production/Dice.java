package com.amdocs.monopoly.production;

public class Dice {

	public Dice() {

	}

	public static int roll() {
		return (int) (Math.random() * 6 + 1);
	}
	
	public static int getSteps() {
		int roll1 = roll();
		int roll2 = roll();
		if(roll1 == roll2) {
			System.out.println("Doubles!");
		}
		return roll1 + roll2;
	}
	
}
