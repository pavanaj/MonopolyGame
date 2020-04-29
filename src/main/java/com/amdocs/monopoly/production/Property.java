package com.amdocs.monopoly.production;

import java.util.ArrayList;

//Should extend Square
public class Property extends ISquare{
	
	private int propertyCost;
	private int rentCost;
	private String color;
	

	private String description;
	private String owner;
	
	
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
	
	//get the property color
	public String getColor() {
		return color;
	}
	
	public ArrayList<String> viewDetails() {
		ArrayList<String> details = new ArrayList<String>();
		details.add(this.getType());
		details.add(this.description);
		details.add(this.color);
		details.add(this.owner);
		details.add(Integer.toString(this.propertyCost));
		details.add(Integer.toString(this.rentCost));
		
		System.out.println("Type: " + details.get(0));
		System.out.println("Description: " + details.get(1));
		System.out.println("Color: " + details.get(2));
		System.out.println("Owner: " + details.get(3));
		System.out.println("Cost: " + details.get(4));
		System.out.println("Rent: " + details.get(5));
		return details;
		
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
