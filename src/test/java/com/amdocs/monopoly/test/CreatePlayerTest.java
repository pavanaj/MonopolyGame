package com.amdocs.monopoly.test;

import org.junit.Assert;
import org.junit.Test;

import com.amdocs.monopoly.production.Player;

public class CreatePlayerTest {

	@Test
	public void NewPlayerTest() {
		Player player = new Player("didier",3, 5 );
		Assert.assertNotNull(player);

	}
	public void BuyPropertyTest() {
		//BuyProperty = new BuyProperty();
	}


}
