package com.TestngDemo;

import org.testng.annotations.*;

public class TestngDemo {
	
@BeforeClass	
	public void moblie() {
		System.out.println("before suiite");
	}
	
	@BeforeTest
	public void moblie2() {
		System.out.println("before test");
	}
	
	@BeforeClass
	public void moblie3() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void moblie4() {
		System.out.println("before method");
	}
	@Test(invocationCount = 2)
	public void moblie5() {
		System.out.println("At Test-1");
	}
	@Test(invocationCount = 3)
	public void moblie6() {
		System.out.println("At test-2");
	}
	@AfterMethod
	public void moblie7() {
		System.out.println("After method");
	}
	
    @AfterClass
	public void moblie8() {
		System.out.println("after class");
	}
	
    @AfterTest
	public void moblie9() {
		System.out.println("after test");
	}
	
    @AfterSuite
	public void moblie10() {
		System.out.println("after suiite");
	}
	
	
	
	
}
