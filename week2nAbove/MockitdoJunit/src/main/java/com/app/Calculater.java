package com.app;

public class Calculater {
	
	CalculatorService service;
	
	public Calculater() {
		
	}
	
	public Calculater(CalculatorService service) {
		this.service = service;
	}
	
	public int perform(int a,int b) {
		return service.sum(a, b)*a;
		//return (a + b)*a;
	}

}
