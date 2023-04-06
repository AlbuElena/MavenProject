package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {
	
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locatori
	public By loginLink = By.linkText("Login");
	//mai fac un locator:
	public By contactsLink = By.linkText("CONTACTS");
	//locatori pt ex1,2,3 din tema:
	public By singleAuthorLink = By.linkText("SINGLE AUTHOR");
	public By searchField = By.cssSelector("button[title = 'Open search']");
	public By shopLink = By.linkText("BOOKS");
	public By addresses = By.cssSelector("li[class *= 'address']>a");
	public By shippingAddress = By.cssSelector("a[href *= 'shipping']");
		

	
	//driver.findElement(By.linkText("Login")).click();
	// indentificare element                  + actiune pe element
	//deci identificare element e compusa din urmatoarele doua:
	//metoda findElemenet + locator (By.linkText("Login"))
	//driver.findElement(locator) =>> daca locator == loginLink, pot face:
	//driver.findElement(loginLink)
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
		
	public void hoverUserName() {
	    WebElement  userName = driver.findElement(By.cssSelector("span[class= 'user_name']"));
	    WebElement shippingLink = driver.findElement(By.cssSelector("a[href *='wp-admin']"));
		Actions action = new Actions(driver);
		action.moveToElement(userName).perform(); 
		action.moveToElement(userName).click().build().perform();	
		action.moveToElement(shippingLink).click().build().perform();		

	}
	
	public void selectAddresses(By locator) {
		driver.findElement(locator).click();
	}
	
	public void selectShippingAddress(By locator) {
		driver.findElement(locator).click();
	}
	
}
