package com.demo;

public interface HelloJava8Interface {

	static void hiStatic() {
		System.out.println("Hello from static method within an Interface from Java8 and above");
	}
	
	default void hiDefault() {
		System.out.println("Hi from default methods from java 8 and above");
	}
}
