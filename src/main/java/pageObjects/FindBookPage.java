package pageObjects;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindBookPage {
	
	public WebDriver driver ; 
	
	public FindBookPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public By searchField = By.cssSelector("button[title = 'Open search']");
	public By displayedBook = By.cssSelector("div[class *= 'item_masonry']>article>h4>a[href*='the-story-about-me']");

	public void WriteinSearch(String numeCarte) {
		driver.findElement(searchField).sendKeys(numeCarte);
		driver.findElement(searchField).click();
	}
	
	public void loadMore() {
		driver.findElement(displayedBook).isDisplayed();
		
			
				
		while(driver.findElement(displayedBook).isDisplayed()) {
			
		}
		
		
	}
	

}
