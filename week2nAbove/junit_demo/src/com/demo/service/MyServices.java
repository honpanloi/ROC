package com.demo.service;

public class MyServices {
	
	public String sayHello(String name) {
		
		if(name == null) return null;
		
		return "Hello "+name;
	}

}
