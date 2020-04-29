package com.amdocs.monopoly.production;

public class Player {
	
	private String name;
	private double balance;
	private int position;
	private int token;
	private int rotationNumber;
	
	public Player(String name, double balance, int position, int token, int rotationNumber) {
		this.name = name;
		this.balance = balance;
		this.position = position;
		this.token = token;
		this.rotationNumber = rotationNumber;
		
	}
	
	public void setPlayerName(String name) { 
		this.name = name;
	}
	
	public void setPlayerBalance(double balance) {
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

}
