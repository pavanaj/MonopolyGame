package com.amdocs.monopoly.production;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

	Board board;
	List<Player> playerList;
	//List<Cards...>
	//bankBalance...
	
	public Game() {
		board = new Board();
	}
	public Board getBoard() {
		return board;
	}
	public void setupNumberOfPlayers(int num) {
		Scanner input = new Scanner(System.in);
		playerList = new ArrayList<Player>();
		for(int i = 0; i < num; ++i) {
			System.out.println("What is the name of player "+i+"?");
			String name = input.nextLine();
			playerList.add(new Player(name, 1500, 0, i, i));
		}
	}
	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
	
	/*ISquare getPlayerSquare(int player_index) {
		Player player = ge
	}*/
	
	public void playerTurn(int player_index) {
		Player player = playerList.get(player_index);
		movePlayer(player);
	}
	
	public void movePlayer(Player player) {
		int steps = Dice.getSteps();
		int startingPosition = player.getPlayerPosition();
		int newPosition = startingPosition + steps;
		if(newPosition > 40) {
			player.setPlayerBalance(player.getPlayerBalance() + 200);
		}
		player.setPlayerPosition(newPosition % 40);
	}
	
	public void doRound() {
//		for player in players
//			rollDice();
//			movePlayer(player);
//			interactWithSquare(player, square); //idk
	}
}