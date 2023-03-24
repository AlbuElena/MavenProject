package curs10;

import org.testng.annotations.Test;

public class TestPriority {
	
	
	@Test(priority = 0) // poate fi si nr negativ, dar de preferat nu, se ruleaza in ordinea lor; Sa punem priority la toate metodele!!!!
	public void one() {
		System.out.println("1");
	}
	
	@Test (priority = 1)
	public void two() {
		System.out.println("2");
	}
	
	@Test(priority = 2)
	public void three() {
		System.out.println("3");
	}
	
	@Test
	public void four() {
		System.out.println("4");
	}
	@Test
	public void five() {
		System.out.println("5");
	}


}