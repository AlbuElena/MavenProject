package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookingWithLovePage {
	
	public WebDriver driver;
	
	public CookingWithLovePage (WebDriver driver) {
		this.driver = driver;
	}

	public By magnifier = By.xpath("//a[@class= 'woocommerce-product-gallery__trigger']");
	public By title = By.xpath("//h1[contains(text(), 'love')]");
	public By rating = By.xpath("//div[@class ='woocommerce-product-rating']");
	public By price = By.xpath("//p[@class = 'price']");
	public By shortDescription = By.xpath("//div[@class = 'woocommerce-product-details__short-description']");
	public By quantity = By.xpath("//input[@type = 'number']");
	public By addToCartButton = By.xpath("//button[@class = 'single_add_to_cart_button button alt']");
	public By product = By.xpath("//div[@class = 'product_meta']");
	
	public boolean FieldisDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
}
