package curs10;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class SeleniumLocators2 extends BaseTest {
	
	@Test (priority = 1)
	public void idLocator() {
		
		driver.findElement(By.id("menu-item-72")).click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/contacts/");
				
	}
	
	@Test(priority = 2)
	public void cssLocator() {
		WebElement nameInputField = driver.findElement(By.cssSelector("input[name=\"your-name\"]")); // sau "input[name='your-name']"
		assertTrue(nameInputField.isDisplayed());
		nameInputField.sendKeys("Johnny Bravo");
			
	}
	
	@Test(priority =3 )
	public void xpathLocator() {
		WebElement emailInputField = driver.findElement(By.xpath("//input[@name=\"your-email\"]"));
		assertTrue(emailInputField.isDisplayed());
		emailInputField.sendKeys("jdb@)abc.com");
		
		
		
	}
	
	
	

}