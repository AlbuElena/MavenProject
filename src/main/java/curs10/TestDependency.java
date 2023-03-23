package curs10;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestDependency {
	
	@Test(priority = 1)
	public void method1() {
		assertTrue(false);
		System.out.println("Method 1");
	}
	
	@Test(priority = 2, dependsOnMethods = "method1")
	public void method2() {
		System.out.println("Method 2");
	}
	
	@Test(priority = 3,dependsOnMethods = "method2")
	public void method3() {
		System.out.println("Method 3");
	}

}
