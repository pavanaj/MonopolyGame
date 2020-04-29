package com.amdocs.monopoly.test;

import org.junit.Assert;
import org.junit.Test;

import com.amdocs.monopoly.production.Dice;

public class DiceTest {

	@Test
	public void DiceExist() {
		Dice dice = new Dice();
		
		Assert.assertNotNull(dice);
	}
	
	@Test
	public void DiceReturnsNumber() {
		Dice dice = new Dice();
<<<<<<< Updated upstream
		int num = dice.randomNumberGenerator();
		System.out.println(num);
=======
		int num = dice.roll();
>>>>>>> Stashed changes
		Assert.assertTrue((num <= 6 && num >=1));
	}
	
	@Test
	public void DiceGetSteps() {
		Dice dice = new Dice();
		int num = dice.getSteps();
		Assert.assertTrue((num <= 12 && num >=2));
	}

}
