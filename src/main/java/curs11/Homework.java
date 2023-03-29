package curs11;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Homework extends BaseTest{
	
	
	@Test
	public void tema() {
		
		WebElement book = driver.findElement(By.cssSelector("div[id *='sc_tab_1456822345_1_17'] a[href*='the-son']")); 
		book.click();
		driver.findElement(By.cssSelector("a[href*='tab-reviews']")).click();
		assertFalse(driver.findElement(By.cssSelector("p[class*='cook']>input[id='wp-comment-cookies-consent']")).isSelected());
		driver.findElement(By.cssSelector("input[id = 'submit']")).click();
		driver.switchTo().alert().accept();
		
		List<WebElement> stars = driver.findElements(By.cssSelector("p[class = 'stars'] a"));
		
		for(int i=0; i<3; i++) { // i = 3 este numarul de stelute pe care vreau eu sa il selectez
			stars.get(i).click();
			}
		driver.findElement(By.cssSelector("textarea[id='comment']")).sendKeys("this is my comment512");
		driver.findElement(By.cssSelector("input[id = 'author']")).sendKeys("this is my name");
		driver.findElement(By.cssSelector("input[id = 'email']")).sendKeys("my@email.com");
		driver.findElement(By.cssSelector("p[class*='cook']>input[id='wp-comment-cookies-consent']")).click();
		assertTrue(driver.findElement(By.cssSelector("p[class*='cook']>input[id='wp-comment-cookies-consent']")).isSelected());
		driver.findElement(By.cssSelector("input[id = 'submit']")).click();
		driver.findElement(By.cssSelector("em[class *= 'awaiting-approval']")).isDisplayed();
		
		
		
	}
	
	
	
	

}
