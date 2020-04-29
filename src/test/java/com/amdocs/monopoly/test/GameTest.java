package com.amdocs.monopoly.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.amdocs.monopoly.production.Game;
import com.amdocs.monopoly.production.ISquare;
import com.amdocs.monopoly.production.Player;


public class GameTest {
	
	Game game;
	
	@Before
	public void setUp() {
		game = new Game();
		game.setupNumberOfPlayers(3);
	}
	

	@Test
	public void testCreateGame() {
		Assert.assertNotNull(game);
	}

	
	@Test
	public void testGameBoard() {
		Assert.assertNotNull(game.getBoard());
	}
	
	@Test
	public void testGamePlayers() {
		Assert.assertNotNull(game.getPlayerList());
		Assert.assertEquals(3, game.getPlayerList().size());
	}
	
	@Test
	public void testPlayerMove() {
		Player testPlayer = game.getPlayerList().get(0);
		int startingPosition = testPlayer.getPlayerPosition();
		game.movePlayer(testPlayer);
		int newPosition = testPlayer.getPlayerPosition();
		Assert.assertNotEquals(startingPosition, newPosition);
	}
	
	/*@Test
	public void testSquareDetails() {
		Player testPlayer = game.getPlayerList().get(0);
		game.movePlayer(testPlayer);
		ISquare square = game.getBoard().getBoardPositions().get(testPlayer.getPlayerPosition());
		Assert.assertEquals(square.getType(), "property");
	}*/
	

	/*
	@Test
	public void testAllPlayersStartAtGo() {
		for(int i = 0; i < game.getNumPlayers(); ++i) {
			Assert.assertEquals(game.getPlayer(i).getPosition(), 0);
		}
	}*/
	
	@Test
	public void testRunOneTurn() {
		//game.runTurn();
		//Assert all players are moved a certain number of squares
	}

}
