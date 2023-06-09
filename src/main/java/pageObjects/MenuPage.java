package pageObjects;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.xml.sax.ext.Locator2;

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
	public By homePage = By.linkText("HOME");
	public By singleAuthorLink = By.linkText("SINGLE AUTHOR");
	public By booksLink = By.xpath("//li[@id = 'menu-item-262']/a");
	public By searchField = By.cssSelector("button[title = 'Open search']");
	public By searchIcon = By.cssSelector("button[class*='search_submit']");
	public By searchField2 =  By.cssSelector("input[class='search_field']"); // curs 
	
	
	public By shopLink = By.linkText("BOOKS");
	
	public By addresses = By.cssSelector("li[class *= 'address']>a");
	public By shippingAddress = By.cssSelector("a[href *= 'shipping']");
	
	public By facebookLink = By.cssSelector("div[class = 'top_panel_top_socials'] a[href ='https://www.facebook.com/keytraining.ro']");
	public By twitterLink = By.cssSelector("div[class = 'top_panel_top_socials'] a[href ='https://twitter.com/']");
	public By instaLink = By.cssSelector("div[class = 'top_panel_top_socials'] a[href = 'https://www.instagram.com']");

	public By logoutButton = By.cssSelector("li[class = 'menu_user_logout']>a");
	public By blogLink = By.linkText("BLOG");
	public By postFormatsLink = By.linkText("Post Formats");
	
	public By classicLink = By.xpath("//a[@href='https://keybooks.ro/category/classic/']");
	public By theWickedKingpopup = By.xpath("//h6[@class = 'post_title']/a[@href = 'https://keybooks.ro/shop/the-wicked-king/']");
	
	
	//driver.findElement(By.linkText("Login")).click();
	// indentificare element                  + actiune pe element
	//deci identificare element e compusa din urmatoarele doua:
	//metoda findElemenet + locator (By.linkText("Login"))
	//driver.findElement(locator) =>> daca locator == loginLink, pot face:
	//driver.findElement(loginLink)
	
	public void hoverElement(By locator) {
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
	public void logoutFromApp() {
		driver.findElement(logoutButton).click();
	}
	
	//hover and click scris de mine pt tema 1 curs 13
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
	
	public void searchBy (String text) {
		driver.findElement(searchIcon).click();
		driver.findElement(searchField2).sendKeys(text);
	}
	
	public void click (By locator) {
		driver.findElement(locator).click();
	}
			
}
