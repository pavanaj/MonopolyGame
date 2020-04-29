package com.amdocs.monopoly.test;

import org.junit.Assert;
import org.junit.Test;

import com.amdocs.monopoly.production.Player;

public class CreatePlayerTest {

	@Test
	public void test() {
		Player player = new Player("didier", 200.5, 1, 3, 5 );
		Assert.assertNotNull(player);

	}

}
