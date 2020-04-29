package com.amdocs.monopoly.test;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.amdocs.monopoly.production.Property;

public class PropertyTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Test
	public void propertyExist1() {
		Property property = new Property(0,0,"Blue","Park Place");
		
		Assert.assertNotNull(property);
	}
	
	@Test
	public void propertyExist2() {
		Property property = new Property(400,100,"Blue","Park Place");
		
		Assert.assertEquals(400, property.getPropertyCost());
		Assert.assertEquals(100, property.getRentCost());
		//Assert.assertEquals("Park Place", test name here );
		
	}
	
	@Test
	public void propertyViewDetails() {
		Property property = new Property(400,100,"Blue","Park Place");
		ArrayList<String> expectedOutput = new ArrayList<String>(Arrays.asList("property","Park Place","Blue","","400","100"));
		ArrayList<String> actualOutput = property.viewDetails();
		Assert.assertEquals(expectedOutput , actualOutput);
		
	}

}
