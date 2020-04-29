package com.amdocs.monopoly.test;

import org.junit.Assert;
import org.junit.Test;

import com.amdocs.monopoly.production.Property;

public class PropertyTest {

	@Test
	public void propertyExist() {
		Property property = new Property(0,0,"Meshi");
		
		Assert.assertNotNull(property);
	}

}
