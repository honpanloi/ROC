package com.app.validation;

public class Validation {
	
	public static boolean contactValiation(long contact) {
		
		String tester = ""+contact;
		if(tester.matches("[0-9]{10}")) {
			return true;
		}
		
		
		return false;
	}

}
