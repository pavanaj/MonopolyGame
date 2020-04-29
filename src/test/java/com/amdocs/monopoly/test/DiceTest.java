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
		int num = dice.roll();
		System.out.println(num);
		Assert.assertTrue((num <= 6 && num >=1));
	}

}
