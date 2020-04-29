package com.amdocs.monopoly.production;


//Should extend Square
public class Property {
	int propertyCost;
	int rentCost;
	String owner;
	
	public Property(int propertyCost, int rentCost, int position, String description) {
		this.propertyCost = propertyCost;
		this.rentCost = rentCost;
		this.owner = "";
		/*
		super.setDescription(description);
		super.setType("property");
		*/
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



	
	
}
