package pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	public WebDriver driver ; 
	
	public By updateCart = By.cssSelector("button[name='update_cart']");
	public By proceedButton	 = By.cssSelector("a[class *= 'checkout']") ;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public By increment = By.cssSelector("span[class *= 'inc']");
	
	public void updateQuantity() {
		driver.findElement(increment).click();
	}
	
	public void updateCart() {
		driver.findElement(updateCart).click();
	}
	
	public void checkMessageIsDisplayed() {
		WebElement checkMessage = driver.findElement(By.cssSelector("div[class='woocommerce-message']"));
		assertEquals(checkMessage.getText(), "Cart updated.");
	}
	
	public void proceedToCheckout() {
		driver.findElement(proceedButton).click();
	}
	

}
