package com.amdocs.monopoly.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.amdocs.monopoly.production.Board;

public class BoardTest {
	
	Board board;
	
	@Before
	public void setup() {
		board = new Board();
	}
	
	@Test
	public void boardPositions_exists() {
		
		board.setupBoardPositions();
		
		if (board.getBoardPositions() == null )
			fail();
	}
	
	@Test
	public void boardPositions_goIsFirstSquare() {
		board.setupBoardPositions();
		
		if (board.getBoardPositions().get(0).getSquareName() != "GO")
			fail();
	}

}
