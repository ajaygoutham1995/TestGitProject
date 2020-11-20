package com.qa.base;

import static org.testng.Assert.assertTrue;

public class Invoker {

	public static void main(String[] args) {
		
		boolean isTrue = false;
		if (1 == 1) {
			isTrue = true;
		}else {
			isTrue = false;
		}
		
		
		if (isTrue) {
			System.out.println("passed");
			
		}else {
			System.out.println("failed");
		}
		
	} 
}
