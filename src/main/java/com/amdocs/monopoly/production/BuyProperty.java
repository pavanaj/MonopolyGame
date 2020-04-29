package com.amdocs.monopoly.production;

public class BuyProperty {
	Player player;
	Property property;
	
	public BuyProperty(Player player, Property property) {
		
		this.player = player;
		this.property = property;
	}
	
	public void buy() {
		
		if (player.getPlayerBalance() > property.getPropertyCost()) {
			player.withdrawBalance(property.getPropertyCost());
			property.setOwner(player.getPlayerName());
		}
	}

}
