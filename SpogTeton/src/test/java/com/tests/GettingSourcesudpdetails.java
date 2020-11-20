package com.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GettingSourcesudpdetails {

	
	
	@DataProvider(name = "data")
	public final Object[][] data(){
		
		return new Object[][] {
			
			{"Valid- something is valid",200},
			{"Invalid- somthing is in valid",400}
		};
	}
	

	@Test(dataProvider = "data",priority = 1)
	public void testmethod_200(String testcase,int status ) {
		
		if (testcase.startsWith("Valid")) {
			assertEquals(200, status,"Matched");
		}

	}
	
	@Test(dataProvider = "data",priority = 2)
	public void testmethod2_400(String testcase,int status) {
		
		if (testcase.startsWith("Invalid")) {
			assertEquals(400, status,"Matched");
		}
	}
	
}
