package curs10;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework1 extends BaseTest {
	
	@Test
	public void checkElements() {
		
		WebElement findLogin = driver.findElement(By.partialLinkText("Login"));
		assertTrue(findLogin.isDisplayed()); //verific daca este vizibil bttn Login 
		findLogin.click(); //click pe bttn Login
		WebElement emailField = driver.findElement(By.id("log"));
		assertTrue(emailField.isDisplayed()); //verific daca este vizibil campul email
		WebElement passwordField = driver.findElement(By.id("password"));
		assertTrue(passwordField.isDisplayed()); //verific daca este vizibil campul password
					
		}
}
