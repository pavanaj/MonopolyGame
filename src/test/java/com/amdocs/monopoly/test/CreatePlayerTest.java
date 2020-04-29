package com.amdocs.monopoly.test;

import org.junit.Assert;
import org.junit.Test;

import com.amdocs.monopoly.production.CreatePlayers;

public class CreatePlayerTest {

	@Test
	public void test() {
		CreatePlayers player = new CreatePlayers("didier", 200.5, 1, 3, 5 );
		Assert.assertNotNull(player);

	}

}
