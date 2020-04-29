package com.amdocs.monopoly.test;

import org.junit.Assert;
import org.junit.Test;

import com.amdocs.monopoly.production.Property;

public class PropertyTest {

	@Test
	public void propertyExist1() {
		Property property = new Property(0,0,"Meshi");
		
		Assert.assertNotNull(property);
	}
	
	@Test
	public void propertyExist2() {
		Property property = new Property(400,100,"Park Place");
		
		Assert.assertEquals(400, property.getPropertyCost());
		Assert.assertEquals(100, property.getRentCost());
		//Assert.assertEquals("Park Place", test name here );
		
	}

}
