package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
	
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locatori
	public By loginLink = By.linkText("Login");
	//mai fac un locator:
	public By contactsLink = By.linkText("CONTACTS");
	//locator pt ex1 din tema:
	public By singleAuthorLink = By.linkText("SINGLE AUTHOR");
	public By searchField = By.cssSelector("button[title = 'Open search']");
	public By shopLink = By.linkText("BOOKS");
	
	//driver.findElement(By.linkText("Login")).click();
	// indentificare element                  + actiune pe element
	//deci identificare element e compusa din urmatoarele doua:
	//metoda findElemenet + locator (By.linkText("Login"))
	//driver.findElement(locator) =>> daca locator == loginLink, pot face:
	//driver.findElement(loginLink)
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
	//MenuPage menu = new MenuPage(driver);
		//menu.navigateTo(menu.loginlink);
		//menu.navigateTo(menu.contactsLink);

	
	
	
}
