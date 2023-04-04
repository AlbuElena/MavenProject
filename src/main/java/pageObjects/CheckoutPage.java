package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	public WebDriver driver ; 
	
	public By billingDetail = By.cssSelector("div[class *= 'billing']>h3");
	public By additionalInfo = By.cssSelector("div[class *= 'additional']>h3");
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void checkCheckoutUrl() {
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/checkout/");
	}
	
	public boolean billingDetailIsDisplayed() {
		return driver.findElement(billingDetail).isDisplayed();
	}
	
	public boolean additionalInfoIsDisplayed() {
		return driver.findElement(billingDetail).isDisplayed();
	}
	

}
