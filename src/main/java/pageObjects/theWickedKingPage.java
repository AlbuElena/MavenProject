package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class theWickedKingPage {
	
	WebDriver driver;
	
	public theWickedKingPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public By category = By.xpath("//a[@rel = 'tag']");
	public By productId = By.xpath("//span[@class = 'product_id']/span");
	
	
	public boolean fieldIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
}
