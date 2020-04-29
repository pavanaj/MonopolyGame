package com.amdocs.monopoly.production;


//Should extend Square
public class Property extends ISquare{
	int propertyCost;
	int rentCost;
	String color;
	String description;
	String owner;
	
	
	public Property(int propertyCost, int rentCost,String color, String description) {
		this.propertyCost = propertyCost;
		this.rentCost = rentCost;
		this.color = color;
		this.owner = "";
		this.description = description;
		//super.setPosition(position); 
	}
	
	// get the cost of the property
	public int getPropertyCost() {
		return this.propertyCost;
	}

	// get the rent of the property
	public int getRentCost() {
		return this.rentCost;
	}
	
	// set owner to the property
	public void setOwner(String owner) {
		this.owner = owner;
	}

	// get the owner of the property
	public String getOwner() {
		return owner;
	}

	@Override
	public String getType() {
		return "property";
	}

	@Override
	public String getSquareName() {
		return this.description;
	}

}
