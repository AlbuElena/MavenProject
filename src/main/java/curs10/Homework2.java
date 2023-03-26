package curs10;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.junit.ArrayAsserts;

import utils.BaseTest;

public class Homework2 extends BaseTest{
	
	@Test
	public void checkBook() {
		
		List<WebElement>  elements =  driver.findElements(By.cssSelector("li[class*='sc_tabs_title']")); 
		for(int i = 0; i < elements.size(); i++) {
		
			elements.get(i).click();
			WebElement checkTheForestBook = driver.findElement(By.xpath("//a[contains(@href, 'the-forest')]"));
			assertTrue(checkTheForestBook.isDisplayed());
			if(i==elements.size()-1) {
				checkTheForestBook.click();
				assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");				
			}
			
		}		
				
	}

}
