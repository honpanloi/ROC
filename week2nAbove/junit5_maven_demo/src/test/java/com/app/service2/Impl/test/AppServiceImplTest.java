package com.app.service2.Impl.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.app.exception.BusinessException;
import com.app.service2.AppService;
import com.app.service2.Impl.AppServiceImpl;

class AppServiceImplTest {

	private static AppService app;
	
	@BeforeAll
	public static void setUp() {
		app = new AppServiceImpl();
	}
	
	@Test
	void testIsValidPrimeNumberForTrue() {
		assertTrue(app.isValidPrimeNumber(3));
	}
	
	@Test
	void testIsValidPrimeNumberForFalse() {
		assertFalse(app.isValidPrimeNumber(4));
	}
	
	@Test
	void testIsValidPrimeNumberForNegativeNumber() {
		assertFalse(app.isValidPrimeNumber(-5));
	}

	@Test
	void testIsValidMobileNumberForTrue() {
		assertTrue(app.isValidMobileNumber("+1-1112223333"));
	}
	
	@Test()
	void testIsValidMobileNumberForException() {
		
		org.junit.jupiter.api.function.Executable executable = new org.junit.jupiter.api.function.Executable() {
			
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				app.isValidMobileNumber(null);
			}
		};
		
		assertThrows(BusinessException.class, executable);
	}

}
