package com.amdocs.monopoly.production;

public class Player {
	

	private String name;
	private int balance = 1500;
	private int position = 0;
	private int token;
	private int rotationNumber;
	
	public Player(String name,int token, int rotationNumber) {
		this.name = name;
		
		this.token = token;
		this.rotationNumber = rotationNumber;
		
	}
	
	public void setPlayerName(String name) { 
		this.name = name;
	}
	
	public void setPlayerBalance(int balance) {
		this.balance = balance;
	}
	
	public void setPlayerPosition(int position) {
		this.position = position;
	}
	
	public void setPlayerToken(int token) {
		this.token = token;
	}
	
	public void setPlayerRotationNumber(int rotationNumber) {
		this.rotationNumber = rotationNumber;
	}
	
	public String getPlayerName() {
		return name;
	}
	public double getPlayerBalance() {
		return balance;
	}
	
	public int getPlayerPosition() {
		return position;
	}
	
	public int getPlayerToken() {
		return token;
	}
	
	public int getPlayerRotationNumber() {
		return rotationNumber;
	}
	
	public void withdrawBalance(int cost) {
		balance -= cost;
	}
}
