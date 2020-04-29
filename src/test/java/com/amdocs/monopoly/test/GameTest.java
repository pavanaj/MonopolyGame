package com.amdocs.monopoly.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.amdocs.monopoly.production.Board;
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
	
	@Test
	public void testSquareType() {
		Player testPlayer = game.getPlayerList().get(0);
		game.movePlayer(testPlayer);
		int playerPosition = testPlayer.getPlayerPosition();
		//System.out.println(playerPosition);
		Board board = game.getBoard();
		ISquare square = board.getBoardPosition(playerPosition);
		Assert.assertEquals(square.getType(), "property");
	}
	
	@Test
	public void testRunOneTurn() {
		
	}

}
